<%@page import="java.util.Arrays"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>request_test</title>
</head>
<body>
<h3 id = 'title'>
성명, 주소, 애완동물을 입력받아 그 결과에 출력
</h3>
<form name = 'frm' method='post'>
<label>성명</label>
<input type = 'text' name = 'irum' /><br/>

<label>주소</label>
<input type='text' name = 'address'/><br/>

<label>애완동물</label>
<label><input type='checkbox' name='pet' value='강아지'>강아지</label>
<label><input type='checkbox' name='pet' value='송아지'>송아지</label>
<label><input type='checkbox' name='pet' value='망아지'>망아지</label>
<label><input type='checkbox' name='pet' value='고양이'>고양이</label>
<p/>
<input type = 'submit' value = '전송'/>
</form>
<hr/>

<%
request.setCharacterEncoding("utf-8");
if(request.getMethod().equals("GET"))return;

String irum = request.getParameter("irum");	/* string 명과 getparameter 명은 달라도 된다. */
String address = request.getParameter("address");
String[] pet = request.getParameterValues("pet");

out.print("<li>Name : "+ irum);
out.print("<li>Address : "+ address);
out.print("<li>Pet : " + Arrays.toString(pet));

%>

</body>
</html>