/*
 * Ű����� while�� ����(Ű���带 ����� �޴� ��Ʈ��)
 */
package chap4;

public class P127_WhileKeyControlExample {

	public P127_WhileKeyControlExample() throws Exception {
		
		boolean run = true;
		int speed = 0;
		int keyCode = 0;
		
		while (run) {
			if ( (keyCode !=13) && (keyCode != 10)) {// 24~31���� ������ �����ϱ� ���� ���ڿ� enter�� �Բ� �Է��ϸ� ������ enter��ɰ� �Բ� ���Ͱ��� ������ Ű�ڵ� �ΰ��� �Բ� �νĵ�. read()�� �̿��� �Է°��� ���� ������ �����ϴ� �ڵ带 �ۼ��Ҷ� �ʼ�.
				System.out.println("--------------------");
				System.out.println("1.���� | 2.���� | 3.����");
				System.out.println("--------------------");
				System.out.println("����: ");
			}
			
			keyCode = System.in.read();	// read()�� ���࿡ �ʿ��� ���� �Է��ϰ� enter ������ ���డ��. �׷��� read() ��ü�� enter�� ������ ������ ������ �߻�. 1. �Է� ������ enter 2. keyCode 13�� �� 3. keyCode 10�� ��
			
			if (keyCode == 49) {	// ���� 1�� keyCode�� 49, �� ���� 1�� �Է�������
				speed++;
				System.out.println("���� �ӵ�= " + speed);
			} else if (keyCode == 50) {	// ���� 2�� �Է�������
				speed--;
				System.out.println("���� �ӵ�= "+ speed);
			} else if (keyCode == 51) {
				run = false;
			}
		}
		
		System.out.println("���α׷� ����");
	}
}
