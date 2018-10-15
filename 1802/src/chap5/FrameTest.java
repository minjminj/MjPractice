package chap5;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;

public class FrameTest extends JFrame {
	
	int cnt = 0;

	private JPanel contentPane;
	private JLabel label;
	private JTextField tfNo;
	private JLabel lblNewLabel;
	private JTextField tfName;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JTextField tfKor;
	private JTextField tfEng;
	private JTextField tfTot;
	private JTextField tfAvg;
	private JTextField tfGrade;
	private JButton button;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrameTest frame = new FrameTest();
					frame.setVisible(true);		// 보여지는 속성; 값을 false로 하면 소스에는 값이 저장되지만 화면에 출력되지는 않음.
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public FrameTest() {
		setTitle("\uCCAB\uBC88\uC9F8\uB85C \uB9CC\uB4E0 \uD504\uB808\uC784");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 433, 290);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);		// absolute 값이 null
		contentPane.add(getLabel());
		contentPane.add(getTfNo());
		contentPane.add(getLblNewLabel());
		contentPane.add(getTfName());
		contentPane.add(getLblNewLabel_1());
		contentPane.add(getTfKor());
		contentPane.add(getLblNewLabel_2());
		contentPane.add(getTfEng());
		contentPane.add(getLblNewLabel_3());
		contentPane.add(getTfTot());
		contentPane.add(getLblNewLabel_4());
		contentPane.add(getTfAvg());
		contentPane.add(getLblNewLabel_5());
		contentPane.add(getTfGrade());
		contentPane.add(getButton());
	}
	private JLabel getLabel() {
		if (label == null) {
			label = new JLabel("\uD559\uBC88");
			label.setHorizontalAlignment(SwingConstants.CENTER);
			label.setBounds(30, 28, 57, 15);
		}
		return label;
	}
	private JTextField getTfNo() {
		if (tfNo == null) {
			tfNo = new JTextField();
			tfNo.setBounds(99, 25, 116, 21);
			tfNo.setColumns(10);
		}
		return tfNo;
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("\uC131\uBA85");
			lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel.setBounds(30, 59, 57, 15);
		}
		return lblNewLabel;
	}
	private JTextField getTfName() {
		if (tfName == null) {
			tfName = new JTextField();
			tfName.setBounds(99, 56, 116, 21);
			tfName.setColumns(10);
		}
		return tfName;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("\uAD6D\uC5B4");
			lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_1.setBounds(30, 90, 57, 15);
		}
		return lblNewLabel_1;
	}
	private JLabel getLblNewLabel_2() {
		if (lblNewLabel_2 == null) {
			lblNewLabel_2 = new JLabel("\uC601\uC5B4");
			lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_2.setBounds(30, 123, 57, 15);
		}
		return lblNewLabel_2;
	}
	private JLabel getLblNewLabel_3() {
		if (lblNewLabel_3 == null) {
			lblNewLabel_3 = new JLabel("\uCD1D\uC810");
			lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_3.setBounds(30, 154, 57, 15);
		}
		return lblNewLabel_3;
	}
	private JLabel getLblNewLabel_4() {
		if (lblNewLabel_4 == null) {
			lblNewLabel_4 = new JLabel("\uD3C9\uADE0");
			lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_4.setBounds(30, 186, 57, 15);
		}
		return lblNewLabel_4;
	}
	private JLabel getLblNewLabel_5() {
		if (lblNewLabel_5 == null) {
			lblNewLabel_5 = new JLabel("\uD559\uC810");
			lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_5.setBounds(30, 211, 57, 15);
		}
		return lblNewLabel_5;
	}
	private JTextField getTfKor() {
		if (tfKor == null) {
			tfKor = new JTextField();
			tfKor.setBounds(99, 87, 116, 21);
			tfKor.setColumns(10);
		}
		return tfKor;
	}
	private JTextField getTfEng() {
		if (tfEng == null) {
			tfEng = new JTextField();
			tfEng.setBounds(99, 120, 116, 21);
			tfEng.setColumns(10);
		}
		return tfEng;
	}
	private JTextField getTfTot() {
		if (tfTot == null) {
			tfTot = new JTextField();
			tfTot.setEditable(false);
			tfTot.setBounds(99, 151, 116, 21);
			tfTot.setColumns(10);
		}
		return tfTot;
	}
	private JTextField getTfAvg() {
		if (tfAvg == null) {
			tfAvg = new JTextField();
			tfAvg.setEditable(false);
			tfAvg.setBounds(99, 182, 116, 21);
			tfAvg.setColumns(10);
		}
		return tfAvg;
	}
	private JTextField getTfGrade() {
		if (tfGrade == null) {
			tfGrade = new JTextField();
			tfGrade.setEditable(false);
			tfGrade.setBounds(99, 208, 116, 21);
			tfGrade.setColumns(10);
		}
		return tfGrade;
	}
	private JButton getButton() {
		if (button == null) {
			button = new JButton("\uACC4\uC0B0");
			
			// 버튼이 클릭되었을때
			button.addActionListener(new ActionListener() {		// Listener 인터페이스를 구현하는 클래스
				public void actionPerformed(ActionEvent e) {
					cnt ++;
					String strNo = tfNo.getText();
					String strName = tfName.getText();
					String strKor = tfKor.getText();
					String strEng = tfEng.getText();
					
					// 문자열로 입력된 정수값이 숫자형 정수로 변환
					int kor = Integer.parseInt(strKor);
					int eng = Integer.parseInt(strEng);
					int tot = 0;
					double avg = 0;
					char grade = 'F';		// 초기값을 F로 설정하면 마지막 else문 생략할 수 있음.
										
					// 총점
					tot = kor + eng;
					avg = (double)tot / 2;
					
					if (avg >= 90)		grade = 'A';
					else if (avg >= 80)	grade = 'B';
					else if (avg >= 70)	grade = 'C';
					else if (avg >= 60) grade = 'D';
					
					//ui에 표시
					tfTot.setText(tot+"");		// ""는 정수형인 tot를 문자열로 바꿔주기 위해! (+연산의 특징)
					tfAvg.setText(avg+"");
					tfGrade.setText(grade+"");
					
					
				}
			});
			button.setBounds(284, 24, 97, 23);
		}
		return button;
	}
}
