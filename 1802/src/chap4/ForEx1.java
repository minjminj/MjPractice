/*
 * 1~5까지 각 숫자를 다섯개씩 출력. 단 숫자별로 줄 바꿈.
 * 작성일자: 2018.04.20
 */
package chap4;

public class ForEx1 {
	
	public ForEx1() {
		int n, i;
		
		for (n=1 ; n<=5 ; n++) {
			
			for (i=1 ; i<=5 ; i++) {
				System.out.print(n);
				
			}
			System.out.println();
		}		
	}
}


// for문을 두개 사용하는 이유 -> 가로5 세로5를 제어하기 위해서
