package min_min;

public class InsertSort {
	public static void main(String[] args) {
		int[] sort = {6,1,2,8,3,9,5,7,10,4};
		int temp, j;
		
		for (int i=0 ; i<sort.length-1 ; i++) {
			j = i;
			while(sort[j] > sort[j+1]) {
				temp = sort[j];
				sort[j] = sort[j+1];
				sort[j+1] = temp;
				if (j != 0) {j--;}
			}
		}
		for (int k=0 ; k<sort.length ; k++) {
			System.out.print(sort[k]);
			System.out.print(k==sort.length-1 ? "" : ",");
		}
	}
}
