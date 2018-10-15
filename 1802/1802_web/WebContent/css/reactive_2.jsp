<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style>
/* 초기화 */
*{margin:0;padding:0;}
body{font-family:'Times New Roman',serif;}
a{text-decoration:none;}
img{border:0;}
</style>

<!-- 헤더  -->
<style>
#header {
	width : 1000px;
	height : 160px;
	margin:10px auto;
	background-image:url('../img/HM.jpg');
	border:2px solid #3332ff;
}
</style>
<!-- wrap -->
<style>  
/* 1단  */
@media screen and (max-width:600px){
	#header{
		width:600px;
		height:400px;
					background-image:url('../img/HM.jpg');
		
	}
	#left{
		width:600px;
		height:200px;
					background-image:url('../img/HM.jpg');
		
	}
	#content{
		width:600px;
		height:1000px;
			background-image:url('../img/HM.jpg');
	}
	#aside{
		width:600px;
		height:200px;
					background-image:url('../img/HM.jpg');
		
	}
	#footer{
		width:600px;
		height:2000px;
					background-image:url('../img/HM.jpg');
		
	}
	}
/* 2단 */
@media screen and (min-width:601px) and (max-width:999px){
	body{
		width:600px;
	}
	#header{
		width:600px;
		height:200px;
	}
	#left{
		width:300px;
		height:200px;
	}
	#content{
		width:300px;
		height:200px;
		background-image:url('../img/HM.jpg');
	}
	#aside{
		width:600px;
		height:200px;
	}
	#footer{
		width:600px;
		height:200px;
	}
	}
/* 3단 */	
@media screen and (min-width:1000px){
	body{
		width:1000px;
		height:400px;
	}
	#header{
		width:1000px;
		height:200px;
	}
	#left{
		width:200px;
		height:200px;
	}
			background-image:url('../img/HM.jpg');
	#content{
		width:600px;
		height:200px;
	}
	#aside{
		width:200px;
		height:200px;
	}
	#footer{
		width:1000px;
		height:200px;
		}
		}
#wrap {
	width:1020px;
	height:500px;
	margin:10px auto;
	overflow: hidden;
	
}
/* left */
#wrap>#left {
	float: left;
	border:2px solid #3332ff;
	margin:10px auto;
	background-color:green;
}
/*content  */
#wrap>#content {
	margin:10px auto;
	float: left;
	border:2px solid #3332ff;
	
}
/* aside */
#wrap>#aside {
	float: left;
	border:2px solid #3332ff;
	margin:10px auto;
	background-color:green;
}
</style>

<!-- footer -->
<style>
#footer {

	text-align: center;
	margin:10px auto;
	border:2px solid #3332ff;
	
}
</style>
</head>
<body>
	<div id='header'>
		<h1>180218021802</h1>
	</div>
	
	<div id='wrap'>
		<div id='left'>
			<h3>left</h3>
		</div>
		<div id='content'>
			<h1>반응형 웹(reactive_2)</h1>
		</div>
		<div id='aside'>
			<h3>aside</h3>
		</div>
	</div>
	
	<div id='footer'>
		<h3>경기도 의정부시 가능동</h3>
	</div>
</body>
</html>