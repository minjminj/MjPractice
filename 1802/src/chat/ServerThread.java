/*
 * 서버중지
 * 1) 모든 클라이언트에게 서버중지 통보 (shutdown)
 * 2) user에 등록된 모든 클라이언트를 삭제. but!!! user가 null이 되면 안됨.user.clear();
 * 3) usernames.clear();
 * 4) list.setDataList(usernames); 로 초기화
 * 5) serverSocket = null로 설정
 */
package chat;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.StringReader;
import java.net.Socket;
import java.util.List;
import java.util.Vector;

import javax.swing.text.Document;
import javax.swing.text.html.HTMLEditorKit;

public class ServerThread extends Thread {

	ObjectInputStream ois;
	ObjectOutputStream oos;
	Server server;
	boolean run = true;

	public ServerThread(Server server, Socket socket) {
		this.server = server;

		try {
			oos = new ObjectOutputStream(socket.getOutputStream());
			ois = new ObjectInputStream(socket.getInputStream());

		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	@Override

	public void run() {
		HTMLEditorKit ek = (HTMLEditorKit) server.editorPane.getEditorKit();
		StringReader reader = new StringReader("hi!");
		// Document doc = server.editorPane.getDocument();

		try {
			while (run) {
				Document doc = server.editorPane.getDocument();
				Data obj = (Data) ois.readObject();

				switch (obj.getCommand()) {
				case "login":
					// 기존 유저 목록을 자기 자신과 연결된 클라이언트에게 전송
					Data temp = new Data();
					temp.setCommand("userList");
					temp.setMessage("하이루");

					temp.setUsers(server.usernames);
					// 서버에 유저 목록 추가
					temp.setId(obj.getId());
					server.usernames.addElement(obj.getId());
					server.list.setListData(server.usernames);

					oos.writeObject(temp);
					oos.flush();

					// 모든 유저에게 로그인 한 유저 정보를 전달
					temp = new Data();
					temp.setId(obj.getId());
					temp.setCommand("login");
					temp.setMessage(obj.getId() + "님이 로그인 하셨습니다.");
					reader = new StringReader(temp.getMessage());
					ek.read(reader, doc, doc.getLength());
					sendAll(temp);

					break;

				case "logout":
					sendAll(obj);
					reader = new StringReader(obj.getId() + "님이 로그아웃 하셨습니다.");
					ek.read(reader, doc, doc.getLength());
					// 스크롤 바를 맨 하단으로.
					server.editorPane.setCaretPosition(doc.getLength());

					server.usernames.remove(obj.getId()); // 해당 아이디를 username에서 제거
					server.list.setListData(server.usernames); // 해당 아이디를 Jlist에서 제거
					run = false;

					break;

				/*
				 * case "logout": sendAll(obj);
				 * 
				 * server.userNames.remove(obj.getId());
				 * server.list.setListData(server.userNames); run = false;
				 * 
				 * break;
				 * 
				 */

				case "message":
					sendAll(obj);

					reader = new StringReader(obj.getId() + ": " + obj.getMessage());
					ek.read(reader, doc, doc.getLength());

					// 스크롤 바를 맨 하단으로.
					server.editorPane.setCaretPosition(doc.getLength());
					break;
				case "userList":
					break;
				case "whisper":

					break;
				case "shutdown":
					shutdown();
					break;
				//
				}

			}

		} catch (Exception ex) {

			try {
				ois.close();
				oos.close();
			} catch (IOException e1) {
				ex.printStackTrace();
			}
		}
	}

	// // 모든 유저에게 메시지 전달
	public void sendAll(Data msg) {
		try {
			HTMLEditorKit kit = (HTMLEditorKit) server.editorPane.getEditorKit();
			StringReader reader = new StringReader(msg.getMessage());
			Document doc = server.editorPane.getDocument();
			kit.read(reader, doc, doc.getLength());
			server.editorPane.setCaretPosition(doc.getLength());

		} catch (Exception ex) {
			ex.printStackTrace();
		}

		for (int i = server.user.size() - 1; i >= 0; i--) {
			ServerThread st = null;
			try {
				st = server.user.get(i);
				st.oos.writeObject(msg);
				st.oos.flush();

			} catch (Exception ex) {
				server.user.remove(st);
				st = null;
			}
		}

	}

	// public void sendAll(Data temp) {
	//
	// for (ServerThread st : server.user) {
	//
	// try {
	// if (st.isAlive()) {
	// st.oos.writeObject(temp);
	// oos.flush();
	// } else {
	// server.user.remove(st);
	//
	// }
	// } catch (Exception ex) {
	// ex.printStackTrace();
	// }
	// }
	// }

	// 서버 메시지를 전달받아 Data 객체로 생성한 후 sendAll(obj) 실행
	public void sendAll(String msg) {
		Data temp = new Data();

		temp.setId("server");
		temp.setMessage(msg);
		temp.setCommand("message");

		Document doc = server.editorPane.getDocument();
		MyMessage.my(server.editorPane, temp);
		server.editorPane.setCaretPosition(doc.getLength());

		sendAll(temp);
	}

	// 귓속말
	public void send(Data msg) {
		try {
			oos.writeObject(msg);
			oos.flush();

		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	public void shutdown() {

		Data temp = new Data();
		temp.setId("server");
		temp.setMessage("공지: 서버가 중지됨.");
		sendAll(temp.getMessage());
		temp.users.removeAllElements();
		server.usernames.removeAllElements();
		server.list.setListData(server.usernames);
		try {
			server.serverSocket.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
