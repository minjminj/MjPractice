/*
 * �������̽� ����
 * 2018.05.10(�����)
 */
package chap7;

public class P352_Television implements P349_RemoteControl {

	// �ʵ�
	private int volume;
	
	//turnOn() �߻� �޼ҵ��� ��ü �޼ҵ�
	public void turnOn() {
		System.out.println("TV�� �մϴ�.");
	}
	
	// turnOff() �߻� �޼ҵ��� ��ü �޼ҵ�
	public void turnOff() {
		System.out.println("TV�� ���ϴ�.");
	}
	
	// setVolume() �߻� �޼ҵ��� ��ü �޼ҵ�
	public void setVolume(int volume) {
		if (volume > P349_RemoteControl.MAX_VOLUME) {
			this.volume = P349_RemoteControl.MAX_VOLUME;
		} else if (volume < P349_RemoteControl.MIN_VOLUME) {
			this.volume = P349_RemoteControl.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println("���� TV ����: " + this.volume);
	}
	
	
}
