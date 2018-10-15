// -----------------
// 주사위의 번호를 뽑는 예제
// 작성일자: 2018.04.18
// ------------------

package chap4;

public class P114_IfDiceExample {
	public static void main(String[] args) {
		
		int num = (int)(Math.random()*6) + 1; // 주사위 번호를 임의로 뽑는다!
		int i;
		
		for (i=1; i<7; i++) {
			if (num == i) {
				System.out.println(i + "번이 나왔습니다.");
			}
		}
	}
}
