package chap18;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import java.util.Vector;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class OutputPanel extends JPanel {
	
	Vector<Board> data = new Vector<Board>();
	
	private JLabel lblNewLabel;
	private JTextField tfFind;
	private JButton btnNewButton;
	private JScrollPane scrollPane;
	public JTextArea textArea;
// 출력
	/**
	 * Create the panel.
	 */
	public OutputPanel(Vector<Board> v) {
		this();
		this.data = v;
	}
	public OutputPanel() {
		setBackground(new Color(255, 240, 245));
		setLayout(null);
		add(getLblNewLabel());
		add(getTfFind());
		add(getBtnNewButton());
		add(getScrollPane());

	}

	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("게시판 조회 및 출력");
			lblNewLabel.setFont(new Font("굴림", Font.BOLD, 16));
			lblNewLabel.setForeground(new Color(255, 153, 204));
			lblNewLabel.setBounds(12, 10, 170, 26);
		}
		return lblNewLabel;
	}
	private JTextField getTfFind() {
		if (tfFind == null) {
			tfFind = new JTextField();
			tfFind.setBounds(98, 57, 198, 21);
			tfFind.setColumns(10);
		}
		return tfFind;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("검   색");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					textArea.setText("");
					String findstr = tfFind.getText();
					for (Board b : data) {
						if(b.getWorker().indexOf(findstr) >= 0 ||	 //indexOf는 포함되어 있으면 !=-1
							b.getSubject().indexOf(findstr) >= 0 ||
							b.getContent().indexOf(findstr) >= 0) {
							
							textArea.append(b.toStirng()+"\n");
						}
					}
					BoardEx.status.setText("검색된 데이터를 출력했습니다.");
				}
			});
			btnNewButton.setBackground(new Color(240, 248, 255));
			btnNewButton.setBounds(307, 56, 77, 23);
		}
		return btnNewButton;
	}
	private JScrollPane getScrollPane() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setBounds(30, 104, 374, 267);
			scrollPane.setViewportView(getTextArea());
		}
		return scrollPane;
	}
	private JTextArea getTextArea() {
		if (textArea == null) {
			textArea = new JTextArea();
		}
		return textArea;
	}
}
