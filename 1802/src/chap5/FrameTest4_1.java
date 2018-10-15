package chap5;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FrameTest4_1 extends JFrame {

	private JPanel contentPane;
	private JLabel label;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JLabel lblNewLabel_6;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JTextField tfNo;
	private JTextField tfKor;
	private JTextField tfTot;
	private JTextField tfGrade;
	private JTextField tfName;
	private JTextField tfEng;
	private JTextField tfAvg;
	private JScrollPane scrollPane;
	private JTextArea textArea;
	private JLabel lblNewLabel_7;
	private JButton btnNewButton_2;

	/**
	 * Launch the application.
	 */
	
	Student[] student = new Student[10];
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrameTest4_1 frame = new FrameTest4_1();
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
	public FrameTest4_1() {
		setTitle("성적 처리");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 451, 665);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLabel());
		contentPane.add(getLblNewLabel());
		contentPane.add(getLblNewLabel_1());
		contentPane.add(getLblNewLabel_2());
		contentPane.add(getLblNewLabel_3());
		contentPane.add(getLblNewLabel_4());
		contentPane.add(getLblNewLabel_5());
		contentPane.add(getLblNewLabel_6());
		contentPane.add(getBtnNewButton());
		contentPane.add(getBtnNewButton_1());
		contentPane.add(getTfNo());
		contentPane.add(getTfKor());
		contentPane.add(getTfTot());
		contentPane.add(getTfGrade());
		contentPane.add(getTfName());
		contentPane.add(getTfEng());
		contentPane.add(getTfAvg());
		contentPane.add(getScrollPane());
		contentPane.add(getBtnNewButton_2());
	}

	private JLabel getLabel() {
		if (label == null) {
			label = new JLabel("성 적 처 리");
			label.setForeground(new Color(245, 245, 245));
			label.setFont(new Font("맑은 고딕", Font.PLAIN, 14));
			label.setOpaque(true);
			label.setBackground(new Color(25, 25, 112));
			label.setHorizontalAlignment(SwingConstants.CENTER);
			label.setBounds(12, 10, 411, 38);
		}
		return label;
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("학 번");
			lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel.setBounds(12, 84, 57, 15);
		}
		return lblNewLabel;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("국 어");
			lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_1.setBounds(12, 138, 57, 15);
		}
		return lblNewLabel_1;
	}
	private JLabel getLblNewLabel_2() {
		if (lblNewLabel_2 == null) {
			lblNewLabel_2 = new JLabel("총 점");
			lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_2.setBounds(12, 195, 57, 15);
		}
		return lblNewLabel_2;
	}
	private JLabel getLblNewLabel_3() {
		if (lblNewLabel_3 == null) {
			lblNewLabel_3 = new JLabel("성 명");
			lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_3.setBounds(152, 84, 57, 15);
		}
		return lblNewLabel_3;
	}
	private JLabel getLblNewLabel_4() {
		if (lblNewLabel_4 == null) {
			lblNewLabel_4 = new JLabel("영 어");
			lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_4.setBounds(152, 138, 57, 15);
		}
		return lblNewLabel_4;
	}
	private JLabel getLblNewLabel_5() {
		if (lblNewLabel_5 == null) {
			lblNewLabel_5 = new JLabel("평 균");
			lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_5.setBounds(152, 195, 57, 15);
		}
		return lblNewLabel_5;
	}
	private JLabel getLblNewLabel_6() {
		if (lblNewLabel_6 == null) {
			lblNewLabel_6 = new JLabel("학 점");
			lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_6.setBounds(93, 262, 57, 15);
		}
		return lblNewLabel_6;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("계 산");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String strNo = tfNo.getText();
					String strName = tfName.getText();
					int kor = Integer.parseInt(tfKor.getText());
					int eng = Integer.parseInt(tfEng.getText());
					
					Student stu = new Student(strNo, strName, kor, eng);
					
					int tot = kor + eng;
					double avg = (double)tot / 2;
					
					tfTot.setText(kor+eng+" ");
					tfAvg.setText(avg + " ");
					
				}
			});
			btnNewButton.setBounds(334, 191, 67, 23);
		}
		return btnNewButton;
	}
	private JButton getBtnNewButton_1() {
		if (btnNewButton_1 == null) {
			btnNewButton_1 = new JButton("저 장");
			btnNewButton_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});
			btnNewButton_1.setBounds(334, 258, 67, 23);
		}
		return btnNewButton_1;
	}
	private JTextField getTfNo() {
		if (tfNo == null) {
			tfNo = new JTextField();
			tfNo.setBounds(61, 81, 97, 21);
			tfNo.setColumns(10);
		}
		return tfNo;
	}
	private JTextField getTfKor() {
		if (tfKor == null) {
			tfKor = new JTextField();
			tfKor.setBounds(61, 135, 97, 21);
			tfKor.setColumns(10);
		}
		return tfKor;
	}
	private JTextField getTfTot() {
		if (tfTot == null) {
			tfTot = new JTextField();
			tfTot.setBounds(61, 192, 97, 21);
			tfTot.setColumns(10);
		}
		return tfTot;
	}
	private JTextField getTfGrade() {
		if (tfGrade == null) {
			tfGrade = new JTextField();
			tfGrade.setBounds(152, 259, 97, 21);
			tfGrade.setColumns(10);
		}
		return tfGrade;
	}
	private JTextField getTfName() {
		if (tfName == null) {
			tfName = new JTextField();
			tfName.setBounds(200, 81, 97, 21);
			tfName.setColumns(10);
		}
		return tfName;
	}
	private JTextField getTfEng() {
		if (tfEng == null) {
			tfEng = new JTextField();
			tfEng.setBounds(200, 135, 97, 21);
			tfEng.setColumns(10);
		}
		return tfEng;
	}
	private JTextField getTfAvg() {
		if (tfAvg == null) {
			tfAvg = new JTextField();
			tfAvg.setBounds(200, 192, 97, 21);
			tfAvg.setColumns(10);
		}
		return tfAvg;
	}
	private JScrollPane getScrollPane() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setBounds(26, 300, 375, 215);
			scrollPane.setViewportView(getTextArea());
			scrollPane.setColumnHeaderView(getLblNewLabel_7());
		}
		return scrollPane;
	}
	private JTextArea getTextArea() {
		if (textArea == null) {
			textArea = new JTextArea();
		}
		return textArea;
	}
	private JLabel getLblNewLabel_7() {
		if (lblNewLabel_7 == null) {
			lblNewLabel_7 = new JLabel(" 학번   성명   국어   영어   총점   평균   학점 ");
			lblNewLabel_7.setForeground(new Color(105, 105, 105));
			lblNewLabel_7.setBackground(new Color(173, 216, 230));
			lblNewLabel_7.setOpaque(true);
			lblNewLabel_7.setHorizontalAlignment(SwingConstants.CENTER);
		}
		return lblNewLabel_7;
	}
	private JButton getBtnNewButton_2() {
		if (btnNewButton_2 == null) {
			btnNewButton_2 = new JButton("출 력");
			btnNewButton_2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});
			btnNewButton_2.setBounds(127, 534, 161, 38);
		}
		return btnNewButton_2;
	}
}
