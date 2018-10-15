package chap18;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import java.awt.event.ActionListener;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Vector;
import java.awt.event.ActionEvent;

public class Memo extends JFrame implements Serializable{
	
	String fileName = null;
	Vector<Memo> memo = null;
	Boolean mdFlag = false; 

	private JPanel contentPane;
	private JMenuBar menuBar;
	private JMenu mnNewMenu;
	private JMenuItem mntmNewFile;
	private JMenuItem mntmOpen;
	private JMenuItem mntmSave;
	private JMenuItem mntmSaveAs;
	private JMenu mnClose;
	private JMenuItem mntmWithSave;
	private JMenuItem mntmWithoutSave;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Memo frame = new Memo();
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
	public Memo() {
		String title = "파일명: [" + fileName + "]";
		setTitle(title);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 560, 650);
		setJMenuBar(getMenuBar_1());
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
	}

	private JMenuBar getMenuBar_1() {
		if (menuBar == null) {
			menuBar = new JMenuBar();
			menuBar.add(getMnNewMenu());
			menuBar.add(getMnClose());
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
		}
		return mnNewMenu;
	}
	private JMenuItem getMntmNewFile() {
		if (mntmNewFile == null) {
			mntmNewFile = new JMenuItem("New File");
			mntmNewFile.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});
		}
		return mntmNewFile;
	}
	private JMenuItem getMntmOpen() {
		if (mntmOpen == null) {
			mntmOpen = new JMenuItem("Open");
			mntmOpen.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if (mdFlag = true) {
						
					}
				}
			});
		}
		return mntmOpen;
	}
	private JMenuItem getMntmSave() {
		if (mntmSave == null) {
			mntmSave = new JMenuItem("Save");
			mntmSave.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if (fileName == null) {
						newSaveFile();
						mdFlag = false;
					} else{						
						saveFile();
						mdFlag = false;
					}
				}
			});
		}
		return mntmSave;
	}
	public void saveFile() {
		// TODO Auto-generated method stub
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		
		try {
			fos = new FileOutputStream(fileName);
			oos = new ObjectOutputStream(fos);
			oos.writeObject(memo);
			oos.flush();
			
			oos.close();
			fos.close();
			
			mdFlag = false;
		} catch (Exception ex) {
			
		}
	}

	private JMenuItem getMntmSaveAs() {
		if (mntmSaveAs == null) {
			mntmSaveAs = new JMenuItem("Save As");
			mntmSaveAs.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					newSaveFile();
				}
			});
		}
		return mntmSaveAs;
	}
	public void newSaveFile() {
		// TODO Auto-generated method stub
		JFileChooser fc = new JFileChooser();
		int sa = fc.showSaveDialog(Memo.this);
		if (sa == fc.APPROVE_OPTION) {
			fileName = fc.getSelectedFile().toString();
			saveFile();
		}
		
	}

	private JMenu getMnClose() {
		if (mnClose == null) {
			mnClose = new JMenu("Close");
			mnClose.add(getMenuItem_1());
			mnClose.add(getMenuItem_2());
		}
		return mnClose;
	}
	private JMenuItem getMenuItem_1() {
		if (mntmWithSave == null) {
			mntmWithSave = new JMenuItem("with Save");
		}
		return mntmWithSave;
	}
	private JMenuItem getMenuItem_2() {
		if (mntmWithoutSave == null) {
			mntmWithoutSave = new JMenuItem("without Save");
		}
		return mntmWithoutSave;
	}
}
