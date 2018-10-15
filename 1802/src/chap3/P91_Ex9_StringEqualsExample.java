package chap3;
//문자열 비교
public class P91_Ex9_StringEqualsExample {
	public static void main(String[] args) {
		String strVar1 = "신민철";
		String strVar2 = "신민철";
		String strVar3 = new String("신민철");	/* String은 원래 예약어가 아니기 때문에 이렇게 쓰는것이 정석
				but 그냥 String만 사용해서도 문자열 변수 선언이 가능하지만, 정석인 방법으로 선언했을때랑 다른 개체값을 가지게 됨.*/
		
		System.out.println( strVar1 == strVar2);
		System.out.println( strVar1 == strVar3);
		System.out.println();
		System.out.println( strVar1.equals(strVar2));
		System.out.println( strVar1.equals(strVar3));
		
		
	}
}
