/*
 * 1~100���̸� 1�� ������Ű�� for������ �ݺ��ϸ鼭 ������ �����ڸ� ����ϴ� ������� 3�� ��� �հ� ���
 * �ۼ�����: 2018.04.20
 */

package chap4;

public class Exercise03_01 {
	
	public Exercise03_01() {
		
		int i;
		int sum = 0;
		
		for (i=1 ; i<=100 ; i++) {
			if (i % 3 == 0) {
				sum += i;
			}
		}
		System.out.println(sum);
	}

}
