/*
 * ��ü�� ���� ����(toString() �޼ҵ�)
 * 2018.05.02(�����)
 */
package chap10;

public class P465_SmartPhone {

	private String company;
	private String os;

	public P465_SmartPhone(String company, String os) {
		this.company = company;
		this.os = os;
	}
	
	@Override
	public String toString() {
		
		return company + ", " + os;
	}


}

