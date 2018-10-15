/*
 * 1부터 100까지 합계를 while로 출력
 * 작성일자: 2018.04.20
 */
package chap4;

public class P125_WhileSumFrom1To100Example {

	public P125_WhileSumFrom1To100Example() {
		
		int i = 1;
		int sum = 0;
		
		while (i <= 100) {
			
			sum += i ;
		
			i++ ;
		}
		System.out.println("1~" + (i-1) + " 까지의 합: " + sum);
	}
}
