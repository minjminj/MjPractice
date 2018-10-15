<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>include_action_main</title>
<style>
#main{
	width:900px;
	margin:0 auto;
	overflow:hidden;
}
#left{
	padding: 5px;
	float:left;
	box-sizing:border-box;
	display:inline-block;
	border: 1px solid #0000ff;
	width:200px;
}
#right{
	display:inline-block;
	padding:5px;
	width:700px;
	border: 1px solid #0000ff;
	box-sizing:border-box;
}

</style>
</head>
<body>
	<%
	String inc = "";//초기에 include될 파일
	if(request.getParameter("inc")!=null){
		inc = request.getParameter("inc");
	}
	%>
	<div id = 'main'>
	<h3>include action main</h3>
	<nav id = 'left'>
		<jsp:include page = "include_action_menu.jsp" />
	</nav>
	<section id = 'right'>
		<!-- <iframe name="ifrm_content" width="100%" height="100%"></iframe> -->
		<jsp:include page = "<%=inc %>"/>
	</section>
	</div>
</body>
</html>