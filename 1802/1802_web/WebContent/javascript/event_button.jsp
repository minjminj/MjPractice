<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>event_button</title>
<!-- 특별한 이유가 없는한 script는 head 사이에 기술 -->
<script>
window.onload = function(){
	var btn = document.frm1.btnSend;	/* 읽혀 지기 전에는 null값이다. */
	btn.onclick = function(){
		/* if(document.frm1.mid.value == ''){
			alert('아이디 입력하시오.........')
		}else{
			document.frm1.submit();//submit 버튼 역할
		} */
		if(chkData(document.frm1)){
			document.frm1.submit();
		}else{
			alert('아이디를 입력하시오 chkData호출 버전');
		}
	}
}

/* ff로 받는다. */
function chkData(ff){
	var mid = ff.mid.value;
	if(mid == ''){
		return false;	//submit 기능을 취소 시켜라
	}else{
		return true;
	}
}
</script>
</head>
<body>
	<!-- 의존성이 약하게 결합하도록 하자.(연관성을 최소화 시키도록 하자.) -->
	<h3>event_button</h3>
	<form name='frm1' method='post'onsubmit='return chkData(this)' action='event_button_result.jsp'>
		<!-- method = 'get'인경우에는 내용들이 보임 -->
		<!-- onsubmit은 submit 했을경우  -->
		<!-- action은 submit이 실행 되면 action 안에 있는것이 실행되는것 -->
		<label>아이디</label> 
		<input type='text' name='mid' size='20' value='choi' />
		<!-- value 값이 있으면 action 실행 / 값이 없다면 submit 기능을 중지 하도록 실행 -->
		<br> 
		<input type='submit' value='전송' />
		<input type='button' value='전송2' name='btnSend'/>
	</form>
</body>
</html>