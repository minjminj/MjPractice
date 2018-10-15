<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>event_album</title>
<style>
	#img>img{
		border:3px solid #ffffff;
	}
	#img>img:hover{
		border:1px solid #888888;
	}
</style>
<script>
	/*  img1 ~ img7까지 for문을 사용한 이벤트핸들러 (onmouseover) 추가  */
	window.onload = function() {
		var f = "img";
		for (i = 1; i < 8; i++) {
			document.getElementById(f + i).onmouseover = mover;
		}
	}
	function mover(event) {		/* 여기서 event 는 매개변수 (아무거나 사용해도 상관 x)/보기좋게 event 사용한것 */
		var m = document.getElementById("main");
		m.src = event.srcElement.src;
	}
</script>
</head>
<body>
	<h2>ALBUM</h2>
	<img src = '../img/gg.png' width = '400px' height ='350px' id = 'main'/>	<!-- default 값 -->
	<div id = 'img'>	<!-- 썸네일이 없기 때문에 기존이미지 사용(원래는 썸네일을 따로 만들어야함)  --> 
		<img src = '../img/aa.jpg' width = '50px' height ='40px' id = 'img1'/>
		<img src = '../img/bb.jpg' width = '50px' height ='40px' id = 'img2'/>
		<img src = '../img/cc.jpg' width = '50px' height ='40px' id = 'img3'/>
		<img src = '../img/dd.jpg' width = '50px' height ='40px' id = 'img4'/>
		<img src = '../img/ee.jpg' width = '50px' height ='40px' id = 'img5'/>
		<img src = '../img/gg.png' width = '50px' height ='40px' id = 'img6'/>
		<img src = '../img/HM.jpg' width = '50px' height ='40px' id = 'img7'/>
	</div>
</body>
</html>