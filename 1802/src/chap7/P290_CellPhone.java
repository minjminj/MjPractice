/*
 * �θ� Ŭ����
 * 2018.05.01(�����)
 */

package chap7;

public class P290_CellPhone {

	// �ʵ�
	String model;
	String color;
	
	// ������
	
	//�޼ҵ�
	
	void powerOn() {System.out.println("������ �մϴ�.");}
	void powerOff() {System.out.println("������ ���ϴ�.");}
	void bell() {System.out.println("���� �︳�ϴ�");}
	void sendVoice(String message) {System.out.println("�ڱ�: " + message);}
	void receiveVoice(String message) {System.out.println("����: " + message);}
	void hangUp() {System.out.println("��ȭ�� �����ϴ�.");}
}
