/*
 * User1 ������, ����ȭ ������ ���� �ڵ�1
 * 2018.05.08(�����)
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
