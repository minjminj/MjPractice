/*
 * Map<학번, Student> map = new HashMap<학번,student> 로 생성하여 임의의 데이터를 value값으로, 학번을 key로 map 에 저장.
 * 1) keySet으로 key,value출력
 * 2) Map.Entry 유형으로 key, value 출력
 * 2018.05.09(김민정)
 */
package chap11;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import cahp15.P744_Student;

public class HashMapExample3 {
	
	public static void main(String[] args) {
		Map<Integer, P744_Student> map = new HashMap<Integer, P744_Student>();

		map.put(1, new P744_Student(1, "홍길동"));
		map.put(2, new P744_Student(2, "김민정"));
		map.put(3, new P744_Student(3, "강호동"));
		map.put(4, new P744_Student(4, "유재석"));
		map.put(5, new P744_Student(5, "이승기"));
		
		
		Set<Integer> keySet = map.keySet();
		for (Integer sno : keySet) {
			P744_Student stu = map.get(sno);
			System.out.println("key: " + sno + "\t value: " + stu);
		}

		// 향상된 for문을 사용하면 iterator를 이용할 필요 없다.
//		Iterator<Integer> keyIterator = keySet.iterator();
//		while (keyIterator.hasNext()) {
//			Integer sno = keyIterator.next();
//			P744_Student stu = map.get(sno);
//			System.out.println("key: " + sno + "\t value: " + stu);			
//		}
		System.out.println();
		
		Set<Map.Entry<Integer, P744_Student>> entrySet = map.entrySet();
		Iterator<Map.Entry<Integer, P744_Student>> entryIterator = entrySet.iterator();
		while (entryIterator.hasNext()) {
			Map.Entry<Integer, P744_Student> entry = entryIterator.next();
			Integer sno = entry.getKey();
			P744_Student stu = entry.getValue();
			System.out.println("key: "+ sno + "\t value:" + stu);
			
		}
		
		
	}
	
	

}
