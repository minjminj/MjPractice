/*
 * ArrayEx3을 분석하고 데이터 작업하기
 * 2018.04.25(김민정)
 */

package chap5;

public class Student {

	String no;		// 학번
	String name;	// 성명
	int kor;		// 국어성적
	int eng;		// 영어성적
	int tot;		// 총점
	double avg;		// 평균
	char grade;		// 학점
	
	public Student(String no, String name, int k, int e) {	// 외부에서 전달 받을 데이터를 매개변수로 설정
		
		this.no = no;
		this.name = name;
		this.kor = k;
		this.eng = e;
		this.tot = 0;
		this.avg = 0;
		compute(k, e);
		grade = setGrade(this.avg);	
		
		
	}
	
	public void compute(int k, int e) {		// 총점과 평균 계산
		
		this.kor = k;
		this.eng = e;
		this.tot = k + e;
		this.avg = (double)this.tot / 2;
	}
	
	public char setGrade(double avg) {		// 전달받은 평균을 통해 학점 구하기
		char g = 'F';
		
		if (avg >= 90)		g = 'A';
		else if (avg >= 80) g = 'B';
		else if (avg >= 70)	g = 'C';
		else if (avg >= 60)	g = 'D';
		
		return g;
	}
	
	public String prn() {		// 출력하기
		String stu =no + " | " + name + " | " + kor + " | " + eng + " | " + tot + " | " + avg + " | " + grade + '\n';
		
		return stu;
	}
	
	
	
}
