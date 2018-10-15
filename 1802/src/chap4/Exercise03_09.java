/*
 * 1~100사이의 3의 배수의 합이 1000 이상이 되는 시점의 3의 배수와 합계(do~while문)
 */

package chap4;

public class Exercise03_09 {
	
	public Exercise03_09() {
		
		int i = 1;
		int sum = 0;
		
		do {
			if (i % 3 == 0) {
				sum += i;
				if (sum >= 1000) {
					System.out.println("3의 배수: " + (i));
					System.out.println("합계: " + sum);	
					break;
				}
			}
			i++;
		} while (i <= 100);
		
	}

}
