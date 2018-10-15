<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>border</title>
<style>
	#left{
		border:1px solid #0000ff;
		border-left-width:10px;
		padding: 10px;
		box-sizing:border-box;
	}
	
	#div2{
		border:0px solid #0000ff;
		border-left-width:10px;
		padding: 10px;
		box-sizing:border-box;
	}
	
	#div3{
		border:0px solid red;
		border-left-width:35px;
		border-bottom-width:2px;
		border-radius:20px 0 0 20px;
		padding: 10px;
		box-sizing:border-box;
	}
</style>
</head>
<body>
	<div id='left'>css란 ??</div>
	<br/>
	<div id='div2'>javascript란 ??</div>
	<br/>
	<div id='div3'>jsp란 ??</div>
</body>
</html>