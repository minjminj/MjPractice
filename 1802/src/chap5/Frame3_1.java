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
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;

public class Frame3_1 extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JTextField tfNo;
	private JTextField tfName;
	private JTextField tfKor;
	private JTextField tfEng;
	private JButton btnNewButton;
	private JScrollPane scrollPane;
	private JTextArea textArea;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame3_1 frame = new Frame3_1();
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
	public Frame3_1() {
		setTitle("\uC131\uC801 \uCC98\uB9AC");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 416, 617);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(135, 206, 250));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblNewLabel());
		contentPane.add(getLblNewLabel_1());
		contentPane.add(getLblNewLabel_2());
		contentPane.add(getLblNewLabel_3());
		contentPane.add(getTfNo());
		contentPane.add(getTfName());
		contentPane.add(getTextField_1());
		contentPane.add(getTextField_2());
		contentPane.add(getBtnNewButton());
		contentPane.add(getScrollPane());
	}

	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("\uD559\uBC88");
			lblNewLabel.setBounds(12, 38, 57, 15);
		}
		return lblNewLabel;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("\uC131\uBA85");
			lblNewLabel_1.setBounds(12, 89, 57, 15);
		}
		return lblNewLabel_1;
	}
	private JLabel getLblNewLabel_2() {
		if (lblNewLabel_2 == null) {
			lblNewLabel_2 = new JLabel("\uAD6D\uC5B4");
			lblNewLabel_2.setBounds(12, 142, 57, 15);
		}
		return lblNewLabel_2;
	}
	private JLabel getLblNewLabel_3() {
		if (lblNewLabel_3 == null) {
			lblNewLabel_3 = new JLabel("\uC601\uC5B4");
			lblNewLabel_3.setBounds(12, 202, 57, 15);
		}
		return lblNewLabel_3;
	}
	private JTextField getTfNo() {
		if (tfNo == null) {
			tfNo = new JTextField();
			tfNo.setBounds(45, 35, 116, 21);
			tfNo.setColumns(10);
		}
		return tfNo;
	}
	private JTextField getTfName() {
		if (tfName == null) {
			tfName = new JTextField();
			tfName.setBounds(45, 86, 116, 21);
			tfName.setColumns(10);
		}
		return tfName;
	}
	private JTextField getTextField_1() {
		if (tfKor == null) {
			tfKor = new JTextField();
			tfKor.setBounds(45, 139, 116, 21);
			tfKor.setColumns(10);
		}
		return tfKor;
	}
	private JTextField getTextField_2() {
		if (tfEng == null) {
			tfEng = new JTextField();
			tfEng.setBounds(45, 199, 116, 21);
			tfEng.setColumns(10);
		}
		return tfEng;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("\uACC4 \uC0B0");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String no = tfNo.getText();
					String name = tfName.getText();
					String kor = tfKor.getText();
					String eng = tfEng.getText();
					
					int k = Integer.parseInt(kor);
					int g = Integer.parseInt(eng);
					
					ArrayEx3 ae3 = new ArrayEx3(no, name, k, g);
					textArea.setText(ae3.prn());
					
				}
			});
			btnNewButton.setBounds(239, 180, 101, 58);
		}
		return btnNewButton;
	}
	private JScrollPane getScrollPane() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setBounds(45, 311, 295, 224);
			scrollPane.setViewportView(getTextArea());
			scrollPane.setColumnHeaderView(getTextField());
		}
		return scrollPane;
	}
	private JTextArea getTextArea() {
		if (textArea == null) {
			textArea = new JTextArea();
			textArea.setForeground(SystemColor.scrollbar);
		}
		return textArea;
	}
	private JTextField getTextField() {
		if (textField == null) {
			textField = new JTextField();
			textField.setForeground(new Color(255, 250, 240));
			textField.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 14));
			textField.setBackground(new Color(253, 245, 230));
			textField.setHorizontalAlignment(SwingConstants.CENTER);
			textField.setText("\uC131\uC801 \uCC98\uB9AC \uACB0\uACFC");
			textField.setColumns(10);
		}
		return textField;
	}
}
