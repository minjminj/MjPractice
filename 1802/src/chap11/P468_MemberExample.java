/*
 * ���� ��ü�� �����ϴ��� ���� ��ü�� ���Ծ���.
 */
package chap11;

public class P468_MemberExample {

	public static void main(String[] args) {
		// ���� ��ü ����
		P467_Member original = new P467_Member("yellow", "�����", "98765", 28, true);
	
	
	// ���� ��ü�� ���� �Ŀ� �н����� ����
	P467_Member cloned = original.getMember();
	cloned.password = "13579";
	
	System.out.println("[���� ��ü�� �ʵ尪]");
	System.out.println(cloned /*cloned.toSting���� .toString�� ������ ��*/);							// ���� ��ü�� �н����� ���� ������ �н����� ���� �ٸ���.
	
	System.out.println();
	
	System.out.println("[���� ��ü�� �ʵ尪]");
	System.out.println(original);						// ���� ��ü�� �н����� ���� ��ȭ�� ���� ��ü�� ������ ��ġ�� �ʾҴ�.
	
	
	
	}

}
