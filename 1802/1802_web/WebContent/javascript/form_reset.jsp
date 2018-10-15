<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>form_reset</title>
<style>
input {
	font-size: 40;
}
</style>
<script>
	function fun(ff) {
		if (ff.irum.value == "")
			return true;
		else
			return false;
	}
</script>
</head>
<body>
		Name <input type="text" name="irum" value=""><br> 
		Address<input type="text" name="addre" value=""><br> 
		<input type=reset value="다시">
	</form>
</body>
</html>