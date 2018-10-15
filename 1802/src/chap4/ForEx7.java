/*
 * 1, 2 2, 3 3 3, 4 4 4 4, 5 5 5 5 5 를 한줄에 한숫자씩 출력하기
 */
package chap4;

public class ForEx7 {

	public ForEx7() {
		int a, b;
		
		for (a=1 ; a<=5 ; a++) {
			
			for (b=1 ; b<=a ; b++) {
				System.out.print(a);
			}
			System.out.println();
		}
	}
}
