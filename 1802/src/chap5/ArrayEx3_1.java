/*한 사람의 성적을 정리하는 클래스를 활용해 x명의 성적을 더 쉽게 출력할 수 있다.
 * 2018.04.24(김민정)*/
package chap5;

public class ArrayEx3_1 {

	String no; //학번
	String name; //이름
	int k; //국어
	int e; //영어
	int t;
	double a;
	char grade; //학점
	
	public ArrayEx3_1(String no, String name, int k, int e) {	//변수 선언
		
		this.no = no;
		this.name = name;
		this.k = k;
		this.e = e;
		
		compute();
		setGrade(a);
		prn();
	}
	
	public void compute() {
		t = k + e;
		a = (double)t / 2;
	}
	
	public char setGrade(double a) {
		char g = 'F';
		
		if (a > 90) 		g = 'A';
		else if (a > 80) 	g = 'B';
		else if (a > 70)	g = 'C';
		else if (a > 60)	g = 'D';
		
		return g;
	}
	
	public void prn() {	//출력
		System.out.println(no + " "
				+ name + " "
				+ k + " "
				+ e + " "
				+ grade + '\n');
						
	
	}



public static void main(String[] args) {
	new ArrayEx3_1("ii", "ee", 90, 32);
	
}
}
