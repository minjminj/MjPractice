/*
 * 1~100������ 3�� ����� �հ谡 1000 �̻��� �Ǵ� ������ 3�� ����� �հ�(for��)
 */

package chap4;

public class Exercise03_07 {
	
	public Exercise03_07() {
		
		int i;
		int sum = 0;
		
		for (i=1 ; i<=100 ; i++) {
			if (i % 3 == 0) {
				sum += i;
				if (sum >= 1000) {
					System.out.println("3�ǹ��: " + i);
					System.out.println("�հ�: " + sum);
					break;
				}
			}
		}
	}
}