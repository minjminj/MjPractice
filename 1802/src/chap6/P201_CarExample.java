/*
 * �ܺ� Ŭ�������� Car �ʵ尪 �б�� ����
 * 2018.04.30(�����)
 */

package chap6;

public class P201_CarExample {

	public static void main(String[] args) {
		
		// ��ü ����
		P201_Car myCar = new P201_Car();
		
		// �ʵ尪 �б�
		System.out.println("����ȸ��: " + myCar.company);
		System.out.println("�𵨸�: " + myCar.model);
		System.out.println("����: " + myCar.color);
		System.out.println("�ְ�ӵ�: " + myCar.maxSpeed);
		System.out.println("����ӵ�: " + myCar.speed);
		
		// �ʵ尪 ����
		myCar.speed = 60;
		System.out.println("������ �ӵ�: " + myCar.speed);
	}
}
