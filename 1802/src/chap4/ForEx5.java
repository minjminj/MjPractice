/*
 * 1~5, 2~6, 3~7, 4~8, 5~9 �ٹٲ㼭 ����ϱ�
 * �ۼ�����: 2018.04.20
 */

package chap4;

public class ForEx5 {

	public ForEx5() {
		
		int n, i;
		
		for (n=1 ; n<=5 ; n++) {
			
			for (i=n ; i<=(n+4) ; i++) {
				System.out.print(i);
			}
			System.out.println();
		}
	}
}
