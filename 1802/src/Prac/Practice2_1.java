/*
 * Practice2�� ���� �ϳ��� �� ���. 2_1���� ���� ���ڸ� �ѹ��� �������·� ����غ���.
 */

package Prac;

public class Practice2_1 {
	public Practice2_1() {
		
		int lucky = (int) (Math.random()*45) + 1;
		int k;
		int i;
		
		for (k=1 ; k<=7 ; k++) {
			for (i=1 ; i<46 ; i++) {
				lucky = (int) (Math.random()*45) + 1; // for�� �ȿ��� �ٽ� �������ִ� ����: i++���� ���� �ٽ� ��������!
				if (lucky == i) {
				System.out.println("�� ���� 1�� ��ȣ�� " + i + "�Դϴ�");
				} break;
			}
		}
	}
}
