/*
 * super ����
 */
package chap7;

public class P299_SupersonicAirplane extends P299_Airplane {

	public static final int NORMAL = 1;
	public static final int SUPERSONIC = 2;
	
	public int flymode = NORMAL;
	
	@Override
	public void fly() {
		if(flymode == SUPERSONIC) {
			System.out.println("�����Ӻ����մϴ�");
		} else {
			// P299_Airplane ��ü�� fly() �޼ҵ� ȣ��
			super.fly();
		}
	}
}
