// -----------------
// ��ø if��
// �ۼ�����: 2018.04.18
// ------------------

package chap4;

public class P115_IfNestedExample {
	public static void main(String[] args) {
		
		int score = (int)(Math.random()*20)+81; // ������ ���� ���� �� ���Ƿ� �̴´�!
		System.out.println("����: " + score);
		
		String grade;
		
		if (score >= 90) {
			if (score >= 95) {
				grade = "A+";
			} else {
				grade = "A";
			}
		} else {
			if (score >= 85) {
				grade = "B+";
			} else {
				grade = "B";
			}
		}
		
		System.out.println("����: " + grade);
	}
}