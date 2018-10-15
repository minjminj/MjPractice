<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
	<jsp:useBean id="scores" class="bean.ScoreVo"/>
	<jsp:setProperty property="*" name="scores"/> 
</head>
<body>
<div>
	<h3>성적 입력 결과</h3>
	<ol>
		<li>ID : <%= scores.getId() %></li>
		<li>SUBJECT : <%= scores.getSubject() %></li>
		<li>DATE : <%= scores.getDate() %></li>
		<li>SCORE : <%= scores.getScore() %></li>
	</ol>
</div>
</body>
</html>