<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>include_action_menu</title>
<style>
	a{
		text-decoration: none;
	}
	a:hover{
		background: #ffffff;
	}
	ul, li{
		list-style: none;
		padding-left:0;
		margin-left:0;
	}
</style>
</head>
<body>
	<h2>메 뉴</h2>
	<ul>
		<!-- <li><a href='hobby.jsp' target="ifrm_content">hobby</a></li> -->
		<li><a href='include_action_main.jsp?inc=hobby.jsp'>hobby</a></li>
		<li><a href='include_action_main.jsp?inc=gugudan.jsp'>gugudan</a></li>
		<li><a href='include_action_main.jsp?inc=hap.jsp'>hap</a></li>
		<li><a href='include_action_main.jsp?inc=scope.jsp'>scope</a></li>
		<li><a href='include_action_main.jsp?inc=score3.jsp'>score3</a></li>
		
		<!-- inc 값을 right 영역에 뿌려주면 된다. -->
	</ul>
</body>
</html>