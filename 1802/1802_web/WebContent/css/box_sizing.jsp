<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>box_sizing</title>
<style>
	div{
		width:200px;
		height:100px;
		border:1px solid #0000ff;
		padding:20px;
	}
	div#padding,div#boxing{
		padding:50px;
	}
	div#boxing{
		box-sizing: border-box;
	}
</style>
</head>
<body>
<h1>normal</h1>
	<div id='normal'>홍길동</div>
	
<h1>box_sizing</h1>
	<div id='boxing'>홍길동</div>
	
<h1>padding</h1>
	<div id='padding'>홍길동</div>
</body>
</html>