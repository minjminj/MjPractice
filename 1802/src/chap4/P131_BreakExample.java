/*
 * break�� while�� ����
 * ������ ����Ͽ� 6�� ������ break�� �ݺ��� ����
 * �ۼ�����: 2018.04.20
 */
package chap4;

public class P131_BreakExample {
	
	public P131_BreakExample() {
		
		while (true) {
		
			int num = (int) (Math.random()*6) + 1;
			
			System.out.println(num);
		
			if (num == 6) {
				break;
			}
		}
		
		System.out.println("���α׷� ����");
	}

}
