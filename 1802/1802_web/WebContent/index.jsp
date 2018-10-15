<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%
	request.setCharacterEncoding("utf-8");
%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<link rel='stylesheet' type='text/css' href='effect.css' />
<link rel='stylesheet' type='text/css' href='index_max.css' />
<style>
.ku {
	
 -webkit-animation-duration: 1s;
  -webkit-animation-delay: 0s;
  -webkit-animation-fill-mode: both;
  -webkit-animation-name: slideInUp;
  
   
  -webkit-animation-iteration-count: 1;
}
</style>
<title>index</title>

</head>
<body>
<%
String nav = "./html/html_index.jsp";
if(request.getParameter("nav") != null)
	nav = request.getParameter("nav");
%>
<%
String sec = "./html/font.jsp";
if(request.getParameter("sec") != null)
	sec = request.getParameter("sec");
%>
<%
String asd = "./html/asd.jsp";
if(request.getParameter("asi") != null)
	asd = request.getParameter("asi");
%>
<div style= 'width:1030px; margin:0 auto;overflow:hidden; border-radius:515px;'>
	<div style="width:1030px" id = 'header'  class='animatied rotateInDownLeft' ><%@include file="header.jsp" %></div>
	
	<div style="width:1030px" id ='content'>
		<div id ='nav' style="width:210px">
		<jsp:include page="<%= nav %>"/>
		</div>
		<div id ='section' style="width:610px">	
		<jsp:include page="<%= sec %>" />
		</div>
		<div id = 'aside' style="width:210px">
		<jsp:include page="<%= asi %>" />
		</div>
	</div>
	
	<div style="width:1030px" id = 'footer'><%@include file="footer.jsp" %></div>
</div>
</body>
</html>