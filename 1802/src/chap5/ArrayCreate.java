/*
 * P154
 * main[]안에 존재하는 코드를 생성자에 작성
 * public static int add(int[] scores){...}를 public int add(int[] scores){...}로 바꾸기
 * add()에 의해서 계산된 합계를전달받아 평균을 리턴하는 avg(...) 함수를 추가
 * ArrayTest.java로 실행해보기
 * 작성일자: 2018.04.23
 */
package chap5;

public class ArrayCreate {
	
	public ArrayCreate() {
		
		int [] scores;
		scores = new int[] {83, 90, 87};
		
		int sum1 = 0;
		for (int i=0 ; i<3 ; i++) {
			sum1 += scores[i];
		}
		System.out.println("총합: " + sum1);
		
		int sum2 = add( new int[] {83, 90, 87});
		System.out.println("총합: " + sum2);
		System.out.println();
		System.out.println("평균: " + avg(sum2));
				
	}
	
	public int add(int[] scores){
		int sum = 0;
		for (int i=0 ; i<3 ; i++) {
			sum += scores[i];
		}
		
		return sum;
	}
	
	public double avg(int k) {
		double avg;
		avg = k / 3.0;
		
		return avg;
	}
	
}
