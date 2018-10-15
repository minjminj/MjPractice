/*
 * 배열의 length 필드
 * 2018.04.23
 */
package chap5;

public class P158_ArrayLengthExample {

	public P158_ArrayLengthExample() {
		
		int[] scores = {83, 92, 97};
		
		int sum = 0;
		
		for (int i=0 ; i<scores.length ; i++) {
			sum += scores[i];
		}
		System.out.println("sum: " + sum);
		
		double avg;
		
		avg = (double) sum / scores.length;
		
		System.out.println("avg: " + avg);
	}
}
