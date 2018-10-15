/*
 * 배열형을 매개변수와 반환타입으로 작성해보기
 * 모든 배열은 인스턴스형으로 선언
 * 생성자에서 학번, 성명, 국어, 영어 초기값 설정
 * void compute(int[] k, int[] e) 형태로 국어 점수 배열과 영어 점수 배열을 매개변수로 전달받아 총점, 평균 계산
 * char[] setGrade(double[] avg) 형태로 평균을 매개변수로 받아 학점을 구하여, char[] 타입으로 반환받아 grade에 대입 (학점은 일반적인 점수대로 A~F까지)
 * void prn()을 사용하여 성적 출력 (출력 형식은 임의로 지정)
 * 실행명령: new ArrayEx2();
 * 
 * 2018.04.24(김민정)
 */
package chap5;

public class ArrayEx2Ver2 {
	
	String[] no;	// 학번
	String[] name;	// 성명
	int[] kor;		// 국어
	int[] eng;		// 영어
	int[] tot;		// 총점
	double[] avg;	// 평균
	char[] grade;	// 학점

	public ArrayEx2Ver2() {		// 생성자 영역에서 배열의 초기값 대입
	
		no = new String[5];	
		name = new String[5];	
		kor = new int[5];	
		eng = new int[5];	
		tot = new int[5];
		avg = new double[5];
		
		for (int i=0 ; i<no.length ; i++) {
			int r = (int)(Math.random()*100+1);
			int k = (int)(Math.random()*100+1);
			int e = (int)(Math.random()*100+1);
			
			no[i] = "n" + r;
			name[i] = "name" +r;
			kor[i] =k;
			eng[i] =e;
		}
		/* compute가 클래스 밖에 있는 메소드라면..
		 * ArrayEx2.ex2 = new ArrayEx2();
		 * ae2.compute(ae2.kor, ae2.eng);
		 * 단, kor, eng가 전역형 변수이기 때문에 가능. 지역형 변수면 불가능.
		 */
	
		compute(kor, eng);		// 총점 및 평균 계산
		grade = setGrade(avg);
		prn();					// 출력
		
		
	}
	
	public void compute(int[] k, int[] e) {		// 매개변수로 전달받은 국어성적과 영어성적을 이용하여 총점 및 평균 구하기.
		
		
		for (int i=0 ; i<no.length ; i++) {	
			tot[i] = k[i] + e[i];
			avg[i] = tot[i] / 2.0;
		}
	}
	
	public char[] setGrade(double[] avg) {		// 매개변수로 전달받은 평균을 이용해 char[]타입으로 학점 구하고, grade에 대입하기.
		
		grade = new char[no.length];
		
		for (int i=0 ; i<no.length ; i++) {		// 평균 점수대에 따른 학점 배정
			
			
			if (avg[i] > 90) {
				grade[i] = 'A';		
			} else if (avg[i] > 80) {
				grade[i] = 'B';
			} else if (avg[i] > 70) {
				grade[i] = 'C';
			} else if (avg[i] > 60) {
				grade[i] = 'D';
			} else {
				grade[i] = 'F';
			}
		}
		
			return grade;
	}
	
	public void prn() {
		
		System.out.println("============= 성적  처리 ===============");
		System.out.println(" 학번 | 성 명 | 국어 | 영어 | 총점 |  평균  | 학점");
		for (int i=0 ; i<no.length ; i++) {
			System.out.println(no[i] + " | " + name[i] + " | " + kor[i] + " | " + eng[i] + " | " + tot[i] + " | " + avg[i] + " | " + grade[i]);
		}
		System.out.println("-------------------------------------");
		
	}
}
