/*
 * hashcode() 메소드를 재정의하지 않음
 * 2018.05.02(김민정)
 */
package chap10;

public class P461_Key {

	int number;
	
	public P461_Key(int number) {
		this.number = number;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof P461_Key) {
			P461_Key comparekey = (P461_Key) obj;
			if (this.number == comparekey.number) {
				return true;
			}
		}
		return false;
	}
}
