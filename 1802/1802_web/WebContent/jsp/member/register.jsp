<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
	
<script>
	
	
	function check(){
		
		var ff = document.frm_member;
		
		var regId = /[^a-z]/g;
		new RegExp("\\w","g");
		var regName = /[^]/;
		var regPw;
		var regEmail;
			
		ff.id.style.backgroundColor = "#ffffff";
		ff.name.style.backgroundColor = "#ffffff";
		ff.pw.style.backgroundColor = "#ffffff";
		ff.email.style.backgroundColor = "#ffffff";
	
		/* ff.msgId.value ='';
		ff.msgName.value ='';
		ff.msgPw.value ='';
		ff.msgEmail.value ='';
		  */
		ff.btnRegister.onclick = function() {
			
			if(regId.test(ff.id.value) || ff.id.value.trim == ''){
				ff.id.focus();
				ff.id.style.backgroundColor = "#ffeeee";
				
				ff.msgId.value = ('아이디 좀...');
			}else if(ff.name.value == '' ){
				ff.name.focus();
				ff.name.style.backgroundColor = "#ffeeee";
				ff.msgName.value = ("성명을...");
			}else if(ff.pw.value == ''){
				ff.pw.focus();
				ff.pw.style.backgroundColor = "#ffeeee";
				ff.msgPwd.value = ("암호를...");
			}else if(ff.email.value == ''){
				ff.email.focus();
				ff.email.style.backgroundColor = "#ffeeee";
				ff.msgEmail.value = ("이메일을...");
			}else{
				ff.action = 'index.jsp?nav=./jsp/member/member_control.jsp&sec=./jsp/member/register_result.jsp';
				ff.submit();
			
			}
		}
	}
</script>
<body>
<div id='member_register' class='rotateInDownLeft'>
		<h3 id='title'>회원가입</h3>
		<form name="frm_member" method="post">
		
		<label>아이디</label>
		<input type="text" name="id" size="10" id="id"/>
		<input type="button" value="가 입" name="btnRegister"/>
		<p/>
		<label>이름</label>
		<input type="text" name="name" size="10" id="name"/><br/>
		<p/>
		<label>비번</label>
		<input type="text" name="pw" size="10" id="pw"/><br/>
		<p/>
		<label>이메일</label>
		<input type="text" name="email" size="10" id="email" /><br/>
		<p/>
		<label>폰 번호</label>
		<input type='text' name='phone' size='15' id='phone'/><br/>
		<p/>
		<label>post</label>
		<input type='text' name='post' size='15' id='post'/><br/>
		<p/>
		<label>우편번호</label>
		<input type='text' name='address' size='15' id='address'/>
		
	
</form>
</div>
<script>
	check()
</script>
<script>
	
</script>
</body>
</html>