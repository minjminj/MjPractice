/*
 * continue�� ����� for��
 * 1~10������ �� �� continue�� ����� ¦�� ���
 * �ۼ�����: 2018.04.20
 */
package chap4;

public class P133_ContiueExample {
	
	public P133_ContiueExample() {
		
		for (int i=1 ; i<=10 ; i++) {
			if (i % 2 == 1) {
				continue;
			}
			System.out.println(i);
		}
	}

}
