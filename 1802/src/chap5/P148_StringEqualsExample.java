/*
 * ���ڿ� ���� �� �� ���
 * �ۼ�����: 2018.04.23
 */
package chap5;

public class P148_StringEqualsExample {
	
	public P148_StringEqualsExample() {
		
		String strVar1 = "�Ź�ö";
		String strVar2 = "�Ź�ö";
		
		if (strVar1 == strVar2) {
			System.out.println("strVar1�� strVar2�� ������ ����");
		} else {
			System.out.println("strVar1�� strVar2�� ������ �ٸ�");
		}
		
		if (strVar1.equals(strVar2)) {
			System.out.println("strVar1�� strVar2�� ���ڿ��� ����");
		}
		
		String strVar3 = new String("�Ź�ö");
		String strVar4 = new String("�Ź�ö");
		
		if (strVar3 == strVar4) {
			System.out.println("strVar3�� strVar4�� ������ ����");
		} else {
			System.out.println("strVar3�� strVar4�� ������ �ٸ�");
		}
		
		if (strVar3.equals(strVar4)) {
			System.out.println("strVar3�� strVar4�� ���ڿ��� ����");
		}
		
	}
}
		

