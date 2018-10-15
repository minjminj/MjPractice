/*
 * �̸��� Ű�� ������ ������ �����ϱ�
 * �⺻�� key, value ó��
 */
package cahp15;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class P743_HashMapExample1 {

	public static void main(String[] args) {
		
		// Map �÷��� ����
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		// ��ü ����
		map.put("ȫ�浿", 88);
		map.put("�����", 99);
		map.put("������", 34);	
		map.put("�״���", 70);
		map.put("������", 28);
		System.out.println("�� Entry ��: " + map.size());
		
		// ��ü ã��
		System.out.println("\tȫ�浿: " + map.get("ȫ�浿") );
		System.out.println();
		
		// ��ü�� �ϳ��� ó��
		Set<String> keySet = map.keySet();
		Iterator<String> keyIterator =keySet.iterator();
		while (keyIterator.hasNext()) {
			String key = keyIterator.next();
			Integer value = map.get(key);
			System.out.println("\t" + key + ": " + value);
		}
		System.out.println();
		
		// ��ü ����
		map.remove("ȫ�浿");
		System.out.println("�� Entry ��: " + map.size());
		
		// ��ü�� �ϳ��� ó��
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();
		while (entryIterator.hasNext()) {
			Map.Entry<String, Integer> entry = entryIterator.next();
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println("\t" + key + ": " + value);
		}
		
		// ��ü ��ü ����
		map.clear();
		System.out.println("�� Entry ��: " + map.size());
	}
}








