<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<label>상세보기</label>
<%
	String nav = request.getParameter("nav");
	String sec = request.getParameter("sec");
	String id = request.getParameter("id");
%>

<li>nav = <%=nav %></li>
<li>sec = <%=sec %></li>
<li>id = <%=id %></li>
</body>
</html>