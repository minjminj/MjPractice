/*
 * �������̽� ������ ���� ��ü ����
 * 2018.05.01(�����)
 */
package chap7;

public class P354_RemoteControlExample {

	public static void main(String[] args) {
		P349_RemoteControl rc;
		
		rc = new P352_Television();
		//rc = new P352_Audio();
		
		rc.setVolume(5);
	}
}
