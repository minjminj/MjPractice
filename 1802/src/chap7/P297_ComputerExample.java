/*
 * �޼ҵ� �������̵� �׽�Ʈ
 * 2018.05.01(�����)
 */
package chap7;

public class P297_ComputerExample {
	
	public static void main(String[] args) {
		
		int r =10;
		
		P296_Calculator calculator = new P296_Calculator();
		System.out.println("������: " + calculator.areaCircle(r));
		System.out.println();
		
		P297_Computer computer = new P297_Computer();
		System.out.println("������: " + computer.areaCircle(r));
		
	}
	

}
