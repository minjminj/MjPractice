/*
 * 채팅에서 내가 보낸 메세지를 받은 메세지와 다르게 정렬하기 위한 클래스.
 * 2018.05.23(김민정)
 */

package chat;

import java.io.StringReader;
import java.text.MessageFormat;

import javax.swing.JEditorPane;
import javax.swing.text.Document;
import javax.swing.text.html.HTMLEditorKit;
import javax.swing.text.html.StyleSheet;

public class MyMessage {
		// 채팅 패키지 내 어디서나 편하게 my를 소환하기 위해 static으로 지정
	public static void my(JEditorPane ep, Data data) {
		HTMLEditorKit ek;
		StyleSheet style;
		String pattern = "<div class = 'my'><span class='my'>{0}</span></div>";
		ek = (HTMLEditorKit) ep.getEditorKit();		// html editor kit을 자바 editorPane에 적용
		style = ek.getStyleSheet(); // html editor kit의 styleSheet를 가져옴
		style.addRule("div.my{text-align:right;}");		// 오른쪽 정렬배치
		style.addRule("span.my{;width:250px;background-color:#ffff00;}");		// 글자바탕을 노랑색으로 설정
		Document doc = ep.getDocument();
		String temp = MessageFormat.format(pattern, data.getMessage());
		StringReader reader = new StringReader(temp);
		
		try {
			ek.read(reader, doc, doc.getLength());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
