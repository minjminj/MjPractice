package chap3;
//���ڿ� ��
public class P91_Ex9_StringEqualsExample {
	public static void main(String[] args) {
		String strVar1 = "�Ź�ö";
		String strVar2 = "�Ź�ö";
		String strVar3 = new String("�Ź�ö");	/* String�� ���� ���� �ƴϱ� ������ �̷��� ���°��� ����
				but �׳� String�� ����ؼ��� ���ڿ� ���� ������ ����������, ������ ������� ������������ �ٸ� ��ü���� ������ ��.*/
		
		System.out.println( strVar1 == strVar2);
		System.out.println( strVar1 == strVar3);
		System.out.println();
		System.out.println( strVar1.equals(strVar2));
		System.out.println( strVar1.equals(strVar3));
		
		
	}
}
