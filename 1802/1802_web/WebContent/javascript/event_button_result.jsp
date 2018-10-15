<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		/* jsp영역(문법 구조는 java) */
		/* requeset객체는 사용자가 요청한 정보를 가지고 있음. */
		request.setCharacterEncoding("utf-8");
		String mid = request.getParameter("mid");	// <input type='text' name='mid' size='20' value='park' /> 에서 name='mid'와 같음
		out.print("ID : " + mid);
		
	%>
</body>
</html>