/* ------------------------------
 * �������� ������ ��ü ����
 * �ۼ�����: 2018.04.18
*/  

package chap4;

public class Ex20 {
	// �Ű������� ���� ������
	public Ex20() {
		System.out.println("�Ű������� ���� ������ �Դϴ�.");
	}
	
	// ������ �Ű������� �� �� �ִ� ������
	// ���� �����ڸ� �Ű������� ����, ����, ������ ������ �׳� �Ű�������� ���þ��� ��� �ϳ��� ������.
	public Ex20(int k){
		System.out.println("������ �Ű������� �� �� �ִ� ������");
		System.out.println("�Ű�������:" + k);
	}
	
	// ���ڿ� �� ���� �Ǽ��� �� ���� �Ű������� �ִ� ������
	public Ex20(String name, double score) {
		System.out.println("name : " + name);
		System.out.println("score : " + score);
	}
	
}
