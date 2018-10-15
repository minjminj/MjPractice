<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>display</title>
<style>
	#box{
	/* 자리도 차지하지 않고 내용을 감춘다. */
		display:none;
	}
	
	#box2{
		visibility:hidden;
	}
	
	#block>span{
		border:2px solid #5555ee;
		background-color: yellow;
	}
	
	#inline>span{
		border:2px solid #6666dd;
		background-color: yellow;
	}
	
	#inline-block>span{
		border:2px solid #0110ee;
		background-color: yellow;
	}
	#block>span{
		display: block;
		width:100px; height:100px;
	}
	#inline>span{
		display: #inline;
		width:100px; height:100px;
	}
	#inline-block>span{
		display: inline-block;
		width:100px; height:100px;
	}
</style>
</head>
<body>
	<h1>display</h1>
	<span>첫번째 줄</span>
	<div id ='box'>두번째 줄</div>
	<span>세번째 줄</span>
	
	<h1>visibility</h1>
	<span>첫번째 줄</span>
	<div id ='box2'>두번째 줄</div>
	<span>세번째 줄</span>
	
	<h1>display:block</h1>
		<div id='block'>
			<span>AAAA</span>
			<span>BBBB</span>
			<span>CCCC</span>
		</div>
	
	<h1>display:inline</h1>
		<div id='inline'>
			<span>AAAA</span>
			<span>BBBB</span>
			<span>CCCC</span>
		</div>
	
	<h1>display:inline-block</h1>
		<div id='inline-block'>
			<span>AAAA</span>
			<span>BBBB</span>
			<span>CCCC</span>
		</div>
</body>
</html>