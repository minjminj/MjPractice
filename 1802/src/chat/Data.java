
package chat;

import java.io.Serializable;
import java.util.Vector;

public class Data implements Serializable {
	
	static final long serialVersionUID = 3L;
		// 8명이 전체 다 같은 화면에서 채팅을 주고 받으려면 UID넘버가 모두 같아야함.
	
	String id;
	String command; // login, logout, whisper, message, userList, new user, shutdown
	String message;
	Vector<String> users; 	// 로그인시 server에서 userList라는 기존 유저 목록, 귓속말시 대상자 명단

	public Data() {}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCommand() {
		return command;
	}

	public void setCommand(String command) {
		this.command = command;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Vector<String> getUsers() {
		return users;
	}

	public void setUsers(Vector<String> users) {
		this.users = users;
	}


	
	
}
