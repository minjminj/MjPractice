/*
 * ByteBuffer <-> String
 * 2018.05.23(김민정)
 */
package chap19;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

public class P1133_ByteBufferToStringExample {

	public static void main(String[] args) {
		
		Charset charset = Charset.forName("UTF-8");
		
		// 문자열 -> 인코딩 -> ByteBuffer
		String data = "안녕하세요";
		ByteBuffer buffer = charset.encode(data);
		
		// ByteBuffer -> 디코딩 -> CharBuffer -> 문자열
		data = charset.decode(buffer).toString();
		System.out.println("문자열 복원: " + data);
		
	}
}
 