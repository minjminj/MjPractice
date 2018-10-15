/*
 *나이와 성별이 각각 정수형 변수와 논리형 변수에 저장되어 있다.
 * 나이가 20대 이거나 성별이 남자(true)이면 "포인트 지급", 그렇지 않으면 "사은품 지급"을 출력하시오.
// 필드와 메소드로 구분. 필드: 모든변수. 메소드: compute(int age, boolean men) 메소드로 전달받은 값을 필드에 저장한 후
 *  "포인트 지급" 또는 "사은품 지급"을 출력. 
 */
package chap4;

public class AA{
	
	int age;
	boolean men;
	
	public void compute(int age, boolean men) {
		this.age = age;
		this.men = men;
		
		if ( (age >=20 && age <=29) || men ) {
			System.out.println("포인트 지급");
		} else {
			System.out.println("사은품 지급");
		}
	}
	
	
}