/*
 * break���� ���� case;
 * test() �޼ҵ带 ����Ͽ� ó��, time ������ ���������� ����
 * �ۼ�����: 2018.04.19
 */

package chap4;

public class P118_SwitchNoBreakCaseExample {

	public void test() {
		
		int time = (int) (Math.random()*4) +8;
		System.out.println("����ð�: " + time + "��");
		
		switch (time) {
		
		case 8:
			System.out.println("����մϴ�");
		case 9:
			System.out.println("ȸ�Ǹ� �մϴ�");
		case 10:
			System.out.println("������ ���ϴ�");
		default :
			System.out.println("�ܱ��� �����ϴ�");
		}
		
	}
}
