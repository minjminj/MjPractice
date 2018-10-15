package chat;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class Client extends JFrame {
	
	Socket socket;
	ClientThread ct;
	Vector<String> usernames = new Vector<String>();

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JTextField tfServerIp;
	private JScrollPane scrollPane;
	private JScrollPane scrollPane_1;
	private JButton btnNewButton_2;
	private JButton btnNewButton_3;
	private JTextField textField;
	private JLabel lblNewLabel_1;

	public JList list;
	public JEditorPane editorPane;
	public JTextField tfId;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Client frame = new Client();
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
	
	public void connect() {
	
		if( socket == null	) {
			try {
				socket = new Socket(tfServerIp.getText(), 4444);
				Data temp = new Data();
				
				
				ct = new ClientThread(this, socket);
				ct.start();
				temp.setId(tfId.getText());
				temp.setCommand("login");
				temp.setCommand("userList");
				temp.setMessage("님이 입장하셨습니다.");
				
				
				
				editorPane.setText("[연결 성공]");
				//ct.send(temp.getId() + temp.getMessage());
				
			} catch(Exception e) {
				String msg = "<font color = 'red'> 서버 연결 중 오류 발생!!!</font>";
				editorPane.setText(msg);
			}
		}
	}
	
	public void disConnect() {
		if (socket != null) {
			try {
				Data temp = new Data();
				temp.setId(tfId.getText());
				temp.setMessage("님이 방을 떠났습니다.");
				temp.setCommand("logout");
				
				ct.run = false;
				ct.oos.writeObject(temp);
				ct.oos.flush();
				socket = null;
				
				
				socket.close();
				
//				ct.send(temp.getId() + temp.getMessage());
//				socket= null;
//				socket.close();
			
			} catch (Exception ex){
				
			}
			
			
//			try {
//				socket.close();
//				socket = null;
//				editorPane.setText("서버 연결이 종료되었습니다.");
//				
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
		}
		
	}
	
	public Client() {
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent arg0) {
				// 창을 완전히 닫기 전에 서버에 logout 메시지 전달
				try {
					Data temp = new Data();
					temp.setId(tfId.getText());
					temp.setMessage("바빠서 이제 그만..");
					temp.setCommand("logout");
					//String not = tfId.getText() + " 님이 연결을 종료하였습니다.";
					//ct.send(not);
					
					ct.run = false;
					ct.oos.writeObject(temp);
					ct.oos.flush();
					socket = null;
					
					
					socket.close();
				
				/*
				 *     Data temp = new Data();
                temp.setId(tfId.getText());
                temp.setMessage("바빠서 이제 그만....");
                temp.setCommand("logout");
 
                ct.run = false;
                ct.oos.writeObject(temp);
                ct.oos.flush();
                socket = null;
				 * */
				} catch (Exception ex){
					
				}
			}
		});
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 476, 702);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblNewLabel());
		contentPane.add(getBtnNewButton());
		contentPane.add(getBtnNewButton_1());
		contentPane.add(getTfServerIp());
		contentPane.add(getScrollPane());
		contentPane.add(getScrollPane_1());
		contentPane.add(getBtnNewButton_2());
		contentPane.add(getBtnNewButton_3());
		contentPane.add(getTextField());
		contentPane.add(getLblNewLabel_1());
		contentPane.add(getTfId());
		
	try {
			
			InetAddress local = InetAddress.getLocalHost();
			String myIp = local.getHostAddress();
			setTitle("my ip : " + myIp);

		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
		
	
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("서버 IP");
			lblNewLabel.setBounds(12, 27, 57, 15);
		}
		return lblNewLabel;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("종 료");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					disConnect();
				}
			});
			btnNewButton.setBounds(370, 23, 75, 44);
		}
		return btnNewButton;
	}
	private JButton getBtnNewButton_1() {
		if (btnNewButton_1 == null) {
			btnNewButton_1 = new JButton("연 결");
			btnNewButton_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					connect();		// 클라이언트에서 연결이란 소켓을 만드는 것.
				}
			});
			btnNewButton_1.setBounds(291, 23, 75, 44);
		}
		return btnNewButton_1;
	}
	private JTextField getTfServerIp() {
		if (tfServerIp == null) {
			tfServerIp = new JTextField();
			tfServerIp.setText("127.0.01");
			tfServerIp.setBounds(60, 24, 219, 21);
			tfServerIp.setColumns(10);
		}
		return tfServerIp;
	}
	private JScrollPane getScrollPane() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setBounds(12, 104, 95, 475);
			scrollPane.setViewportView(getList());
		}
		return scrollPane;
	}
	private JList getList() {
		if (list == null) {
			list = new JList();
			
		
		}
		return list;
	}
	private JScrollPane getScrollPane_1() {
		if (scrollPane_1 == null) {
			scrollPane_1 = new JScrollPane();
			scrollPane_1.setBounds(119, 104, 326, 475);
			scrollPane_1.setViewportView(getEditorPane());
		}
		return scrollPane_1;
	}
	private JEditorPane getEditorPane() {
		if (editorPane == null) {
			editorPane = new JEditorPane();
			editorPane.setContentType("text/html");
		}
		return editorPane;
	}
	private JButton getBtnNewButton_2() {
		if (btnNewButton_2 == null) {
			btnNewButton_2 = new JButton("전 송");
			btnNewButton_2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					ct.send(textField.getText());
					textField.setText("");
					
					
				}
			});
			btnNewButton_2.setBounds(370, 606, 75, 23);
		}
		return btnNewButton_2;
	}
	private JButton getBtnNewButton_3() {
		if (btnNewButton_3 == null) {
			btnNewButton_3 = new JButton("귓 속 말");
			btnNewButton_3.setBounds(12, 606, 95, 23);
		}
		return btnNewButton_3;
	}
	private JTextField getTextField() {
		if (textField == null) {
			textField = new JTextField();
			textField.addKeyListener(new KeyAdapter() {
				@Override
				public void keyReleased(KeyEvent arg0) {
					if (arg0.getKeyCode() == KeyEvent.VK_ENTER) {
						ct.send(textField.getText());
						textField.setText("");
					}
				}
			});
			textField.setBounds(119, 607, 247, 21);
			textField.setColumns(10);
		}
		return textField;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("아이디");
			lblNewLabel_1.setBounds(12, 52, 57, 15);
		}
		return lblNewLabel_1;
	}
	private JTextField getTfId() {
		if (tfId == null) {
			tfId = new JTextField();
			tfId.setBounds(60, 52, 219, 21);
			tfId.setColumns(10);
		}
		return tfId;
	}
}






















