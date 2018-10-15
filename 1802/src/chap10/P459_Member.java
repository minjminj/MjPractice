/*
 * ∞¥√º µøµÓ ∫Ò±≥ (equals() ∏ﬁº“µÂ)
 * 2018.05.02(±ËπŒ¡§)
 */
package chap10;

public class P459_Member {

	String id;
	int x;
	
	public P459_Member(String id) {
		this.id = id;
	}
	
	public P459_Member(String id, int x) {
		this.id = id;
		this.x = x;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof P459_Member) {
			P459_Member member = (P459_Member) obj;
			if (id.equals(member.id)) {
				return true;
			}
		}
		return false;
	}
}
