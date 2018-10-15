/*
 * ���� Ŭ����2
 * 2018.05.01(�����)
 */
package chap7;

public class P352_Audio implements P349_RemoteControl {
	
	// �ʵ�
	private int volume;
	
	// turnOn() �߻� �޼ҵ��� ��ü �޼ҵ�
	public void turnOn() {
		System.out.println("Audio�� �մϴ�");
	}
	
	// turnOff() �߻� �޼ҵ��� ��ü �޼ҵ�
	public void turnOff() {
		System.out.println("Audio�� ���ϴ�");
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
		System.out.println("���� Audio ����: " + volume);
	}
	

}
