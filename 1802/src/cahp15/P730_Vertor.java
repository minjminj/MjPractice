/*
 * Board ��ü�� �����ϴ� Vector
 * ����ȭ ��� ����. (��Ƽ �����忡�� ����)
 */
package cahp15;

import java.util.List;
import java.util.Vector;

public class P730_Vertor {

	public static void main(String[] args) {
		List<P731_Board> list = new Vector<P731_Board>();
		
		list.add(new P731_Board("����1", "����1", "�۾���1"));
		list.add(new P731_Board("����2", "����2", "�۾���1"));
		list.add(new P731_Board("����3", "����3", "�۾���3"));
		list.add(new P731_Board("����4", "����4", "�۾���4"));
		list.add(new P731_Board("����5", "����5", "�۾���5"));
		
		list.remove(2);	// 2�� �ε��� ��ü(����3) ���� (���� �ε����� 1�� ������ ����)
		list.remove(3);
		
		for (int i=0 ; i<list.size() ; i++) {
			P731_Board board = list.get(i);
			System.out.println(board.subject + "\t" + board.content + "\t" + board.writer);
		}
	}
}
