/*
 * 다른 생성자를 호출해서 중복 코드 줄이기
 * 2018.04.30(김민정)
 */
package chap6;

public class P213_Car {

	// 필드
	String company = "민정자동차";
	String model;
	String color;
	int maxSpeed;
	
	// 생성자
	P213_Car(){
		
	}
	
	P213_Car(String model){
		this(model, "빨강", 360);
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
