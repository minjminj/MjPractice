/*
 * Format 클래스를 이용하여 숫자를 원하는 형식으로 출력하기
 * 2018.05.08(김민정)
 */

package chap11;

import java.text.DecimalFormat;


public class P544_DecimalFormatExample {
	
	public static void main(String[] args) {
		
		double num = 1234567.89;
		
		DecimalFormat df = new DecimalFormat("0");		// 빈자리는 0으로 채움
		System.out.println(df.format(num));
		
		df = new DecimalFormat("0.0");
		System.out.println(df.format(num));
		
		df = new DecimalFormat("0000000000.00000");
		System.out.println(df.format(num));
		
		df = new DecimalFormat("#");					// 빈자리 채우지 않음.
		System.out.println(df.format(num));
		
		df = new DecimalFormat("#.#");
		System.out.println(df.format(num));
		
		df = new DecimalFormat("##########.#####");
		System.out.println(df.format(num));
		
		df = new DecimalFormat("#.0");
		System.out.println(df.format(num));
				
		df = new DecimalFormat("+#.0");					// 양수 기호
		System.out.println(df.format(num));
		
		df = new DecimalFormat("-#.0");					// 음수 기호
		System.out.println(df.format(num));
		
		df = new DecimalFormat("#,###.0");				// 자릿수 나타내기
		System.out.println(df.format(num));
		
		df = new DecimalFormat("0.0E0");				// E는 지수문자
		System.out.println(df.format(num));
		
		df = new DecimalFormat("+#,### ; -#,###");		// 양수일때는 +, 음수일때는 -
		System.out.println(df.format(num));
		
		df = new DecimalFormat("#.# %");				// *100 후에 % 붙임
		System.out.println(df.format(num));
		
		df = new DecimalFormat("\u00A4 #,###");			// 통화 기호 표시
		System.out.println(df.format(num));
	}

}
