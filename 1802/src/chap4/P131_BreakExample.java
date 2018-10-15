/*
 * break로 while문 종료
 * 난수를 사용하여 6이 나오면 break로 반복문 종료
 * 작성일자: 2018.04.20
 */
package chap4;

public class P131_BreakExample {
	
	public P131_BreakExample() {
		
		while (true) {
		
			int num = (int) (Math.random()*6) + 1;
			
			System.out.println(num);
		
			if (num == 6) {
				break;
			}
		}
		
		System.out.println("프로그램 종료");
	}

}
