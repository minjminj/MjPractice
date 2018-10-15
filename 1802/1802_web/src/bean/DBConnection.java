package bean;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {	//반환하는 역할
	
	//필드값
	
	//사전에 드라이버명 준비
		String driver = "oracle.jdbc.driver.OracleDriver";
		//오라클 서버가 설치되어 있는 도메인
		String db_url = "jdbc:oracle:thin:@192.168.0.29:1521:xe";	
		String dbUser = "hr";// DBuser명
		String dbPwd = "hr";//	DBpw 명
	
		Connection conn;

		public DBConnection() {
			try{
				//driver loading
				Class.forName(driver);
				//java.sql 로 되어있는것으로 import 처리
				conn = DriverManager.getConnection(db_url,dbUser,dbPwd);
			}catch(Exception ex){	//혹시 모르니 예외 처리
				ex.printStackTrace();
			}
		}
		
		public Connection getConn() {
			return conn;
					
		}
}
