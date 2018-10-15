/*
 * Board 객체를 저장하는 Vector
 * 동기화 기능 있음. (멀티 스레드에서 안전)
 */
package cahp15;

import java.util.List;
import java.util.Vector;

public class P730_Vertor {

	public static void main(String[] args) {
		List<P731_Board> list = new Vector<P731_Board>();
		
		list.add(new P731_Board("제목1", "내용1", "글쓴이1"));
		list.add(new P731_Board("제목2", "내용2", "글쓴이1"));
		list.add(new P731_Board("제목3", "내용3", "글쓴이3"));
		list.add(new P731_Board("제목4", "내용4", "글쓴이4"));
		list.add(new P731_Board("제목5", "내용5", "글쓴이5"));
		
		list.remove(2);	// 2번 인덱스 객체(제목3) 삭제 (뒤의 인덱스는 1씩 앞으로 저장)
		list.remove(3);
		
		for (int i=0 ; i<list.size() ; i++) {
			P731_Board board = list.get(i);
			System.out.println(board.subject + "\t" + board.content + "\t" + board.writer);
		}
	}
}
