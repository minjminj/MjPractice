// ------------------
// if문
// 작성일자: 2018.04.18
// -------------------

package chap4;

public class P109_IfExample {
	public static void main(String[] args) {
		 int score= 90;
		 
		 if (score>=90) {
			 System.out.println("점수가 90보다 크거나 같습니다");
			 System.out.println("등급은 A 입니다.");
		 }
		 
		 if (score<90) {
			 System.out.println("점수가 90보다 작습니다");
			 System.out.println("등급은 B 입니다.");
		 }
	}
}
