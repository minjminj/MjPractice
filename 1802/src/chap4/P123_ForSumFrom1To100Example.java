/*
 * 1~100���� ���� ���
 * �ۼ�����: 2018.04.19
 */
package chap4;

public class P123_ForSumFrom1To100Example {

	public P123_ForSumFrom1To100Example() {
		
		int sum=0;
		int i;
		
		for (i=1 ; i<=100 ; i++) {
			sum += i;
					
		}
		
		System.out.println("1 ~ " + (i-1) + "�� �� =" + sum);
	}
}
