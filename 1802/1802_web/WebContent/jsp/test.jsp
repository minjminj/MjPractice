<%@ page import="java.text.SimpleDateFormat" %>
<%@ page import="java.util.Date" %>
<!-- page 지시문은 2개이상 사용할 수 없는데
	단,import는 2개이상 사용가능하다. -->
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%	//스크립트릿
Date d = new Date();
SimpleDateFormat sdf = new SimpleDateFormat();
%>

<%!	//선언문
public void sum(){
	
}
%>


<%="최규하" %>

<%
	out.print("규");
%>
<h1>servlet code 확인</h1>

<!-- 하나의 페이지는 서블릿으로 바뀔때 하나의 메소드안에 다들어간다. -->
<!-- 메소드안에 메소드는 불가능 하므로 선언문을 통해 자바메서드(함수)를 작성한다.-->
<!-- properties ->Location (지정경로) > .metatata > .plugins >org.eclipe.wst.server.core 
		> temp0 > work > Catalina > localhost >1802_web > org 
		> apache > jsp > jsp > test_jsp.java(test.jsp의 컴파일 결과 파일/servlet 형식의 파일)-->
</body>
</html>