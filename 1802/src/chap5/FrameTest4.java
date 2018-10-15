package chap5;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;

public class FrameTest4 extends JFrame {

	private JPanel contentPane;
	private JLabel label;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JLabel lblNewLabel_6;
	private JTextField tfNo;
	private JTextField tfName;
	private JTextField tfKor;
	private JTextField tfEng;
	private JTextField tfTot;
	private JTextField tfAvg;
	private JTextField tfGrade;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JScrollPane scrollPane;
	private JTextArea textArea;
	private JLabel label_1;

	/**
	 * Launch the application.
	 */
	
	Student[] student = new Student[10];	// student 타입의 배열 초기화.
	int position = 0;	// 저장될 현재 위치 or 저장된 배열의 수
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrameTest4 frame = new FrameTest4();
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
	public FrameTest4() {
		setTitle("성적 처리");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 403, 715);
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
		contentPane.add(getTfNo());
		contentPane.add(getTfName());
		contentPane.add(getTfKor());
		contentPane.add(getTfEng());
		contentPane.add(getTfTot());
		contentPane.add(getTfAvg());
		contentPane.add(getTfGrade());
		contentPane.add(getBtnNewButton());
		contentPane.add(getBtnNewButton_1());
		contentPane.add(getBtnNewButton_2());
		contentPane.add(getScrollPane());
	}

	private JLabel getLabel() {
		if (label == null) {
			label = new JLabel("성 적  처 리");
			label.setOpaque(true);
			label.setHorizontalAlignment(SwingConstants.CENTER);
			label.setFont(new Font("돋움체", Font.BOLD, 15));
			label.setForeground(new Color(128, 128, 128));
			label.setBackground(new Color(220, 220, 220));
			label.setBounds(12, 10, 363, 24);
		}
		return label;
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("학번");
			lblNewLabel.setBounds(24, 49, 57, 15);
		}
		return lblNewLabel;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("성명");
			lblNewLabel_1.setBounds(203, 49, 57, 15);
		}
		return lblNewLabel_1;
	}
	private JLabel getLblNewLabel_2() {
		if (lblNewLabel_2 == null) {
			lblNewLabel_2 = new JLabel("국어");
			lblNewLabel_2.setBounds(23, 92, 57, 15);
		}
		return lblNewLabel_2;
	}
	private JLabel getLblNewLabel_3() {
		if (lblNewLabel_3 == null) {
			lblNewLabel_3 = new JLabel("영어");
			lblNewLabel_3.setBounds(159, 92, 57, 15);
		}
		return lblNewLabel_3;
	}
	private JLabel getLblNewLabel_4() {
		if (lblNewLabel_4 == null) {
			lblNewLabel_4 = new JLabel("평균");
			lblNewLabel_4.setBounds(159, 135, 57, 15);
		}
		return lblNewLabel_4;
	}
	private JLabel getLblNewLabel_5() {
		if (lblNewLabel_5 == null) {
			lblNewLabel_5 = new JLabel("총점");
			lblNewLabel_5.setBounds(24, 135, 57, 15);
		}
		return lblNewLabel_5;
	}
	private JLabel getLblNewLabel_6() {
		if (lblNewLabel_6 == null) {
			lblNewLabel_6 = new JLabel("학점");
			lblNewLabel_6.setBounds(129, 181, 57, 15);
		}
		return lblNewLabel_6;
	}
	private JTextField getTfNo() {
		if (tfNo == null) {
			tfNo = new JTextField();
			tfNo.setBounds(60, 46, 105, 21);
			tfNo.setColumns(10);
		}
		return tfNo;
	}
	private JTextField getTfName() {
		if (tfName == null) {
			tfName = new JTextField();
			tfName.setBounds(245, 46, 116, 21);
			tfName.setColumns(10);
		}
		return tfName;
	}
	private JTextField getTfKor() {
		if (tfKor == null) {
			tfKor = new JTextField();
			tfKor.setBounds(60, 89, 63, 21);
			tfKor.setColumns(10);
		}
		return tfKor;
	}
	private JTextField getTfEng() {
		if (tfEng == null) {
			tfEng = new JTextField();
			tfEng.setBounds(187, 89, 57, 21);
			tfEng.setColumns(10);
		}
		return tfEng;
	}
	private JTextField getTfTot() {
		if (tfTot == null) {
			tfTot = new JTextField();
			tfTot.setBounds(60, 132, 63, 21);
			tfTot.setColumns(10);
		}
		return tfTot;
	}
	private JTextField getTfAvg() {
		if (tfAvg == null) {
			tfAvg = new JTextField();
			tfAvg.setBounds(187, 132, 57, 21);
			tfAvg.setColumns(10);
		}
		return tfAvg;
	}
	private JTextField getTfGrade() {
		if (tfGrade == null) {
			tfGrade = new JTextField();
			tfGrade.setBounds(187, 178, 57, 21);
			tfGrade.setColumns(10);
		}
		return tfGrade;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("계산");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String strNo = tfNo.getText();
					String strName = tfName.getText();
					int kor = Integer.parseInt(tfKor.getText());
					int eng = Integer.parseInt(tfEng.getText());
					
					Student s = new Student(strNo,strName, kor, eng);
					tfTot.setText(s.tot+"");
					tfAvg.setText(s.avg+"");
					tfGrade.setText(s.grade+"");
					
				
				}
			});
			btnNewButton.setBounds(275, 103, 84, 44);
		}
		return btnNewButton;
	}
	private JButton getBtnNewButton_1() {
		if (btnNewButton_1 == null) {
			btnNewButton_1 = new JButton("저장");
			btnNewButton_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String strNo = tfNo.getText();
					String strName = tfName.getText();
					int kor = Integer.parseInt(tfKor.getText());
					int eng = Integer.parseInt(tfEng.getText());
					
					Student s = new Student(strNo,strName, kor, eng);
					
					if (position == 10) {
						textArea.setText("데이터가 꽉 찼습니다");
					} else {
						student[position] = s;		// 필드에 Student[] student = new Student[10]
						position++;
						textArea.append(position + "번째 데이터가 저장됨.\n");
				}
				}});
			btnNewButton_1.setBounds(139, 225, 109, 32);
		}
		return btnNewButton_1;
	}
	private JButton getBtnNewButton_2() {
		if (btnNewButton_2 == null) {
			btnNewButton_2 = new JButton("출력");
			btnNewButton_2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					textArea.setText("");
					
					// 기존 for문
					/*for (int i=0 ; i<position ; i++) {
							Student str = student[i];
							textArea.append(str.prn()+"\n");
						}*/
					
					// 향상된 for문
					for (Student k : student) { 	// 타입은 대문자로 시작. 배열명은 소문자!!! 필드 정의 참고
						if (k == null) continue;
						textArea.append(k.prn());
					}
					
				}
			});
			btnNewButton_2.setBounds(139, 598, 105, 31);
		}
		return btnNewButton_2;
	}
	private JScrollPane getScrollPane() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setBounds(12, 296, 360, 275);
			scrollPane.setViewportView(getTextArea());
			scrollPane.setColumnHeaderView(getLabel_1());
		}
		return scrollPane;
	}
	private JTextArea getTextArea() {
		if (textArea == null) {
			textArea = new JTextArea();
		}
		return textArea;
	}
	private JLabel getLabel_1() {
		if (label_1 == null) {
			label_1 = new JLabel("학번  성명  국어  영어  총점  평균  학점");
			label_1.setForeground(new Color(169, 169, 169));
			label_1.setOpaque(true);
			label_1.setBackground(new Color(255, 228, 225));
			label_1.setHorizontalAlignment(SwingConstants.CENTER);
		}
		return label_1;
	}
}
