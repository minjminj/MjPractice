/*
 * 1���� 100���� �հ踦 while�� ���
 * �ۼ�����: 2018.04.20
 */
package chap4;

public class P125_WhileSumFrom1To100Example {

	public P125_WhileSumFrom1To100Example() {
		
		int i = 1;
		int sum = 0;
		
		while (i <= 100) {
			
			sum += i ;
		
			i++ ;
		}
		System.out.println("1~" + (i-1) + " ������ ��: " + sum);
	}
}
