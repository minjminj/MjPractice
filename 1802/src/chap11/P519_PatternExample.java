/*
 * 문자열 검증하기
 * 1)숫자로 이루어진 데이터인가를 체크
 * 2)영문으로만 이루어진 데이터인가 체크
 * 3)영숫자만으로 이루어진 데이터인가 체크
 * 4)정상적인 도메인인지 체크
 */
package chap11;

import java.util.regex.Pattern;

public class P519_PatternExample {
	
	public static void main(String[] args) {
		
		// 전화번호 정규식에 맞는 데이터인가 체크
		String regExp = "(02|010)-\\d{3,4}-\\d{4}"; 
		String data = "010-3123-7207";
		boolean result = Pattern.matches(regExp, data);
		if (result) {
			System.out.println("전화번호가 정규식과 일치합니다.");
		} else {
			System.out.println("전화번호가 정규식과 일치하지 않습니다.");
		}
		
		
		// 이메일 정규식에 맞는 데이터인가 체크
		regExp = "\\w+@\\w+\\.\\w+";
		data = "adiiiii@naver123com";
		result = Pattern.matches(regExp, data);
		if (result) {
			System.out.println("이메일이 정규식과 일치합니다.");
		} else {
			System.out.println("이메일이 정규식과 일치하지 않습니다.");
		}
		
		
		// 숫자로만 이루어진 데이터인가 체크 
		regExp = "\\d+";
		data = "4567-82594";
		result = Pattern.matches(regExp, data);
		if (result) {
			System.out.println("숫자가 정규식과 일치합니다.");
		} else {
			System.out.println("숫자가 정규식과 일치하지 않습니다.");
		}
		
		
		// 영문자로만 이루어진 데이터인가 체크
		regExp = "[a-zA-Z]+";
		data = "fghfgh";
		result = Pattern.matches(regExp, data);
		if (result) {
			System.out.println("영문자가 정규식과 일치합니다.");
		} else {
			System.out.println("영문자가 정규식과 일치하지 않습니다.");
		}
		
		
		// 영숫자로만 이루어진 데이터인가 체크
		regExp = "\\w+";
		data = "klsdhahsDSDd3234234234f";
		result = Pattern.matches(regExp, data);
		if (result) {
			System.out.println("영숫자가 정규식과 일치합니다.");
		} else {
			System.out.println("영숫자가 정규식과 일치하지 않습니다.");
		}
		
		
		// 정상적인 도메인인지 체크
		regExp = "\\w+\\.\\w+\\.\\w+(\\.\\w+)?";
		// www 가 고정이 아닌 경우도 많이 있음. 그래서 (www\\.) 보다는 그냥 \\w+가 더 나은 표현.
		data = "www.naver,com";
		result = Pattern.matches(regExp, data);
		if (result) {
			System.out.println("도메인이 정규식과 일치합니다.");
		} else {
			System.out.println("도메인이 정규식과 일치하지 않습니다.");
		}
		
		
	}

}
