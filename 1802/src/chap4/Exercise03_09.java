/*
 * 1~100������ 3�� ����� ���� 1000 �̻��� �Ǵ� ������ 3�� ����� �հ�(do~while��)
 */

package chap4;

public class Exercise03_09 {
	
	public Exercise03_09() {
		
		int i = 1;
		int sum = 0;
		
		do {
			if (i % 3 == 0) {
				sum += i;
				if (sum >= 1000) {
					System.out.println("3�� ���: " + (i));
					System.out.println("�հ�: " + sum);	
					break;
				}
			}
			i++;
		} while (i <= 100);
		
	}

}
