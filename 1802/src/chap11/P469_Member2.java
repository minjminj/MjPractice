/*
 * clone()�� �������ؼ� ���� ������ ����
 * 2018.05.03(�����)
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
	
	@Override		// ���� ������ �ϱ� ���� ����
	protected Object clone() throws CloneNotSupportedException{
		
		// ���� ���� ���縦 �ؼ� name �� age�� ����
		P469_Member2 cloned = (P469_Member2) super.clone();
		
		// scores �� ���� ����
		cloned.scores = Arrays.copyOf(this.scores, this.scores.length);
		
		// car �� ���� ����
		cloned.car = new P470_Car(this.car.model);
		
		// ���� ������ P469_Member2 ��ü�� ����
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
		c = Arrays.toString(this.scores) + ""; //�� �ϸ� �� �����ϰ� �迭�� ������ �����ؼ� ��� ����.
		return name + ", " 
			+ age + ", " 
			+ /* " { " + */ c /* + " } " */ + ", " 
			+ car.model;
	}
}

