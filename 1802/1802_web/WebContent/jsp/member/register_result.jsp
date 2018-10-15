<%@page import="bean.MemberDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<div id="member_register_result">
	<id id ="title">회원 입력 결과</id>
	<jsp:useBean id='member' class='bean.MemberVo' scope='page'/>
	<jsp:setProperty property='*' name='member'/>
	
	<%
	MemberDao dao = new MemberDao(); //connection 까지 일어남
		boolean b = dao.insert(member);
		
		if(b){
			out.print("데이터가 정상적으로 입력됬어요");
		}else{
			out.print("데이터 저장중 오류 발생했어요");
		}
	%>
	
	<ol>
		<li>ID : <%=member.getId() %></li>
		<li>Name : <%=member.getName() %></li>
		<li>Email : <%=member.getEmail() %></li>
		<li>Pw : <%=member.getPw() %></li>
	</ol>
</div>
</body>
</html>