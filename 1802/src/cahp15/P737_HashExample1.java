/*
 * String 객체를 중복없이 저장하는 HashSet
 * 2018.05.09(김민정)
 */
package cahp15;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class P737_HashExample1 {

	public static void main(String[] args) {
		
		// String 타입의 Set 객체 생성
		Set<String> set = new HashSet<String>();
				
		// Set에 문자열 저장
		set.add("AAA");
		set.add("BBB");
		set.add("CCC");
		set.add("DDD");
		set.add("EEE");
		
		int size = set.size();
		System.out.println("총 객체수: " + size);
		
		// 반복자 실행
		Iterator<String> iterator = set.iterator();
		while (iterator.hasNext()) {
			String element = iterator.next();
			System.out.println("\t" + element);
		}
				
		// Set에 저장된 객체 삭제
		set.remove("BBB");
		set.remove("DDD");
		
		System.out.println("총 객체수: " + set.size());
		
		//반복자 실행
		iterator = set.iterator();
		while (iterator.hasNext()) {
			String element = iterator.next();
			System.out.println("\t" + element);
		}
			
		//모든 객체 제거
		set.clear();
		if (set.isEmpty()) {
			System.out.println("비어 있음");
		}
	}
}
