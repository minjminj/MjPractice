/*
 * 한 사람의 성적을 정리하는 클래스를 활용해 x명의 성적을 더 쉽게 출력할 수 있다.
 * 2018.04.24(김민정)
 */
package chap5;


public class ArrayEx3 {
	String no;
	String name;
	int kor;
	int eng;
	int tot;
	double avg;
	char grade;
	
	public ArrayEx3(String no, String name, int k, int e) {
		this.no = no;
		this.name = name;
		this.kor = k;
		this.eng = e;
		compute(this.kor, this.eng);
		prn();
	}
	
	public void compute(int k, int e) {
		this.tot = k + e;
		this.avg = (double)this.tot / 2;
	}
	
	public char setGrade(double avg) {
		char c = ' ';
		if(avg >= 90)		c = 'A';
		else if(avg >= 80)	c = 'B';
		else if(avg >= 70)	c = 'C';
		else if(avg >= 60)	c = 'D';
		else				c = 'F';
		
		return c;
	}
	
	public String prn() {				 /*ArrayEx3 본 실습때는 void prn()의 형태로 출력했지만, FrameTest3에서 콘솔창이 아닌 UI창에 출력하기 위해,
		textArea.append() 명령을 사용. append를 이용해 출력하려면 반드시 String 타입이어야 하기때문에 반환형 String!*/
		
		String str = no + " "			// 한줄로 나열해도 상관없지만 의미가 분리되는 형태이면 줄바꿔 써주면 분석하기 좋음.
				+	name + " "			// " "는 한칸 띄어쓰기 하려는 의도도 있지만 ""를 int 혹은 double 타입 사이에 넣어줘서 변수끼리 계산되지 않게 하려는 의도도 있다.
				+	kor + " "
				+	eng + " "
				+	tot + " "
				+	avg + " "
				+	grade;
				
		return str;
	}
}
