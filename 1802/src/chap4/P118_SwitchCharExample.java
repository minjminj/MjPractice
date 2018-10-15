/*
 * char 타입의 switch문
 * test(char grade)메소드를 만들어 결과 처리 - grade 변수는 매개변수값을 사용하여 처리
 * 작성일자: 2018.04.19
 */

package chap4;

public class P118_SwitchCharExample {
	
	public void test(char grade) {
			
		switch (grade) {
		
		case 'A' :
		case 'a' :
			System.out.println("우수 회원입니다");
			break;
		case 'B' :
		case 'b' :
			System.out.println("일반 회원입니다");
			break;
		default :
			System.out.println("손님입니다");
		}
	}
}
