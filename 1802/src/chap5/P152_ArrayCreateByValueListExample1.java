/*
 * 배열 선언 및 제어 방법
 * 작성일자: 2018.04.23
 */
package chap5;

public class P152_ArrayCreateByValueListExample1 {
	
	public P152_ArrayCreateByValueListExample1() {
		
		int[] scores = {87, 79, 93};
		
		System.out.println("scores[0] : " + scores[0]);
		System.out.println("scores[1] : " + scores[1]);
		System.out.println("scores[2] : " + scores[2]);
		
		int sum = 0;
		
		for (int i=0 ; i<3 ; i++) {
			sum += scores[i];
		}
		System.out.println("총합: " + sum);
		
		double avg = sum / 3.0;
		System.out.println("평균: " + avg);
	}
	

	

}
