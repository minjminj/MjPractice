/*
 * �ڵ� �ڽ̰� ��ڽ�
 * 2018.05.08(�����)
 */

package chap11;

public class P530_AutoBoxingUnBoxingExample {

	public static void main(String[] args) {
		
		// �ڵ� Boxing
		Integer obj = 100;
		System.out.println("value: " + obj.intValue());
		
		// ���� �� �ڵ� Unboxing
		int value = obj;
		System.out.println("value: " + value);
		
		// ���� �� �ڵ� Unboxing
		int result = obj + 100;
		System.out.println("result: " + result);
		
	
	}
}
