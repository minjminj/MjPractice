/*
 * 회원정보 / 게시판 만들기
 * 2018.05.14(김민정)
 */
package chap18;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Board implements Serializable{
	
	// UID선언
	static final long serialVersionUID = 2L;
	
	private int no;				 // 게시물 번호
	private String mdate;		 // 작성일자(현재날짜)
	private String worker; 		// 작성자
	private int hit;		// 조회수
	private String subject; // 제목
	private String content;	 // 내용
	private String pwd;		// 암호
	
	public Board() {}			// only 검색용 생성자
	
	public Board(String worker, String subject, String content, String pwd) {
		
		this.worker = worker;
		this.subject = subject;
		this.content = content;
		this.pwd = pwd;
		
		this.no = maxNo();			//임의로 추가된 메소드 재정의 하기.
		this.hit = 0;
		this.mdate = makeDate();
		
	}
	
	@Override
	public int hashCode() {
		return no;			// 같은 게시물은 동일한 게시물 번호를 갖는다.
	}

	@Override
	public boolean equals(Object o) {
		boolean b = false;
		if(o instanceof Board) {
			Board brd = (Board) o;
			if(this.no == brd.getNo())
				b = true;
		}
		return b;
	}
	

	public String toStirng() {
		String str = String.format("%5d %20s %50s %50s %s", no, worker, subject, content, mdate );
		return str;
	}
	
	public int maxNo() {
		int n = 0;
		int size = BoardEx.data.size();
		if (size ==0) {
			n=1;
		} else {
			Board temp = BoardEx.data.get(size-1);		// size-1 = last index 를 의미
			n = temp.getNo() + 1;
		}
		return n;
	}
	
	public String makeDate() {
		SimpleDateFormat da = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		String md = da.format(new Date());
		return md;
	}
	
	
	// getter / setter
	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getMdate() {
		return mdate;
	}

	public void setMdate(String mdate) {
		this.mdate = mdate;
	}

	public String getWorker() {
		return worker;
	}

	public void setWorker(String worker) {
		this.worker = worker;
	}

	public int getHit() {
		return hit;
	}

	public void setHit(int hit) {
		this.hit = hit;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}



	
	
}
