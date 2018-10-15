/*
 * ����� ���� ��ü�� ���� ������ �����ϱ�
 * Comparable�� �̿��� ��ü�� �����ϱ� ������ ���̼����� ����.
 * 2018.05.09(�����)
 */
package cahp15;

import java.util.TreeSet;

public class P764_ComparableExample {

	public static void main(String[] args) {
		 
		TreeSet<P764_Person> treeSet = new TreeSet<P764_Person>();
		
		treeSet.add(new P764_Person("ȫ�浿", 56));
		treeSet.add(new P764_Person("�����", 28));
		treeSet.add(new P764_Person("��ο�", 30));
		
		for (P764_Person e : treeSet) {
			System.out.println("name: " + e.name + "\t age:" + e.age);
		}
	}
}
