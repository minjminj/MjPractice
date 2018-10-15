/*
 * 1~100사이를 do~while을 사용하여 3씩 증가시켜 반복하고 3의 배수의 합 출력
 */

package chap4;

public class Exercise03_06 {

	public Exercise03_06() {
		
		int i = 3;
		int sum = 0;
		
		do {
			sum+= i;
			i= i+3;
		} while (i<=100);
		System.out.println(sum);
	}
}
