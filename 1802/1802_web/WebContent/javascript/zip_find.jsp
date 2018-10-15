<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script>
	function mclick(f) {

		var a = document.f2;
		var a = a.sel.options[document.f2.sel.options.selectedIndex].text;
		var b = a.substr(0,a.sel.indexOf('-'));
		
		/* window.opener.document.f1.irum1.value = document.f2.sel.value; */
		
/* 		window.opener.document.f1.irum1.value = document.f2.sel.options[document.f2.sel.options.selectedIndex].text;
		
		var s1 = document.f2.sel.options[document.f2.sel.options.selectedIndex].text.substr(0,3);
		window.opener.document.f1.irum1.value = s1;
		
		self.close(); */
	}
	function load_rtn() {
		document.f2.irum2.value = window.opener.document.f1.irum1.value;
	}
	
</script>
</head>
<body onload = "load_rtn()">
	<b><h3>우 편 번 호</h3></b>
	<p>
	<form name="f2">
		<select onChange="change(this.form)" name="sel" size = "3">
			<option value="111-222/경기도 의정부시 호원동/111-222">111-222/경기도 의정부시 호원동
			<option value="222-33/3경기도 의정부시 가능동/222-333">222-333/경기도 의정부시 가능동
			<option value="444_555경기도 의정부시 의정부동/444_555">333-444/경기도 의정부시 의정부동
			<option value="666-777경기도 의정부시 금오동/666-777">777-555/경기도 의정부시 금오동
			<option value="888-999경기도 의정부시 민락동/888-999">555-666/경기도 의정부시 민락동
		</select> 
		<input type="button" value="GOOD" onClick="mclick(this.form,'확 인')">
	</form>
</body>
</html>