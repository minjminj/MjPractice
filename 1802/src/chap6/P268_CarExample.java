/*
 * getter �� setter �޼ҵ� ���
 */

package chap6;

public class P268_CarExample {
	
	public static void main(String[] args) {
	P267_Car myCar = new P267_Car();
	
//	// �߸��� �ӵ� ����
//	myCar.setSpeed(-50);
//	
//	System.out.println("���� �ӵ�: " + myCar.getSpeed());
//	
	// �ùٸ� �ӵ� ����
	myCar.setSpeed(60);
	
	// ����
	
	if (!myCar.isStop()) {
		myCar.setStop(true);
	}
	
	}
	
	
	
}
