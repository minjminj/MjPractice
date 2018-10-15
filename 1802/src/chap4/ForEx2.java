/*
 * 1~5까지 출력. 줄바꿔 출력 5번.
 * 작성일자: 2018.04.20
 */
package chap4;

public class ForEx2 {
	
	public ForEx2() {
		
		int n, i;
		
		for (n=1 ; n<=5 ; n++) {
			
			for (i=1 ; i<=5 ; i++) {
				System.out.print(i);
				
			}
			System.out.println();
		}
	}
}
