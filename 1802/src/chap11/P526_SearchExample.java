/*
 * 배열 검색(Arrays.binarySearch() 사용시 정렬 먼저)
 */
package chap11;

import java.util.Arrays;

public class P526_SearchExample {

	public static void main(String[] args) {
		
		// 기본 타입값 검색
		int[] scores = {99, 96, 93};
		Arrays.sort(scores);
		int index = Arrays.binarySearch(scores, 99);
		System.out.println("찾은 인덱스: " + index);
	
		
		// 문자열 검색
		String[] names = {"홍길동", "박동수", "김민수"};
		Arrays.sort(names);
		index = Arrays.binarySearch(names, "홍길동");
		System.out.println("찾은 인덱스: " + index);
		
		// 객체 검색
		P524_Member m1 = new P524_Member("홍길동");
		P524_Member m2 = new P524_Member("박동수");
		P524_Member m3 = new P524_Member("김민수");
		
		P524_Member[] members = {m1, m2, m3};
		Arrays.sort(members);
		index = Arrays.binarySearch(members, m1);
		System.out.println("찾은 인덱스: " + index);
	
	
	}
}
