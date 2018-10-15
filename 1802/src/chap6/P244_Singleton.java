/*
 * ΩÃ±€≈Ê
 * 2018.04.30(±ËπŒ¡§)
 */
package chap6;

public class P244_Singleton {

	private static P244_Singleton singleton = new P244_Singleton();
	
	private P244_Singleton() {}
	
	static P244_Singleton getInstance() {
		
		return singleton;
	}
		
}
