/*
 * if-else if-else문 연습 (class 따로 만들어서)
 * 작성일자: 2018.04.18
 */

package Prac;

public class Practice1 {
	public Practice1(int score) {
				
		if (score >= 90) {
			if (score >= 95) {
				System.out.println("A+ 입니다");
			} else {
				System.out.println("A 입니다");
			}
		} else if (score >= 80) {
			if (score >= 85) {
				System.out.println("B+ 입니다");
			} else {
				System.out.println("B 입니다");
			}
		} else {
			System.out.println("재수강 입니다");
		}
	}
}
