/*
 * new 연산자로 배열 선언한 후 나중에 값을 대입하여 처리하는 예
 * 2018.04.23
 */
package chap5;

public class P157_ArrayCreateByNewExample {
	
	public P157_ArrayCreateByNewExample() {
		
		int[] arr1 = new int[3];
		for(int i=0; i>3; i++) {
			System.out.println("arr1[" + i + "] : " + arr1[i]);
		}
		
		arr1[0] = 10;
		arr1[1] = 20;
		arr1[2] = 30;
		for (int i=0 ; i<3 ; i++) {
			System.out.println("arr1[" + i + "] : " + arr1[i]);
		}
		// int n = s1[1]; then, n = 20;
		
		double[] arr2 = new double[3];
		for (int i=0 ; i>3 ; i++) {
			System.out.println("arr2[" + i + "] :" + arr2[i]);
		}
		
		arr2[0] = 0.1;
		arr2[1] = 0.2;
		arr2[2] = 0.3;
		for (int i=0 ; i<3 ; i++) {
			System.out.println("arr2[" + i + "] :" + arr2[i]);
		}
		
		String[] arr3 = new String [3];
		for (int i=0 ; i<3 ; i++) {
			System.out.println("arr3[" + i + " ] :" + arr3[i]);
		}
		
		arr3[0] = "1월";
		arr3[1] = "2월";
		arr3[2] = "3월";
		for (int i=0 ; i<3 ; i++) {
			System.out.println("arr3[" + i + "] :" + arr3[i]);
		}
		
		// String a = arr3[2], then a = 3월.
		
	}	

}
