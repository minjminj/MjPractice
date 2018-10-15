/*
 * 복제 객체를 변경하더라도 원본 객체는 변함없음.
 */
package chap11;

public class P468_MemberExample {

	public static void main(String[] args) {
		// 원본 객체 생성
		P467_Member original = new P467_Member("yellow", "김민정", "98765", 28, true);
	
	
	// 복제 객체를 얻은 후에 패스워드 변경
	P467_Member cloned = original.getMember();
	cloned.password = "13579";
	
	System.out.println("[복제 객체의 필드값]");
	System.out.println(cloned /*cloned.toSting에서 .toString을 생략한 셈*/);							// 복제 객체의 패스워드 값이 원본의 패스워드 값과 다르다.
	
	System.out.println();
	
	System.out.println("[원본 객체의 필드값]");
	System.out.println(original);						// 복제 객체의 패스워드 값의 변화가 원본 객체에 영향을 미치지 않았다.
	
	
	
	}

}
