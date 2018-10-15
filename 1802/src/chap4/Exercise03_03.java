/*
 * 1~100 사이를 1씩 증가시키는 while을 사용하여 3의 배수의 합계 출력
 * 작성일자: 2018.04.20
 */

package chap4;

public class Exercise03_03 {
	
	public Exercise03_03() {
		
		int i = 1;
		int sum = 0;	// 3의 배수의 합계
		
		while (i<=100) {
			if (i % 3 == 0) {	// 3의 배수 가려내기
				sum += i;		// 3의 배수일때 합산
			}
			i++ ;				// i값을 1씩 증가
		}
		System.out.println(sum);	// 1~100까지 중 3의 배수의 합계 출력
	}
		
}


