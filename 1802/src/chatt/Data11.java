package chatt;

import java.io.Serializable;
import java.util.Vector;

public class Data11 implements Serializable{
	static final long serialVersionUID = 3L;
	
	String id;
	String command; // login, logout, whisper, message, userList, newUser
	String message;
	Vector<String> users;
	
	public Data11() {}

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
