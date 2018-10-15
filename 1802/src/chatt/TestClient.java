package chatt;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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

public class TestClient extends JFrame {
	Socket socket = null;

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JTextField tfServerIp;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JScrollPane scrollPane;
	private JScrollPane scrollPane_1;
	private JEditorPane editorPane;
	private JButton btnNewButton_2;
	private JTextField tfMsg;
	private JButton btnNewButton_3;
	private JList list;

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
		if (socket == null) {
			try {
				socket = new Socket(tfServerIp.getText(), 4444);
				editorPane.setText("서버에 연결되었습니다.");

			} catch (Exception ex) { // 무슨 오류든 뜨면 밑에문장 실행
				String msg = "<font color ='red'> 서버연결중 오류 발생!!! </font>";
				editorPane.setText(msg);
			}
		}
	}

	public void disConnect() {
		if (socket != null) {
			try {
				socket.close();
				socket = null;
				editorPane.setText("서버 연결을 종료했습니다.");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public TestClient() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 559, 484);
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
		contentPane.add(getTfMsg());
		contentPane.add(getBtnNewButton_3());

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

					String sip = tfServerIp.getText(); // 입력 아이피값
					int tt = Integer.parseInt(sip); // 변환
					int po = socket.getPort(); // 찿아가려는아이피값
					String sss;
					if (po == tt) {
						try {
							socket = new Socket(tfServerIp.getText(), 4444);
							editorPane.setText("서버에 연결되었습니다.");

						} catch (Exception ex) { // 무슨 오류든 뜨면 밑에문장 실행
							String msg = "<font color ='red'> 서버연결중 오류 발생!!! </font>";
							editorPane.setText(msg);
							
						}

					}

				}
			});
			btnNewButton.setBounds(328, 6, 97, 23);
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
			btnNewButton_1.setBounds(437, 6, 97, 23);
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
		}
		return editorPane;
	}

	private JButton getBtnNewButton_2() {
		if (btnNewButton_2 == null) {
			btnNewButton_2 = new JButton("귓속말");
			btnNewButton_2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {

				}
			});
			btnNewButton_2.setBounds(12, 411, 97, 23);
		}
		return btnNewButton_2;
	}

	private JTextField getTfMsg() {
		if (tfMsg == null) {
			tfMsg = new JTextField();
			tfMsg.setBounds(121, 412, 304, 21);
			tfMsg.setColumns(10);
		}
		return tfMsg;
	}

	private JButton getBtnNewButton_3() {
		if (btnNewButton_3 == null) {
			btnNewButton_3 = new JButton("전송");
			btnNewButton_3.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {

					String sip = tfServerIp.getText(); // 입력 아이피값
					int tt = Integer.parseInt(sip); // 변환된 입력 아이피값
					int po = socket.getPort(); // 찿아가려는아이피값

					if (po == tt) {
						while (true) {
							editorPane.setText("<font color = 'black'> </font>");
						}
					}
				}
			});
			btnNewButton_3.setBounds(437, 411, 97, 23);
		}
		return btnNewButton_3;
	}
}
