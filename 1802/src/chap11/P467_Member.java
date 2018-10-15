/*
 * 복제할 수 있는 클래스 선언
 * 2018.05.03(김민정)
 */
package chap11;

public class P467_Member implements Cloneable{
	
	public String id;
	public String name;
	public String password;
	public int age;
	public boolean adult;
	
	public P467_Member(String id, String name, String password, int age, boolean adult) {
		this.id = id;
		this.name = name;
		this.password = password;
		this.age = age;
		this.adult = adult;
	}
	
	public P467_Member getMember() {
		
		P467_Member cloned = null;
		
		try {
			cloned = (P467_Member) clone();
		} catch (CloneNotSupportedException e) {}
		
		return cloned;
	}
	
	@Override
	public String toString() {		// 출력할때 sysout을 이용해 콘솔에 출력하는 것 뿐 아니라 출력창을 다변화 시키는데 매우 효율적임.
		
		String str = "";
		str += "id: " + id + "\n";
		str += "name: " + name + "\n";
		str += "password: " + password + "\n";
		str += "age: " + age + "\n";
		str += "adult: " + adult + "\n";
		
		return str;
		
		
//	return id + ", " + name + ", " + password + ", " + age + ", " +adult;      이건 내가 한거. 틀리지는 않지만 지나치게 간소 
	}

}
