/*
 * 1�� �ֱ�� save()�޼ҵ带 ȣ���ϴ� ���� ������
 * 2018.05.08(�����)
 */
package chap11;

public class P619_AutoSaveThread extends Thread {

	public void save() {
		System.out.println("�۾� ������ ������");
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
