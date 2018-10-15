// ------------------------------
// 문자열 비교시 ==로 비교한 경우와, .equals() 매서드를 비교한 경우
	//문자열을 대입연산자로 만든 후 ==로 비교
 	//문자열을 객체로 만든 후 == 비교
// 작성일자: 2018.04.18
// --------------------------------------------------

package chap4;

public class Ex19 {
	public static void main(String[] args) {
		String a = "홍";
		String b = "홍";
		
		if (a == b) {
			System.out.println("a=b"); //출력
		} else {
			System.out.println("a!=b");
		}
		
		String c = new String("김");
		String d = new String("김");
		
		if (c == d) {
			System.out.println("c=d");
		} else {
			System.out.println("c!=d"); //출력
		}
		
		// .equals 비교
		System.out.println("-----------------------");
		
		if (a .equals(b)) {
			System.out.println("a=b"); //출력
		} else {
			System.out.println("a!=b");
		}
		
		if (c .equals(d)) {
			System.out.println("c=d"); //출력
		} else {
			System.out.println("c!=d");
		}
	}
}
