// -----------------
// 중첩 if문
// 작성일자: 2018.04.18
// ------------------

package chap4;

public class P115_IfNestedExample {
	public static void main(String[] args) {
		
		int score = (int)(Math.random()*20)+81; // 점수의 범위 수들 중 임의로 뽑는다!
		System.out.println("점수: " + score);
		
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
		
		System.out.println("학점: " + grade);
	}
}