/*
 * 추상 메소드 선언
 * 2018.05.01(김민정)
 */
package chap7;

public abstract class P335_Animal {
	
	public String kind;
	
	public void breathe() {
		System.out.println("숨을 쉽니다.");
	}
	
	public abstract void sound();

}
