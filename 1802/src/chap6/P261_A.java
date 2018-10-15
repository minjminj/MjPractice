/*
 * 생성자의 접근 제한
 * 2018.04.30(김민정)
 */
package chap6;

public class P261_A {
	
	// 필드
	P261_A a1 = new P261_A(true);
	P261_A a2 = new P261_A(1);
	P261_A a3 = new P261_A("문자열");
	
	
	// 생성자
	public P261_A(boolean b) {}
	P261_A(int b){}
	private P261_A(String s) {}
	

}
