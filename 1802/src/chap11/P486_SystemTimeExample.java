/*
 * ���α׷� ���� �ҿ� �ð� ���ϱ�
 * 2018.05.03(�����)
 */
package chap11;

public class P486_SystemTimeExample {

	public static void main(String[] args) {
		long startTime, endTime;
		String str = "";
		
		// ���ڿ� ó���ð�
		startTime = System.nanoTime();
		for (int i=0 ; i<80000; i++) {
			str += "a";
		}
		endTime = System.nanoTime();
		
		System.out.println("ó�� �ð� :");
		System.out.println(((endTime-startTime)/10000000000.0));
	
		// StringBuilder�� ���ڿ� ó�� �ð�
		StringBuilder sb = new StringBuilder();
		startTime = System.nanoTime();
		for (int i=0 ; i<80000; i++) {
			sb.append("a");
		}
		endTime = System.nanoTime();
		
		System.out.println("ó�� �ð� :");
		System.out.println(((endTime-startTime)/10000000000.0));
	
	
	
	
	}
}
