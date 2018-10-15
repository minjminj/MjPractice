package cahp15;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Vector;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import java.awt.Font;
import javax.swing.JTextArea;

public class MapEx2 extends JFrame {

	private JPanel contentPane;
	private JLabel lblId;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JTextField tfID;
	private JTextField tfName;
	private JTextField tfKor;
	private JTextField tfEng;
	private JButton btnSearch;
	private JButton btnSave;
	private JButton btnEdit;
	private JButton btnDelete;
	private JButton btnOutput;
	private JScrollPane scrollPane;
	private JTextArea textArea;
	
	/**
	 * Launch the application.
	 */
	Map<String, Score> map = new HashMap<String, Score>(); // String key = Score.id
	boolean flag =false;  // 검색된 작업이 아님 // 수정과 삭제시 데이터가 map에 저장된 데이터인지 아닌지 여부를 따지기 위해.
	Score oldScore = null;		// 수정과 삭제 시 검색한 Score 객체를 지정해 줄 필요 있기때문에 미리 생성해둔 빈 객체.
		
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MapEx2 frame = new MapEx2();
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
	public MapEx2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 389, 546);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(173, 216, 230));
		contentPane.setForeground(new Color(0, 0, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblId());
		contentPane.add(getLblNewLabel());
		contentPane.add(getLblNewLabel_1());
		contentPane.add(getLblNewLabel_2());
		contentPane.add(getTfID());
		contentPane.add(getTfName());
		contentPane.add(getTfKor());
		contentPane.add(getTfEng());
		contentPane.add(getBtnSearch());
		contentPane.add(getBtnSave());
		contentPane.add(getBtnEdit());
		contentPane.add(getBtnDelete());
		contentPane.add(getBtnOutput());
		contentPane.add(getScrollPane());
		
	}
	public Score check() {	
	
		Score s = null;	 // 무결성에 하자가 없으면 객체가 생성됨.
		String id = tfID.getText();
		String name = tfName.getText();
		int kor = 0;
		int eng = 0;
		try {
			kor = Integer.parseInt(tfKor.getText());	// 성적 점수이기 때문에 입력되는 결과에 대한 제한이 많다. 100점 미만, only digit...->예외처리
			eng = Integer.parseInt(tfEng.getText());
			
			// 데이터의 적합성 체크 (데이터의 무결성)
			if (id.trim().equals("")) { // trim은 공백 제거. 공백을 제거했을때 입력된 것이 없는지 확인
				textArea.setText("id를 확인해주세요");
				tfID.requestFocus();
			} else if (name.trim().equals("")) {
				textArea.setText("성명을 확인해주세요");		// 오류에 대한 지적(설명)은 자세할수록 좋다
				tfName.requestFocus();
			} else if (kor<0 || kor >100) {
				textArea.setText("국어 점수를 확인해주세요");
				tfKor.requestFocus();
			} else if (eng<0 || eng > 100) {
				textArea.setText("영어 점수를 확인해주세요");
				tfEng.requestFocus();
			} else {
				s = new Score(id.trim(), name.trim(), kor, eng);  // =>문자열인 id와 name에 공백을 제거하는 trim()을 함께 써줘서 공백없이 입력해야함을 지정. 단 문자열 사이의 공백은 제거되지 않음. 문자열 앞뒤 공백들만 제거해서 저장!
				
			}
			
		} catch (Exception ex) {
			textArea.setText("성적은 숫자로만 입력해주세요");
			tfKor.requestFocus();
		} finally {
			return s;
		}
	}
	private JLabel getLblId() {
		if (lblId == null) {
			lblId = new JLabel("ID");
			lblId.setHorizontalAlignment(SwingConstants.LEFT);
			lblId.setBounds(33, 99, 57, 15);
		}
		return lblId;
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("성명");
			lblNewLabel.setBounds(33, 138, 57, 15);
		}
		return lblNewLabel;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("국어");
			lblNewLabel_1.setBounds(33, 182, 57, 15);
		}
		return lblNewLabel_1;
	}
	private JLabel getLblNewLabel_2() {
		if (lblNewLabel_2 == null) {
			lblNewLabel_2 = new JLabel("영어");
			lblNewLabel_2.setBounds(33, 222, 57, 15);
		}
		return lblNewLabel_2;
	}
	private JTextField getTfID() {
		if (tfID == null) {
			tfID = new JTextField();
			tfID.setBounds(71, 96, 116, 21);
			tfID.setColumns(10);
		}
		return tfID;
	}
	private JTextField getTfName() {
		if (tfName == null) {
			tfName = new JTextField();
			tfName.setBounds(71, 135, 116, 21);
			tfName.setColumns(10);
		}
		return tfName;
	}
	private JTextField getTfKor() {
		if (tfKor == null) {
			tfKor = new JTextField();
			tfKor.setBounds(71, 179, 116, 21);
			tfKor.setColumns(10);
		}
		return tfKor;
	}
	private JTextField getTfEng() {
		if (tfEng == null) {
			tfEng = new JTextField();
			tfEng.setBounds(71, 219, 116, 21);
			tfEng.setColumns(10);
		}
		return tfEng;
	}
	private JButton getBtnSearch() {
		if (btnSearch == null) {
			btnSearch = new JButton("검 색");
			btnSearch.setFont(new Font("맑은 고딕", Font.BOLD, 14));
			btnSearch.setForeground(new Color(0, 0, 0));
			btnSearch.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					// 저장된 데이터의 유무
					int size = map.size();
					flag = false;	// 저장된 데이터가 있는 경우 true. 
					
					if (size <= 0) {
						textArea.setText("저장된 데이터가 없습니다.");
					} else {
						// 검색할 객체 생성 (1)
						String id = tfID.getText().trim();
						String name = tfName.getText().trim();
						Score findScore = new Score(id, name ,0 ,0); // =>지금은 성적에 대한 부분은 고려하지 않으므로 0점처리
						boolean flag = false; // 저장된 데이터가 없을때, 있으면 true.
						
//						Set<Map.Entry<String, Score>> entrySet = map.entrySet();
//						Iterator<Map.Entry<String, Score>> entryIter = entrySet.iterator();
//						while (entryIter.hasNext()) {
//							Map.Entry<String, Score> entry = entryIter.next();
//							String k = entry.getKey();
//							Score s = entry.getValue();
//													
//							if (k.equals(findScore.id)) {	// 재정의 된 equals메소드 자체가 id와 name에 대한 비교만 저장되어 있기 때문에, 두 객체를 비교할때 점수는 아무런 영향을 미치지 않음.
//								flag = true;
//								
//								tfKor.setText(s.kor+"");
//								tfEng.setText(s.eng+"");
//								oldScore = findScore;
//							}
//						}
						
						// 검색할 객체 생성(2) 
						// map.get(key)		map 구조는 키값이 절대 중복되지 않기때문에 키값의 비교만 해도 무관
						Score score = map.get(id);
						if (score != null) {				// 데이터가 check메소드를 만족하는 형태로 만들어짐
							flag = true;					// 그래서 검색될 수 있다
							tfKor.setText(score.kor+"");
							tfEng.setText(score.eng+"");
							oldScore = findScore;
						}
						
						
						if (!flag) {
							textArea.setText("검색된 데이터가 없습니다.");
						} else {
							btnEdit.setEnabled(true);
							btnDelete.setEnabled(true);
							textArea.setText("데이터를 찾았습니다.");
						}
					}
				}
			});
			btnSearch.setBackground(new Color(255, 182, 193));
			btnSearch.setBounds(221, 107, 97, 49);
		}
		return btnSearch;
	}
	private JButton getBtnSave() {
		if (btnSave == null) {
			btnSave = new JButton("저 장");
			btnSave.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					Score s = check();		// 데이터 무결성 체크하는 메소드, 만약 데이터가 무결하지 않으면 null 반환
					if(s != null) {	// 개체가 만들어짐
						map.put(s.id, s);
					}
					textArea.setText(map.size() + "번째 데이터가 저장되었습니다.");
					
					
				
				}
			});
			btnSave.setFont(new Font("맑은 고딕", Font.BOLD, 14));
			btnSave.setBackground(new Color(255, 182, 193));
			btnSave.setBounds(33, 280, 72, 23);
		}
		return btnSave;
	}
	private JButton getBtnEdit() {
		if (btnEdit == null) {
			btnEdit = new JButton("수 정");
			btnEdit.setEnabled(false);
			btnEdit.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
//					Score s1 = check();	// 수정된 데이터에 따른 무결성 체크
//					String k = "";
//					if (s1 != null) {		// s1 이미 check메소드를 통해 set안에 만들어진 메소드임을 확인하니까 Iterator를 사용해서 다시 확인할 필요가 없다.
//						Set<Map.Entry<String, Score>> entrySet = map.entrySet();
//						Iterator<Map.Entry<String, Score>> entryIter = entrySet.iterator();
//						while (entryIter.hasNext()) {
//							Map.Entry<String, Score> entry = entryIter.next();
//							k = entry.getKey();
//							s1 = entry.getValue();
//						}
//						
					Score s2 = check();
//					map.put(k, s2);
						
					String key = tfID.getText();
					map.put(key, s2);
						
						textArea.setText("데이터가 정상적으로 수정됨");
					//}
				}
			});
			btnEdit.setFont(new Font("맑은 고딕", Font.BOLD, 14));
			btnEdit.setBackground(new Color(255, 182, 193));
			btnEdit.setBounds(117, 280, 72, 23);
		}
		return btnEdit;
	}
	private JButton getBtnDelete() {
		if (btnDelete == null) {
			btnDelete = new JButton("삭 제");
			btnDelete.setEnabled(false);
			btnDelete.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String key = tfID.getText();
				
					map.remove(key);
						textArea.setText("데이터가 삭제되었습니다.");
					
					
				}
						
			});
			btnDelete.setEnabled(false);
			
			btnDelete.setFont(new Font("맑은 고딕", Font.BOLD, 14));
			btnDelete.setBackground(new Color(255, 182, 193));
			btnDelete.setBounds(203, 280, 72, 23);
			
			}
		return btnDelete;
	}
	private JButton getBtnOutput() {
		if (btnOutput == null) {
			btnOutput = new JButton("출 력");
			btnOutput.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String title = String.format("%10s %10s %5s %5s %5s %5s ",
												"아이디", "성 명", "국어", "영어", "합계", "평균" + "\n");
					textArea.setText(title);
					textArea.append("---------------------------------------------------------------" + "\n");
					
					Set<Map.Entry<String, Score>> set = map.entrySet();
					for (Map.Entry<String, Score> s : set) {
						Score score = s.getValue();
						
						textArea.append(score.toString());
						textArea.append("\n");
					}
					flag = false;
				}
			});
			btnOutput.setFont(new Font("맑은 고딕", Font.BOLD, 14));
			btnOutput.setBackground(new Color(255, 182, 193));
			btnOutput.setBounds(287, 280, 72, 23);
		}
		return btnOutput;
	}
	private JScrollPane getScrollPane() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setBounds(12, 320, 349, 178);
			scrollPane.setViewportView(getTextArea_1());
		}
		return scrollPane;
	}
	private JTextArea getTextArea_1() {
		if (textArea == null) {
			textArea = new JTextArea();
		}
		return textArea;
	}
}
