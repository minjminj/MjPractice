/*
 * User1 스레드, 동기화 실행을 위한 코드1
 * 2018.05.08(김민정)
 */
package chap11;

public class P592_User1 extends Thread {

	private P595_Calculator calculator;
	
	public void setCalculator(P595_Calculator calculator) {
		this.setName("User1");
		this.calculator = calculator;
	}
	
	public void run() {
		calculator.setMemory(100);
	}
	
}
