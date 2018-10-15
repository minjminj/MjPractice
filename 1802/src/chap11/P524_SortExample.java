/*
 * Arrays.sort() 메소드를 이용한 배열 비교
 */
package chap11;

import java.util.Arrays;

public class P524_SortExample {
	
	public static void main(String[] args) {
		
		int[] scores = {99, 96, 93};
		Arrays.sort(scores);
		for (int i=0 ; i<scores.length ; i++) {
			System.out.println("scores [" + i + "]=" + scores[i]);			
		}
		System.out.println();
		
		String[] names = {"홍길동", "박동수", "김민수"};
		Arrays.sort(names);
		for (int i=0 ; i<names.length ; i++) {
			System.out.println("names [" + i + "]=" + names[i]);
		}
		System.out.println();
		
		P524_Member m1 = new P524_Member("홍길동");
		P524_Member m2 = new P524_Member("박동수");
		P524_Member m3 = new P524_Member("김민수");
		P524_Member[] members = {m1, m2, m3};
		
		Arrays.sort(members);			// sort 라는 메소드가 P524_Member의 compareTo를 호출하기 때문에 각 객체의 name으로 비교
										// 만약 재정의된 compareTo가 없는데도 불구하고 실행이 된다면, 그것은 hashcode값으로 비교를 했을 것.
		for (int i=0 ; i<members.length ; i++) {
			System.out.println("members [" + i + "]=" + members[i].name);
		}
	}
	
	

}
