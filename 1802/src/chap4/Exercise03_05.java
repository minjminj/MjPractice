/*
 * 1~100���̸� 1�� ������Ű�� do~while�� ����Ͽ� 3�� ����� �հ� ���
 */

package chap4;

public class Exercise03_05 {
	
	public Exercise03_05() {
		
		int i = 1;
		int sum = 0;
		
		do {
			if (i % 3 == 0) {
				sum += i;
			}
			i++;
		} while(i<=100);
		System.out.println(sum);
	}

}
