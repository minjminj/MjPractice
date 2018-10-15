/*
 * 인터페이스 변수에 구현 객체 대입
 * 2018.05.01(김민정)
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
