<%@page import="java.util.Arrays"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<!-- 아이디,성명,취미,여행희망지역을 입력받아 동일한 페이지에 출력 -->
<body>
	<form name = 'frm' method = 'post'>
	
	<label>성명</label>
	<input type='text' name='irum'/><br/>
	
	<label>아이디</label>
	<input type='text' name='id'/><br/>
	
	<label>취미</label><br/>
	<input type='checkbox' name='hobby' value='야구'/>야구<br/>
	<input type='checkbox' name='hobby' value='배구'/>배구<br/>
	<input type='checkbox' name='hobby' value='축구'/>축구<br/>
	<input type='checkbox' name='hobby' value='농구'/>농구<br/>
	
	<label>여행 희망 지역</label><br/>
	 <select name='hope' size='5' multiple='multiple'>
        <option value='오사카'>오사카</option>
        <option value='베이징'>베이징</option>
        <option value='뉴욕'>뉴욕</option>
        <option value='제주도'>제주도</option>
    </select>
	<p/>
	<input type='submit' value='전송' />
	</form>
	<hr/>
	
	<%
	request.setCharacterEncoding("utf-8");
	if(request.getMethod().equals("GET"))return;
	
	String irum = request.getParameter("irum");
	String id = request.getParameter("id");
	String[] hobby = request.getParameterValues("hobby");
	String[] hope = request.getParameterValues("hope");
	
	out.print("<li>Name : "+ irum);
	out.print("<li>id : "+ id);
	out.print("<li>Hobby : "+ Arrays.toString(hobby));
	out.print("<li>Hope : "+ Arrays.toString(hope));
	%>
	
	
</body>
</html>