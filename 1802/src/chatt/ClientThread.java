package chatt;

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
		HTMLEditorKit et = (HTMLEditorKit) client.editorPane.getEditorKit();
		StringReader reader = null;

		try {
			// 서버에 로그인 정보를 전송
			Data11 d = new Data11();
			d.setId(client.tfId.getText());
			d.setCommand("login");
			d.setMessage("방가....");

			oos.writeObject(d);
			oos.flush();

			while (true) {
				Document doc = client.editorPane.getDocument();
				Data11 obj = (Data11) ois.readObject();

				switch (obj.getCommand()) {
				case "login": // 지금 로그인한 유저정보
					client.userNames.addElement(obj.getId());
					client.list.setListData(client.userNames);
										
					break;
				case "userList": // 로그인 후 기존 유저아이디를 수신
					client.userNames = obj.users;
					client.list.setListData(client.userNames);
					break;
					
				case "logout":
					break;
				case "message":
					reader = new StringReader(
							"<div style = 'background-color:#ffff00'>"
					+ obj.getMessage() + "</div>");
					
					et.read(reader, doc, doc.getLength());
					break;
				}


			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	public void send(String msg) {
		try {
			Data11 temp = new Data11();
			temp.setMessage(msg);
			temp.setCommand("message");
			temp.setId(client.tfId.getText());
			oos.writeObject(temp);
			oos.flush();
			
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

}
