/*
 * Member °´Ã¼¸¦ Áßº¹¾øÀÌ ÀúÀåÇÏ´Â HashSet
 * 2018.05.09(±è¹ÎÁ¤)
 */
package cahp15;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class P739_HashSetExample2 {
	
	public static void main(String[] args) {
		
		Set<P738_Member> set = new HashSet<P738_Member>();
		
		set.add(new P738_Member("È«±æµ¿", 46));
		set.add(new P738_Member("±è¹ÎÁ¤", 28));
		set.add(new P738_Member("±è¹ÎÁ¤", 46));
		set.add(new P738_Member("È«±æµ¿", 46));
		
		int size = set.size();
		
		System.out.println("ÃÑ °´Ã¼ÀÇ ¼ö: " + size);
		
		Iterator<P738_Member> iterator = set.iterator();
		while (iterator.hasNext()) {
			P738_Member e = iterator.next(); 
			System.out.println(set);
			
		}
		
	}

}
