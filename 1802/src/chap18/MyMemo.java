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
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class MyMemo extends JFrame {

	private JPanel contentPane;
	private JMenuBar menuBar;
	private JMenu mnNewMenu;
	private JMenuItem mntmNewFile;
	private JMenuItem mntmSave;
	private JMenuItem mntmSaveAs;
	private JMenuItem mntmClose;
	private JScrollPane scrollPane;
	private JTextArea textArea;

	/**
	 * Launch the application.
	 */
	
	String fileName = null;
	String title = ""; 
	boolean modifyFlag = false;		// 편집된 경우 true.
	private JMenuItem mntmOpen;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MyMemo frame = new MyMemo();
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
	public MyMemo() {
		title = "메모장 [파일명 : " + fileName + "]";
		setTitle(title);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 479, 464);
		setJMenuBar(getMenuBar_1());
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		contentPane.add(getScrollPane(), BorderLayout.CENTER);
	}
	
	public void mkfile() {
		if (modifyFlag) {	// mF가 참이면 저장여부 체크 (편집이 된 상황이면 변경사항을 저장할지 확인해야함)
			
				// showConfirmDialog의 반환형이 int
			int ync = JOptionPane.showConfirmDialog(MyMemo.this, "파일이 편집되었습니다. 저장할까요?");
			switch (ync) {
			case JOptionPane.YES_OPTION:	// 저장(새 이름 또는 현재 파일명으로)
				if (fileName == null) {
					saveNewFile();
				} else {
					saveFile();
				}
				break;
			case JOptionPane.NO_OPTION:		// 저장하지 않고 새 파일로
				modifyFlag = false;
				fileName = null;
				textArea.setText("");
				title = "메모장 [파일명: " + fileName + " ]";
				setTitle(title);
				break;
			}
		} else {
			modifyFlag = false;
			fileName = null;
			textArea.setText("");
			title = "메모장 [파일명: " + fileName + " ]";
			setTitle(title);
		}
	}

	// 기존 파일명이 있을 때 저장			// 진짜 저장을 실행하는 로직은 여기에 저장! 18장 학습 내용의 point!
	public void saveFile() {
		FileOutputStream fos = null;
		
		try {
			fos = new FileOutputStream(fileName);
			byte[] data = textArea.getText().getBytes();
			fos.write(data, 0, data.length);
			fos.flush();
			fos.close();
			
			modifyFlag = false;
		} catch (Exception ex) {
			
		}
		
	}
	
	// 새이름으로 저장하는 경우
	public void saveNewFile() {
		JFileChooser fc = new JFileChooser();
		int yn = fc.showSaveDialog(MyMemo.this);			// showSaveDialog는 저장모드로 다이얼로그를 열어라. 반환형은 int
		if (yn == fc.APPROVE_OPTION) {			// 저장모드에서 yes선택
			fileName = fc.getSelectedFile().toString();
			saveFile();
			
			modifyFlag = false;
			fileName = null;
			textArea.setText("");
			title = "메모장 [파일명: " + fileName + " ]";
			setTitle(title);
		}
	}
	
	// 파일 열기
	public void open() {
		JFileChooser fc =new JFileChooser();
		int yn = fc.showOpenDialog(MyMemo.this);
		if (yn == fc.APPROVE_OPTION) {
			fileName = fc.getSelectedFile().toString();
			byte[] data = new byte[512];
			int datalength = 0;
			try {
				FileInputStream fis = new FileInputStream(fileName);
				StringBuffer sb = new StringBuffer();

				while ( (datalength = fis.read(data)) != -1	) {
					sb.append(new String(data, 0 ,datalength));
				}
				
				textArea.setText(sb.toString());
				
				fis.close();
				modifyFlag = false;
				title = "메모장 [파일명: " + fileName + " ]";
				setTitle(title);
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				}
		}
		
	}
	
	private JMenuBar getMenuBar_1() {
		if (menuBar == null) {
			menuBar = new JMenuBar();
			menuBar.add(getMnNewMenu());
		}
		return menuBar;
	}
	private JMenu getMnNewMenu() {
		if (mnNewMenu == null) {
			mnNewMenu = new JMenu("File");
			mnNewMenu.add(getMntmNewFile());
			mnNewMenu.add(getMntmOpen());
			mnNewMenu.add(getMntmSave());
			mnNewMenu.add(getMntmSaveAs());
			mnNewMenu.add(getMntmClose());
		}
		return mnNewMenu;
	}
	private JMenuItem getMntmNewFile() {
		if (mntmNewFile == null) {
			mntmNewFile = new JMenuItem("New File");
			mntmNewFile.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					mkfile();
				}
			});
		}
		return mntmNewFile;
	}
	private JMenuItem getMntmSave() {
		if (mntmSave == null) {
			mntmSave = new JMenuItem("Save");
			mntmSave.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					if (fileName == null) {
						JFileChooser  fc = new JFileChooser();
						int yn = fc.showSaveDialog(MyMemo.this);
						if (yn == fc.APPROVE_OPTION) {		// 네 클릭
							fileName = fc.getSelectedFile().toString();
						} else {		// 아니오 클릭
							return;
						}
					}
					
					saveFile();
				
					modifyFlag = false;
					title = "메모장 [파일명: " + fileName + " ]";
					setTitle(title);
				}
			});
		}
		return mntmSave;
	}
	private JMenuItem getMntmSaveAs() {
		if (mntmSaveAs == null) {
			mntmSaveAs = new JMenuItem("Save as");
		}
		return mntmSaveAs;
	}
	private JMenuItem getMntmClose() {
		if (mntmClose == null) {
			mntmClose = new JMenuItem("Close");
		}
		return mntmClose;
	}
	private JScrollPane getScrollPane() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setViewportView(getTextArea());
		}
		return scrollPane;
	}
	private JTextArea getTextArea() {
		if (textArea == null) {
			textArea = new JTextArea();
			textArea.addKeyListener(new KeyAdapter() {
				@Override
				public void keyReleased(KeyEvent ke) {
					int key = ke.getKeyCode();
					if (ke.getKeyCode() == KeyEvent.VK_SHIFT ||
						ke.getKeyCode() == KeyEvent.VK_CONTROL ||
						ke.getKeyCode() == KeyEvent.VK_ALT ||
						ke.getKeyCode() == KeyEvent.VK_ESCAPE	||
						ke.getKeyCode() == KeyEvent.VK_PAGE_UP ||
						ke.getKeyCode() == KeyEvent.VK_PAGE_DOWN ||
						ke.getKeyCode() == KeyEvent.VK_LEFT ||
						ke.getKeyCode() == KeyEvent.VK_RIGHT ||
						ke.getKeyCode() == KeyEvent.VK_UP ||
						ke.getKeyCode() == KeyEvent.VK_DOWN ||
						ke.getKeyCode() == KeyEvent.VK_HOME ||
						ke.getKeyCode() == KeyEvent.VK_END)
						return ;		// 위 사항들에 해당이 된다면 아무것도 실행하지 말고 되돌아가~
					
					setTitle(title + " * ");
					modifyFlag = true;  //   편집 되었음.
				}
			});
		}
		return textArea;
	}
	private JMenuItem getMntmOpen() {
		if (mntmOpen == null) {
			mntmOpen = new JMenuItem("Open");
			mntmOpen.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					open();
				}
			});
		}
		return mntmOpen;
	}
}
