/*
 * 학번과 이름이 동일한 경우 같은 키로 인식	
 */
package cahp15;

import java.util.HashMap;
import java.util.Map;

public class P745_HashMapExample2 {
	
	public static void main(String[] args) {
		
		Map<P744_Student, Integer> map = new HashMap<P744_Student, Integer>();
	
		map.put(new P744_Student(1, "홍길동"), 88);
		map.put(new P744_Student(1, "홍길동"), 88);
		
		System.out.println("총 Entry tn: " + map.size());
	}

}
