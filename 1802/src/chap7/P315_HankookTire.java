/*
 * Tire�� �ڽ� Ŭ����
 */
package chap7;

public class P315_HankookTire extends P314_Tire {

	// �ʵ�
	
	// ������
	public P315_HankookTire(String location, int maxRotation) {
		super(location, maxRotation);
	}
	
	// �޼ҵ�
	@Override
		public boolean roll() {
			++accumulatedRotation;		
			if (accumulatedRotation < maxRotation) {					
				System.out.println(location + "HankookTire ����: " + (maxRotation - accumulatedRotation) + "ȸ");
				return true;
			} else {
				System.out.println("*** " + location + " HankookTire ��ũ ***");			
				return false;
			}
		}
}
