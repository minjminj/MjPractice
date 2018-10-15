/*
 * ������ �� �ִ� Ŭ���� ����
 * 2018.05.03(�����)
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
	public String toString() {		// ����Ҷ� sysout�� �̿��� �ֿܼ� ����ϴ� �� �� �ƴ϶� ���â�� �ٺ�ȭ ��Ű�µ� �ſ� ȿ������.
		
		String str = "";
		str += "id: " + id + "\n";
		str += "name: " + name + "\n";
		str += "password: " + password + "\n";
		str += "age: " + age + "\n";
		str += "adult: " + adult + "\n";
		
		return str;
		
		
//	return id + ", " + name + ", " + password + ", " + age + ", " +adult;      �̰� ���� �Ѱ�. Ʋ������ ������ ����ġ�� ���� 
	}

}
