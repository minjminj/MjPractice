/*
 * continue를 사용한 for문
 * 1~10까지의 수 중 continue를 사용한 짝수 출력
 * 작성일자: 2018.04.20
 */
package chap4;

public class P133_ContiueExample {
	
	public P133_ContiueExample() {
		
		for (int i=1 ; i<=10 ; i++) {
			if (i % 2 == 1) {
				continue;
			}
			System.out.println(i);
		}
	}

}
