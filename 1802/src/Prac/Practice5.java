/*
 * 카페에 글 올렸던거 연습해보기.
 * 각 배열은 필드로 선언. 초기값은 생성자에 선언. compute()에서 총점과 평균 계산. prn()에서 결과 출력(출력 형식은 임의 설정)
 * 2018.04.23
 */
package Prac;


public class Practice5 {

	String[] no; // 학번
	String[] name; // 이름
	int[] kor; // 국어
	int[] eng; // 영어
	int[] tot; // 총점
	double[] avg; //평균
				


	public Practice5() {
		no = new String[] {"n1", "n2", "n3", "n4", "n5"};
		name = new String[] {"kim", "lee", "cho", "jin", "han"};
		kor = new int[] {88, 99, 45, 75, 79};
		eng = new int[] {63, 97, 59, 68, 77};
		tot = new int[5];
		avg = new double[5];
	}
	
	public void compute() {
		for (int i=0 ; i<no.length ; i++) {
			tot[i] = (kor[i]+eng[i]);
			avg[i] = (tot[i] / 2.0);
		}
	}
	
	public void prn() {
		System.out.println("======  성적처리  ======");
		System.out.println("학번  성명  국어  영어  총점  평균");
		System.out.println("-----------------------");
		for (int i=0 ; i<no.length ; i++) {
			System.out.println(no[i]+"  "+name[i]+"  "+kor[i]+"  "+eng[i]+"  "+tot[i]+"  "+avg[i]);
			
		}
	}
	
	public static void main(String[] args) {
		Practice5 p5 = new Practice5();
		p5.compute();
		p5.prn();
	}
}
