/*
 * ������ �����ϴ� ���� �����尡 �����ϴ� �ڵ�
 * 2018.05.08(�����)	
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
		
		System.out.println("���� ������ ����");
		
	}
}
