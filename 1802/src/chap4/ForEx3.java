/*
 * 5~1까지 한줄에 출력. 5번반복
 * for문과 if문 사용.
 * 작성일자: 2018.04.20
 */
package chap4;

public class ForEx3 {

	public ForEx3() {
		
		int n, i;
		
		for (n=5 ; n>=1 ; n--){
			
			for (i=5; i>=1 ; i--){
				System.out.print(i);
			}
			System.out.println();
		}
	}
}
