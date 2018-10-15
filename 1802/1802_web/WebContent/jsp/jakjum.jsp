<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>hakjum</title>
</head>
<body>

<%!
public char hakjum(int a) {
	return (a >= 90) ? 'A' : ((a >= 80) ? 'B' : ((a >= 70) ? 'C' : ((a >= 60) ? 'D' : 'F')));
}
%>

<%= 
hakjum(64)
%>
</body>
</html>