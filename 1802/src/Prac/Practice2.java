/*
 * ����� �ζ� ��ȣ 7�� ����ϱ� (�ߺ� ����� ���� ���� x)
 * �ۼ�����: 2018.04.18
 */

package Prac;

public class Practice2 {
	public Practice2() {
		
		int lucky = (int) (Math.random()*45) + 1;
		int i;
		
		for (i=1 ; i<46 ; i++) {
			if (lucky == i) {
				System.out.println("�� ���� 1�� ��ȣ��: " + i + "�� �Դϴ�.");
			}
		}
	}
}
