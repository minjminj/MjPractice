/*
 * ��ü�� ���� ����(toString() �޼ҵ�)
 * 2018.05.02(�����)
 */
package chap10;

public class P465_SmartPhoneExample {
	
	public static void main(String[] args) {
		
		P465_SmartPhone myPhone = new P465_SmartPhone("����", "ios");
		
		String mp = myPhone.toString();
		System.out.println(mp);
		
		System.out.println(myPhone);
	}

}
