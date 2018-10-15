/*
 * �������� �����ڸ� ����ϴ� TreeSet
 * 2018.05.09(�����)
 */
package cahp15;

import java.util.Iterator;
import java.util.TreeSet;

public class P766_ComparatorExample {

	public static void main(String[] args) {
		
		/*
		 TreeSet<P766_Fruit> treeSet = new TreeSet<P766_Fruit>();
		  // Fruit�� Comparable�� �������� �ʾұ� ������ ���� �߻�
		 treeSet.add(new P766_Fruit("����", 1000));
		 treeSet.add(new P766_Fruit("����", 9000));
		 treeSet.add(new P766_Fruit("���", 7600));
		 */
		
		TreeSet<P766_Fruit> treeSet = new TreeSet<P766_Fruit>(new P765_DescendingComparator());
		treeSet.add(new P766_Fruit("����", 1000));
		treeSet.add(new P766_Fruit("����", 9000));
		treeSet.add(new P766_Fruit("���", 7600));
		
		Iterator<P766_Fruit> iterator = treeSet.iterator();
		while (iterator.hasNext()) {
			P766_Fruit fruit = iterator.next();
			System.out.println(fruit.name + " " + fruit.price);
		}
	}
}
