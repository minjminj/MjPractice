package chap2;

public class Ex2 {
	double avg=15.5;
	
	// 	변수 선언과 값 대입을 따로 입력할 수 없다. 변수 선언 이후 값을 대입하는 연산은 대입 행위로 간주. but 행위는 메소드나 함수 내에서만 가능.
	
	public static void main(String[] args) {
		double avg;
		avg = 15.5; //메소드 안에서 행위가 발생하는 것이기 때문에 가능
		
		Ex2 e = new Ex2(); // 객체 생성 (인스턴스 변수 생성)
		
		
		System.out.println(e.avg);
		System.out.println(avg);
		
		
	}

}
