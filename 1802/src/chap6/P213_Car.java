/*
 * �ٸ� �����ڸ� ȣ���ؼ� �ߺ� �ڵ� ���̱�
 * 2018.04.30(�����)
 */
package chap6;

public class P213_Car {

	// �ʵ�
	String company = "�����ڵ���";
	String model;
	String color;
	int maxSpeed;
	
	// ������
	P213_Car(){
		
	}
	
	P213_Car(String model){
		this(model, "����", 360);
	}
	
	P213_Car(String model, String color){
		this(model, color, 360);
	}
	
	P213_Car(String model, String color, int maxSpeed){
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
}
