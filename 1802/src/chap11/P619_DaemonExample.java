/*
 * 데몬을 포함하는 메인 스레드가 실행하는 코드
 * 2018.05.08(김민정)	
 */
package chap11;

public class P619_DaemonExample {
	
	public static void main(String[] args) {
		P619_AutoSaveThread autoSaveThread = new P619_AutoSaveThread();
		autoSaveThread.setDaemon(true);
		autoSaveThread.start();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
		}
		
		System.out.println("메인 스레드 종료");
		
	}
}
