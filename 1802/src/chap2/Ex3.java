package chap2;

public class Ex3 {
	char a = 'A';
	
	public static void main(String[] args) {
		char c = 'B';
		System.out.println(c);
		
		Ex3 obj = new Ex3();
		obj.a  = 'F';
		System.out.println("obj.a=" + obj.a);
		
		Ex1 e1 = new Ex1();
		e1.kor=100;
		e1.eng=100;
		e1.mat=99;
		
		System.out.println("e1.kor=" + e1.kor);
	
		Ex4 e4 = new Ex4();
		System.out.println(e4.n);
	}
	
}
