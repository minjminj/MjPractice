/*
 * Tire를 부품으로 가지는 클래스
 * 다형성과 배열
 * 2018.05.01(김민정)
 */
package chap7;

public class P319_Car {
	
	// 필드
	P314_Tire[] tires = {new P314_Tire("앞왼쪽", 6), new P314_Tire("앞오른쪽", 2), new P314_Tire("뒤왼쪽", 3), new P314_Tire("뒤오른쪽", 4)};
	
	// 메소드
	int run() {
		System.out.println("[자동차가 달립니다]");
		for (int i=0 ; i<tires.length ; i++) {
			if (tires[i].roll() == false) {
				stop();
				return ( i + 1 );				
			}
		}
		return 0;
	}
	
	void stop() {
		System.out.println("[자동차가 멈춥니다]");
	}
	
	

}
