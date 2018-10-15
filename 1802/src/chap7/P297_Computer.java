/*
 * ÀÚ½Ä Å¬·¡½º
 * 2018.05.01(±è¹ÎÁ¤)
 */
package chap7;

public class P297_Computer extends P296_Calculator {

	
	@Override
	double areaCircle(double r) {
		System.out.println("Computer °´Ã¼ÀÇ areaCircle() ½ÇÇà");
		
		return Math.PI * r * r;
	}
}
