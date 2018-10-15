package chap18;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.UIManager;
import java.awt.SystemColor;
import java.util.Vector;

import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ModifyPanel extends JPanel {

	Vector<Board> data = null;

	Board b = null;

	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JLabel lblNewLabel_6;
	private JTextField tfNo;
	private JTextField tfMdate;
	private JTextField tfWorker;
	private JTextField tfSubject;
	private JTextField tfPwd;
	private JLabel lblNewLabel_7;
	private JButton btnEdit;
	private JButton btnRemove;
	private JButton btnCancle;
	private JScrollPane scrollPane;
	private JTextArea tfContent;
	private JButton btnNewButton_3;

	// 수정, 삭제, 조회
	/**
	 * Create the panel.
	 */

	public ModifyPanel(Vector<Board> v) {
		this();
		this.data = v;
	}

	public ModifyPanel() {
		setBackground(new Color(255, 250, 240));
		setLayout(null);
		add(getLblNewLabel());
		add(getLblNewLabel_1());
		add(getLblNewLabel_2());
		add(getLblNewLabel_3());
		add(getLblNewLabel_4());
		add(getLblNewLabel_5());
		add(getLblNewLabel_6());
		add(getTfNo());
		add(getTfMdate());
		add(getTfWorker());
		add(getTfSubject());
		add(getTfPwd());
		add(getLblNewLabel_7());
		add(getBtnEdit());
		add(getBtnRemove());
		add(getBtnCancle());
		add(getScrollPane());
		add(getBtnNewButton_3());

	}

	public Board check() {
		Board b = null;

		String w = tfWorker.getText();
		String s = tfSubject.getText();
		String c = tfContent.getText();
		String p = tfPwd.getText();

		if (w.trim().equals("")) {
			BoardEx.status.setText("작성자를 입력해주세요.");
		} else if (s.trim().equals("")) {
			BoardEx.status.setText("제목을 입력해주세요.");
		} else if (c.trim().equals("")) {
			BoardEx.status.setText("내용을 입력해주세요.");
		} else if (p.trim().equals("")) {
			BoardEx.status.setText("비밀번호를 입력해주세요.");
		} else {

			b = new Board(w, s, c, p);

		}

		return b;
	}

	public void itemClear() {
		tfWorker.setText("");
		tfSubject.setText("");
		tfContent.setText("");
		tfPwd.setText("");
		tfWorker.requestFocus();
	}

	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("게시판 수정");
			lblNewLabel.setFont(new Font("굴림", Font.BOLD, 16));
			lblNewLabel.setBackground(new Color(0, 51, 0));
			lblNewLabel.setForeground(SystemColor.activeCaption);
			lblNewLabel.setBounds(12, 10, 102, 28);
		}
		return lblNewLabel;
	}

	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("번     호");
			lblNewLabel_1.setBounds(22, 48, 57, 15);
		}
		return lblNewLabel_1;
	}

	private JLabel getLblNewLabel_2() {
		if (lblNewLabel_2 == null) {
			lblNewLabel_2 = new JLabel("작성일자");
			lblNewLabel_2.setBounds(22, 81, 57, 15);
		}
		return lblNewLabel_2;
	}

	private JLabel getLblNewLabel_3() {
		if (lblNewLabel_3 == null) {
			lblNewLabel_3 = new JLabel("작 성 자");
			lblNewLabel_3.setBounds(22, 116, 57, 15);
		}
		return lblNewLabel_3;
	}

	private JLabel getLblNewLabel_4() {
		if (lblNewLabel_4 == null) {
			lblNewLabel_4 = new JLabel("제     목");
			lblNewLabel_4.setBounds(22, 146, 57, 15);
		}
		return lblNewLabel_4;
	}

	private JLabel getLblNewLabel_5() {
		if (lblNewLabel_5 == null) {
			lblNewLabel_5 = new JLabel("내     용");
			lblNewLabel_5.setBounds(22, 196, 57, 15);
		}
		return lblNewLabel_5;
	}

	private JLabel getLblNewLabel_6() {
		if (lblNewLabel_6 == null) {
			lblNewLabel_6 = new JLabel("암     호");
			lblNewLabel_6.setBounds(23, 312, 57, 15);
		}
		return lblNewLabel_6;
	}

	private JTextField getTfNo() {
		if (tfNo == null) {
			tfNo = new JTextField();
			tfNo.setBounds(86, 48, 71, 21);
			tfNo.setColumns(10);
		}
		return tfNo;
	}

	private JTextField getTfMdate() {
		if (tfMdate == null) {
			tfMdate = new JTextField();
			tfMdate.setBounds(86, 81, 110, 21);
			tfMdate.setColumns(10);
		}
		return tfMdate;
	}

	private JTextField getTfWorker() {
		if (tfWorker == null) {
			tfWorker = new JTextField();
			tfWorker.setBounds(86, 113, 144, 21);
			tfWorker.setColumns(10);
		}
		return tfWorker;
	}

	private JTextField getTfSubject() {
		if (tfSubject == null) {
			tfSubject = new JTextField();
			tfSubject.setBounds(86, 143, 324, 21);
			tfSubject.setColumns(10);
		}
		return tfSubject;
	}

	private JTextField getTfPwd() {
		if (tfPwd == null) {
			tfPwd = new JTextField();
			tfPwd.setBounds(87, 309, 116, 21);
			tfPwd.setColumns(10);
		}
		return tfPwd;
	}

	private JLabel getLblNewLabel_7() {
		if (lblNewLabel_7 == null) {
			lblNewLabel_7 = new JLabel("(저장 시 암호)");
			lblNewLabel_7.setFont(new Font("굴림", Font.ITALIC, 12));
			lblNewLabel_7.setBounds(215, 312, 79, 15);
		}
		return lblNewLabel_7;
	}

	private JButton getBtnEdit() {
		if (btnEdit == null) {
			btnEdit = new JButton("수  정");
			btnEdit.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					Board bf = check();
					if (bf != null) {
						Board findBoard = new Board();
						int no = Integer.parseInt(tfNo.getText());
						String pwd = tfPwd.getText();
						findBoard.setNo(no);
						findBoard.setPwd(pwd);

						for (Board b : data) {
							if (b.getNo() == findBoard.getNo() && b.getPwd().equals(findBoard.getPwd())) {
								b.setWorker(tfWorker.getText());
								b.setSubject(tfSubject.getText());
								b.setContent(tfContent.getText());

								BoardEx.status.setText("수정이 완료되었습니다.");
								BoardEx.mdFlag = true;
							} else {
								BoardEx.status.setText("입력된 비밀번호가 다릅니다.");
							}
						}
					}

				}
			});
			btnEdit.setBackground(new Color(240, 248, 255));
			btnEdit.setBounds(106, 364, 71, 23);
		}
		return btnEdit;
	}

	private JButton getBtnRemove() {
		if (btnRemove == null) {
			btnRemove = new JButton("삭  제");
			btnRemove.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {

					Board findBoard = new Board();
					int no = Integer.parseInt(tfNo.getText());
					findBoard.setNo(no);

					for (Board b : data) {
						if (b.equals(findBoard)) {
							data.remove(b);
							BoardEx.mdFlag = true;
							break;

						}
					}

				}
			});
			btnRemove.setBackground(new Color(240, 248, 255));
			btnRemove.setBounds(189, 364, 71, 23);
		}
		return btnRemove;
	}

	private JButton getBtnCancle() {
		if (btnCancle == null) {
			btnCancle = new JButton("취  소");
			btnCancle.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					itemClear();
				}
			});
			btnCancle.setBackground(new Color(240, 248, 255));
			btnCancle.setBounds(272, 364, 71, 23);
		}
		return btnCancle;
	}

	private JScrollPane getScrollPane() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setBounds(86, 174, 324, 125);
			scrollPane.setViewportView(getTfContent());
		}
		return scrollPane;
	}

	private JTextArea getTfContent() {
		if (tfContent == null) {
			tfContent = new JTextArea();
		}
		return tfContent;
	}

	private JButton getBtnNewButton_3() {
		if (btnNewButton_3 == null) {
			btnNewButton_3 = new JButton("검  색");
			btnNewButton_3.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					Board findBoard = new Board();
					int no = Integer.parseInt(tfNo.getText());
					findBoard.setNo(no);

					for (Board b : data) {
						if (b.equals(findBoard)) {
							tfMdate.setText(b.getMdate());
							tfWorker.setText(b.getWorker());
							tfSubject.setText(b.getSubject());
							tfContent.setText(b.getContent());
						}
					}
				}
			});
			btnNewButton_3.setBounds(170, 45, 71, 23);
		}
		return btnNewButton_3;
	}
}
