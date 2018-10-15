/*
 * 자식 클래스
 * 2018.05.01(김민정)
 */

package chap7;


public class P290_DmbCellPhone extends P290_CellPhone{

	// 필드
	int channel;
	
	// 생성자
	P290_DmbCellPhone(String model, String color, int channel){
		
		this.model = model;
		this.color = color;
		this.channel = channel;
	}
	
	// 메소드
	void turnOnDmb() {
		System.out.println("채널 " + channel + "번 DMB 방송 수신을 시작합니다.");
	}
	void changeChannel(int channel) {
		this.channel = channel;
		System.out.println("채널 " + channel + "번으로 바꿉니다." );
	}
	void turnOffDmb() {
		System.out.println("DMB 방송 수신을 멈춥니다.");
	}
}
