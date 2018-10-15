<%@page import="java.util.Arrays"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form>
		<label for='mid'>ID</label>
		<input type ='text' id='mid' name='mid' value ='choi' size = '6' maxlength='7'/><br/>
		<input type ='button' value = '버튼'/><br/>
		<label>취미</label><br/>
		<input type ='checkbox' name='hobby' value='축구'/>축구<br/>
		<input type ='checkbox' name='hobby' value='야구'/>야구<br/>
		<input type ='checkbox' name='hobby' value='배구'/>배구<br/>
		<label><input type ='checkbox' name='hobby' value='농구'/>농구<br/></label>
		<label><input type ='checkbox' name='hobby' value='비치발리볼'/>비치발리볼<br/></label>
		<label><input type ='checkbox' name='hobby' value='수영'/>수영<br/></label>
		<input type = 'file' name='attfile' value='파일명'/><br/>
		<input type ='hidden' name='hiddenvalue' value='히든값'/><br/>
		<input type ='image' src='../img/KakaoTalk_20180527_131004447.jpg' width = '500' height = '400' value= '이미지'/><br/>
		<label>PassWord</label><input type ='password' name='pwd'/><br/>
		<label>성 별</label>
		<label><input type ='radio' name='gender' value='남자'/>남자</label>
		<label><input type ='radio' name='gender' value='여자'/>여자</label>
		<label><input type ='radio' name='gender' value='ㅎㅎ'/>ㅎㅎ</label><br/>
		<input type ='reset'/><br/>
		<input type ='submit'/>
	</form>
	<% //jsp영역
	//form의 method속성이 get이면 리턴
	if(request.getMethod().equals("get"))return;
	request.setCharacterEncoding("UTF-8");
	%>
	<ul>
		<li>아이디 : <%=request.getParameter("mid") %></li>
		<li>취미 : <%= Arrays.toString(request.getParameterValues("hobby")) %></li>
		<li>첨부파일명 : <%= request.getParameter("attfile") %></li>
		<li>히든값 : <%=request.getParameter("hiddenvalue") %></li>
		<li>암호 : <%= request.getParameter("pwd") %></li>
		<li>성별 <%= request.getParameter("gender") %>></li>
	</ul>
	
</body>
</html>