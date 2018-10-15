/*
 * 1 1 1 1 1, 2 2 2 2, 3 3 3, 4 4, 5 를 다섯줄에 각각 출력.
 * 작성일자: 2018.04.20
 */
package chap4;

public class ForEx9 {
	
	public ForEx9() {
		
		int a, b;
		int n = 1;
		
		for(a=5 ; a>=1 ; a--) {
			
			for (b=1 ; b<=a ; b++) {
				System.out.print(n);
			}
			n++ ;
			System.out.println();
		}
	}

}
