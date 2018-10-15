package chatt;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerExample {
	public static void main(String[] args) {
		
		ServerSocket serversocket = null;
		try {
			serversocket = new ServerSocket();
			serversocket.bind(new InetSocketAddress(4444));
			while (true) {
				System.out.println("기다림");
				Socket socket = serversocket.accept();
				InetSocketAddress isa = (InetSocketAddress) socket.getRemoteSocketAddress();
				System.out.println("수락함 : " + isa.getHostName());

				byte[] bytes = null;
				String msg = null;

				InputStream is = socket.getInputStream();
				bytes = new byte[100];
				int readbyte = is.read(bytes);
				msg = new String(bytes, 0, readbyte, "UTF-8");
				System.out.println("성공" + msg);

				OutputStream os = socket.getOutputStream();
				msg = "Server";
				bytes = msg.getBytes("UTF-8");
				os.write(bytes);
				os.flush();
				System.out.println("보내기 성공");

				is.close();
				os.close();
				socket.close();

			}
		} catch (Exception e) {
		}
		
		if (!serversocket.isClosed()) {
			try {
				serversocket.close();
			} catch (IOException e) {

			}
		}
	}

}
