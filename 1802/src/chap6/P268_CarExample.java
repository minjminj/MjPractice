/*
 * getter 와 setter 메소드 사용
 */

package chap6;

public class P268_CarExample {
	
	public static void main(String[] args) {
	P267_Car myCar = new P267_Car();
	
//	// 잘못된 속도 변경
//	myCar.setSpeed(-50);
//	
//	System.out.println("현재 속도: " + myCar.getSpeed());
//	
	// 올바른 속도 변경
	myCar.setSpeed(60);
	
	// 멈춤
	
	if (!myCar.isStop()) {
		myCar.setStop(true);
	}
	
	}
	
	
	
}
