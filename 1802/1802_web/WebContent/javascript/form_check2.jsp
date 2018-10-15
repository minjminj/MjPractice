<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<!-- 
text : 아이디
checkbox : 취미(축구, 농구, 배구, 야구, 등산, 독서, 여행)
select : 과목(java, jsp, html,css, js, ajax, mybatis, jquery, spring, android) 다중 선택
화면으로 입력받아 그결과를 textarea에 출력
 -->
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script>
window.onload = function(){
	frm.bu.onclick = zxc;

}
function mclick(f){

	l = f.chk.length
	f.re.value =''
	for(i=0;i<l;i++){
		if(f.chk[i].checked){
			f.re.value = f.te.value +f.chk[i].value +'\n'
		}
	}
	
	zxc = ''
	
}


</script>
</head>
<body>
<form name='frm' method = 'post'>
	<textarea name='re' rows='5' cols='40' id='te'></textarea><br>
	<label>아이디</label>
	<input type='text' name ='id' id = 'id'><br>
	<label>취미</label>
	<label><input type='checkbox' name ='chk' value='축구'>축구</label>
	<label><input type='checkbox' name ='chk' value='농구'>농구</label>
	<label><input type='checkbox' name ='chk' value='배구'>배구</label>
	<label><input type='checkbox' name ='chk' value='야구'>야구</label>
	<label><input type='checkbox' name ='chk' value='등산'>등산</label>
	<label><input type='checkbox' name ='chk' value='독서'>독서</label>
	<label><input type='checkbox' name ='chk' value='여행'>여행</label><br>
	<label>과목</label>
	<select name="sel" onChange="change(this.form)">
			<option value="jsp">jsp
			<option value="java">java
			<option value="html">html
			<option value="css">css
			<option value="ajax">ajax
			<option value="mybatis">mybatis
			<option value="jquery">jquery
			<option value="spring">spring
			<option value="android">android
		</select> 
	<label><input type=button name=bu value='선택' onclick='mclick(this.form)'></label>
	
</form>
</body>
</html>