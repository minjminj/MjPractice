/*
 * 1~25까지 출력하는데 한줄에 숫자 5개씩 5열로.
 * 작성일자: 2018.04.20
 */
package chap4;

public class ForEx4WithIf {

	public ForEx4WithIf() {
		
		int n;
		
		for (n=1 ; n<=25; n++) {
			if (n % 5 == 1 && n >= 5) {
				System.out.println();
			}
			
			System.out.print(n);
		}
	}
}
