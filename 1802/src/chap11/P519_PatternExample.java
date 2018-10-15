/*
 * ���ڿ� �����ϱ�
 * 1)���ڷ� �̷���� �������ΰ��� üũ
 * 2)�������θ� �̷���� �������ΰ� üũ
 * 3)�����ڸ����� �̷���� �������ΰ� üũ
 * 4)�������� ���������� üũ
 */
package chap11;

import java.util.regex.Pattern;

public class P519_PatternExample {
	
	public static void main(String[] args) {
		
		// ��ȭ��ȣ ���ԽĿ� �´� �������ΰ� üũ
		String regExp = "(02|010)-\\d{3,4}-\\d{4}"; 
		String data = "010-3123-7207";
		boolean result = Pattern.matches(regExp, data);
		if (result) {
			System.out.println("��ȭ��ȣ�� ���Խİ� ��ġ�մϴ�.");
		} else {
			System.out.println("��ȭ��ȣ�� ���Խİ� ��ġ���� �ʽ��ϴ�.");
		}
		
		
		// �̸��� ���ԽĿ� �´� �������ΰ� üũ
		regExp = "\\w+@\\w+\\.\\w+";
		data = "adiiiii@naver123com";
		result = Pattern.matches(regExp, data);
		if (result) {
			System.out.println("�̸����� ���Խİ� ��ġ�մϴ�.");
		} else {
			System.out.println("�̸����� ���Խİ� ��ġ���� �ʽ��ϴ�.");
		}
		
		
		// ���ڷθ� �̷���� �������ΰ� üũ 
		regExp = "\\d+";
		data = "4567-82594";
		result = Pattern.matches(regExp, data);
		if (result) {
			System.out.println("���ڰ� ���Խİ� ��ġ�մϴ�.");
		} else {
			System.out.println("���ڰ� ���Խİ� ��ġ���� �ʽ��ϴ�.");
		}
		
		
		// �����ڷθ� �̷���� �������ΰ� üũ
		regExp = "[a-zA-Z]+";
		data = "fghfgh";
		result = Pattern.matches(regExp, data);
		if (result) {
			System.out.println("�����ڰ� ���Խİ� ��ġ�մϴ�.");
		} else {
			System.out.println("�����ڰ� ���Խİ� ��ġ���� �ʽ��ϴ�.");
		}
		
		
		// �����ڷθ� �̷���� �������ΰ� üũ
		regExp = "\\w+";
		data = "klsdhahsDSDd3234234234f";
		result = Pattern.matches(regExp, data);
		if (result) {
			System.out.println("�����ڰ� ���Խİ� ��ġ�մϴ�.");
		} else {
			System.out.println("�����ڰ� ���Խİ� ��ġ���� �ʽ��ϴ�.");
		}
		
		
		// �������� ���������� üũ
		regExp = "\\w+\\.\\w+\\.\\w+(\\.\\w+)?";
		// www �� ������ �ƴ� ��쵵 ���� ����. �׷��� (www\\.) ���ٴ� �׳� \\w+�� �� ���� ǥ��.
		data = "www.naver,com";
		result = Pattern.matches(regExp, data);
		if (result) {
			System.out.println("�������� ���Խİ� ��ġ�մϴ�.");
		} else {
			System.out.println("�������� ���Խİ� ��ġ���� �ʽ��ϴ�.");
		}
		
		
	}

}
