/*
 * �̱��� ��ü
 * 2018.04.30(�����)
 */
package chap6;

public class P244_SingletonExample {

	public static void main(String[] args) {
		
//		P244_Singleton obj1 = new P244_Singleton();
//		P244_Singleton obj2 = new P244_Singleton();
		
		P244_Singleton obj1 = P244_Singleton.getInstance();
		P244_Singleton obj2 = P244_Singleton.getInstance();
		
		if (obj1 == obj2) {
			System.out.println("���� Singleton ��ü �Դϴ�.");
		} else {
			System.out.println("�ٸ� Singleton ��ü �Դϴ�.");
		}
		
	}
}
