package min_min;
// 각 자릿수의 합 구하기

public class MathFunc {
	  public int solution(int n) {
	        int answer = 0;
	        String str_a = ""; // 추가 변수 초기화
	        
	        int length = (int)(Math.log10(n)+1); // n의 자릿수 구하기
	        String str_n = Integer.toString(n);	// n을 String으로 
	        
	        for (int i=0; i<=length ; i++){    // n의 자릿수 만큼 for
	             
	        	str_a = str_n.substring(i,i+1);  // str_n을 숫자 하나씩 자르기
	        	answer += Integer.parseInt(str_a); // 하나씩 자른 문자를 int형으로 바꿔 answer에 합.
	            if (i+1 == length) break;		
	        }
	        
	        System.out.println("Hello Java");

	        return answer;
	    }
}
