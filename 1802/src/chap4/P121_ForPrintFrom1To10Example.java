/*
 * for���� Ȱ���Ͽ� 1-10����ϱ�
 */

package chap4;

public class P121_ForPrintFrom1To10Example {

	public P121_ForPrintFrom1To10Example() {
		int i;
		
		for ( i=1 ; i<=10 ; i++ ) {
			System.out.println(i);
		}
		
		for ( i=10 ; i>=1 ; i--) {
			System.out.println(i);
		}
		
		for ( i=1 ; i<=10 ; i++) {
			System.out.println(5*i);
		}
		
		for ( i=1 ; i<=10 ; i++) {
			if (i % 2 == 0) {
				System.out.println(i + " �� ¦��");
			} else {
				System.out.println(i + " �� Ȧ��");
			}
		}
	}
}
