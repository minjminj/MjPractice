/*
 * 직렬화된 Score 클래스를 파일에 저장하고 읽기
 * 2018.05.14(김민정)
 */
package chap18;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Vector;

public class ScoreTest {
	
	public static void main(String[] args) {
		Vector<Score> data = new Vector<Score>();
		data.add(new Score("aaa", "hong", 90, 80));
		data.add(new Score("bbb", "kim", 78, 87));
		data.add(new Score("ccc", "park", 79, 23));
		data.add(new Score("ddd", "lee", 44, 55));
		data.add(new Score("eee", "choi", 88, 66));
		
		String fileName = "score.dat";
		
		// fileOutputStream + ObjectOutputStream
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		
		try {
			fos = new FileOutputStream(fileName);
			oos = new ObjectOutputStream(fos);
			oos.writeObject(data);
			oos.flush();
			
			oos.close();
			fos.close();
		} catch(Exception ex) {
			ex.printStackTrace();
		}
		
		// FileInputStream + ObjectInputStream
		Vector<Score> readData = null;
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		
		try {
			fis = new FileInputStream(fileName);
			ois = new ObjectInputStream(fis);
			
			readData = (Vector)ois.readObject();
			
			for (Score s : readData) {
				System.out.println(s);
			}
		} catch (Exception ex) {
			ex.printStackTrace();
			}
		
	}

}
