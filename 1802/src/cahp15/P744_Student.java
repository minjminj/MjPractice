/*
 * Å°·Î »ç¿ëÇÒ °´Ã¼ - hashCode()¿Í equals()ÀçÁ¤ÀÇ
 * 2018.05.09(±è¹ÎÁ¤)
 */
package cahp15;

public class P744_Student {

	public int sno;
	public String name;
	
	public P744_Student(int sno, String name) {
		this.sno = sno;
		this.name = name;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof P744_Student) {
			P744_Student student = (P744_Student) obj;	
			return (sno==student.sno) &&(name.equals((student.name)) );
		} else {
			return false;
		}
	}
	
	@Override
	public int hashCode() {
		return sno + name.hashCode();
	
	}
	
	@Override
	public String toString() {
		return sno + "," + name;
	}
}
