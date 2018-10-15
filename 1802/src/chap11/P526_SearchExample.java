/*
 * �迭 �˻�(Arrays.binarySearch() ���� ���� ����)
 */
package chap11;

import java.util.Arrays;

public class P526_SearchExample {

	public static void main(String[] args) {
		
		// �⺻ Ÿ�԰� �˻�
		int[] scores = {99, 96, 93};
		Arrays.sort(scores);
		int index = Arrays.binarySearch(scores, 99);
		System.out.println("ã�� �ε���: " + index);
	
		
		// ���ڿ� �˻�
		String[] names = {"ȫ�浿", "�ڵ���", "��μ�"};
		Arrays.sort(names);
		index = Arrays.binarySearch(names, "ȫ�浿");
		System.out.println("ã�� �ε���: " + index);
		
		// ��ü �˻�
		P524_Member m1 = new P524_Member("ȫ�浿");
		P524_Member m2 = new P524_Member("�ڵ���");
		P524_Member m3 = new P524_Member("��μ�");
		
		P524_Member[] members = {m1, m2, m3};
		Arrays.sort(members);
		index = Arrays.binarySearch(members, m1);
		System.out.println("ã�� �ε���: " + index);
	
	
	}
}
