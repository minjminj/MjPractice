/*
 * �ڽ� Ŭ����
 * 2018.05.01(�����)
 */

package chap7;


public class P290_DmbCellPhone extends P290_CellPhone{

	// �ʵ�
	int channel;
	
	// ������
	P290_DmbCellPhone(String model, String color, int channel){
		
		this.model = model;
		this.color = color;
		this.channel = channel;
	}
	
	// �޼ҵ�
	void turnOnDmb() {
		System.out.println("ä�� " + channel + "�� DMB ��� ������ �����մϴ�.");
	}
	void changeChannel(int channel) {
		this.channel = channel;
		System.out.println("ä�� " + channel + "������ �ٲߴϴ�." );
	}
	void turnOffDmb() {
		System.out.println("DMB ��� ������ ����ϴ�.");
	}
}
