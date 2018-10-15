/*
 * 1~25까지 출력하는데 한줄에 숫자 5개씩 5열로.
 * if문 없이
 * 작성일자: 2018.04.20
 */

package chap4;

public class ForEx4 {

	public ForEx4() {
		
		int a, b;
		int n = 0;
		
		for (a=1 ; a<=5 ; a++) {
			for (b=1 ; b<=5 ; b++) {
				System.out.print(++n);
			}
			System.out.println();
		
		}
	}
}
