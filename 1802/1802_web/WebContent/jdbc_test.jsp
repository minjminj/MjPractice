<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="bean.DBConnection"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style>
	item1{
		display:inline-block;
		width:250px;
	}
	item2{
		display:inline-block;
		width:250px;
	}
</style>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Oracle JDBC Driver Testing!!</title>
</head>
<body>
<%
/* 	//사전에 드라이버명 준비
	String driver = "oracle.jdbc.driver.OracleDriver";
	//오라클 서버가 설치되어 있는 도메인
	String db_url = "jdbc:oracle:thin:@192.168.0.29:1521:xe";	
	String dbUser = "hr";// DBuser명
	String dbPwd = "hr";//	DBpw 명
	
	try{
		//driver loading
		Class.forName(driver);
		//java.sql 로 되어있는것으로 import 처리
		Connection con = DriverManager.getConnection(db_url,dbUser,dbPwd);
		//connection good!!!!!!!! 나오면 제대로 된것
		out.print("connection good!!!!!!!!");
	}catch(Exception ex){	//혹시 모르니 예외 처리
		//toString - 오류메세지 구분을 위해서
		out.print(ex.toString());
	} */
	
	
	
	Connection conn = new DBConnection().getConn();
	
	if(conn != null){
		out.print("good!!!!!!!!!!!!");
	}
	try{
		String sql = "select first_name,phone_number from emloyees"
					//sql문장인 경우 무조건 Resultset이 만들어진다.
					+" where first_name like ?";	
					// ? 는 파라미터의 위치, " " 첫번째에는 공백을 만들어야 한다. 그렇지 않으면 앞에 employees 와 딱 붙게 된다.
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setString(1,"%a%");	
		//1번째 물음표에 %a%가 들어간다는 뜻.	String 은 자동으로 양옆에 ''를 붙여준다. ex) '%a%';
		ResultSet rs = ps.executeQuery();
		while(rs.next()){
			out.print("<div>");
			out.print("<span class='item1'>" + rs.getString("first_name") +"</span>");
			out.print("<span class='item2'>" + rs.getString("first_name") +"</span>");
		}
	}catch(Exception ex){
		out.print(ex.toString());
	}
	
	
%>
</body>
</html>