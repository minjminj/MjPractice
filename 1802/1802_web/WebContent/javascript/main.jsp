<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script>
	function open_rtn() {
		win = window.open("win_chk.jsp", "win", "width=200,height=200")
	}
	function close_rtn() {
		window.win.close()
	}
</script>
</head>
<body>
	<form name="f1">
		<input text=text name="irum1" value="abc"> 
		<input type="button" value="open" onclick="open_rtn()"> 
		<input type="button" value="close" onclick="close_rtn()">
	</form>
</body>
</html>