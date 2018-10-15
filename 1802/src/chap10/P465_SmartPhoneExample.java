/*
 * 객체의 문자 정보(toString() 메소드)
 * 2018.05.02(김민정)
 */
package chap10;

public class P465_SmartPhoneExample {
	
	public static void main(String[] args) {
		
		P465_SmartPhone myPhone = new P465_SmartPhone("애플", "ios");
		
		String mp = myPhone.toString();
		System.out.println(mp);
		
		System.out.println(myPhone);
	}

}
