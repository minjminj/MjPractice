/*
 * 자식 클래스 사용
 * 2018.05.01(김민정)
 */
package chap7;

public class P291_DmbCellPhoneExample {

	public static void main(String[] args) {
		
		// 객체 생성
		P290_DmbCellPhone dmbCellPhone = new P290_DmbCellPhone("아이폰", "화이트", 7);
 
		// CellPhone으로부터 상속받은 필드
		System.out.println("모델:" + dmbCellPhone.model);
		System.out.println("색상:" + dmbCellPhone.color);
		
		// DmbCellPhone으로부터 상속받은 필드
		System.out.println("채널" + dmbCellPhone.channel);
		
		// CellPhone으로부터 상속받은 메소드 호출
		dmbCellPhone.powerOn();
		dmbCellPhone.bell();
		dmbCellPhone.sendVoice("여보세요");
		dmbCellPhone.receiveVoice("안녕하세요! 저는 홍길동인데요");
		dmbCellPhone.sendVoice("아~ 예 반갑습니다.");
		dmbCellPhone.hangUp();
		
		// DmbCellPhone으로부터 상속받은 메소드 호출
		dmbCellPhone.turnOnDmb();
		dmbCellPhone.changeChannel(12);
		dmbCellPhone.turnOffDmb();
		}
}
