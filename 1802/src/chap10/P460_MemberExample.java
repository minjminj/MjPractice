/*
 * 객체 동등 비교(equals() 메소드)
 */
package chap10;

public class P460_MemberExample {

	public static void main(String[] args) {
		P459_Member obj1 = new P459_Member("blue");
		P459_Member obj2 = new P459_Member("blue");
		P459_Member obj3 = new P459_Member("red");

		if (obj1.equals(obj2)) {
			System.out.println("obj1과 obj2는 동등합니다.");
		} else {
			System.out.println("obj1과 obj2는 동등하지 않습니다.");
		}
		
		if (obj1.equals(obj3)) {
			System.out.println("obj1과 obj3은 동등합니다.");
		} else {
			System.out.println("obj1과 obj3은 동등하지 않습니다.");
		}
		
	
		P459_Member two1 = new P459_Member("red", 5);
		P459_Member two2 = new P459_Member("red", 5);
		P459_Member two3 = new P459_Member("red", 9);
		P459_Member two4 = new P459_Member("white", 5);
		
		if (two1.equals(two2)) {
			System.out.println("two1과 two2는 동등합니다.");
		} else {
			System.out.println("two1과 two2는 동등하지 않습니다.");
		}
		
		if (two1.equals(two3)) {
			System.out.println("two1과 two3은 동등합니다.");
		} else {
			System.out.println("two1과 two3은 동등하지 않습니다.");
		}
		
		if (two1.equals(two4)) {
			System.out.println("two1과 two4는 동등합니다.");
		} else {
			System.out.println("two1과 two4는 동등하지 않습니다.");
		}
		
		if (two3.equals(two4)) {
			System.out.println("two3과 two4은 동등합니다.");
		} else {
			System.out.println("two3과two4은 동등하지 않습니다.");
		}
	
	
	
	
	}
	
}
