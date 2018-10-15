/*
 * Arrays.sort() �޼ҵ带 �̿��� �迭 ��
 */
package chap11;

import java.util.Arrays;

public class P524_SortExample {
	
	public static void main(String[] args) {
		
		int[] scores = {99, 96, 93};
		Arrays.sort(scores);
		for (int i=0 ; i<scores.length ; i++) {
			System.out.println("scores [" + i + "]=" + scores[i]);			
		}
		System.out.println();
		
		String[] names = {"ȫ�浿", "�ڵ���", "��μ�"};
		Arrays.sort(names);
		for (int i=0 ; i<names.length ; i++) {
			System.out.println("names [" + i + "]=" + names[i]);
		}
		System.out.println();
		
		P524_Member m1 = new P524_Member("ȫ�浿");
		P524_Member m2 = new P524_Member("�ڵ���");
		P524_Member m3 = new P524_Member("��μ�");
		P524_Member[] members = {m1, m2, m3};
		
		Arrays.sort(members);			// sort ��� �޼ҵ尡 P524_Member�� compareTo�� ȣ���ϱ� ������ �� ��ü�� name���� ��
										// ���� �����ǵ� compareTo�� ���µ��� �ұ��ϰ� ������ �ȴٸ�, �װ��� hashcode������ �񱳸� ���� ��.
		for (int i=0 ; i<members.length ; i++) {
			System.out.println("members [" + i + "]=" + members[i].name);
		}
	}
	
	

}
