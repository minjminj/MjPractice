/*
 * 1~25���� ����ϴµ� ���ٿ� ���� 5���� 5����.
 * �ۼ�����: 2018.04.20
 */
package chap4;

public class ForEx4WithIf {

	public ForEx4WithIf() {
		
		int n;
		
		for (n=1 ; n<=25; n++) {
			if (n % 5 == 1 && n >= 5) {
				System.out.println();
			}
			
			System.out.print(n);
		}
	}
}
