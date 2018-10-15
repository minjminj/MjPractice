/*
 * String ��ü�� �ߺ����� �����ϴ� HashSet
 * 2018.05.09(�����)
 */
package cahp15;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class P737_HashExample1 {

	public static void main(String[] args) {
		
		// String Ÿ���� Set ��ü ����
		Set<String> set = new HashSet<String>();
				
		// Set�� ���ڿ� ����
		set.add("AAA");
		set.add("BBB");
		set.add("CCC");
		set.add("DDD");
		set.add("EEE");
		
		int size = set.size();
		System.out.println("�� ��ü��: " + size);
		
		// �ݺ��� ����
		Iterator<String> iterator = set.iterator();
		while (iterator.hasNext()) {
			String element = iterator.next();
			System.out.println("\t" + element);
		}
				
		// Set�� ����� ��ü ����
		set.remove("BBB");
		set.remove("DDD");
		
		System.out.println("�� ��ü��: " + set.size());
		
		//�ݺ��� ����
		iterator = set.iterator();
		while (iterator.hasNext()) {
			String element = iterator.next();
			System.out.println("\t" + element);
		}
			
		//��� ��ü ����
		set.clear();
		if (set.isEmpty()) {
			System.out.println("��� ����");
		}
	}
}
