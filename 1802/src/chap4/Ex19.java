// ------------------------------
// ���ڿ� �񱳽� ==�� ���� ����, .equals() �ż��带 ���� ���
	//���ڿ��� ���Կ����ڷ� ���� �� ==�� ��
 	//���ڿ��� ��ü�� ���� �� == ��
// �ۼ�����: 2018.04.18
// --------------------------------------------------

package chap4;

public class Ex19 {
	public static void main(String[] args) {
		String a = "ȫ";
		String b = "ȫ";
		
		if (a == b) {
			System.out.println("a=b"); //���
		} else {
			System.out.println("a!=b");
		}
		
		String c = new String("��");
		String d = new String("��");
		
		if (c == d) {
			System.out.println("c=d");
		} else {
			System.out.println("c!=d"); //���
		}
		
		// .equals ��
		System.out.println("-----------------------");
		
		if (a .equals(b)) {
			System.out.println("a=b"); //���
		} else {
			System.out.println("a!=b");
		}
		
		if (c .equals(d)) {
			System.out.println("c=d"); //���
		} else {
			System.out.println("c!=d");
		}
	}
}
