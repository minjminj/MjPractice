package chap7;

public class P300_SupersonicAirplaneExample {
	
	public static void main(String[] args) {
		
		P299_SupersonicAirplane sa = new P299_SupersonicAirplane();
		
		sa.takeOff();
		sa.fly();
		sa.flymode = P299_SupersonicAirplane.SUPERSONIC;		// sa 대신 P299_SupersonicAirplane를 사용한 이유는 직관적으로 SUPERSONIC 또는 NORMAL이 static final int 인것을 알수 있기 하기 위해. 그리고 보편적
		sa.fly();
		sa.flymode = P299_SupersonicAirplane.NORMAL;			// static 형을 선언하는 이유 중 하나가 객체형성을 피하고 싶어서.
		sa.fly();
		sa.land();
	}

}
