/*
 * if-else if-else�� ���� (class ���� ����)
 * �ۼ�����: 2018.04.18
 */

package Prac;

public class Practice1 {
	public Practice1(int score) {
				
		if (score >= 90) {
			if (score >= 95) {
				System.out.println("A+ �Դϴ�");
			} else {
				System.out.println("A �Դϴ�");
			}
		} else if (score >= 80) {
			if (score >= 85) {
				System.out.println("B+ �Դϴ�");
			} else {
				System.out.println("B �Դϴ�");
			}
		} else {
			System.out.println("����� �Դϴ�");
		}
	}
}
