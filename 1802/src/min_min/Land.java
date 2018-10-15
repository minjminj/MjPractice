package min_min;

public class Land {
	int solution(int[][] land) {
		int answer = 0;	
		int l = land.length;
		int max = 0;
		int[]dp = new int[l];
		
		for (int i=0; i<l ; i ++) {
			max = 0;
			for (int k=0 ; k<4 ; k++) {
				if (land[i][k] > max) {
					max = land[i][k];
					dp[i] = k;
				}
			}
			if (i == l-1) {
				answer += max;
			} else {
				answer += max;
				land[i+1][dp[i]] = 0;
			}
			System.out.println(i + ": max :" + max + " an: "+ answer);
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		int[][] land = {{1,2,3,5},{5,6,7,8},{4,3,2,1}};
		Land la = new Land();
		int a = la.solution(land);
		System.out.println(a);
	}
	
	
	int solution(vector<vector<int> > land)
	{
		int answer = 0;
	    int result[4];
	    int i, j;
	    
	    for (i = 1; i < land.size(); i++)
	    {
	        land[i][0] = land[i][0] + max(land[i-1][1],max(land[i-1][2],land[i-1][3]));
	        land[i][1] = land[i][1] + max(land[i-1][0],max(land[i-1][2],land[i-1][3]));
	        land[i][2] = land[i][2] + max(land[i-1][1],max(land[i-1][0],land[i-1][3]));
	        land[i][3] = land[i][3] + max(land[i-1][1],max(land[i-1][2],land[i-1][0]));
	    }
	    
	    answer = max(land[i - 1][0],
	                max(land[i - 1][1],
	                   max(land[i - 1][2],
	                       land[i - 1][3])));

		return answer;
	}
	


}
