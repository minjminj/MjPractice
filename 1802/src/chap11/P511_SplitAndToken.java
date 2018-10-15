/*
 * Stirng.split()과 StringTokenizer의 차이점
 * (무효의 값에 대한 차이)
 * 2018.05.04(김민정)
 */
package chap11;

import java.util.StringTokenizer;

public class P511_SplitAndToken {

	public P511_SplitAndToken() {
		
		String text = "java,jsp,db,,,,,,,,ajax";
		
		// split 은 실행 결과가 String[] 을 return
		String[] r1 = text.split(",");
		for (int i=0 ; i<r1.length ; i++) {
			String str = String.format("r1[%d]=%s", i,r1[i]);			
					// %: 문자열의 위치, %d: 정수의 위치, %f: 실수의 위치, %s: 문자의 위치, %10s: 공간을 10자리를 만든 후 문자열을 대입, %10d: 공간을 10자리를 만든 후 정수를 대입.
					// %10.2f: 전체 자릿수는 10자리고, 2자리는 소수점 이하의 자리.
		System.out.println(str);
		}
		
		System.out.println();
		
		// StringTokenizer 처리 결과
		StringTokenizer st = new StringTokenizer(text, ",");
		int p = 0;
		while (st.hasMoreTokens()) {
			String s= st.nextToken();
			String str = String.format("r1[%d]=%s", p,s);
			System.out.println(str);
			p++;
		}
		System.out.println();
	}
	
	public void test() {
		String text = "jave,jsp,/db@ajax,mybatis/spring,android///javascript";
	
		// , / @로 나누어서 출력
		
		// split
		String[] q1 = text.split(",|/|@");
								// 구분자를 정규식으로 표현해야 하기때문에 | 반드시 필요함.
		for (int i=0 ; i<q1.length ; i++) {
			String hi = String.format("q1[%d]=%s", i,q1[i]);
									// 출력형태,     출력 내용
			System.out.println(hi);
		}
		System.out.println();
				
		// tokenizer
		StringTokenizer mj = new StringTokenizer(text, ",|/|@");
										// 구분자를 문자로 표현하기 때문에 | 필요없이 ",/@" 로 입력해도 무관.
		int m = 0;
		while (mj.hasMoreTokens()) {
			String j = mj.nextToken();
			String kmj = String.format("q1[%d]=%s", m,j);
			System.out.println(kmj);
			m++;
		}
	
	}
	
	public static void main(String[] args) {
		P511_SplitAndToken s = new P511_SplitAndToken();
		
		s.test();
	}
}









