<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form name = 'frm' method = 'post'><br/>
<label>이름 : </label>
<input type = 'text' name = 'name'><br/><br/>
<label>성별 : </label>
<input type = 'radio' name = 'gender' value = '남자'>남자
<input type = 'radio' name = 'gender' value = '여자'>여자<br/><br/>
<label>국어 : <input type = 'text' name = 'kor'></label><br/>
<label>영어 : <input type = 'text' name = 'eng'></label><br/>
<label>수학 : <input type = 'text' name = 'mat'></label><br/>
<p/>
<input type = 'submit' value = '전송'/>
</form>
<%
request.getCharacterEncoding("utf-8");

String name = request.getParameter("name");
String[] gender =
%>
</body>
</html>