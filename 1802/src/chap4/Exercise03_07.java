/*
 * 1~100사이의 3의 배수의 합계가 1000 이상이 되는 시점의 3의 배수와 합계(for문)
 */

package chap4;

public class Exercise03_07 {
	
	public Exercise03_07() {
		
		int i;
		int sum = 0;
		
		for (i=1 ; i<=100 ; i++) {
			if (i % 3 == 0) {
				sum += i;
				if (sum >= 1000) {
					System.out.println("3의배수: " + i);
					System.out.println("합계: " + sum);
					break;
				}
			}
		}
	}
}