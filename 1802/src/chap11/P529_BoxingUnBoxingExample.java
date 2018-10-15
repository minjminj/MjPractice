/*
 * �⺻ Ÿ���� ���� �ڽ��ϰ� ��ڽ��ϱ�
 * 2018.05.08(�����)
 */

package chap11;

public class P529_BoxingUnBoxingExample {
	public static void main(String[] args) {
		
		// Boxing : ���� Ŭ������ �� �Է�
		Integer obj1 = new Integer(100);		// ����Ŭ������ ������ �Ű������� �⺻ Ÿ���� �� �Ѱ��ֱ�
		Integer obj2 = new Integer("200");		// ����Ŭ������ ������ �Ű������� ���ڿ��� �Ѱ��ֱ�
		Integer obj3 = Integer.valueOf("300");	// valueOf ���. ���ڿ��� �Ѱ��ֱ�
		Integer obj4 = Integer.valueOf(400);	// valueOf ���. �⺻ Ÿ�� ������ �Ѱ��ֱ�
		
		// Unboxing : ���� Ŭ������ �Էµ� �� ��������
		int value1 = obj1.intValue();
		int value2 = obj2.intValue();
		int value3 = obj3.intValue();
		int value4 = obj4.intValue();
		
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
		System.out.println(value4);
	}

}
