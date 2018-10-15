package chatt;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.StringReader;
import java.net.Socket;
import java.util.Vector;

import javax.swing.text.Document;
import javax.swing.text.html.HTMLEditorKit;

public class ServerThread extends Thread {
	ObjectInputStream ois;
	ObjectOutputStream oos;
	Server server;

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
		HTMLEditorKit et = (HTMLEditorKit) server.editorPane.getEditorKit();
		StringReader reader = null;

		try {
			while (true) {
				Document doc = server.editorPane.getDocument();
				Data11 obj = (Data11) ois.readObject();
				
				switch(obj.getCommand()) {
				case "login":
					// 기존 유저목록 전송 자기와 연결된 클라이언트에게 전송
					Data11 temp = new Data11();
					temp.setCommand("userList");
					temp.setMessage("Hi~");
					server.userNames.addElement(obj.getId());
					server.list.setListData(server.userNames);
					
					temp.setUsers(server.userNames);
					
					oos.writeObject(temp);
					oos.flush();
					
					//모든 유저에게 login 한 유저 정보 전송
					temp = new Data11();
					temp.setId(obj.getId());
					temp.setCommand("login");
					
					sendAll(temp);
					break;
				case "logout":
					break;
				case "message":
					sendAll(obj);
					reader = new StringReader(obj.getMessage());
					et.read(reader, doc, doc.getLength());
					
					// 스크롤바를 맨 하단으로
					server.editorPane.setCaretPosition(doc.getLength());
					break;
				}


			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
	
	// 모든 유저에게 데이터 전송
	public void sendAll(Data11 msg) {
		try {
			for(ServerThread st : server.user) {
				if(st.isAlive()) {
				st.oos.writeObject(msg);
				st.oos.flush();

			}else {
				server.user.remove(st);
			}
			}
		}catch(Exception ex) {
			ex.printStackTrace();
		}
	}
	
	// 서버 메시지를 전달받아 Data 객체로 생성한 후 sendAll(obj) 실행
	public void sendAll(String msg) {
		Data11 temp = new Data11();
		temp.setId("server");
		temp.setMessage(msg);
		temp.setCommand("message");
		
		sendAll(temp);

	}
	
	// 귓속말 
	public void send(String msg) {
		try {

		}catch(Exception ex) {
			ex.printStackTrace();
		}
	}

}
