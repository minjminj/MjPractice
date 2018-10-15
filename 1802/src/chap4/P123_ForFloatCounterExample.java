/*
 * float 타입 카운터 변수
 * 작성일자: 2018.04.19
 */

package chap4;

public class P123_ForFloatCounterExample {
	
	public P123_ForFloatCounterExample() {
		
		float x;
		
		for (x=0.1f ; x<=1.0f ; x+=0.1f) {
			System.out.println(x);
		}
	}
}
