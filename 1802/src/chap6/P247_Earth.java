/*
 * 상수 선언
 */
package chap6;

public class P247_Earth {

	static final double Earth_Radius = 6400;
	static final double Earth_Surface;
	
	static {
		Earth_Surface = 4 * Math.PI * Earth_Radius * Earth_Radius;
	}
	
}
