/*
 * 깊은 복제 후 복제본 변경은 원본에 영향을 미치지 않는다.
 * 2018.05.03(김민정)
 */
package chap11;

public class P471_Member2Example {

	public static void main(String[] args) {
		
		// 원본 객체 생성
		P469_Member2 original = new P469_Member2("김민정", 28, new int[] {93, 97}, new P470_Car("디스커버리"));
		
		
		// 복제 객체를 얻은 후에 참조 객체의 값을 변경
		P469_Member2 cloned = original.getMember();
		cloned.scores[0] = 100;
		cloned.car.model = "스포티지";
		
		System.out.println("[복제 객체의 필드값]");
		System.out.println(cloned);
		
		System.out.println();
		
		System.out.println("[원본 객체의 필드값]");
		System.out.println(original);
	}
}
