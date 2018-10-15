package chap18;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Font;
import java.util.Vector;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class InputPanel extends JPanel {
	
	Vector<Board> data = null;
	
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JTextField tfWorker;
	private JTextField tfSubject;
	private JTextField tfPwd;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JScrollPane scrollPane;
	private JTextArea tfContent;
// 입력
	/**
	 * Create the panel.
	 */
	
	public InputPanel(Vector<Board> v) {
		this();			//  => 자기 자신의 생성자를 호출 매개타입이 같은 것으로!
		this.data = v;
	}
	public InputPanel() {
		setBackground(new Color(255, 245, 238));
		setLayout(null);
		add(getLblNewLabel());
		add(getLblNewLabel_1());
		add(getLblNewLabel_2());
		add(getLblNewLabel_3());
		add(getLblNewLabel_4());
		add(getTfWorker());
		add(getTfSubject());
		add(getTfPwd());
		add(getBtnNewButton());
		add(getBtnNewButton_1());
		add(getScrollPane());

	}
	/* 선생님 버전 check()
	 * public Board check() {
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
			 b = new Board(w,s,c,p);
			
		}
		
		return b; 
	 */
	public boolean check() {
		boolean bln = false;
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
			
			bln = true;
			b = new Board(w,s,c,p);
			data.add(b);
		}
		
		return bln; 
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
			lblNewLabel = new JLabel("게시판 입력");
			lblNewLabel.setFont(new Font("굴림", Font.BOLD, 16));
			lblNewLabel.setForeground(new Color(153, 102, 102));
			lblNewLabel.setBounds(12, 10, 400, 35);
		}
		return lblNewLabel;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("작 성 자");
			lblNewLabel_1.setBounds(22, 66, 57, 15);
		}
		return lblNewLabel_1;
	}
	private JLabel getLblNewLabel_2() {
		if (lblNewLabel_2 == null) {
			lblNewLabel_2 = new JLabel("제     목");
			lblNewLabel_2.setBounds(22, 114, 57, 15);
		}
		return lblNewLabel_2;
	}
	private JLabel getLblNewLabel_3() {
		if (lblNewLabel_3 == null) {
			lblNewLabel_3 = new JLabel("내     용");
			lblNewLabel_3.setBounds(22, 167, 57, 15);
		}
		return lblNewLabel_3;
	}
	private JLabel getLblNewLabel_4() {
		if (lblNewLabel_4 == null) {
			lblNewLabel_4 = new JLabel("암     호");
			lblNewLabel_4.setBounds(22, 299, 57, 15);
		}
		return lblNewLabel_4;
	}
	private JTextField getTfWorker() {
		if (tfWorker == null) {
			tfWorker = new JTextField();
			tfWorker.setBounds(83, 63, 116, 21);
			tfWorker.setColumns(10);
		}
		return tfWorker;
	}
	private JTextField getTfSubject() {
		if (tfSubject == null) {
			tfSubject = new JTextField();
			tfSubject.setBounds(83, 111, 329, 21);
			tfSubject.setColumns(10);
		}
		return tfSubject;
	}
	private JTextField getTfPwd() {
		if (tfPwd == null) {
			tfPwd = new JTextField();
			tfPwd.setBounds(83, 296, 116, 21);
			tfPwd.setColumns(10);
		}
		return tfPwd;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("저  장");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					if (check() == true) {
						BoardEx.status.setForeground(Color.BLUE);
						BoardEx.status.setText("데이터가 저장되었습니다.");
						BoardEx.mdFlag = true;
					}
					
					itemClear();
				}
			});
			btnNewButton.setBackground(new Color(240, 248, 255));
			btnNewButton.setBounds(102, 361, 97, 23);
		}
		return btnNewButton;
	}
	private JButton getBtnNewButton_1() {
		if (btnNewButton_1 == null) {
			btnNewButton_1 = new JButton("취  소");
			btnNewButton_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					itemClear();
				}
			});
			btnNewButton_1.setBackground(new Color(240, 248, 255));
			btnNewButton_1.setBounds(223, 361, 97, 23);
		}
		return btnNewButton_1;
	}
	private JScrollPane getScrollPane() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setBounds(83, 154, 335, 132);
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
}
