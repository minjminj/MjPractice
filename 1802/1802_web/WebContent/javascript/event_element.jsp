<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>event_element</title>
<!-- 4개의 div에 event를 씌어보자 -->
<style>
div {
	border: 1px outset #aaaaaa;
	width: 300px;
	height: 250px;
	display: inline-block;
}
span{
	border: 1px solid #aaaaaa;
	display: inline-block;
	width: 600px; height: 100px;
	background: #eeeeee;
}
</style>
<script>
	window.onload = function(){
		var d1 = document.getElementById("div1");
		var d2 = document.getElementById("div2");
		var d3 = document.getElementById("div3");
		var d4 = document.getElementById("div4");
		
		d1.onclick = chk;
		d2.onclick = chk;
		d3.onclick = chk;
		d4.onclick = chk;
		
		d4.onmousemove = chk;
	}
	/* 매개변수 event에는 이벤트와 관련된 모든 정보가 대입 됨 */
	/* 이벤트가 사전에 정해되어져있고 실행되는 타입(콜백 타입) */
	function chk(event){
		var info = document.getElementById("info");
		var ele = event.srcElement.id;
		var x = event.x;
		var y = event.y;
		var cx = event.clientX;
		var cy = event.clientY;
		
		info.innerHTML = "<li> ID : " + ele + "<li> X : " + x + "<li> Y : " + y 
						+ "<li> CX : " + cx + "<li> CY : "+ cy;
	}
	
</script>
</head>
<body>
	<div id='div1'></div>
	<div id='div2'></div>
	<div id='div3'></div>
	<div id='div4'></div>	<!-- 마우스가 이동됬을 때 좌표 이동-->
<p/>
	<span id='info'></span>
</body>
</html>