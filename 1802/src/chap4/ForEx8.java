/*
 * 1, 1 2, 1 2 3, 1 2 3 4, 1 2 3 4 5 �� �ټ��ٿ� ������ ���.
 */
package chap4;

public class ForEx8 {
	
	public ForEx8() {
		
		int a, b;
		
		for (a=1 ; a<=5 ; a++) {
			
			for (b=1 ; b<=a ; b++) {
				System.out.print(b);
			}
			System.out.println();
		}
	}

}
