package min_min;

public class ArrayCheck {
	public boolean solution(int[] arr) {
		boolean answer = true;
		
		int n = arr.length;
		int[] test = new int[n];
		for (int i=0 ; i<n ; i++){
			if(arr[i]>n || arr[i]<1){
				answer = false;
			} else {
				
				test[arr[i]-1]++;
			}
		}
		for (int i=0;i<n;i++){
			if(test[i] != 1){
				answer = false;
			}
		}
		System.out.println(answer);
		return answer;
	}
	
	public static void main(String[] args) {
		
		ArrayCheck ac = new ArrayCheck();
		
		int[] arr = {4,1,3,2};
		System.err.println(arr.length);
		boolean b = ac.solution(arr);
		
		System.out.println(b);
	
	}
	
	
}




