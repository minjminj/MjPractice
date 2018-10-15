/*
 * ∏ﬁº“µÂ »£√‚
 * 2018.04.30(±ËπŒ¡§)
 */

package chap6;

public class P218_CalculatorExample {

	public static void main(String[] args) {
		
		P217_Calculator myCal = new P217_Calculator();
		myCal.poweron();
		
		int result1 = myCal.plus(5, 6);
			System.out.println("result1: " + result1);
			
			
		byte x = 10;
		byte y = 4;
		
		double result2 = myCal.divide(x, y);
			System.out.println("result2: " + result2);
			
		myCal.poweroff();
		
			
		
	}
}
