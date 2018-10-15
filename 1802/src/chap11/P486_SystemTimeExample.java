/*
 * 프로그램 실행 소요 시간 구하기
 * 2018.05.03(김민정)
 */
package chap11;

public class P486_SystemTimeExample {

	public static void main(String[] args) {
		long startTime, endTime;
		String str = "";
		
		// 문자열 처리시간
		startTime = System.nanoTime();
		for (int i=0 ; i<80000; i++) {
			str += "a";
		}
		endTime = System.nanoTime();
		
		System.out.println("처리 시간 :");
		System.out.println(((endTime-startTime)/10000000000.0));
	
		// StringBuilder로 문자열 처리 시간
		StringBuilder sb = new StringBuilder();
		startTime = System.nanoTime();
		for (int i=0 ; i<80000; i++) {
			sb.append("a");
		}
		endTime = System.nanoTime();
		
		System.out.println("처리 시간 :");
		System.out.println(((endTime-startTime)/10000000000.0));
	
	
	
	
	}
}
