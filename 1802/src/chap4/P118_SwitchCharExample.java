/*
 * char Ÿ���� switch��
 * test(char grade)�޼ҵ带 ����� ��� ó�� - grade ������ �Ű��������� ����Ͽ� ó��
 * �ۼ�����: 2018.04.19
 */

package chap4;

public class P118_SwitchCharExample {
	
	public void test(char grade) {
			
		switch (grade) {
		
		case 'A' :
		case 'a' :
			System.out.println("��� ȸ���Դϴ�");
			break;
		case 'B' :
		case 'b' :
			System.out.println("�Ϲ� ȸ���Դϴ�");
			break;
		default :
			System.out.println("�մ��Դϴ�");
		}
	}
}
