/*
 * Tire�� ��ǰ���� ������ Ŭ����
 * �������� �迭
 * 2018.05.01(�����)
 */
package chap7;

public class P319_Car {
	
	// �ʵ�
	P314_Tire[] tires = {new P314_Tire("�տ���", 6), new P314_Tire("�տ�����", 2), new P314_Tire("�ڿ���", 3), new P314_Tire("�ڿ�����", 4)};
	
	// �޼ҵ�
	int run() {
		System.out.println("[�ڵ����� �޸��ϴ�]");
		for (int i=0 ; i<tires.length ; i++) {
			if (tires[i].roll() == false) {
				stop();
				return ( i + 1 );				
			}
		}
		return 0;
	}
	
	void stop() {
		System.out.println("[�ڵ����� ����ϴ�]");
	}
	
	

}
