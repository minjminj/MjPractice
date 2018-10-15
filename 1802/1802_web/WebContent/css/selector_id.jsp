<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"> 
	<title>selector_id</title>
	<style>
	 div{
	 	border:0px solid #bcefef;
	 	padding:0px;
	 	box-sizing:border-box;
	 }
	 div#header{
	 	width:800px;
	 	margin:0 auto;
	 	text-align: center;
	 	background-color: green;
	 }
	 div#wrap{
	 	width:800px;
	 	margin: 0 auto; /* 상하 : 0px, 좌우:자동(가운데) */
	 	overflow:hidden;
	 }
	 div#aside{
	 	width:200px;
	 	float:left;
	 	text-align: center;
	 	background-color:#9024ed;
	 }
	 
	 div#content{
	 	width:600px;
	 	float:left;
	 	text-align: center;
	 	background-color:#87eeee;
	 }
	 
	 div#footer{
	 	width:800px;
	 	margin:0 auto;
	 	text-align: center;
	 	margin-top:45px;
	 }
	</style>
</head>
<body>
	 <div id='header'>
	 	<h1>Header</h1>
	 </div>
	 
	 <div id='wrap'>
	 	<div id='aside'>
	 		<h1>Aside</h1>
	 	</div>
	 	 
	 <div id='content'>
	 	<h1>Content</h1>
	 </div>

	<div id='footer'>
		1802기 화이팅
	</div>
	
	</div>
</body>
</html>