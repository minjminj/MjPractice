/*
 * 1~100 ���̸� 1�� ������Ű�� while�� ����Ͽ� 3�� ����� �հ� ���
 * �ۼ�����: 2018.04.20
 */

package chap4;

public class Exercise03_03 {
	
	public Exercise03_03() {
		
		int i = 1;
		int sum = 0;	// 3�� ����� �հ�
		
		while (i<=100) {
			if (i % 3 == 0) {	// 3�� ��� ��������
				sum += i;		// 3�� ����϶� �ջ�
			}
			i++ ;				// i���� 1�� ����
		}
		System.out.println(sum);	// 1~100���� �� 3�� ����� �հ� ���
	}
		
}


