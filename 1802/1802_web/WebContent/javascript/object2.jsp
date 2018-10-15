<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>object2</title>
<!-- 
[공통] 
1)입력받은 내용을 사용하여 하나의 객체에 저장한 후 저장된 객체는 배열을 사용하여 관리.

[추가]
1)취미나 수강희망과목은 반드시 하나이상을 선택
2)no는 반드시 1~1000사이의 번호이여야 함.
3)입력 내용은 하나의 객체에 저장한 후 배열에 저장

[검색]
1)검색에 필요한 화면을 갖는 새로운 창을 open
2)검색창에는 검색, 수정, 삭제 버튼을 추가하여 관련 내용을 처리(배열에 저장된 값을 수정, 삭제)

[출력]
배열에 저장된 값을 result 영역에 출력

1)전역으로 배열 data를 선언
2)추가, 검색, 출력 버튼에 click 이벤트 처리
3)검색 버튼 클릭시 새로운 창에 object2_find.jsp 페이지 로딩
 -->
<link href="https://fonts.googleapis.com/css?family=Gaegu" rel="stylesheet">
<link rel='stylesheet' type='text/css' href='../css/mycss.css'/>
<style>
.lbl {
	display: inline-block;
	width: 120px;
	text-align: right;
	border-right-width: 3px;
	border-right-color: #aaaaaa;
	border-right-style: solid;
	padding-right: 6px;
	margin-right: 6px;
}

#subject {
	margin-top: 5px;
}

#subject>.lbl {
	vertical-align: top;
}

#subject>select {
	width:180px; height:120px;
}

#btn{
	margin-left:150px;
}

#result{
	border:2px outset #ff1111;
	padding:15px;
	width:500px; height:400px;
	overflow:scroll;
	box-sizing:border-box;
	border-radius:18px;
}
table{
	width:100%;
}
th{
	background: #ff2222;
}
table,tr,td{
	border:1px solid #ffeeee;
	border-spacing:0px;
	border-padding:4px;
}
</style>
<!-- 이 예제에서는 리터럴객체을 사용하지않음(리터럴객체는 한번밖에 사용할수 없기 때문에) -->
<script>
	//화면으로 입력받은 값을 저장하기 위한 배열
	var data = [];	//data = new Array();
	var ff;
	var win;

	function $(id){	//onload 안에 있으면 안된다.
		
		return document.getElementById(id);
	
	}
	
	//한건의 데이터를 저장하기 위한 함수(객체, 클래스)
	//js는 생성자가 없다. function Data() 가 생성자 역할	
	function Data(no, color, skill, hobby, subject){	//class 를 선언한거라고 보면됨
		//() 안에 매개변수는 무조건 지역형
		//동적 생성
		this.no = no;
		this.color = color;
		this.skill = skill;
		this.hobby = hobby;
		this.subject = subject;
		
		/* 
		ex) d = new Data(...);
			data[0] = d;	로 하면
			d.toString(); 과 data.toString(); 이같다.
		*/
		
		/*
		함수 선언 형식 2가지
		1. function a() {...}	
			-실행 될때 메모리에 가장 먼저 로딩된다.
		2. v = function(){...}
			-실행 될때 메모리에 먼저 안올라 간다.
			
		한가지타입만 쓰자~	
		*/
			
		
		this.toString = function(){	
			var str = '<tr>'	/* 행 생성 */
					+ '<td>' + this.no + '</td>'
					+ '<td>' + this.color + '</td>'
					+ '<td>' + this.skill + '</td>'
					+ '<td>' + this.hobby + '</td>'
					+ '<td>' + this.subject + '</td>'
					+ '</tr>';
		return str;
		
			}
		
	}
	
	window.onload = function(){
		ff = document.frm;
		ff.btnInput.onclick = funcInput; //(콜백) 호출할때 매개변수나 소괄호를 기술하지않는다.
		
		ff.btnOutput.onclick = funcOutput;
		
		ff.btnSearch.onclick = function(ev){
			
			/* window.open(,,)의 가운데는 창의 이름을 칭하므로 작성시 큰 의미 X */
			win = window.open('object2_find.jsp','','width=600px, height=600px');	
			win.moveTo(ev.screenX+20, ev.screenY+20); /* 클릭위치 기준(마우스위치) */
		
		} 
		
	}
	
	function funcOutput(){	
		var str = '<table>'
				+'<tr>'
				+'<th>No</th><th>Color</th><th>Skill</th>'
				+'<th>Hobby</th><th>Subject</th>'
				+'</tr>';

		for(i=0; i<data.length; i++){
			str += data[i].toString();
		}
		str += '</table>';
		
		$('result').innerHTML = str;
	}
	
	function funcInput(){
		var no = ff.no.value;
		if(no <= 0 ){
			alert('0이하의 값을 입력하셨습니다.');
			return false;
			
		}else if(no > 1000){
			alert('1001이상의 값을 입력하셨습니다.');
			return false;
		}
		var color = ff.color.value;
		var skill = ff.skill.value;
		
		var subject = [];
		var hobby = [];
		
		//radio, checkbox, select 에서 선택된 값(TODO)
		//radio, checkbox, select 는 client 와 server 처리 방법이 다르다
		//client 는 모든항목 server 는 선택항목만 해당이된다
		
		for(i=0; i<ff.hobby.length; i++){
			if(ff.hobby[i].checked == true){
				hobby.push(ff.hobby[i].value);
			}
		}
		
		for(j=0;j<ff.subject.options.length;j++){
			if(ff.subject.options[j].selected == true){
				subject.push(ff.subject.options[j].value);
			}
		}
		
		//Data 객체 생성(객체명은 d)
		var d = new Data(no,color,skill,hobby,subject);	
	
		// 배열(data)에 객체(d)를 집어넣는다.
		data.push(d);	
		
	
	}


