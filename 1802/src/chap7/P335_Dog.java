/*
 * 추상 메소드 오버라이딩
 * 2018.05.01(김민정)
 */
package chap7;

public class P335_Dog extends P335_Animal{

	public P335_Dog() {
		
		this.kind = "포유류";
	}
	
	@Override
	public void sound() {
		System.out.println("멍멍");
	}
	
}
