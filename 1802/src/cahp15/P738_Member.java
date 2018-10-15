/*
 * hashCode()øÕ equals() ∏ﬁº“µÂ ¿Á¡§¿«
 * 2018.05.09(±ËπŒ¡§)
 */
package cahp15;

public class P738_Member {

	public String name;
	public int age;
	
	public P738_Member(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof P738_Member) {
			P738_Member member = (P738_Member) obj;
			
			return member.name.equals(name) && (member.age == age);
		} else {
			return false;
		}

	}
	
	@Override
	public int hashCode() {
		return name.hashCode() + age;
	}
	
	@Override
	public String toString() {
		return name + " " + age;
	}
}
