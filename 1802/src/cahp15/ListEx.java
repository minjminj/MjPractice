package cahp15;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class ListEx extends JFrame {

	private JPanel contentPane;
	private JTextField tfData;
	private JButton btnAdd;
	private JButton btnRemove;
	private JButton btnOutput;
	private JButton btnFind;
	private JScrollPane scrollPane;
	private JTextArea textArea;

	/**
	 * Launch the application.
	 */
	
	List<String> data = new Vector<String>(10,3);
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ListEx frame = new ListEx();
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
	public ListEx() {
		setTitle("ListEx");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 364, 651);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getTfData());
		contentPane.add(getBtnAdd());
		contentPane.add(getBtnRemove());
		contentPane.add(getBtnOutput());
		contentPane.add(getBtnFind());
		contentPane.add(getScrollPane_1());
	}
	private JTextField getTfData() {
		if (tfData == null) {
			tfData = new JTextField();
			tfData.setBounds(52, 38, 140, 21);
			tfData.setColumns(10);
		}
		return tfData;
	}
	private JButton getBtnAdd() {
		if (btnAdd == null) {
			btnAdd = new JButton("\uCD94  \uAC00");
			btnAdd.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String str = tfData.getText();
					data.add(str);
					
					int capa = ((Vector)data).capacity();
					int size = data.size();
					
					
					textArea.setText(str + "데이터가 저장됨.\n");
					textArea.append("전체 용량: " + capa + "\n");
					textArea.append("저장된 데이터의 개수: " + size + "\n");
				}
			});
			btnAdd.setBounds(33, 90, 74, 23);
		}
		return btnAdd;
	}
	private JButton getBtnRemove() {
		if (btnRemove == null) {
			btnRemove = new JButton("\uC0AD  \uC81C");
			btnRemove.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					String str = tfData.getText();
					data.remove(str);
					
					for (String find : data) {
						if (str.equals(find)) {
							
							textArea.setText(str + "데이터가 삭제됨!!!!!!!!!\n");
							textArea.append("남은 데이터");
							tfData.requestFocus(); 		// 커서를 입력상자로 이동
						} else {
							textArea.setText("저장되지 않은 데이터입니다.");
						}
					}
				}
			});
			btnRemove.setEnabled(false);
			btnRemove.setBounds(142, 90, 74, 23);
		}
		return btnRemove;
	}
	private JButton getBtnOutput() {
		if (btnOutput == null) {
			btnOutput = new JButton("\uCD9C  \uB825");
			btnOutput.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					textArea.setText("전체 데이터 -----------\n\n");
					for (String str : data) {
						textArea.append(str + "\n");
					}
					
					// get()
					textArea.append("-----------get()-----------\n");
					for (int i=0 ; i<data.size() ; i++) {
						textArea.append(data.get(i) + "\n");
					}
					
				}
			});
			btnOutput.setBounds(251, 90, 74, 23);
		}
		return btnOutput;
	}
	private JButton getBtnFind() {
		if (btnFind == null) {
			btnFind = new JButton("\uC870  \uD68C");
			btnFind.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					int capa = ((Vector)data).capacity(); // 용량. List 구조의 메소드에는 capacity가 업어서 Vector로 강제형변환.
					int size = data.size();	// 저장된 데이터의 개수
					int cnt = 0;	// 검색된 건수
					String find = tfData.getText();
					
					textArea.setText("전체 용량: " + capa + "\n");
					textArea.append("데이터의 개수:" + size + "\n");
					if (size == 0) {
						textArea.append("저장된 데이터가 없습니다.\n");
					} else {
						// 검색된 데이터의 개수
						for (String str : data) {
							if (str.equals(find)) {
								cnt++;
							}
						}
						textArea.append("검색된 데이터의 건수: " + cnt + "\n");
					}
					
					// 검색된 데이터가 1건 이상인 경우 삭제버튼 활성화
					if (cnt > 0) {
						btnRemove.setEnabled(true);
					} else {
						btnRemove.setEnabled(false);
					}
				}	
			}	
			);
			btnFind.setBounds(215, 37, 97, 23);
		}
		return btnFind;
	}
	private JScrollPane getScrollPane_1() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setBounds(12, 154, 324, 425);
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
