<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>register</title>
<script>
	function open_rtn(){
		win = window.open("zip_find.jsp","win","width = 1000,height = 800")
	}	
	function close_rtn(){
		window.win.close()
	}

</script>
</head>
<body>
	<h3>레 지 스 터</h3>
	<form name="f1" method ='post'>
		<input text= text name="irum1" id ="irum1" size = 10 readonly = "readonly"> - 
		<input text= text name="irum2" id ="irum2" size = 10 readonly = "readonly">
		<input type= "button" value="우 편 번 호" onclick="open_rtn()"><br><br>
		<textarea cols = 50px rows = 10px name="irum2" id ="irum2"> </textarea><br><br>
		<input type="button" value="닫 기" onclick="close_rtn()"><br>
	</form>
</body>
</html>