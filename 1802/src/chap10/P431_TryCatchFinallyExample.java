/*
 * �Ϲ� ���� ó��
 *2018.05.02(�����)
 */
package chap10;

public class P431_TryCatchFinallyExample {

	public static void main(String[] args) {
		
		try {
			Class clazz = Class.forName("jave.lang.String2");
		} catch (ClassNotFoundException e) {
			System.out.println("Ŭ������ �������� �ʽ��ϴ�.");
		}
	}
}
