/*
 * Map<�й�, Student> map = new HashMap<�й�,student> �� �����Ͽ� ������ �����͸� value������, �й��� key�� map �� ����.
 * 1) keySet���� key,value���
 * 2) Map.Entry �������� key, value ���
 * 2018.05.09(�����)
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

		map.put(1, new P744_Student(1, "ȫ�浿"));
		map.put(2, new P744_Student(2, "�����"));
		map.put(3, new P744_Student(3, "��ȣ��"));
		map.put(4, new P744_Student(4, "���缮"));
		map.put(5, new P744_Student(5, "�̽±�"));
		
		
		Set<Integer> keySet = map.keySet();
		for (Integer sno : keySet) {
			P744_Student stu = map.get(sno);
			System.out.println("key: " + sno + "\t value: " + stu);
		}

		// ���� for���� ����ϸ� iterator�� �̿��� �ʿ� ����.
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
