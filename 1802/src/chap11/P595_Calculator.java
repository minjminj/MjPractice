/*
 * ����ȭ �޼ҵ�� ������ ���� ��ü
 * 2018.05.08(�����)
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
		System.out.println(Thread.currentThread().getName() + ": " + this.memory);		// currentThread().getName() �� ���� �������� �̸��� �θ��� �ڵ�.
	}
}
