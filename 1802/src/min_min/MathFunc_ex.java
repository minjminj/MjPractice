package min_min;

public class MathFunc_ex {
	public int solution(int n) {
		
		int sum = 0; // 각 자릿수 합을 저장하는 변수
		while(n>0) {
			sum += n % 10;
			n/= 10;
		}
		return sum;
	}
}
