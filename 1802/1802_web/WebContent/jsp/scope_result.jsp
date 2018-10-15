<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>scope_result</title>
</head>
<body>
	<h3 id='title'>form에서 전달받은 값을 application, session, request, page에 저장한 후 다시 확인해 보기</h3>
	<%
		//form의 정보를 각영역에 저장
		if(request.getMethod().equals("POST")){
			String msg = request.getParameter("msg");
			application.setAttribute("msg", msg);
			session.setAttribute("msg", msg);
			request.setAttribute("msg", msg);
			pageContext.setAttribute("msg", msg);
		}
	%>
	<ul>
		<li>Application : <%=application.getAttribute("msg") %></li>	<!-- 공용데이터를 사용시 ,log 관련-->
		<li>Session : <%=session.getAttribute("msg") %></li>	<!-- 브라우저를 끄기전 까지 살아있음 (default 30분),login관련 -->
		<li>Request : <%=request.getAttribute("msg") %></li>	<!-- 요청정보가 살아있을때만 , form태그변경 관련 -->
		<li>PageContext : <%=pageContext.getAttribute("msg") %></li>	<!-- 요청정보가 살아있을때만 ,form태그변경 관련 -->
	</ul>
	<a href = 'scope_result.jsp'>재 로딩....</a>
</body>
</html>