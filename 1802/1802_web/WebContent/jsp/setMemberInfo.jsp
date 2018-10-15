<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String irum;
	String id;
	
	session.setAttribute("id", "아뒤");
	session.setAttribute("Name", "최규하");
	
	irum = (String)session.getAttribute("Name");
	id = (String)session.getAttribute("id");
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
세션에 정보를 저장하였습니다.<br/>

이름:<%= irum %><br/>
아이디:<%= id %>
</body>
</html>