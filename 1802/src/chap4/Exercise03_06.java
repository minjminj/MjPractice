/*
 * 1~100���̸� do~while�� ����Ͽ� 3�� �������� �ݺ��ϰ� 3�� ����� �� ���
 */

package chap4;

public class Exercise03_06 {

	public Exercise03_06() {
		
		int i = 3;
		int sum = 0;
		
		do {
			sum+= i;
			i= i+3;
		} while (i<=100);
		System.out.println(sum);
	}
}
