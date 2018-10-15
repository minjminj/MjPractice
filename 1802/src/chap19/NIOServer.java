/*
 * p.1186~  메소드에 해당하는 페이지마다 자세히 주석처리 되어있음.
 */
package chap19;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class NIOServer extends JFrame {
	
	Selector selector;
	ServerSocketChannel serverSocketChannel;
	List<Client> connections = new Vector<Client>();

	private JPanel contentPane;
	private JScrollPane scrollPane;
	private JTextArea textArea;
	private JLabel lblNewLabel;
	private JButton btnStartStop;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NIOServer frame = new NIOServer();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public NIOServer() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 394, 463);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		contentPane.add(getScrollPane(), BorderLayout.CENTER);
		contentPane.add(getBtnStartStop(), BorderLayout.SOUTH);
	}
	
	void startServer() {	// p.1187
		try {
			selector = Selector.open();		// 셀렉터(어떤 부분이 작업처리 준비가 완료되었는지 감시와 동시에 준비 완료 된것은 실행) 생성
			serverSocketChannel = serverSocketChannel.open();	// 서버소켓 생성
			serverSocketChannel.configureBlocking(false);		// 서버소켓 채널을 넌블로킹모드로 만듦.
			serverSocketChannel.bind(new InetSocketAddress(5555));		// 5555번 포트에 바인딩(연결)
			
			serverSocketChannel.register(selector, SelectionKey.OP_ACCEPT);		// selector에 OP_ACCEPT로 serverSocketChannel을 등록함.	selector에 자신을 등록할때 selectionKey 유형으로 등록.
			
		} catch(Exception ex) {
			if(serverSocketChannel.isOpen()) {
				stopServer();
			}
			return;
		}
		
		Thread thread = new Thread() {		// 스레드 생성, p.1188
			@Override
			public void run() {
				while(true) {
					try {
						int keyCount = selector.select();	// 작업 처리 준비가 된 채널이 있을때까지 대기.   만약 키값이 존재하면 keyCount가 1이상.
						if (keyCount == 0) {continue;}
						
						Set<SelectionKey> selectedKeys = selector.selectedKeys();		// 작업 처리 준비가 된 키를 얻고 Set 컬렉션으로 리턴
						Iterator<SelectionKey> iterator = selectedKeys.iterator();
						
						while (iterator.hasNext()) {
							SelectionKey selectionKey = iterator.next();
							
							if (selectionKey.isAcceptable()) {
								accept(selectionKey);
							} else if (selectionKey.isReadable()) {
								Client client = (Client) selectionKey.attachment();		// attach에 의해서 추가된 데이터를 가져올 때 attachment
								client.receive(selectionKey);
							} else if (selectionKey.isWritable()) {
								Client client = (Client) selectionKey.attachment();
								client.send(selectionKey);
							}
							iterator.remove();		// 선택된 키셋에서 처리 완료된 SelectionKey를 제거
						}
					} catch(Exception ex) {
						if (serverSocketChannel.isOpen()) {
							stopServer();
						}
						break;
						
					}
				}
			}
		};
		
		thread.start();
		
		textArea.setText("[서버가 시작됨~~~~]\n");
		btnStartStop.setText("STOP");
	}
	
	void stopServer() {	//p.1189~1190
		try {
			Iterator<Client> iterator = connections.iterator();
			
			while (iterator.hasNext()) {
				Client client = iterator.next();
				client.socketChannel.close();		// 연결된 SocketChannel 강제종료
				iterator.remove();
			}
			
			if (serverSocketChannel != null && serverSocketChannel.isOpen()) {
				serverSocketChannel.close();				
			}
			
			if (selector != null && selector.isOpen()) {
				selector.close();
			}
			
			textArea.append("[서버가 중지됨 ..!]\n");
			btnStartStop.setText("START");
			
		} catch(Exception ex) {
			
		}
		
	}
	
	void accept(SelectionKey selcectionKey) {		// p.1190
		try {
			// Selector에 등록되어 있는 서버 채널을 가져옴
			ServerSocketChannel serverSocketChannel = (ServerSocketChannel) selcectionKey.channel();
			SocketChannel socketChannel = serverSocketChannel.accept();
			
			String message = "[연결 수락: " + socketChannel.getRemoteAddress() + "]";
			textArea.append(message+ "\n"); 
			
			// ServerThread 역할을 하는 Client를 생성 한 후 List에 저장
			Client client = new Client(socketChannel);
			connections.add(client);
			message = "[연결 개수: " + connections.size();
			textArea.append(message + "\n");
			
		} catch(Exception ex) {
			if (serverSocketChannel.isOpen()) {
				stopServer();
			}
		}
		
		
		
	}
	
	// TCP에서 일종의 ServerThread 역할을 하는 inner class, p.1191~1192
	class Client{	
		SocketChannel socketChannel;
		String sendData;
		
		public Client(SocketChannel sc) {
			this.socketChannel = sc;

			try {
				this.socketChannel.configureBlocking(false);
				SelectionKey selectionKey = socketChannel.register(selector, SelectionKey.OP_READ);
				
				selectionKey.attach(this);
			} catch (IOException ex1) {
				// TODO Auto-generated catch block
				ex1.printStackTrace();
			}
		}
		
		public void receive(SelectionKey selectionKey) {		// P.1192
			// 데이터 받기 코드
			
			try {
				ByteBuffer byteBuffer = ByteBuffer.allocate(512);  // allocate이기 때문에 힘메모리에 저장하는 넌다이렉트임.
				int byteCount = socketChannel.read(byteBuffer);
				if (byteCount == -1) {			// -1이 의미 하는 것은 연결된 클라이언트가 socketChannel을 close한 경우.
					throw new Exception();		// 강제로 예외를 발생시켜서 catch문장을 만나게 함.
		
				}
				
				byteBuffer.flip();
				Charset charset = Charset.forName("utf-8");		// 유니코드명은 대소문자 구분 x
				String data = charset.decode(byteBuffer).toString();
				
				textArea.append("[" + socketChannel.getRemoteAddress() + "]" + data + "\n");
				
				// 접속된 모든 클라이언트의 작업 유형을 OP_WRITE	로 변경하여, 각 클라이언트가 데이터를 전송하도록 조치
				for (Client client : connections) {
					client.sendData = data;
					SelectionKey key = client.socketChannel.keyFor(selector);
					key.interestOps(selectionKey.OP_WRITE);
				}
				
				// 변경된 작업 유형을 감지시킴
				selector.wakeup();			// 다시 while문 안으로 가서 select()의 블로킹 해제 -> readable 에서 writable로 바뀌었음을 인지하고 writable을 실행 
				
			} catch(Exception ex) {
				try {
					connections.remove(this);
					textArea.append("[통신 두절] " + socketChannel.getRemoteAddress());
					textArea.append("\n");
					
					socketChannel.close();
					
				} catch(Exception ex2) {
				
					
				}
				
			}
			
		}
		
		public void send(SelectionKey selectionKey) {
			// 데이터 전송 코드
	
			try {
				Charset charset = Charset.forName("utf-8");
				ByteBuffer byteBuffer = charset.encode(sendData);
				
				socketChannel.write(byteBuffer);
				selectionKey.interestOps(selectionKey.OP_READ);
				selector.wakeup();
				
			} catch(Exception ex) {
				try {
					String message = "[통신안됨] " +socketChannel.getRemoteAddress();
					textArea.append(message + "\n");
					connections.remove(this);
					socketChannel.close();
				
				} catch (Exception ex2) {
					
				}
			}
		}
		
	}
	
	
	
	private JScrollPane getScrollPane() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setViewportView(getTextArea());
			scrollPane.setColumnHeaderView(getLblNewLabel());
		}
		return scrollPane;
	}
	private JTextArea getTextArea() {
		if (textArea == null) {
			textArea = new JTextArea();
			textArea.setBackground(new Color(255, 248, 220));
		}
		return textArea;
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("New label");
			lblNewLabel.setBackground(Color.ORANGE);
			lblNewLabel.setOpaque(true);
		}
		return lblNewLabel;
	}
	private JButton getBtnStartStop() {
		if (btnStartStop == null) {
			btnStartStop = new JButton("Start");
			btnStartStop.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if (btnStartStop.getText().equals("START")) {
						startServer();
					} else {
						stopServer();
					}
				}
			});
			btnStartStop.setBackground(new Color(255, 140, 0));
		}
		return btnStartStop;
	}
}
