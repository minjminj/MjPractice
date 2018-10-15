/*
 * Fruit의 내림차순 정렬자
 */
package cahp15;

import java.util.Comparator;

public class P765_DescendingComparator implements Comparator<P766_Fruit>{
	
	@Override
	public int compare(P766_Fruit o1, P766_Fruit o2) {
		if (o1.price < o2.price) return 1;
		else if (o1.price == o2.price) return 0;
		else return -1;
	}

}
