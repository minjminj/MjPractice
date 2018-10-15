/*
 * ��¥ ���� Ŭ����(SimpleDateFormat)�� �̿��Ͽ� ��¥�� ���ϴ� �������� ���
 * 2018.05.08(�����)
 */
package chap11;

import java.text.SimpleDateFormat;
import java.util.Date;

public class P546_SimpleDateFormatExample {
	
	public static void main(String[] args) {
		
		Date now = new Date();
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(sdf.format(now));
		
		sdf = new SimpleDateFormat("yyyy�� MM�� dd��");
		System.out.println(sdf.format(now));
		
		sdf = new SimpleDateFormat("yyyy.MM.dd a HH:mm:ss");
		System.out.println(sdf.format(now));
	}

}
