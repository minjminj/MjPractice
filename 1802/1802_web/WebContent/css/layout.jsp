<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>layout</title>
<style>
	body{
		width:960px;
		margin:0 auto;
	}
	#wrap{
		overflow:hidden;
	}
	#wrap>div{
		float:left;
	}

	#aside{
		width:200px;
	}
	#content{
		width:700px;
	}
	
</style>
</head>
<body>
<div id='header'>
	<h1>Header</h1>
</div>
<div id='nav'>
	<h1>Navigation</h1>
</div>
<div id='wrap'>
	<div id='aside'>
		<h2>Aside</h2>
		<p>
		무수히 많은 내용들<br/>
		무수히 많은 내용들<br/>
		무수히 많은 내용들<br/>
		</p>
	</div>
	
	<div id='content'>
		<h2>Content</h2>
		<p>
		무수히 많은 내용들<br/>
		무수히 많은 내용들<br/>
		무수히 많은 내용들<br/>
		</p>
	</div>
	
	<div id='footer'>
		<h2>Footer</h2>
	</div>
</div>

</body>
</html>