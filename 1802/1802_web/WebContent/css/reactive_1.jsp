<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>reactive_1</title>
<style>
	@media screen and (max-width:600px){
		html{
			background-color:red;
			color:#ffff66;
		}	
	}
	
	@media screen and (min-width:601px) and (max-width:800px){
		html{
			background-color:green;
			color:#ff4444;
		}	
	}
	
	@media screen and (min-width:801px){
		html{
			background-color:blue;
			color:#f88888;
		}	
	}
</style>
</head>
<body>
<h1>reactive_1(반응형 웹)</h1>
<ul>
	<li>0~600 까지 바탱색을 red</li>
	<li>601~800까지는 바탕색을 green</li>
	<li>801~바탕색을 blue</li>
</ul>
</body>
</html>