/*
 * 배열을 선언하는 여러가지 방법
 * 작성일자: 2018.04.23
 */
package chap5;

public class ArrayDeclare {
	
	public ArrayDeclare() {
		
		// 배열 선언과 동시에 초기값 대입
		int[] s1 = {90, 80, 77};
		int[] s2 = new int[] {90, 80, 77};
		
		// 배열형만 선언한 후 나중에 값을 대입
		int[] s3;
		s3 = new int[] {90, 80, 77};
	
		// 배열형과 배열의 크기만 선언
		int[] s4 = new int[3];
		int[] s5;
		s5 = new int[3];
		
		
		
		// 배열을 한번 선언하면 후에 그 타입과 크기를 절대로 바꿀 수 없다.
	}

} 
