<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>date_test</title>
<style>
	#div{
		font-size:20px;
		font-weight:bold;
		border:2px;
		solid:#aaaaaa;
		background-color:#ffeeee;
		width:440px;
		height:50px;
		text-align:center;
		padding-top:20px;
	}
</style>
<script>
	var btn,div1;
	var week = ['일','월','화','수','목','금','토','일'];
	
	window.onload = function(){
		document.getElementById('btn').onclick = createDate;
		div1 =document.getElementById('div1');
		setInterval(createDate, 1000);
	}
	
	function createDate(){
		var now = new Date();
		var str = '';
		
		str = now.getFullYear() + '년';
		str += (now.getMonth()+1) + '월';
		str += now.getDate() + '일';
		str += week[now.getDay()] + '/';
		str += now.getHours() + '시';
		str += now.getMinutes() + '분';
		str += now.getSeconds() + '초';
		
		div1.innerHTML = str;
	}
</script>
</head>
<body>
	<input type='button' id='btn' value='날짜'>
	<p />
	<div id='div1'></div>
</body>
</html>