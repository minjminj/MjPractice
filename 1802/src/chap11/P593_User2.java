/*
 * User2 ������
 * 2018.05.08(�����)
 */
package chap11;

public class P593_User2 extends Thread{

	private P595_Calculator calculator;
	
	public void setCalculator(P595_Calculator calculator) {
		this.setName("User2");
		this.calculator = calculator;
	}
	
	public void run() {
		calculator.setMemory(50);
	}
}
