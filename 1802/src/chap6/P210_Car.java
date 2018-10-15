/*
 * 생성자의 오버로딩
 * 2018.04.30(김민정)
 */
package chap6;

public class P210_Car {

	// 필드
	String company = "민정자동차";
	String model;
	String color;
	int maxSpeed;
	
	// 생성자
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

