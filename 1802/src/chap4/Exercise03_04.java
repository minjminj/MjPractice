/*
 * while을 사용하여 3씩 증가시켜 3의 배수 합계 출력 (while문과 증가변수만 사용)
 */

package chap4;

public class Exercise03_04 {
	
	public Exercise03_04() {
		
		int i = 3;
		int sum = 0;
		
		while (i<=100) {
			sum += i;
			i= i+3;
		}
		System.out.println(sum);
	}

}
