<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>SelectBox</title>
<script>
function mclick(f,n){
	f.tt.style.backgroundColor = n
}
function change(f){
	f.tt.style.backgroundColor = f.sel.options[f.sel.options.selectedIndex].value
}
</script>
</head>
<body>
	<b><h3>Select를 이용하여 바탕 색상 바꾸기</h3></b>
	<p>
	<form name="ff">
		<input type=text name=tt> 
		<select name="sel" onChange="change(this.form)">
			<option value="#000000">검은색
			<option value="#006600">녹색
			<option value="#00FF00">연두색
			<option value="#FF0000">빨간색
			<option value="#FFFFFF">흰색
		</select> 
		<input type="button" value="white" onClick="mclick(this.form,'white')">
	</form>
</body>
</html>