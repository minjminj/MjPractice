/*
 * Member ��ü�� �ߺ����� �����ϴ� HashSet
 * 2018.05.09(�����)
 */
package cahp15;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class P739_HashSetExample2 {
	
	public static void main(String[] args) {
		
		Set<P738_Member> set = new HashSet<P738_Member>();
		
		set.add(new P738_Member("ȫ�浿", 46));
		set.add(new P738_Member("�����", 28));
		set.add(new P738_Member("�����", 46));
		set.add(new P738_Member("ȫ�浿", 46));
		
		int size = set.size();
		
		System.out.println("�� ��ü�� ��: " + size);
		
		Iterator<P738_Member> iterator = set.iterator();
		while (iterator.hasNext()) {
			P738_Member e = iterator.next(); 
			System.out.println(set);
			
		}
		
	}

}
