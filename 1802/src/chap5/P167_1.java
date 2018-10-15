package chap5;

import java.util.Arrays;

public class P167_1 {
	
	public static void main(String[] args) {
		
		int[] aaa = {1,2,3,4,5};
		int[] bbb = new int[7];
		
		System.arraycopy(aaa, 2, bbb, 0, aaa.length-2);
		
		System.out.println(Arrays.toString(bbb));
		
		bbb = new int[9];
		
		System.arraycopy(aaa, 3, bbb, 3, aaa.length-3);
		System.out.println(Arrays.toString(bbb));
		
		
	}

}
