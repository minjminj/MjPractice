/*
 * do-while문
 * Scanner를 사용하여 문자열을 입력받아 "q"가 눌러질때까지 do-while을 사용하여 반복하는 예
 */
package chap4;

import java.util.Scanner;

public class P130_DoWhileExample {
	
	public P130_DoWhileExample() {
		
	System.out.println("메세지를 입력하세요");
	System.out.println("프로그램을 종료하려면 q를 입력하세요");
	
	Scanner scanner = new Scanner(System.in);
	String inputString;
	
	do {
		System.out.println(">");
		inputString = scanner.nextLine();
		System.out.println(inputString);
	} while ( !inputString.equals("q"));
	
	System.out.println("프로그램 종료");
	
	}

}
