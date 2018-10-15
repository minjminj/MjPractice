<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>form_text</title>
<!-- 원래는 view와 controll 의 분리를 위해서는 javascript를 같이쓰면 안된다.(MVC를 분리하자) -->
<script>
/* 페이지가(body)로드되면 */
 window.onload = function(){
	/* 버튼이 클릭되었을때 */
	/* 이벤트가 사전에 정해되어져있고 실행되는 타입(콜백 타입) */
	/* function() 안에 function()을 기술하는 방식이 싫다면 function의 이름을 쓰면 된다. */
	document.frm.btn.onclick = copyFunc;
}
function copyFunc(){
	var ff = document.frm;
	/* ori(name)의 값(value)을 copy(name)의 값(value)에 집어넣어라 */
	ff.copy.value = ff.ori.value;
}
</script>
</head>
<body>
<!-- <body onload = 'copyFunc()'> 와 같이 쓸수 있지만 이렇게 안쓰는 것이 좋다. -->
<h1>text 입력한 제어</h1>	<!-- 교재와는 조금 변경된 예제 -->
<form name = 'frm' method = 'post'>
	<label>원 본 : </label>
	<input type = 'text' name = 'ori' value ='choi'><br/>
	<label>사본 : </label>
	<input type = 'text' name = 'copy' value = ''/>
	<p/>
	<input type='button' value = 'COPY' name ='btn' />
</form>
</body>
</html>