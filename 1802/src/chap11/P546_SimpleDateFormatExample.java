/*
 * 날짜 형식 클래스(SimpleDateFormat)을 이용하여 날짜를 원하는 형식으로 출력
 * 2018.05.08(김민정)
 */
package chap11;

import java.text.SimpleDateFormat;
import java.util.Date;

public class P546_SimpleDateFormatExample {
	
	public static void main(String[] args) {
		
		Date now = new Date();
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(sdf.format(now));
		
		sdf = new SimpleDateFormat("yyyy년 MM월 dd일");
		System.out.println(sdf.format(now));
		
		sdf = new SimpleDateFormat("yyyy.MM.dd a HH:mm:ss");
		System.out.println(sdf.format(now));
	}

}
