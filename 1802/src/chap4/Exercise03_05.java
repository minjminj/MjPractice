/*
 * 1~100사이를 1씩 증가시키는 do~while을 사용하여 3의 배수의 합계 출력
 */

package chap4;

public class Exercise03_05 {
	
	public Exercise03_05() {
		
		int i = 1;
		int sum = 0;
		
		do {
			if (i % 3 == 0) {
				sum += i;
			}
			i++;
		} while(i<=100);
		System.out.println(sum);
	}

}
