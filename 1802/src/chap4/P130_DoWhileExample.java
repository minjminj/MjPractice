/*
 * do-while��
 * Scanner�� ����Ͽ� ���ڿ��� �Է¹޾� "q"�� ������������ do-while�� ����Ͽ� �ݺ��ϴ� ��
 */
package chap4;

import java.util.Scanner;

public class P130_DoWhileExample {
	
	public P130_DoWhileExample() {
		
	System.out.println("�޼����� �Է��ϼ���");
	System.out.println("���α׷��� �����Ϸ��� q�� �Է��ϼ���");
	
	Scanner scanner = new Scanner(System.in);
	String inputString;
	
	do {
		System.out.println(">");
		inputString = scanner.nextLine();
		System.out.println(inputString);
	} while ( !inputString.equals("q"));
	
	System.out.println("���α׷� ����");
	
	}

}
