<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="<%= request.getContextPath() %>/jsp/login.jsp" method="post" />
	아이디<input type="text" name='id' size='10'/><br/>
	암호<input type="text" name="pwd" size='10'/><br/>
	<input type='submit' value='로 그 인'/>
</form>
</body>
</html>