/*
 * �й��� �̸��� ������ ��� ���� Ű�� �ν�	
 */
package cahp15;

import java.util.HashMap;
import java.util.Map;

public class P745_HashMapExample2 {
	
	public static void main(String[] args) {
		
		Map<P744_Student, Integer> map = new HashMap<P744_Student, Integer>();
	
		map.put(new P744_Student(1, "ȫ�浿"), 88);
		map.put(new P744_Student(1, "ȫ�浿"), 88);
		
		System.out.println("�� Entry tn: " + map.size());
	}

}
