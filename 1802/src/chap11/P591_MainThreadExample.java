/*
 * 동기화를 포함한 메인 스레드가 실행하는 코드
 * 2018.05.08(김민정)
 */
package chap11;

public class P591_MainThreadExample {
	
	public static void main(String[] args) {
		P595_Calculator calculator = new P595_Calculator();
		
		P592_User1 user1 = new P592_User1();
		user1.setCalculator(calculator);
		user1.start();
		
		P593_User2 user2 = new P593_User2();                                                             
		user2.setCalculator(calculator);
		user2.start();                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   
	}

}
