/*
 * 실행 클래스
 * 2018.05.01(김민정)
 */
package chap7;

public class P336_AnimalExample {

	public static void main(String[] args) {
		
		P335_Dog dog = new P335_Dog();
		P336_Cat cat = new P336_Cat();
		
		dog.sound();
		cat.sound();
		
		System.out.println("-----");
		
		// 변수의 자동 타입 변환
		P335_Animal animal = null;
		
		animal = new P335_Dog();
		animal.sound();
		
		animal = new P336_Cat();
		animal.sound();
		
		System.out.println("-----");
		
		// 메소드의 다형성
		animalSound(new P335_Dog());
		animalSound(new P336_Cat());
	}
	
	public static void animalSound(P335_Animal animal) {
		animal.sound();
	}
}
