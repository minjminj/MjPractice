package chap19;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.Document;
import javax.swing.text.html.HTMLEditorKit;

import java.awt.Dimension;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.StringReader;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;
import java.nio.charset.Charset;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import javax.swing.JTextArea;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class NIOClient extends JFrame {
	
	SocketChannel socketChannel;

	private JPanel contentPane;
	private JPanel panel;
	private JButton btnStartStop;
	private JButton btnSend;
	private JTextField textField;
	private JScrollPane scrollPane;
	private JTextArea textArea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NIOClient frame = new NIOClient();
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
	public NIOClient() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 397, 426);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		contentPane.add(getPanel(), BorderLayout.SOUTH);
		contentPane.add(getScrollPane(), BorderLayout.CENTER);
	}
	
	// 연결 시작 코드
	void startClient() {
		Thread thread = new Thread() {
			@Override
			public void run() {
				try {
					socketChannel = SocketChannel.open();
					socketChannel.configureBlocking(true);
					socketChannel.connect(new InetSocketAddress("localhost", 5555));
					
					try {
						textArea.setText("[연결 완료!!!: " + socketChannel.getRemoteAddress() + "]\n");
						btnStartStop.setText("STOP");
						btnSend.setEnabled(true);
		
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
				} catch (Exception ex) {
					textArea.setText("[서버 통신 안됨]");
					if (socketChannel.isOpen()) {
						stopClient();
					}
					return;
				}
				receive();
			}
		};
		thread.start();
	}
	
	void stopClient() {	// 연결 끊기 코드
		try {
			textArea.setText("[연결 끊음]\n");
			btnStartStop.setText("START");
			
			if (socketChannel != null && socketChannel.isOpen()) {
				socketChannel.close();
			}
		} catch (IOException ex1) {
			
		}
	}
	
	void receive() {	// 데이터 받기 코드
		while(true) {
						
			try {
				ByteBuffer byteBuffer = ByteBuffer.allocate(512);
				
				// 서버가 비정상적으로 종료했을 경우 IOException 발생
				int readByteCount = socketChannel.read(byteBuffer);
				
				// 서버가 정상적으로 socket 의 close()를 호출했을 경우
				if (readByteCount == -1) {
					throw new IOException();
				}
				
				byteBuffer.flip();
				Charset charset = Charset.forName("utf-8");
				String data = charset.decode(byteBuffer).toString();
				textArea.append("\n [" + socketChannel.getRemoteAddress() + " 받기 완료]\t" + data);
				
			} catch (Exception ex) {
				textArea.setText("[서버 통신 안됨]");
				stopClient();
				break;
			}
		}
	}
	
	void send(String data) {
		Thread thread = new Thread() {
			@Override
			public void run() {
				try {
					Charset charset = Charset.forName("utf-8");
					ByteBuffer byteBuffer = charset.encode(data);
					socketChannel.write(byteBuffer);		// 서버로 데이터 보내기
					textArea.append("\n[" + socketChannel.getRemoteAddress() + " 보내기 완료]\n");
				} catch (Exception ex) {
					textArea.setText("[서버 통신 안됨]");
					stopClient();
				}
			}
		};
		thread.start();
	}
	
	

	private JPanel getPanel() {
		if (panel == null) {
			panel = new JPanel();
			panel.setBackground(new Color(139, 0, 0));
			panel.setPreferredSize(new Dimension(10, 30));
			panel.setLayout(new BorderLayout(0, 0));
			panel.add(getBtnStartStop(), BorderLayout.WEST);
			panel.add(getBtnSend(), BorderLayout.EAST);
			panel.add(getTextField(), BorderLayout.CENTER);
		}
		return panel;
	}
	private JButton getBtnStartStop() {
		if (btnStartStop == null) {
			btnStartStop = new JButton("START");
			btnStartStop.setPreferredSize(new Dimension(75, 23));
			btnStartStop.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if (btnStartStop.getText().equals("START")) {
						startClient();
					} else {
						stopClient();
					}
				}
			});
		}
		return btnStartStop;
	}
	private JButton getBtnSend() {
		if (btnSend == null) {
			btnSend = new JButton("SEND");
			btnSend.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					send(textField.getText());
					textField.setText("");
				}
			});
		}
		return btnSend;
	}
	private JTextField getTextField() {
		if (textField == null) {
			textField = new JTextField();
			textField.addKeyListener(new KeyAdapter() {
				@Override
				public void keyReleased(KeyEvent arg0) {
					if (arg0.getKeyCode() == KeyEvent.VK_ENTER) {
						send(textField.getText());
						textField.setText("");
					}
				}
			});
			textField.setColumns(10);
		}
		return textField;
	}
	private JScrollPane getScrollPane() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setViewportView(getTextArea());
		}
		return scrollPane;
	}
	private JTextArea getTextArea() {
		if (textArea == null) {
			textArea = new JTextArea();
			textArea.setBackground(new Color(255, 222, 173));
		}
		return textArea;
	}
}
