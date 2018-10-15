/*
 * 기본 타입의 값을 박싱하고 언박싱하기
 * 2018.05.08(김민정)
 */

package chap11;

public class P529_BoxingUnBoxingExample {
	public static void main(String[] args) {
		
		// Boxing : 포장 클래스에 값 입력
		Integer obj1 = new Integer(100);		// 포장클래스의 생성자 매개값으로 기본 타입의 값 넘겨주기
		Integer obj2 = new Integer("200");		// 포장클래스의 생성자 매개값으로 문자열을 넘겨주기
		Integer obj3 = Integer.valueOf("300");	// valueOf 사용. 문자열로 넘겨주기
		Integer obj4 = Integer.valueOf(400);	// valueOf 사용. 기본 타입 값으로 넘겨주기
		
		// Unboxing : 포장 클래스에 입력된 값 가져오기
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
