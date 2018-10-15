/*
 * 구구단 출력하기
 * 작성일자: 2018.04.19
 */
package chap4;

public class P124_ForMultilpicaionTableExample {

	public P124_ForMultilpicaionTableExample() {
		
		int i, k;
		
		for (i=2 ; i<=9 ; i++) {
			System.out.println("--- " + i + "단 ---");
			
			for (k=1; k<=9 ; k++) {
				System.out.println(i + "*" + k + " = " + (i*k));
			}
		}
	}
}
