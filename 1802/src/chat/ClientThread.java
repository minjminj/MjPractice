/*
 * 가장 중요한 역할
 * 1)데이터 수신 --> UI에 표시
 * 2)데이터 전송
 */
package chat;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.StringReader;
import java.net.Socket;
import java.util.Vector;

import javax.swing.text.Document;
import javax.swing.text.html.HTMLEditorKit;

public class ClientThread extends Thread {

	ObjectInputStream ois;
	ObjectOutputStream oos;
	Client client; // UI를 사용하기 위해

	boolean run = true;

	public ClientThread(Client client, Socket socket) {
		this.client = client;

		try {
			oos = new ObjectOutputStream(socket.getOutputStream());
			ois = new ObjectInputStream(socket.getInputStream());

		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	@Override
	public void run() {
		HTMLEditorKit ek = (HTMLEditorKit) client.editorPane.getEditorKit();
		StringReader reader = null;

		try {
			// 서버에 로그인 정보를 저장
			Data d = new Data();
			d.setId(client.tfId.getText());
			d.setCommand("login");
			d.setMessage("하이루");

			oos.writeObject(d);// 서버에 d를 전달하는 코드
			oos.flush();

			while (run) {

				Document doc = client.editorPane.getDocument();
				Data obj = (Data) ois.readObject();

				switch (obj.getCommand()) {
				case "login": // 지금 로그인 한 유저 현황
					reader = new StringReader("<div style = 'background-color: #ffff00'>" + obj.getId() + ": "
							+ obj.getMessage() + "</div>");

					client.usernames.addElement(obj.getId());
					client.list.setListData(client.usernames);
					break;

				case "logout":
					client.usernames.remove(obj.getId());
					client.list.setListData(client.usernames);
					reader = new StringReader("<div style = 'background-color: #ffff00'>" + obj.getId() + ": "
							+ obj.getMessage() + "</div>");

					break;

				case "message":
					send(obj.getMessage());
					reader = new StringReader("<div style = 'background-color: #ffff00'>" + obj.getId() + ": "
							+ obj.getMessage() + "</div>");
					client.list.setListData(client.usernames);
					// 스크롤 바를 맨 하단으로.
					break;
				case "userList": // 로그인 후 기존 유저아이디를 수신
					client.usernames = obj.users;
					client.list.setListData(client.usernames);
					break;

				case "shutdown":
					reader = new StringReader("<div style = 'background-color: #ffff00'" + obj.getMessage());

					run = false;
					client.disConnect();
					break;
				} // end of switch

				if (obj.getId().equals(client.tfId.getText())) { // 자신의 메세지인지 확인하기
					doc = client.editorPane.getDocument();
					MyMessage.my(client.editorPane, obj);
				} else {
					reader = new StringReader("<div>" + obj.getId() + ": " + obj.getMessage() + "</div>");

					ek.read(reader, doc, doc.getLength());
				}

				// ek.read(reader, doc, doc.getLength());
				client.editorPane.setCaretPosition(doc.getLength());

			} // end of while

			ois.close();
			oos.close();

			ois = null;
			oos = null;

		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	public void send(Data temp) {
		try {
			
				oos.writeObject(temp);
				oos.flush();
	

		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	public void send(String msg) {
		try {
			if (oos != null) {
			Data temp = new Data();
			temp.setMessage(msg);
			temp.setCommand("message");
			temp.setId(client.tfId.getText());
			oos.writeObject(temp);
			oos.flush();
			}
			
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
