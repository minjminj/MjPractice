/*
 * ���� Ŭ����
 * 2018.05.01(�����)
 */
package chap7;

public class P336_AnimalExample {

	public static void main(String[] args) {
		
		P335_Dog dog = new P335_Dog();
		P336_Cat cat = new P336_Cat();
		
		dog.sound();
		cat.sound();
		
		System.out.println("-----");
		
		// ������ �ڵ� Ÿ�� ��ȯ
		P335_Animal animal = null;
		
		animal = new P335_Dog();
		animal.sound();
		
		animal = new P336_Cat();
		animal.sound();
		
		System.out.println("-----");
		
		// �޼ҵ��� ������
		animalSound(new P335_Dog());
		animalSound(new P336_Cat());
	}
	
	public static void animalSound(P335_Animal animal) {
		animal.sound();
	}
}
