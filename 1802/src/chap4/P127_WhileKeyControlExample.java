/*
 * 키보드로 while문 제어(키보드를 사용한 메뉴 컨트롤)
 */
package chap4;

public class P127_WhileKeyControlExample {

	public P127_WhileKeyControlExample() throws Exception {
		
		boolean run = true;
		int speed = 0;
		int keyCode = 0;
		
		while (run) {
			if ( (keyCode !=13) && (keyCode != 10)) {// 24~31행의 내용을 실행하기 위해 숫자와 enter를 함께 입력하면 실행의 enter기능과 함께 엔터값이 가지는 키코드 두개도 함께 인식됨. read()를 이용해 입력값에 대한 실행을 진행하는 코드를 작성할때 필수.
				System.out.println("--------------------");
				System.out.println("1.증속 | 2.감속 | 3.중지");
				System.out.println("--------------------");
				System.out.println("선택: ");
			}
			
			keyCode = System.in.read();	// read()는 실행에 필요한 값을 입력하고 enter 눌러야 실행가능. 그래서 read() 자체가 enter를 만나면 세번의 실행이 발생. 1. 입력 실행의 enter 2. keyCode 13의 값 3. keyCode 10의 값
			
			if (keyCode == 49) {	// 숫자 1의 keyCode가 49, 즉 숫자 1을 입력했을때
				speed++;
				System.out.println("현재 속도= " + speed);
			} else if (keyCode == 50) {	// 숫자 2를 입력했을때
				speed--;
				System.out.println("현재 속도= "+ speed);
			} else if (keyCode == 51) {
				run = false;
			}
		}
		
		System.out.println("프로그램 종료");
	}
}
