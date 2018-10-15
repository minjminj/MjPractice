/*
 * chap3. 연산자. 삼항 연산자. 연습
 * 작성일자: 2018.04.18
 */

package Prac;

public class ConditionalOperationExample {
	public static void main(String[] args) {
		
		double tem; //기온
		
		tem= -6.3;
		
		String ss = (tem >= 20)? "여름" : (tem >= 10)? "봄" : ((tem >= 0)? "가을" : "겨울");
			
		System.out.println(ss);
	}
}
