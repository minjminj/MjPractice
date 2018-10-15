/*
 * ListEx2를 위한 클래스
 */
package chap18;

import java.io.Serializable;

public class Score implements Serializable{
	
	// 컴파일 시점이나, 장비가 서로 달라도 같은 객체임을 의미하기 위해.
	static final long serialVersionUID = 1L;
	
	String id;
	String name;
	int kor, eng, tot;
	double avg;
	
	public Score(String id, String name, int kor, int eng) {
			// 생성자를 통해 전달받아 필드에 저장 후 계산
		this.id = id;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		
		compute();

	}
	
	public void compute() {
		
		this.tot = this.kor + this.eng;
		this.avg = (double) tot / 2;
	}
	
	@Override
	public int hashCode() {
		return id.hashCode() + name.hashCode();
	}
	
	@Override
	public boolean equals(Object o) {	// equals 재정의 할때는 Object 타입을 따라서 매개값도 꼭 적어줘야함
		boolean flag = false;
		if (o instanceof Score) {
			Score s = (Score) o;
			if (id.equals(s.id) && name.equals(s.name)) {
				flag = true;
			}	
		}
		return flag;
	}
	
	@Override
	public String toString() {
		String //str = id +"\t" + name + "\t" + kor +"\t" + eng + "\t" + tot + "\t" + avg;
		
		str = String.format("%-10s %-10s %5d %5d %5d %6.1f", id, name, kor, eng, tot, avg);
									// s는 String, d 는 digit 숫자는 자릿수, -는 왼쪽정렬
									// %-10s 는 전체 열자리 문자열을 왼쪽정렬하여 출력
//		
		
		return str; 
				
//				
//		
	}

}
