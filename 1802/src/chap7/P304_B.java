/*
 * protected 접근 제한자 테스트
 */
package chap7;

public class P304_B {
	public void method() {
		P304_A a = new P304_A();	// (o)
		a.field = "value";			// (o)
		a.method();					// (o)
	}

}
