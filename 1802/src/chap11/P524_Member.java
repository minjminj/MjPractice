/*
 * comparable ���� Ŭ����
 */
package chap11;

public class P524_Member implements Comparable<P524_Member>{
	
	String name;
	P524_Member(String name){
		this.name = name;
	}
	
	@Override
	public int compareTo(P524_Member o){
		
		return name.compareTo(o.name);
	}

	
}
