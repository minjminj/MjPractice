/*
 * ���� ���� �� ������ ������ ������ ������ ��ġ�� �ʴ´�.
 * 2018.05.03(�����)
 */
package chap11;

public class P471_Member2Example {

	public static void main(String[] args) {
		
		// ���� ��ü ����
		P469_Member2 original = new P469_Member2("�����", 28, new int[] {93, 97}, new P470_Car("��Ŀ����"));
		
		
		// ���� ��ü�� ���� �Ŀ� ���� ��ü�� ���� ����
		P469_Member2 cloned = original.getMember();
		cloned.scores[0] = 100;
		cloned.car.model = "����Ƽ��";
		
		System.out.println("[���� ��ü�� �ʵ尪]");
		System.out.println(cloned);
		
		System.out.println();
		
		System.out.println("[���� ��ü�� �ʵ尪]");
		System.out.println(original);
	}
}
