/*
 * Practice2는 숫자 하나씩 만 출력. 2_1에서 여러 숫자를 한번에 나열형태로 출력해보자.
 */

package Prac;

public class Practice2_1 {
	public Practice2_1() {
		
		int lucky = (int) (Math.random()*45) + 1;
		int k;
		int i;
		
		for (k=1 ; k<=7 ; k++) {
			for (i=1 ; i<46 ; i++) {
				lucky = (int) (Math.random()*45) + 1; // for문 안에서 다시 선언해주는 이유: i++마다 랜덤 다시 뽑히도록!
				if (lucky == i) {
				System.out.println("이 주의 1등 번호는 " + i + "입니다");
				} break;
			}
		}
	}
}
