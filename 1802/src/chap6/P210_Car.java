/*
 * �������� �����ε�
 * 2018.04.30(�����)
 */
package chap6;

public class P210_Car {

	// �ʵ�
	String company = "�����ڵ���";
	String model;
	String color;
	int maxSpeed;
	
	// ������
	P210_Car() {
		
	}
	
	P210_Car(String model){
		
		this.model = model;
	}
	
	P210_Car(String model, String color){
		
		this.model = model;
		this.color = color;
	}
	
	P210_Car(String model, String color, int maxSpeed){
	
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
}

