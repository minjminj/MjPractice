/*
 * �ڽ� Ŭ���� ���
 * 2018.05.01(�����)
 */
package chap7;

public class P291_DmbCellPhoneExample {

	public static void main(String[] args) {
		
		// ��ü ����
		P290_DmbCellPhone dmbCellPhone = new P290_DmbCellPhone("������", "ȭ��Ʈ", 7);
 
		// CellPhone���κ��� ��ӹ��� �ʵ�
		System.out.println("��:" + dmbCellPhone.model);
		System.out.println("����:" + dmbCellPhone.color);
		
		// DmbCellPhone���κ��� ��ӹ��� �ʵ�
		System.out.println("ä��" + dmbCellPhone.channel);
		
		// CellPhone���κ��� ��ӹ��� �޼ҵ� ȣ��
		dmbCellPhone.powerOn();
		dmbCellPhone.bell();
		dmbCellPhone.sendVoice("��������");
		dmbCellPhone.receiveVoice("�ȳ��ϼ���! ���� ȫ�浿�ε���");
		dmbCellPhone.sendVoice("��~ �� �ݰ����ϴ�.");
		dmbCellPhone.hangUp();
		
		// DmbCellPhone���κ��� ��ӹ��� �޼ҵ� ȣ��
		dmbCellPhone.turnOnDmb();
		dmbCellPhone.changeChannel(12);
		dmbCellPhone.turnOffDmb();
		}
}
