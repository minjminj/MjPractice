/*
 * switch를 사용하여 주사위 번호를 뽑는 예제
 * 변수 num을 필드로 지정. chk()를 사용하여 난수와 결과 출력
 */
package chap4;

public class P117_SwitchExample {

	int num;
	
	public void chk(){
		
		num = (int) (Math.random()*6) + 1;
		
		switch (num) {
		
		case 1:
			System.out.println("1번이 나왔습니다");
			break;
		case 2:
			System.out.println("2번이 나왔습니다");
			break;
		case 3:
			System.out.println("3번이 나왔습니다");
			break;
		case 4:
			System.out.println("4번이 나왔습니다");
			break;
		case 5:
			System.out.println("5번이 나왔습니다");
			break;
		case 6:
			System.out.println("6번이 나왔습니다");
		
			
		}
	}
}
