<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>form_checkbox1</title>
<script>
function mclick(f){	/* function은 그저 호출만 하는역할 */
	l = f.chk.length
	f.re.value = ''
	for(i=0;i<l;i++){
		if(f.chk[i].checked){
			f.re.value = f.re.value + f.chk[i].value + '\n'
		}
	}
}
</script>
</head>
<body>
	<form name='ff' method='post'>
		<table border=0>
			<th>마음에 드는 연예인을 고르시오</th>
			<tr>
				<td><textarea name=re row=5 cols=30></textarea></td>
			</tr>
			<tr>
				<td><label><input type='checkbox' name=chk value='티아라'>티아라</label>
					<label><input type='checkbox' name=chk value='고두심'>고두심</label>
					<label><input type='checkbox' name=chk value='선우용녀'>선우용녀</label>
					<label><input type='checkbox' name=chk value='이순재'>이순재</label>
					<label><input type='checkbox' name=chk value='김수미'>김수미</label><br>
					<label><input type='checkbox' name=chk value='오지명'>오지명</label>
					<label><input type='checkbox' name=chk value='김미화'>김미화</label>
					<label><input type='checkbox' name=chk value='이영자'>이영자</label><br>
					<label><input type= button name=bu value='선택' onclick='mclick(this.form)'></label>
					<input type = reset value='취 소'>
				</td>
			</tr>
		</table>
	</form>
</body>
</html>