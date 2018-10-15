/*
 * String타입의 switch문
 * 변수 position은 인스턴스형 변수를 선언, 생성자로부터 문자열을 받아 position에 저장, chk() 메소드를 사용하여 결과 처리
 */

package chap4;

public class P119_SwitchStringExample {

	String position;
	
	
	 public P119_SwitchStringExample(String position) {
		
		this.position = position;
	 }		 
	
	
	public void chk() {
		switch (position) {
		
		case "부장" :
			System.out.println("700만원");
			break;
		case "과장" :
			System.out.println("500만원");
			break;
		default :
			System.out.println("300만원");
		}
	}
}
