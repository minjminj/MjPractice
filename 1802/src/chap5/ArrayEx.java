/*
 * 표에 입력되어 있는 내용을 참조하여 1차원 배열 6개를 만들어 아래의 조건에 따라 프로그램을 완성하시오.
 * 각 배열은 필드로 선언. 초기값은 생성자에 선언. compute()에서 총점과 평균 계산. prn()에서 결과 출력(출력 형식은 임의 설정)
 */
package chap5;

public class ArrayEx {
	
	String[] no; // 학번
	String[] name;	// 성명
	int[] kor;	// 국어
	int[] eng; // 영어
	int[] tot;	// 총점
	double[] avg;	// 평균
	
	public ArrayEx() {
		no = new String[]{"n1", "n2", "n3", "n4", "n5"};	
		name = new String[] {"kim", "lee", "hong", "park", "choi"};	
		kor = new int[]{99, 88, 77, 66, 55};	
		eng = new int[]{77, 88, 99, 77, 66};
		tot = new int[no.length];	// 변수의 초기값 선언해야하지만 아직 값의 내용들을 모르기 때문에 크기를 설정해줌으로써 초기화 + 배열의 크기= 학번배열의 열 갯수
		avg = new double[no.length];	// 
	}
		// 만약 생성자 영역에서 compute()를 선언했을때 -> 실행명령: ArrayEx().prn();
		// 만약 생성자 영역에서 compute() 와 prn()을 선언했을때 -> 실행명령: ArrayEx();
	
	public void compute() {
		
		for (int i=0 ; i<kor.length ; i++) {
			tot[i] = (kor[i]+eng[i]) ;
			avg[i] = (tot[i] / 2.0) ;
		}
	}
	
	public void prn() {
		System.out.println("========성적처리======");
		System.out.println("학번 성명 국어 영어 총점 평균");
		System.out.println("--------------------");
		for (int i=0 ; i<kor.length ; i++) {
			System.out.println(no[i] + " " + name[i] + " " + kor[i] + " " + eng[i] + " " + tot[i] + " " + avg[i]);
		}
	}
}





