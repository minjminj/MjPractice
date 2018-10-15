/*
 * Syetem.arraycopy()를 사용한 배열 복사
 * System.arraycopy(원본배열명, 복사 하는 시작 위치, 대상배열명, 복사되는 시작 위치, 갯수)
 * 2018.04.25
 */
package chap5;

import java.util.Arrays;

public class P167_ArrayCopyForExample {

	public static void main(String[] args) {
		int[] source = {1,2,3,4,5};
		int[] target = new int[10];
		
		// source에 있는 모든 데이터를 target에 전송
		
		System.arraycopy(source, 0 , target, 0, source.length);
		
		System.out.println(Arrays.toString(target));
		
		target = new int[10];
		System.arraycopy(source, 0, target, 2, source.length);
		System.out.println(Arrays.toString(target));
	
		// 기존 for
		for (int i=0 ; i<target.length ; i++) {
			System.out.print(target[i]+" ");
		}
	
		// 향상된 for
		for (int t : target) {
			System.out.print(t + " ");
			}
	}

}
