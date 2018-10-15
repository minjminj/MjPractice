/* ------------------------------
 * 생성자의 유형과 객체 생성
 * 작성일자: 2018.04.18
*/  

package chap4;

public class Ex20 {
	// 매개변수가 없는 생성자
	public Ex20() {
		System.out.println("매개변수가 없는 생성자 입니다.");
	}
	
	// 정수형 매개변수가 한 개 있는 생성자
	// 같은 생성자명에 매개변수의 유형, 갯수, 순서가 같으면 그냥 매개변수명과 관련없이 모두 하나의 생성자.
	public Ex20(int k){
		System.out.println("정수형 매개변수가 한 개 있는 생성자");
		System.out.println("매개변수값:" + k);
	}
	
	// 문자열 한 개와 실수형 한 개의 매개변수가 있는 생성자
	public Ex20(String name, double score) {
		System.out.println("name : " + name);
		System.out.println("score : " + score);
	}
	
}
