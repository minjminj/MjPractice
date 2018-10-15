/*
 * String 객체를 저장하는 ArrayList
 * 	동기화 기능 없음. 멀티 스레드에서 불안전
 * 2018.05.08(김민정)
 */
package cahp15;

import java.util.ArrayList;
import java.util.List;

public class P728_ArrayListExample {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		
		list.add("Java");
		list.add("JDBC");
		list.add("Servlet/JSP");
		list.add(2, "Database");
		list.add("iBATIS");
		
		int size = list.size();
		System.out.println("총 객체수: " + size);
		System.out.println();
		
		String skill = list.get(2);		// 2번 인덱스의 객체 얻기
		System.out.println("2: " + skill);
		System.out.println();
		
		for (int i=0 ; i<list.size() ; i++) {
			String str = list.get(i);
			System.out.println(i + ": " + str);
		}
		System.out.println();
		
		list.remove(2);
		list.remove(2);
		list.remove("iBATIS");
		
		for (int i=0 ; i<list.size() ; i++) {
			String str = list.get(i);
			System.out.println(i + ": " + str);
		}
	}
}
