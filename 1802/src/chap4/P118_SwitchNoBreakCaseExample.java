/*
 * break문이 없는 case;
 * test() 메소드를 사용하여 처리, time 변수는 지역변수로 지정
 * 작성일자: 2018.04.19
 */

package chap4;

public class P118_SwitchNoBreakCaseExample {

	public void test() {
		
		int time = (int) (Math.random()*4) +8;
		System.out.println("현재시간: " + time + "시");
		
		switch (time) {
		
		case 8:
			System.out.println("출근합니다");
		case 9:
			System.out.println("회의를 합니다");
		case 10:
			System.out.println("업무를 봅니다");
		default :
			System.out.println("외근을 나갑니다");
		}
		
	}
}
