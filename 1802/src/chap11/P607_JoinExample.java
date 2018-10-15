/*
 * 다른 스레드가 종료될 때까지 일시 정지 상태 유지
 * 2018.05.08(김민정)
 */
package chap11;

public class P607_JoinExample {

	public static void main(String[] args) {
		
		P607_SumThread sumThread = new P607_SumThread();
		
		sumThread.start();
		
		try {
			sumThread.join();
		} catch (InterruptedException e) {
		}
		
		System.out.println("1~100까지의 합: " + sumThread.getSum());
	}
}
