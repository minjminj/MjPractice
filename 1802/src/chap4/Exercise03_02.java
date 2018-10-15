/*
 * for문의 초기값, 증가값 만으로 3의 배수 합계 출력
 */

package chap4;

public class Exercise03_02 {

	public Exercise03_02() {
		
		int i;
		int sum = 0;
		
		for (i=3 ; i<=100 ; i=i+3) {
			sum += i;
		}
		System.out.println(sum);
		
	}
}
