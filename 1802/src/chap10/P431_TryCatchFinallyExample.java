/*
 * 일반 예외 처리
 *2018.05.02(김민정)
 */
package chap10;

public class P431_TryCatchFinallyExample {

	public static void main(String[] args) {
		
		try {
			Class clazz = Class.forName("jave.lang.String2");
		} catch (ClassNotFoundException e) {
			System.out.println("클래스가 존재하지 않습니다.");
		}
	}
}
