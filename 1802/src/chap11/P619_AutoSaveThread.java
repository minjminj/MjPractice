/*
 * 1초 주기로 save()메소드를 호출하는 데몬 스레드
 * 2018.05.08(김민정)
 */
package chap11;

public class P619_AutoSaveThread extends Thread {

	public void save() {
		System.out.println("작업 내용을 저장함");
	}
	
	@Override
	public void run() {
		while(true) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				break;
			}
			
			save();
		}
	}
}
