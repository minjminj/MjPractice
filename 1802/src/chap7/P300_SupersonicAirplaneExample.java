package chap7;

public class P300_SupersonicAirplaneExample {
	
	public static void main(String[] args) {
		
		P299_SupersonicAirplane sa = new P299_SupersonicAirplane();
		
		sa.takeOff();
		sa.fly();
		sa.flymode = P299_SupersonicAirplane.SUPERSONIC;		// sa ��� P299_SupersonicAirplane�� ����� ������ ���������� SUPERSONIC �Ǵ� NORMAL�� static final int �ΰ��� �˼� �ֱ� �ϱ� ����. �׸��� ������
		sa.fly();
		sa.flymode = P299_SupersonicAirplane.NORMAL;			// static ���� �����ϴ� ���� �� �ϳ��� ��ü������ ���ϰ� �;.
		sa.fly();
		sa.land();
	}

}
