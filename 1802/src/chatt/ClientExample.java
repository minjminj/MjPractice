package chatt;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;

public class ClientExample {
	public static void main(String[] args) {
		Socket socket = null; // 소켓 생성

		try {
			socket = new Socket(); 
			System.out.println("연결 요청");
			socket.connect(new InetSocketAddress("192.168.0.2", 4444)); // 포트번호 찿아감
			System.out.println("연결 성공");

			byte[] bytes = null;
			String msg = null;
			
			OutputStream os = socket.getOutputStream(); // 송신
			msg = "영충권 알려주세여"; 
			bytes = msg.getBytes("UTF-8");
			os.write(bytes);
			os.flush();
			System.out.println("보내기");

			InputStream is = socket.getInputStream(); // 수신
			bytes = new byte[100];
			int readByte = is.read(bytes);
			msg = new String(bytes, 0, readByte, "UTF-8");
			System.out.println("받음" + msg);

			os.close();
			is.close();

		} catch (Exception e) {
		}

		if (!socket.isClosed()) { // 소컷이 안닫혔으면
			try {
				socket.close();
			} catch (IOException ex) {

			}
		}
	}

}
