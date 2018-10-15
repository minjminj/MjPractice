package chat;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.io.StringReader;
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
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import javax.swing.text.EditorKit;
import javax.swing.text.html.HTMLEditorKit;

public class Server extends JFrame {

	ServerSocket serverSocket;
	Vector<ServerThread> user = new Vector<ServerThread>();
	ServerThread st;

	Vector<String> usernames = new Vector<String>();

	boolean run = true;

	private JPanel contentPane;
	private JButton button;
	private JButton button_1;
	private JButton button_2;
	private JTextField textField;
	private JScrollPane scrollPane;
	private JScrollPane scrollPane_1;
	private JButton btnNewButton;

	public JList list;
	public JEditorPane editorPane;

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

	public void serverStart() {
		String msg = "";
		if (serverSocket == null) {

			try {
				serverSocket = new ServerSocket(4444);
				msg = "<font color='blue'>서버가 시작되었습니다.</font>";
				editorPane.setText(editorPane.getText() + "<br/>" + msg);
				Thread thread = new Thread(new Runnable() {

					@Override
					public void run() {
						String msg = "";
						StringReader reader = new StringReader("");
						try {
							msg = "<font color='red'>클라이언트 접속 대기 중</font>";
							editorPane.setText(msg);

							while (run) {
								Socket socket = serverSocket.accept();
								st = new ServerThread(Server.this, socket);
								// 스레드 안에 있는 코드이기 때문에 this만 해주면 server가 아니라 스레드를 지목.
								st.start();
								user.add(st);

								String clientIp = socket.getInetAddress().getHostAddress();

								msg = "<font color='red'>클라이언트가 접속되었습니다.</font>";
								reader = new StringReader(clientIp + msg);
								//editorPane.setText();

							}

						} catch (IOException e) {
							msg = "<font color='#ff000'>클라이언트 접속 중 오류 발생</font>";
							editorPane.setText(msg);

						}
					}
				});
				thread.setDaemon(true); // 메인스레드가 중지되면 자동으로 중지되게함. 데몬스레드
				thread.start();

			} catch (Exception e) {
				msg = "<font color='#ff000'>서버 시작중 오류발생</font>";
				editorPane.setText(msg);
			}
		}

	}

	public void serverStop() {
		if (serverSocket != null) {
			// 모든 클라이언트에게 서버 shutdown 전달


				try {
					
					Data temp = new Data();
					for (ServerThread st : user) {
						
					}
					temp.setCommand("shutdown");
					System.out.println("ss");
					run = false;
					new Socket("localhost", 4444); // accept blocking 해제

					//	temp.setId("server");
					//	temp.setMessage("Sorry: 서버 중지");
					// serverSocket.close();

					
					
					
					//serverSocket.close();
					//editorPane.setText("<font color = 'blue'>서버를 종료했습니다.");

				} catch (Exception e) {
					e.printStackTrace();
				} finally {
					serverSocket = null;
					try {
						editorPane.setText("!!server shutdown!!");
					} catch (Exception e) {
						e.printStackTrace();
					}

				}
			}
		}
	

	public Server() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 417, 426);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getButton());
		contentPane.add(getButton_1());
		contentPane.add(getButton_2());
		contentPane.add(getTextField());
		contentPane.add(getScrollPane());
		contentPane.add(getScrollPane_1());
		contentPane.add(getBtnNewButton());

		try {

			InetAddress local = InetAddress.getLocalHost();
			String myIp = local.getHostAddress();
			setTitle("my ip : " + myIp);

		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	private JButton getButton() {
		if (button == null) {
			button = new JButton("서버 중지");
			button.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					serverStop();
				}
			});
			button.setBounds(121, 26, 97, 23);
		}
		return button;
	}

	private JButton getButton_1() {
		if (button_1 == null) {
			button_1 = new JButton("전송");
			button_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String msg = textField.getText();
					st.sendAll(msg);
					HTMLEditorKit edit = (HTMLEditorKit) editorPane.getEditorKit();
					StringReader reader = new StringReader(msg);
					Document doc = editorPane.getDocument();
					try {
						edit.read(reader, doc, doc.getLength());
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					} catch (BadLocationException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					editorPane.setCaretPosition(doc.getLength());

					textField.setText("");
				}
			});
			button_1.setBounds(291, 335, 97, 23);
		}
		return button_1;
	}

	private JButton getButton_2() {
		if (button_2 == null) {
			button_2 = new JButton("귓속말");
			button_2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});
			button_2.setBounds(12, 335, 97, 23);
		}
		return button_2;
	}

	private JTextField getTextField() {
		if (textField == null) {
			textField = new JTextField();
			textField.addKeyListener(new KeyAdapter() {
				@Override
				public void keyReleased(KeyEvent arg0) {
					if (arg0.getKeyCode() == KeyEvent.VK_ENTER) {
						String msg = textField.getText();
						st.sendAll(msg);
						HTMLEditorKit edit = (HTMLEditorKit) editorPane.getEditorKit();
						StringReader reader = new StringReader(msg);
						Document doc = editorPane.getDocument();
						try {
							edit.read(reader, doc, doc.getLength());
						} catch (IOException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						} catch (BadLocationException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
						editorPane.setCaretPosition(doc.getLength());
						textField.setText("");
					}
				}
			});
			textField.setBounds(121, 336, 166, 21);
			textField.setColumns(10);
		}
		return textField;
	}

	private JScrollPane getScrollPane() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setBounds(121, 59, 267, 252);
			scrollPane.setViewportView(getEditorPane());
		}
		return scrollPane;
	}

	private JScrollPane getScrollPane_1() {
		if (scrollPane_1 == null) {
			scrollPane_1 = new JScrollPane();
			scrollPane_1.setBounds(12, 59, 97, 252);
			scrollPane_1.setViewportView(getList());
		}
		return scrollPane_1;
	}

	private JList getList() {
		if (list == null) {
			list = new JList();
		}
		return list;
	}

	private JEditorPane getEditorPane() {
		if (editorPane == null) {
			editorPane = new JEditorPane();
			editorPane.setContentType("text/html");

			String msg = "<font color='blue' size='5'>서버를 시작해 주세요</font>";
			editorPane.setText(msg);

		}
		return editorPane;
	}

	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("서버 시작");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					serverStart();
				}
			});
			btnNewButton.setBounds(12, 26, 97, 23);
		}
		return btnNewButton;
	}
}
