<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style>
	#css>span{
	display: inline-block;
	text-align:center;
	box-sizing:border-box;
	cursor:pointer;
	float:left;
	border-right-width:0px;
	border:2px solid #0000ff;
	padding:20px;
	margin:-5px;
	width:100px;
	box-shadow:25px 25px 25px red;
	
	}
	span.last{
		border-radius:0px 100px 100px 0px;
	}
	span.first{
		border-radius:100px 0px 0px 100px;
	}
	span#a,#c,#e,#g{
		background-color:yellow;
	}
	span#b,#d,#f{
		background-color:green;
	}
	span:hover {
		background-color:red;
	}
</style>
</head>
<body>
<!-- 
1)하나의 div영역안에 span태그를 7개를 좌우로 나열 
2)span태그의 넒이는 일정하게
3)마우스가 올라가면 바탕색을 변경
4)각각의 span태그에는 그림자를 추가(box-shadow:x축,y축,퍼짐크기,색)
5)첫번째 span에는 좌측 모서리를 라운딩
6)마지막 span에는 우측 모서리를 라운딩
7)span태그의 홀수번째와 짝수번째의 바탕색을 서로 다른색으로
-->
<div id='css'>
	<span class='first' id='a'>a</span>
	<span id='b'>b</span>
	<span id='c'>c</span>
	<span id='d'>d</span>
	<span id='e'>e</span>
	<span id='f'>f</span>
	<span class='last' id='g'>g</span>
</div>
</body>
</html>