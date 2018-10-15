/*
 * clone()을 재정의해서 깊은 복제로 변경
 * 2018.05.03(김민정)
 */
package chap11;

import java.util.Arrays;

public class P469_Member2 implements Cloneable {

	String name;
	int age;
	int[] scores;
	P470_Car car;

	public P469_Member2(String name, int age, int[] scores, P470_Car car) {
		
		this.name = name;
		this.age = age;
		this.scores = scores;
		this.car = car;
	}
	
	@Override		// 깊은 복제를 하기 위해 실행
	protected Object clone() throws CloneNotSupportedException{
		
		// 먼저 얕은 복사를 해서 name 과 age를 복사
		P469_Member2 cloned = (P469_Member2) super.clone();
		
		// scores 를 깊은 복제
		cloned.scores = Arrays.copyOf(this.scores, this.scores.length);
		
		// car 를 깊은 복제
		cloned.car = new P470_Car(this.car.model);
		
		// 깊은 복제된 P469_Member2 객체를 리턴
		return cloned;
	}
	
	public P469_Member2 getMember() {
		
		P469_Member2 cloned = null;
		
		try {
			cloned = (P469_Member2) clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		return cloned;
	}
                                        
	public String toString() {
//		int s = 0;
		String c = "";
//		for (int i=0 ; i<scores.length ; i++) {
//			s = this.scores[i];
//			c += (i==(scores.length-1))? (s + "") : (s + ",");
//		}
		c = Arrays.toString(this.scores) + ""; //로 하면 더 간단하게 배열의 값들을 나열해서 출력 가능.
		return name + ", " 
			+ age + ", " 
			+ /* " { " + */ c /* + " } " */ + ", " 
			+ car.model;
	}
}

