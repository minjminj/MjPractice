/*
 * 1~100������ 3�� ����� ���� 1000 �̻��� �Ǵ� ������ 3�� ����� �հ�(while��)
 */

package chap4;

public class Exercise03_08 {

	public Exercise03_08(){
		
		int i = 3;
		int sum = 0;
		
		while (i<=100) {
			sum += i;
			i = i +3;
			
			if (sum >= 1000) {
				System.out.println("3�� ���: " + (i-3));
				System.out.println("�հ�: " + sum);
				break;
			}
		}
	}
}
