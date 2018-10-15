/*
 * Comparable 구현을 위한 클래스
 * 2018.05.09(김민정)
 */
package cahp15;

public class P764_Person implements Comparable<P764_Person> {

	public String name;
	public int age;
	
	public P764_Person(String name, int age) {
		
		this.name = name;
		this.age = age;
	}
	
	@Override
	public int compareTo(P764_Person o) {
		if (age<o.age) return -1;
		else if (age == o.age) return 0;
		else return 1;
	}
}
