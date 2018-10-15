/*
 * 동기화 메소드로 수정된 공유 객체
 * 2018.05.08(김민정)
 */
package chap11;

public class P595_Calculator {

	private int memory;
	
	public int getMemory() {
		return memory;
	}
	
	public synchronized void setMemory(int memory) {
		this.memory = memory;
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {}
		System.out.println(Thread.currentThread().getName() + ": " + this.memory);		// currentThread().getName() 은 현재 스레드의 이름을 부르는 코드.
	}
}
