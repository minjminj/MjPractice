/*
 * this 호출로 인한 중복코드 생략
 * 2018.04.30(김민정)
 */
package chap6;

public class P213_CarExample {

	public static void main(String[] args) {
		
		P213_Car car1 = new P213_Car();
		System.out.println("car1.company: " + car1.company);
		System.out.println();
		
		P213_Car car2 = new P213_Car("디스커버리");
		System.out.println("car2.company: " + car2.company);
		System.out.println("car2.model: " + car2.model);
		System.out.println();
		
		P213_Car car3 = new P213_Car("디스커버리", "빨강");
		System.out.println("car3.company: " + car3.company);
		System.out.println("car3.model: " + car3.model);
		System.out.println("car3.color" + car3.color);
		System.out.println();
		
		P213_Car car4 = new P213_Car("디스커버리", "빨강", 360);
		System.out.println("car4.company: " + car4.company);
		System.out.println("car4.model: " + car4.model);
		System.out.println("car4.color: " + car4.color);
		System.out.println("car4.maxSpeend: " + car4.maxSpeed);
	}
}
