/*
 * 메소드 오버라이딩 테스트
 * 2018.05.01(김민정)
 */
package chap7;

public class P297_ComputerExample {
	
	public static void main(String[] args) {
		
		int r =10;
		
		P296_Calculator calculator = new P296_Calculator();
		System.out.println("원면적: " + calculator.areaCircle(r));
		System.out.println();
		
		P297_Computer computer = new P297_Computer();
		System.out.println("원면적: " + computer.areaCircle(r));
		
	}
	

}
