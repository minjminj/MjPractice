/*
 * ���� Ŭ����
 * �������� �迭
 * 2018.05.01(�����)
 */
package chap7;

public class P320_CarExample {

	public static void main(String[] args) {
		
		P319_Car car = new P319_Car();
		
		for (int i=1 ; i<=5 ; i++) {
			int problemLocation = car.run();
			
			if (problemLocation != 0) {
				System.out.println(car.tires[problemLocation-1].location + "HankookTire�� ��ü");
				car.tires[problemLocation-1] = new P315_HankookTire(car.tires[problemLocation-1].location, 15);
			}
			System.out.println("----------------------------");
		}
	}
}
