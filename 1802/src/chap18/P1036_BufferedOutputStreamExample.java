/*
 * 버퍼를 사용했을 때의 성능 테스트
 * 2018.05.14(김민정)
 */
package chap18;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class P1036_BufferedOutputStreamExample {

	public static void main(String[] args) throws Exception {
		
		FileInputStream fis = null;
		FileOutputStream fos = null;
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		
		int data = -1;
		long start = 0;
		long end = 0;
		
		fis = new FileInputStream("C:/new_workspace/1802/src/chap18/img.jpg");
		bis = new BufferedInputStream(fis);
		fos = new FileOutputStream("C:/Temp/img.jpg");
		
		start = System.currentTimeMillis();
		while ((data = fis.read()) != -1) {
			fos.write(data);
		}
		fos.flush();
		end = System.currentTimeMillis();
		fos.close(); bis.close(); fis.close();
		System.out.println("사용하지 않았을 때 :" + (end-start) + "ms");
		
		fis = new FileInputStream("C:/new_workspace/1802/src/chap18/img.jpg");
		bis = new BufferedInputStream(fis);
		fos = new FileOutputStream("C:/Temp/img.jpg");
		bos = new BufferedOutputStream(fos);
		
		start = System.currentTimeMillis();
		while ((data = fis.read()) != -1) {
			bos.write(data);
		}
		bos.flush();
		end = System.currentTimeMillis();
		bos.close(); fos.close(); bis.close(); fis.close();
		System.out.println("사용했을 때: " + (end-start) + "ms");
		
		
	}
}
