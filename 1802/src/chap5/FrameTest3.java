package chap5;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FrameTest3 extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel label;
	private JLabel lblNewLabel_3;
	private JTextField tfNo;
	private JTextField tfName;
	private JTextField tfKor;
	private JTextField tfEng;
	private JButton btnNewButton;
	private JScrollPane scrollPane;
	private JTextArea textArea;
	private JLabel lblNewLabel_4;
	private JButton btnNewButton_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrameTest3 frame = new FrameTest3();
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
	public FrameTest3() {
		setTitle("\uC131\uC801 \uCC98\uB9AC");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 523, 558);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblNewLabel());
		contentPane.add(getLblNewLabel_1());
		contentPane.add(getLblNewLabel_2());
		contentPane.add(getLabel());
		contentPane.add(getLblNewLabel_3());
		contentPane.add(getTfNo());
		contentPane.add(getTfName());
		contentPane.add(getTfKor());
		contentPane.add(getTfEng());
		contentPane.add(getBtnNewButton());
		contentPane.add(getScrollPane());
		
	}

	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("\uC131\uC801 \uC785\uB825");
			lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel.setFont(new Font("πŸ≈¡√º", Font.ITALIC, 16));
			lblNewLabel.setBounds(12, 10, 483, 32);
		}
		return lblNewLabel;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("\uD559\uBC88");
			lblNewLabel_1.setBounds(33, 74, 57, 15);
		}
		return lblNewLabel_1;
	}
	private JLabel getLblNewLabel_2() {
		if (lblNewLabel_2 == null) {
			lblNewLabel_2 = new JLabel("\uC131\uBA85");
			lblNewLabel_2.setBounds(33, 121, 57, 15);
		}
		return lblNewLabel_2;
	}
	private JLabel getLabel() {
		if (label == null) {
			label = new JLabel("\uAD6D\uC5B4");
			label.setBounds(33, 168, 57, 15);
		}
		return label;
	}
	private JLabel getLblNewLabel_3() {
		if (lblNewLabel_3 == null) {
			lblNewLabel_3 = new JLabel("\uC601\uC5B4");
			lblNewLabel_3.setToolTipText("");
			lblNewLabel_3.setBounds(33, 216, 57, 15);
		}
		return lblNewLabel_3;
	}
	private JTextField getTfNo() {
		if (tfNo == null) {
			tfNo = new JTextField();
			tfNo.setBounds(95, 71, 116, 21);
			tfNo.setColumns(10);
		}
		return tfNo;
	}
	private JTextField getTfName() {
		if (tfName == null) {
			tfName = new JTextField();
			tfName.setBounds(95, 118, 116, 21);
			tfName.setColumns(10);
		}
		return tfName;
	}
	private JTextField getTfKor() {
		if (tfKor == null) {
			tfKor = new JTextField();
			tfKor.setBounds(95, 165, 116, 21);
			tfKor.setColumns(10);
		}
		return tfKor;
	}
	private JTextField getTfEng() {
		if (tfEng == null) {
			tfEng = new JTextField();
			tfEng.setBounds(95, 213, 116, 21);
			tfEng.setColumns(10);
		}
		return tfEng;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("\uACC4\uC0B0");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					String strNo = tfNo.getText();
					String strName = tfName.getText();
					String strKor = tfKor.getText();
					String strEng = tfEng.getText();
				
					
					/*textArea.setText("no" + strNo + '\n');
					textArea.append("Name" + strName + '\n');
					textArea.append("Kor" + strKor + '\n');
					textArea.append("Eng" + strEng + '\n');*/
					
					int kor = Integer.parseInt(strKor);
					int eng = Integer.parseInt(strEng);
					
					ArrayEx3 e3 = new ArrayEx3(strNo, strName, kor, eng);
					textArea.append(e3.prn() + '\n') ;
					
					
					
				}
			});
			btnNewButton.setBounds(307, 74, 122, 157);
		}
		return btnNewButton;
	}
	private JScrollPane getScrollPane() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setBounds(12, 260, 439, 226);
			scrollPane.setViewportView(getTextArea());
			scrollPane.setColumnHeaderView(getLblNewLabel_4());
		}
		return scrollPane;
	}
	private JTextArea getTextArea() {
		if (textArea == null) {
			textArea = new JTextArea();
		}
		return textArea;
	}
	private JLabel getLblNewLabel_4() {
		if (lblNewLabel_4 == null) {
			lblNewLabel_4 = new JLabel("\uC131\uC801 \uCC98\uB9AC \uACB0\uACFC");
			lblNewLabel_4.setForeground(new Color(25, 25, 112));
			lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_4.setBackground(Color.ORANGE);
		}
		return lblNewLabel_4;
	
	
		
	}
}
