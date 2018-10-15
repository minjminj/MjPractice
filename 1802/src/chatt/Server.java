package chatt;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class Server extends JFrame {
	ServerSocket serverSocket;
	Vector<ServerThread> user = new Vector<ServerThread>();
	ServerThread st;
	
	Vector<String> userNames = new Vector<String>();

	private JPanel contentPane;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JScrollPane scrollPane;
	public JList list;
	private JScrollPane scrollPane_1;
	public JEditorPane editorPane;
	private JButton btnNewButton_2;
	private JTextField textField;
	private JButton btnNewButton_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Server frame = new Server();
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
	public void serverStart() {
		String msg = "";
		if (serverSocket == null) {
			try {
				serverSocket = new ServerSocket(4444);
				msg = "<font color = 'blue'>서버가 시작되었습니다.</font>";
				System.out.println("dsadas");
				editorPane.setText(msg);
				
				Thread thread = new Thread(new Runnable() {
				
					@Override
					public void run() {
						String msg = "";
						try {
							msg = "<font color = 'red'>클라이언트 접속 대기중 . . . </font>";
							editorPane.setText(msg);

							while (true) {
								Socket socket = serverSocket.accept();
								
								st = new ServerThread(Server.this, socket);
								st.start();
								user.add(st);
								
								
								String clientIP = socket.getInetAddress().getHostAddress();
								
								msg = msg + clientIP + "<font color = 'blue'>가 접속되었습니다...</font></br>";
								editorPane.setText(msg);
							}

						} catch (Exception e) {
							msg = "<font color = '#ff000'> 클라이언트 접속중 오류 발생</font>";
							editorPane.setText(msg);
						}
					}
				});
				thread.setDaemon(true); // 메인 스레드가 종료되면 자동으로 중지되게함.
				thread.start();

			} catch (Exception e) {
				msg = "<font color = '#ff000'> 서버 시작중 오류 발생</font>";
				editorPane.setText(msg);
			}
		}
	}

	public void serverStop() {
		if (serverSocket != null) {
			try {
				serverSocket.close();
				serverSocket = null;
				editorPane.setText("서버를 종료하였습니다.");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public Server() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 559, 516);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getBtnNewButton());
		contentPane.add(getBtnNewButton_1());
		contentPane.add(getScrollPane());
		contentPane.add(getScrollPane_1());
		contentPane.add(getBtnNewButton_2());
		contentPane.add(getTextField());
		contentPane.add(getBtnNewButton_3());
		
		try {
	         
	         InetAddress local = InetAddress.getLocalHost();
	         String myIp = local.getHostAddress();
	         setTitle("my ip : " + myIp);

	      } catch (Exception ex) {
	         ex.printStackTrace();
	      }
	}

	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("서버 시작");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					serverStart();

				}
			});
			btnNewButton.setBounds(12, 10, 106, 23);
		}
		return btnNewButton;
	}

	private JButton getBtnNewButton_1() {
		if (btnNewButton_1 == null) {
			btnNewButton_1 = new JButton("서버 중지");
			btnNewButton_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					serverStop();
				}
			});
			btnNewButton_1.setBounds(130, 10, 106, 23);
		}
		return btnNewButton_1;
	}

	private JScrollPane getScrollPane() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setBounds(22, 43, 97, 391);
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
			scrollPane_1.setBounds(131, 43, 407, 391);
			scrollPane_1.setViewportView(getEditorPane());
		}
		return scrollPane_1;
	}

	private JEditorPane getEditorPane() {
		if (editorPane == null) {
			editorPane = new JEditorPane();
			editorPane.setContentType("text/html");
			String msg = "<font color = 'blue' size = '5'>서버를 시작해 주세요</font>";
			editorPane.setText(msg);
		}
		return editorPane;
	}

	private JButton getBtnNewButton_2() {
		if (btnNewButton_2 == null) {
			btnNewButton_2 = new JButton("귓속말");
			btnNewButton_2.setBounds(12, 453, 106, 23);
		}
		return btnNewButton_2;
	}

	private JTextField getTextField() {
		if (textField == null) {
			textField = new JTextField();
			textField.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});
			textField.setBounds(130, 454, 299, 21);
			textField.setColumns(10);
		}
		return textField;
	}

	private JButton getBtnNewButton_3() {
		if (btnNewButton_3 == null) {
			btnNewButton_3 = new JButton("전송");
			btnNewButton_3.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String msg = textField.getText();
					st.sendAll(msg);
				}
			});
			btnNewButton_3.setBounds(441, 453, 97, 23);
		}
		return btnNewButton_3;
	}
}
