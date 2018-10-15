/*
 * 사용자 정의 객체를 나이 순으로 정렬하기
 * Comparable을 이용한 객체를 참조하기 때문에 나이순으로 정렬.
 * 2018.05.09(김민정)
 */
package cahp15;

import java.util.TreeSet;

public class P764_ComparableExample {

	public static void main(String[] args) {
		 
		TreeSet<P764_Person> treeSet = new TreeSet<P764_Person>();
		
		treeSet.add(new P764_Person("홍길동", 56));
		treeSet.add(new P764_Person("김민정", 28));
		treeSet.add(new P764_Person("김민영", 30));
		
		for (P764_Person e : treeSet) {
			System.out.println("name: " + e.name + "\t age:" + e.age);
		}
	}
}
