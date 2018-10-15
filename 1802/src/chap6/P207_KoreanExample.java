/*
 * °´Ã¼ »ý¼º ÈÄ ÇÊµå°ª Ãâ·Â
 * 2018.04.30(±è¹ÎÁ¤)
 */
package chap6;

public class P207_KoreanExample {

	public static void main(String[] args) {
		
		P207_Korean k1 = new P207_Korean("±è¹ÎÁ¤", "001145-224866");
		System.out.println("k1.name: " + k1.name);
		System.out.println("k1.ssn: " + k1.ssn);
		
		P207_Korean k2 = new P207_Korean("±è¹Î¿µ", "5594154-4187566");
		System.out.println("k2.name: " + k2.name);
		System.out.println("k2.ssn:" + k2.ssn);
	}
}
