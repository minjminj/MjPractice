/*
 * 객체 생성 시 생성자 선택
 * 2018.04.30(김민정)
 */
package chap6;

public class P210_CarExampel {

	public static void main(String[] args) {
		
		P210_Car car1 = new P210_Car();
		System.out.println("car1.company: " + car1.company);
		System.out.println();
	
		P210_Car car2 = new P210_Car("디스커버리");
		System.out.println("car2.company: " + car2.company);
		System.out.println("car2.model: " + car2.model);
		System.out.println();
		
		P210_Car car3 = new P210_Car("디스커버리", "화이트");
		System.out.println("car3.company: " + car3.company);
		System.out.println("car3.model: " + car3.model);
		System.out.println("car.color: " + car3.color);
		System.out.println();
		
		P210_Car car4 = new P210_Car("디스커버리", "화이트", 380);
		System.out.println("car4.company: " + car4.company);
		System.out.println("car4.model: " + car4.model);
		System.out.println("car4.color: " + car4.color);
		System.out.println("car4.maxSpeed: " + car4.maxSpeed);
	}
}