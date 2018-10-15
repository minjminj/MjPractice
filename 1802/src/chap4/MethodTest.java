/*
 * 메소드 파악하는 연습
 * 작성일자: 2018.04.19
 */

package chap4;

public class MethodTest {
	private int sum() {
		int s = 10;
		s = 10;
		return s; // return은 반드시 메소드의 마지막에!
	}

	public void sum2() {

	}

	public double avg(int a, int b) {
		double k = (a + b) / 2.0;

		return k;
	}

	public A compute(B b) { // A,B 는 자바의 기본형 예약어가 아니기 때문에 사용하려면 Class로 만들어줘야함.
		A a = new A();

		return a;
	}
}
 