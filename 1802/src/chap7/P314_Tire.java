/*
 * Ÿ�̾� Ŭ����
 * 2018.05.01
 */
package chap7;

public class P314_Tire {

	// �ʵ�
	public int maxRotation;	// �ִ� ȸ����(Ÿ�̾� ����)
	public int accumulatedRotation;	// ���� ȸ����
	public String location;	// Ÿ�̾��� ��ġ
	
	// ������
	public P314_Tire(String location, int maxRotation) {
		this.location = location;
		this.maxRotation = maxRotation;
	}
	
	// �޼ҵ�
	public boolean roll() {
		++accumulatedRotation;		// ���� ȸ���� 1 ����
		if (accumulatedRotation < maxRotation) {					// ����<�ִ� �϶� ����ȸ��
			System.out.println(location + "Tire ����: " + (maxRotation - accumulatedRotation) + "ȸ");
			return true;
		} else {
			System.out.println("*** " + location + " Tire ��ũ ***");			// ����=�ִ� �϶� ��ũ
			return false;
		}
	}
}
