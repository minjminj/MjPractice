package chap2;

public class Ex1 {
	//전역형
	int kor, eng, mat;

	public static void main(String[] args) {
		int kor;
		int eng;
		int mat;
		
		Ex1 e = new Ex1();
		// ex1 클래스명, e 객체명(object: 인스턴스화), new 객체생성연산자,
		//ex1() 생성자(클래스 명과 똑같은 메소드-객체가 생성될때 그 기능을 하는 메소드-모든 클래스는 생성자를 통해 객체가 만들어짐)
		//static의 특성상 ex1이 메모리에 저장되기 전에 main 함수부터 메모리에 저장. 
		//그래서 전역형 변수를 class ex1의 객체생성을 통해 불러내지 않으면 저장 되지 않음.
		//클래스를 인터턴스 할때는 main 함수의 위와 아래에 명시되어 있는 모든 클래스 내용이 함께 메모리에 저장되는 것.
		
		
		
		//전역형 변수에 값을 대입
		e.kor = 90;
		e.eng = 80;
		e.mat = 99;
		
		//지역형 변수에 값을 대입
		kor = 55;
		eng = 66;
		mat = 77;
		
		
		System.out.println(e.kor); // e에 속한 kor, eng, mat 변수들의 값 츨력
		System.out.println(e.eng);
		System.out.println(e.mat);
		
		System.out.println(kor); // 자기 자신이 가지고 있는 각 변수들의 값 출력
		System.out.println(eng);
		System.out.println(mat);
		
		
	}

}