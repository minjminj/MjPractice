/*
 * 1~100사이를 1씩 증가시키는 for문으로 반복하면서 나머지 연산자를 사용하는 방법으로 3의 배수 합계 출력
 * 작성일자: 2018.04.20
 */

package chap4;

public class Exercise03_01 {
	
	public Exercise03_01() {
		
		int i;
		int sum = 0;
		
		for (i=1 ; i<=100 ; i++) {
			if (i % 3 == 0) {
				sum += i;
			}
		}
		System.out.println(sum);
	}

}
