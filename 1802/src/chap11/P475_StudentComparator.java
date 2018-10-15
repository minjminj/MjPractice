/*
 * P475 Âü°í¿ë
 */
package chap11;

import java.util.Comparator;

public class P475_StudentComparator extends P475_Student {
	
	static class StudentComparator implements Comparator<Student>{
		@Override
		public int compare(Student o1, Student o2) {
			
			return Integer.compare(o1.sno, o2.sno);
		}

	}
}
