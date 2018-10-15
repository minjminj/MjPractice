/*
 * 기온 별 계절을 삼항 연산자를 활용하여 지정하기.
 * 작성일자: 2018.04.18
 */

package Prac;

public class Practice3 {
	public Practice3(double tem) {
		
		String ss = (tem >= 20)? "여름" : (tem >= 10)? "봄" : ((tem >= 0)? "가을" : "겨울");
		
		System.out.println(tem + "도는 " + ss + "입니다"); 
	}
}
