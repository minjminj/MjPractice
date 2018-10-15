package min_min;

public class Sticker {
	 public int solution(int sticker[]) {
	        int answer = 0;
	        int l = sticker.length;
	        int[] dp = new int[l];
	        
	        dp[0] = sticker[0];
	        dp[1] = Math.max(sticker[0], sticker[1]);	        
	        for (int i=2 ; i<l ; i++) {
	        	if (dp[1] == sticker[0]) {
	        		dp[i] = dp[i-1];
	        	}
	        	dp[i] = sticker[i] + Math.max(dp[i-1], dp[i-2]);
	        
	        }
	        
	        for (int k=0 ; k<l ; k++) {
	        	answer += dp[k];
	        }

	        return answer;
	    }
}
