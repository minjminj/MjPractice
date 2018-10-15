package min_min;

public class BigRegular {
	 public int solution(int[][] board) {
		 int answer = 0;
		 int[][] test = new int[1001][1001];
		 
		 for (int i=0 ; i<board.length ; i++) {
			 for (int k=0 ; k<board[0].length ; k++) {
				 if (i*k != 0) {
					 if ((board[i][k] * board[i-1][k] * board[i][k-1] * board[i-1][k-1]) == 1) {
					 }
				 }
			 }
		 }
		 return answer;
	    }


	 
	 public static void main(String[] args) {
		BigRegular br = new BigRegular();
		int[][] board = {{0,1,1,1},{1,1,1,1},{1,1,1,1},{0,0,1,0}}; 
		int a = br.solution(board);
		System.out.println("a= " + a);
		
		int[][] board1 = {{0,0,1,1},{1,1,1,1}}; 
		int a1 = br.solution(board1);
		System.out.println("a1= " + a1);
	}
}
