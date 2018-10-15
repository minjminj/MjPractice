package chatt;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.IOException;
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
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class Client extends JFrame {
	Socket socket = null;
	ClientThread ct;
	
	Vector<String> userNames = new Vector<String>();

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JTextField tfServerIp;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JScrollPane scrollPane;
	private JScrollPane scrollPane_1;
	private JButton btnNewButton_2;
	private JTextField textField_1;
	private JButton btnNewButton_3;
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
	public void connect() { // 연결
		if(socket == null) {
			try {
				socket = new Socket(tfServerIp.getText(), 4444);
				ct = new ClientThread(this,socket);
				ct.start();
				
				editorPane.setText("서버에 연결되었습니다.");
				
			}catch(Exception ex) { // 무슨 오류든 뜨면 밑에문장 실행
				String msg = "<font color ='red'> 서버연결중 오류 발생!!! </font>";
				editorPane.setText(msg);
			}
		}
	}
	public void disConnect() {
		if(socket != null) {
			try {
				socket.close();
				socket = null;
				ct = null;
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	public Client() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 768, 484);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblNewLabel());
		contentPane.add(getTfServerIp());
		contentPane.add(getBtnNewButton());
		contentPane.add(getBtnNewButton_1());
		contentPane.add(getScrollPane());
		contentPane.add(getScrollPane_1());
		contentPane.add(getBtnNewButton_2());
		contentPane.add(getTextField_1());
		contentPane.add(getBtnNewButton_3());
		contentPane.add(getLblNewLabel_1());
		contentPane.add(getTfId());

		try {
			InetAddress local = InetAddress.getLocalHost();
			String myip = local.getHostAddress();
			setTitle("My Ip : " + myip);
		} catch (Exception e) {
			e.printStackTrace();

		}
	}

	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("서버IP");
			lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel.setBounds(12, 10, 57, 15);
		}
		return lblNewLabel;
	}

	private JTextField getTfServerIp() {
		if (tfServerIp == null) {
			tfServerIp = new JTextField();
			tfServerIp.setBounds(81, 7, 235, 21);
			tfServerIp.setColumns(10);
		}
		return tfServerIp;
	}

	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("연결");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				connect();
				}
			});
			btnNewButton.setBounds(534, 6, 97, 23);
		}
		return btnNewButton;
	}

	private JButton getBtnNewButton_1() {
		if (btnNewButton_1 == null) {
			btnNewButton_1 = new JButton("종료");
			btnNewButton_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					disConnect();
				}
			});
			btnNewButton_1.setBounds(643, 6, 97, 23);
		}
		return btnNewButton_1;
	}

	private JScrollPane getScrollPane() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setBounds(12, 51, 148, 334);
			scrollPane.setViewportView(getList());
		}
		return scrollPane;
	}

	private JList getList() {
		if (list == null) {
			list = new JList();
			
			//test
			//Vector<String> data = new Vector<String>();
			//data.add("kim");
			//data.add("park");
			//list.setListData(data);
		}
		return list;
	}

	private JScrollPane getScrollPane_1() {
		if (scrollPane_1 == null) {
			scrollPane_1 = new JScrollPane();
			scrollPane_1.setBounds(172, 51, 359, 334);
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
			btnNewButton_2 = new JButton("귓속말");
			btnNewButton_2.setBounds(12, 411, 97, 23);
		}
		return btnNewButton_2;
	}

	private JTextField getTextField_1() {
		if (textField_1 == null) {
			textField_1 = new JTextField();
			textField_1.addKeyListener(new KeyAdapter() {
				@Override
				public void keyReleased(KeyEvent arg0) {
					if(arg0.getKeyCode() == KeyEvent.VK_ENTER) {
						ct.send(textField_1.getText());
					}
				}
			});
			textField_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					ct.send(textField_1.getText());
				}
			});
			textField_1.setBounds(121, 412, 304, 21);
			textField_1.setColumns(10);
		}
		return textField_1;
	}

	private JButton getBtnNewButton_3() {
		if (btnNewButton_3 == null) {
			btnNewButton_3 = new JButton("전송");
			btnNewButton_3.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				ct.send(textField_1.getText());
				}
				
			});
		}
			
				btnNewButton_3.setBounds(437, 411, 97, 23);


		return btnNewButton_3;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("아이디");
			lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_1.setBounds(328, 10, 57, 15);
		}
		return lblNewLabel_1;
	}
	private JTextField getTfId() {
		if (tfId == null) {
			tfId = new JTextField();
			tfId.setText("Dong");
			tfId.setBounds(397, 7, 116, 21);
			tfId.setColumns(10);
		}
		return tfId;
	}
}
