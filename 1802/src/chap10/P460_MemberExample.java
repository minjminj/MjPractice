/*
 * ��ü ���� ��(equals() �޼ҵ�)
 */
package chap10;

public class P460_MemberExample {

	public static void main(String[] args) {
		P459_Member obj1 = new P459_Member("blue");
		P459_Member obj2 = new P459_Member("blue");
		P459_Member obj3 = new P459_Member("red");

		if (obj1.equals(obj2)) {
			System.out.println("obj1�� obj2�� �����մϴ�.");
		} else {
			System.out.println("obj1�� obj2�� �������� �ʽ��ϴ�.");
		}
		
		if (obj1.equals(obj3)) {
			System.out.println("obj1�� obj3�� �����մϴ�.");
		} else {
			System.out.println("obj1�� obj3�� �������� �ʽ��ϴ�.");
		}
		
	
		P459_Member two1 = new P459_Member("red", 5);
		P459_Member two2 = new P459_Member("red", 5);
		P459_Member two3 = new P459_Member("red", 9);
		P459_Member two4 = new P459_Member("white", 5);
		
		if (two1.equals(two2)) {
			System.out.println("two1�� two2�� �����մϴ�.");
		} else {
			System.out.println("two1�� two2�� �������� �ʽ��ϴ�.");
		}
		
		if (two1.equals(two3)) {
			System.out.println("two1�� two3�� �����մϴ�.");
		} else {
			System.out.println("two1�� two3�� �������� �ʽ��ϴ�.");
		}
		
		if (two1.equals(two4)) {
			System.out.println("two1�� two4�� �����մϴ�.");
		} else {
			System.out.println("two1�� two4�� �������� �ʽ��ϴ�.");
		}
		
		if (two3.equals(two4)) {
			System.out.println("two3�� two4�� �����մϴ�.");
		} else {
			System.out.println("two3��two4�� �������� �ʽ��ϴ�.");
		}
	
	
	
	
	}
	
}