</script>
</head>
<body>
	<h3 id='title'>Object 객체를 사용하거나 function을 객체로 사용하는 경우</h3>
<form name='frm' method='post'>
	<label class='lbl'>No</label>
	<input type='number' name='no' min='1' max='1000'/>
	<p/>
	<label class='lbl'>좋아하는 색상</label>
	<input type='color' name='color'/><br/>
	<p/>
	<label class='lbl'>자바 스킬</label>
	<label><input type='radio' name='skill' checked value='상'>상</label>
	<label><input type='radio' name='skill' value='중'>중</label>
	<label><input type='radio' name='skill' value='하'>하</label>
	<br/>
	<p/>
	<label class='lbl'>취미</label>
	<label><input type='checkbox' name='hobby' value='축구'>축구</label>
	<label><input type='checkbox' name='hobby' value='야구'>야구</label>
	<label><input type='checkbox' name='hobby' value='농구'>농구</label>
	<label><input type='checkbox' name='hobby' value='배구'>배구</label>
	<label><input type='checkbox' name='hobby' value='탁구'>탁구</label>
	<br/>
	<p/>
	<div id='subject'>	<!-- label 과 select 를 div 안에 넣어놨다.  -->
	<label class='lbl'>수강 희망 과목</label>
	<select name='subject' multiple="multiple">
		<optgroup label = "Application">
			<option value = 'JAVA'>JAVA</option>
			<option value = 'Android'>Android</option>
			<option value = 'C++'>C++</option>
		</optgroup>
		
		<optgroup label = "Web">
			<option value = 'html'>html</option>
			<option value = 'css'>css</option>
			<option value = 'javascript'>javascript</option>
			<option value = 'jsp'>jsp</option>
			<option value = 'php'>php</option>
			<option value = 'asp'>asp</option>
		</optgroup>
		
		<optgroup label = "FrameWork">
			<option value = 'jQuery'>jQuery</option>
			<option value = 'aJax'>aJax</option>
			<option value = 'mybatis'>mybatis</option>
			<option value = 'spring'>spring</option>
		</optgroup>
	</select>
	</div>
	<p/>
	
<div id = 'btn'>
	<input type='button' value='추가' name='btnInput'/>
	<input type='button' value='검색' name='btnSearch'/>
	<input type='button' value='출력' name='btnOutput'/>
</div>
<p/>

<div id = 'result'>
</div>

</form>
</body>
</html>