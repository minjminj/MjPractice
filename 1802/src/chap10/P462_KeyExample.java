/*
 * 다른 키로 인식
 * 2018.05.02(김민정)
 */
package chap10;

import java.util.HashMap;

public class P462_KeyExample {

	public static void main(String[] args) {
		// P461_Key 객체를 식별키로 사용해서 String 값을 저장하는 HashMap 객체 생성
		HashMap<P461_Key, String> hashMap = new HashMap<P461_Key, String>();
		
		// 식별키 "new P461_Key(1)" 로 "홍길동"을 저장함
		hashMap.put(new P461_Key(1), "홍길동");
		
		// 식별키 "new P461_Key(1)" 로 "홍길동"을 읽어옴          
		String value = hashMap.get(new P461_Key(1));
		System.out.println(value);
		
	}
}
