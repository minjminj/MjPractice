/*
 * �޼ҵ� �ľ��ϴ� ����
 * �ۼ�����: 2018.04.19
 */

package chap4;

public class MethodTest {
	private int sum() {
		int s = 10;
		s = 10;
		return s; // return�� �ݵ�� �޼ҵ��� ��������!
	}

	public void sum2() {

	}

	public double avg(int a, int b) {
		double k = (a + b) / 2.0;

		return k;
	}

	public A compute(B b) { // A,B �� �ڹ��� �⺻�� ���� �ƴϱ� ������ ����Ϸ��� Class�� ����������.
		A a = new A();

		return a;
	}
}
 