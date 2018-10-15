package min_min;

public class TheLastPoint {
	public int[] solution(int[][] v) {
        int[] answer = {0,0};
        
        // x비교
        if (v[0][0] == v[1][0]) {
        	answer[0] = v[2][0];
        } else if( v[0][0] == v[2][0]) {
        	answer[0] = v[1][0];
        } else {
        	answer[0] = v[0][0]; 
        }
        
        // y비교
        if (v[0][1] == v[1][1]) {
        	answer[1] = v[2][1];
        } else if( v[0][1] == v[2][1]) {
        	answer[1] = v[1][1];
        } else {
        	answer[1] = v[0][1]; 
        }
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("v[0][0]: " + v[0][0]);

        return answer;
    }
	
public static void main(String[] args) {
		
	TheLastPoint tlp = new TheLastPoint();
		
		int[][] arr = {{1, 4}, {3, 4}, {3, 10}};
		System.out.println("뿅: " + arr.length);
		int[] b = tlp.solution(arr);
		
		System.out.println(b[0] + " , " + b[1]);
	
	}
}
