/*
 * 내림차순 정렬자를 사용하는 TreeSet
 * 2018.05.09(김민정)
 */
package cahp15;

import java.util.Iterator;
import java.util.TreeSet;

public class P766_ComparatorExample {

	public static void main(String[] args) {
		
		/*
		 TreeSet<P766_Fruit> treeSet = new TreeSet<P766_Fruit>();
		  // Fruit이 Comparable을 구현하지 않았기 때문에 예외 발생
		 treeSet.add(new P766_Fruit("포도", 1000));
		 treeSet.add(new P766_Fruit("딸기", 9000));
		 treeSet.add(new P766_Fruit("사과", 7600));
		 */
		
		TreeSet<P766_Fruit> treeSet = new TreeSet<P766_Fruit>(new P765_DescendingComparator());
		treeSet.add(new P766_Fruit("포도", 1000));
		treeSet.add(new P766_Fruit("딸기", 9000));
		treeSet.add(new P766_Fruit("사과", 7600));
		
		Iterator<P766_Fruit> iterator = treeSet.iterator();
		while (iterator.hasNext()) {
			P766_Fruit fruit = iterator.next();
			System.out.println(fruit.name + " " + fruit.price);
		}
	}
}
