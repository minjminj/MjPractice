/*
 * 행운의 로또 번호 7개 출력하기 (중복 출력의 변수 제어 x)
 * 작성일자: 2018.04.18
 */

package Prac;

public class Practice2 {
	public Practice2() {
		
		int lucky = (int) (Math.random()*45) + 1;
		int i;
		
		for (i=1 ; i<46 ; i++) {
			if (lucky == i) {
				System.out.println("이 주의 1등 번호는: " + i + "번 입니다.");
			}
		}
	}
}
