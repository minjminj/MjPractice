/*
 * ArrayList와 LinkedList의 실행 성능 비교
 * 순차적으로 추가/삭제 (A>L), 중간에 추가/삭제 (L>A), 검색(A>L)
 * 2018.05.08(김민정)
 */
package cahp15;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class P732_LinkedListExample {

	public static void main(String[] args) {
		
		List<String> list1 = new ArrayList<String>();
		List<String> list2 = new LinkedList<String>();
		
		long startTime;
		long endTime;
			
		startTime = System.nanoTime();
		for (int i=0 ; i<10000 ; i++) {
				list1.add(0, String.valueOf(i));
		}
		endTime = System.nanoTime();
		System.out.println("ArrayList 걸린시간: " + (endTime-startTime) + "ns");
			
		startTime = System.nanoTime();
		for (int i=0 ; i<10000 ; i++) {
			list2.add(0, String.valueOf(i));
		}
		endTime = System.nanoTime();
		System.out.println("ArrayList 걸린시간: " + (endTime-startTime) + "ns");
	}
}
