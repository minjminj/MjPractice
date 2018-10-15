package chap18;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Vector;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.UIManager;
import java.awt.SystemColor;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.SwingConstants;
import java.awt.Font;

public class BoardEx extends JFrame {

	static Vector<Board> data = new Vector<Board>();

	private JPanel contentPane;
	private JMenuBar menuBar;
	private JMenu mnFile;
	private JMenu mnData;
	private JMenuItem mntmNewMenuItem;
	private JMenuItem mntmNewMenuItem_1;
	private JMenuItem menuItem;
	private JMenuItem mntmNewMenuItem_2;
	private JMenuItem mntmNewMenuItem_3;
	private JMenuItem mntmNewMenuItem_4;
	private JMenuItem mntmNewMenuItem_5;
	public static JLabel status; // 같은 패키지 내 다른 패널에서 굳이 객체 생성없이 바로 사용하기 위해 public으로확장하고(그냥 생략해도 가능), static형으로
									// 지정.
	private JPanel mainPanel;

	String fileName = null;
	String title = "";
	static boolean mdFlag = false; // 수정되지 않음.
	private JMenuItem mntmNewMenuItem_6;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BoardEx frame = new BoardEx();
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
	public BoardEx() {
		title = "게시판 [파일명 : " + fileName + "]";
		setTitle(title);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 464, 487);
		setJMenuBar(getMenuBar_1());
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		contentPane.add(getStatus(), BorderLayout.SOUTH);
		contentPane.add(getMainPanel(), BorderLayout.CENTER);
	}

	private JMenuBar getMenuBar_1() {
		if (menuBar == null) {
			menuBar = new JMenuBar();
			menuBar.add(getMnFile());
			menuBar.add(getMnData());
		}
		return menuBar;
	}

	private JMenu getMnFile() {
		if (mnFile == null) {
			mnFile = new JMenu("파 일");
			mnFile.add(getMntmNewMenuItem());
			mnFile.add(getMntmNewMenuItem_6());
			mnFile.add(getMntmNewMenuItem_1());
			mnFile.add(getMenuItem());
			mnFile.add(getMntmNewMenuItem_2());
		}
		return mnFile;
	}

	private JMenu getMnData() {
		if (mnData == null) {
			mnData = new JMenu("데이터");
			mnData.add(getMntmNewMenuItem_3());
			mnData.add(getMntmNewMenuItem_4());
			mnData.add(getMntmNewMenuItem_5());
		}
		return mnData;
	}

	private JMenuItem getMntmNewMenuItem() {
		if (mntmNewMenuItem == null) {
			mntmNewMenuItem = new JMenuItem("새로만들기");
			mntmNewMenuItem.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					makeNew();

				}
			});
		}
		return mntmNewMenuItem;
	}

	public void makeNew() {
		// TODO Auto-generated method stub

		if (mdFlag) { // mdFlag가 true이기 때문에 수정된 데이터 존재.

			int ync = JOptionPane.showConfirmDialog(BoardEx.this, "파일에 수정된 내용이 존재합니다. 저장 하시겠습니까?");
			switch (ync) {
			case JOptionPane.YES_OPTION:
				if (fileName != null) {
					saveFile();
				} else {
					newSaveFile();
				}
				break;
			case JOptionPane.NO_OPTION:

				dataRemove();
			}
		} else {

			saveFile();
			dataRemove();
		}
	}

	private void dataRemove() {
		// TODO Auto-generated method stub
		data.removeAll(data);

	}

	private JMenuItem getMntmNewMenuItem_1() {
		if (mntmNewMenuItem_1 == null) {
			mntmNewMenuItem_1 = new JMenuItem("저장하기");
			mntmNewMenuItem_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if (fileName != null) {
						saveFile();
					} else {
						newSaveFile();
					}
				}
			});

		}
		return mntmNewMenuItem_1;
	}

	public void newSaveFile() {

		JFileChooser fc = new JFileChooser();
		int yn = fc.showSaveDialog(BoardEx.this);
		if (yn == fc.APPROVE_OPTION) {
			fileName = fc.getSelectedFile().toString();
			saveFile();

			mdFlag = false;
		}

	}

	public void saveFile() {
		// TODO Auto-generated method stub
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;

		try {
			fos = new FileOutputStream(fileName);
			oos = new ObjectOutputStream(fos);
			oos.writeObject(data);
			oos.flush();

			oos.close();
			fos.close();

			mdFlag = false;

		} catch (Exception ex) {
			// ex.printStackTrace();
		}

		title = "게시판 [파일명: " + fileName + "]";
		setTitle(title);
	}

	private JMenuItem getMenuItem() {
		if (menuItem == null) {
			menuItem = new JMenuItem("새 이름으로 저장하기");
			menuItem.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					newSaveFile();
				}
			});
		}
		return menuItem;
	}

	private JMenuItem getMntmNewMenuItem_2() {
		if (mntmNewMenuItem_2 == null) {
			mntmNewMenuItem_2 = new JMenuItem("종료");
			mntmNewMenuItem_2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					exit();

				}
			});
		}
		return mntmNewMenuItem_2;
	}

	protected void exit() {
		// TODO Auto-generated method stub
		if (mdFlag) { // mdFlag가 true이기 때문에 수정된 데이터 존재.

			int ync = JOptionPane.showConfirmDialog(BoardEx.this, "파일에 수정된 내용이 존재합니다. 저장 하시겠습니까?");
			switch (ync) {
			case JOptionPane.YES_OPTION:
				if (fileName != null) {
					saveFile();
				} else {
					newSaveFile();
				}
				System.exit(JOptionPane.NO_OPTION);
			case JOptionPane.NO_OPTION:

				System.exit(JOptionPane.NO_OPTION);
			}
		} else {

			System.exit(JOptionPane.NO_OPTION);
		}
	}

	private JMenuItem getMntmNewMenuItem_3() {
		if (mntmNewMenuItem_3 == null) {
			mntmNewMenuItem_3 = new JMenuItem("입력");
			mntmNewMenuItem_3.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					// 기존 contentPane에 있는 모든 component를 제거
					mainPanel.removeAll();
					InputPanel ip = new InputPanel(data);
					mainPanel.add(ip); // center영역에 추가
					contentPane.updateUI(); // 화면을 새로 그리기
				}
			});
		}
		return mntmNewMenuItem_3;
	}

	private JMenuItem getMntmNewMenuItem_4() {
		if (mntmNewMenuItem_4 == null) {
			mntmNewMenuItem_4 = new JMenuItem("수정 및 삭제");
			mntmNewMenuItem_4.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					mainPanel.removeAll();
					ModifyPanel mp = new ModifyPanel(data);
					mainPanel.add(mp);
					contentPane.updateUI();

				}
			});
		}
		return mntmNewMenuItem_4;
	}

	private JMenuItem getMntmNewMenuItem_5() {
		if (mntmNewMenuItem_5 == null) {
			mntmNewMenuItem_5 = new JMenuItem("조회 및 출력");
			mntmNewMenuItem_5.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					mainPanel.removeAll();
					OutputPanel op = new OutputPanel(data);
					mainPanel.add(op);
					contentPane.updateUI();
				}
			});
		}
		return mntmNewMenuItem_5;
	}

	private JLabel getStatus() {
		if (status == null) {
			status = new JLabel("");
			status.setFont(new Font("굴림", Font.PLAIN, 13));
			status.setHorizontalAlignment(SwingConstants.CENTER);
			status.setBorder(new SoftBevelBorder(BevelBorder.RAISED, SystemColor.controlHighlight, null,
					SystemColor.controlDkShadow, null));
			status.setBackground(SystemColor.activeCaptionBorder);
			status.setOpaque(true);
			status.setPreferredSize(new Dimension(0, 25));
			status.setForeground(Color.RED);
		}
		return status;
	}

	private JPanel getMainPanel() {
		if (mainPanel == null) {
			mainPanel = new JPanel();
			mainPanel.setLayout(new BorderLayout(0, 0));
		}
		return mainPanel;
	}

	private JMenuItem getMntmNewMenuItem_6() {
		if (mntmNewMenuItem_6 == null) {
			mntmNewMenuItem_6 = new JMenuItem("가져오기");
			mntmNewMenuItem_6.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if (mdFlag) {

						int ync = JOptionPane.showConfirmDialog(BoardEx.this, "파일에 수정된 내용이 존재합니다. 저장 하시겠습니까?");
						switch (ync) {
						case JOptionPane.YES_OPTION:
							if (fileName != null) {
								saveFile();
							} else {
								newSaveFile();
							}
							data.removeAll(data);
							load();
						case JOptionPane.NO_OPTION:

							data.removeAll(data);
							load();
							
						} 						
					}else {
						load();
						

					}
				}
			});
		}
		return mntmNewMenuItem_6;
	}

	protected void load() {
		// TODO Auto-generated method stub
		Vector<Board> readBoard = null;
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		
		JFileChooser fc = new JFileChooser();
		int yn = fc.showOpenDialog(BoardEx.this);
		if (yn == fc.APPROVE_OPTION) {
			fileName = fc.getSelectedFile().toString();
		}
		try {
			fis = new FileInputStream(fileName);
			ois = new ObjectInputStream(fis);

			readBoard = (Vector) ois.readObject();

			mainPanel.removeAll();
			OutputPanel op = new OutputPanel(data);
			mainPanel.add(op);
			contentPane.updateUI();
			
			for (Board b : readBoard) {
				
				op.textArea.append(b.toStirng()+"\n");
			}
			status.setText("데이터를 불러왔습니다.");
			
			fis.close();
			ois.close();
			

		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
