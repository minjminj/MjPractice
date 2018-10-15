package chap3;
//임의의 정수를 3으로 나눈 나머지와 몫을 출력
public class Ex5 {
	public static void main(String[] args) {
		int[] A= {3,5,9,13,15,22};
		int b; //몫
		int c; //나머지
		int i;
		int L=A.length;
		
		for (i=0; i<L; i++) {
			b= A[i] / 3;
			c= A[i] % 3;
			
			System.out.println("입력값: " +A[i]);
			System.out.println("몫: " +b);
			System.out.println("나머지: "+c +'\n');
		}
		
		
		
		
		
	}
}
