/*
 * 메소드 선언
 * 2018.04.30(김민정)
 */
package chap6;

public class P217_Calculator {

	//메소드
	void poweron() {
		System.out.println("전원을 킵니다");
	}
	
	int plus(int x, int y) {
		
		int result = x + y;
		
		return result;
	}
	
	double divide(int x, int y) {
		
		double result = (double)x / (double)y;
		
		return result;
	}
	
	void poweroff() {
		System.out.println("전원을 끕니다");
	}
}
