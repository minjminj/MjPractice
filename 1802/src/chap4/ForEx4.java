/*
 * 1~25���� ����ϴµ� ���ٿ� ���� 5���� 5����.
 * if�� ����
 * �ۼ�����: 2018.04.20
 */

package chap4;

public class ForEx4 {

	public ForEx4() {
		
		int a, b;
		int n = 0;
		
		for (a=1 ; a<=5 ; a++) {
			for (b=1 ; b<=5 ; b++) {
				System.out.print(++n);
			}
			System.out.println();
		
		}
	}
}
