/*
 * 추상 메소드 오버라이딩
 */
package chap7;

public class P336_Cat extends P335_Animal {
	
	public P336_Cat() {
		this.kind = "포유류";
	}
	
	@Override
	public void sound() {
		System.out.println("야옹");
	}
	

}
