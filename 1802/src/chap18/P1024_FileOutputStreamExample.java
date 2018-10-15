/*
 * 파일 복사
 */
package chap18;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class P1024_FileOutputStreamExample {

	public static void main(String[] args) throws Exception	 {
		
		String originalFileName = "C:/new_workspace/1802/src/chap18/img.jpg";
		String targetFileName = "C:/Temp/img.jpg";
		
		
		FileInputStream fis = new FileInputStream(originalFileName);
		FileOutputStream fos = new FileOutputStream(targetFileName);
		
		int readyByteNo;
		
		byte[] readyBytes = new byte[100];
		while ((readyByteNo = fis.read(readyBytes)) != -1) {
			fos.write(readyBytes, 0 , readyByteNo);
		}
		
		fos.flush();
		fos.close();
		fis.close();
		
		System.out.println("복사가 잘 되었습니다");
	}
}
