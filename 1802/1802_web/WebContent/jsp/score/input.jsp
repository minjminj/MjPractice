<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<link rel='stylesheet' type='text/css' href='./jsp/score/input_style.css'/>

<body>
	<script>

	function check(){
		
		var ff = document.frm_score;
		
		//체크 데이터의 정규식
		var regId = /[^a-z]/g;
		new RegExp("\\w","g");
		var regSubject = /[^ㄱ-ㅎ|ㅏ-ㅣ|가-힣]+$/g;
		var regScore = /[^0-9]/g;
		//var regDate = /[^a-z0-9A-Z]@[A-Z].[a-z]/g;
			
		 ff.date.value = new Date().toISOString().substring(0,10);
		
		ff.btnRegister.onclick = function() {
			
			ff.id.style.backgroundColor = "#ffffff";
			ff.subject.style.backgroundColor = "#ffffff";
			ff.score.style.backgroundColor = "#ffffff";
			ff.date.style.backgroundColor = "#ffffff";
				
			//이전 표시된 오류 메세지를 초기화
			ff.msgId.value ='';
			ff.msgSubject.value ='';
			ff.msgDate.value ='';
			ff.msgScore.value ='';
			
			if(ff.id.value.trim()==''|| regId.test(ff.id.value)){
				ff.msgId.value = ('아이디 좀...');
				ff.id.focus();
				ff.id.style.backgroundColor = "#ffeeee";
			}else if(ff.subject.value.trim()==' '|| regSubject.test(ff.subject.value)){
				ff.msgSubject.value = ("과목 좀...");
				ff.subject.focus();
				ff.subject.style.backgroundColor = "#ffeeee";
			}else if(ff.score.value.trim()==''|| regScore.test(ff.score.value)){
				ff.msgScore.value = ("점수 좀...");
				ff.score.focus();
				ff.score.style.backgroundColor = "#ffeeee";
			}else if(ff.date.value.trim()==''){
				ff.msgNal.value = ("날짜 좀..");
				ff.date.focus();
				ff.date.style.backgroundColor = "#ffeeee";
			}else{
				/* ff.action = 'index.jsp?nav=./jsp/score/score_control.jsp&sec=./jsp/score/input_result.jsp'; */
				ff.action = "?nav=./jsp/score/score_control.jsp&sec=./jsp/score/input_result.jsp";
				ff.submit();
			}
		}
	}
</script>
<script>
$('.fun-btn').on('click', function(event) {
	  $(this).toggleClass('start-fun');
	  var $page = $('.page');
	  $page.toggleClass('color-bg-start')
	    .toggleClass('bg-animate-color');

	  //change text when when button is clicked

	  $(this).hasClass('start-fun') ?
	    $(this).text('stop the fun') :
	    $(this).text('start the fun');

	});
</script>
<body>
<div id="score_input" align='center'><br/>
<form name="frm_score" method="post">
	
		
		<label>아이디</label>&nbsp&nbsp
		<input type="text" name="id" size="15" id="id" placeholder='아이디 입력해'/>
		<output name="msgId"></output><br/><br/>
		
		<label>과 목</label>&nbsp&nbsp
		<input type="text" name="subject" size="15" id="subject" placeholder='과목 입력해'/><br/>
		<output name="msgSubject"></output><br/>
	
		<label>점 수</label>&nbsp&nbsp
		<input type="text" name="score" size="15" id="score" placeholder='점수 입력해'/><br/>
		<output name="msgScore"></output><br/>
		
		<label>날 짜</label>&nbsp&nbsp
		<input type="text" name="date" size="15" id="date"/><br/>
		<output name="msgDate"></output><br/>
		
		<input class="button" value="조 회" name="btnRegister" ></input><br/>
	
</form>
</div>
<script>
	check()
</script>
</body>
</html>