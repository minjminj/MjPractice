/*
 * 25~1���� 5�ٿ� ���� ���
 * �ۼ�����: 2018.04.20
 */

package chap4;

public class ForEx6 {
	

public ForEx6() {
		
		int a, b;
		int n = 25;
		
		for (a=1 ; a<=5 ; a++) {
			
			for (b=1 ; b<=5 ; b++) {
				System.out.print(n--);
			}
			System.out.println();
		}
	}

}
