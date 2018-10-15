<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script>
	function ok_rtn(f) {
		window.opener.document.f1.irum1.value = document.f2.irum2.value
		self.close()
	}

	function load_rtn() {
		document.f2.irum2.value = window.opener.document.f1.irum1.value
	}
</script>
</head>
<body onload="load_rtn()">
	<form name="f2">
		<input text=text name="irum2" value="abc"> 
		<input type="button" value="o k" onclick="ok_rtn(this.form)">
	</form>
</body>
</html>