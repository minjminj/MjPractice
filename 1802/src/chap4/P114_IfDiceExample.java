// -----------------
// �ֻ����� ��ȣ�� �̴� ����
// �ۼ�����: 2018.04.18
// ------------------

package chap4;

public class P114_IfDiceExample {
	public static void main(String[] args) {
		
		int num = (int)(Math.random()*6) + 1; // �ֻ��� ��ȣ�� ���Ƿ� �̴´�!
		int i;
		
		for (i=1; i<7; i++) {
			if (num == i) {
				System.out.println(i + "���� ���Խ��ϴ�.");
			}
		}
	}
}
