/*
 * 1~100사이의 3의 배수의 합이 1000 이상이 되는 시점의 3의 배수와 합계(while문)
 */

package chap4;

public class Exercise03_08 {

	public Exercise03_08(){
		
		int i = 3;
		int sum = 0;
		
		while (i<=100) {
			sum += i;
			i = i +3;
			
			if (sum >= 1000) {
				System.out.println("3의 배수: " + (i-3));
				System.out.println("합계: " + sum);
				break;
			}
		}
	}
}
