/*
 * while�� ����Ͽ� 3�� �������� 3�� ��� �հ� ��� (while���� ���������� ���)
 */

package chap4;

public class Exercise03_04 {
	
	public Exercise03_04() {
		
		int i = 3;
		int sum = 0;
		
		while (i<=100) {
			sum += i;
			i= i+3;
		}
		System.out.println(sum);
	}

}
