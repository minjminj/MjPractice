<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>object2_find</title>
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
	width:250px; height:250px;
}

#btn{
	margin-left:150px;
}

</style>
<script>
	var ff;	
	var data;
	
	window.onload = function(){
		data = opener.data; //메인창에 있는 데이터 배열
		ff = document.frm;
		
		ff.btnFind.onclick = funcFind;
		ff.btnModify.onclick = funcModify;
		ff.btnDelete.onclick = funcDelete;
		
		ff.btnClose.onclick = function(){
			self.close();
		}
	} 
	 
	
	
	function funcFind() {
		var no = ff.no.value;
		
		//초기화
		//for문을 쓰는 이유는 배열이기 때문에
		
	for (i = 0; i < ff.hobby.length; i++) {
			ff.hobby[i].checked = false;
		}
	for (i = 0; i < ff.subject.length; i++) {
			ff.subject[i].selected = false;
		}	
		
	//검색
				for (i = 0; i < data.length; i++) {
					if (data[i].no == no) {
						
						
				//color
						ff.color.value = data[i].color;
				
				//radio
				for (j = 0; j < ff.skill.length; j++) {
					if (ff.skill[j].value == data[i].skill) {
						ff.skill[j].checked = true;
					}
				}

				//checkbox
				for (j = 0; j < ff.hobby.length; j++) {
					for (k = 0; k < data[i].hobby.length; k++) {
						if (ff.hobby[j].value == data[i].hobby[k]) {
							ff.hobby[j].checked = true;
						}
					}
				}

				//select
				for (j = 0; j < ff.subject.length; j++) {
					for (k = 0; k < data[i].subject.length; k++) {
						if (ff.subject[j].value == data[i].subject[k]) {
							ff.subject[j].selected = true;
							}
						}
					}
				}
			}
		}
	//수정
	
	
	function funcModify() {
		var no = ff.no.value;
		var k = ff.hobby.length;
		
		
		for (i = 0; i < data.length; i++) {
				
			if (data[i].no == no) {
					//color
					data[i].color = ff.color.value;
					//skill
					data[i].skill = ff.skill.value;
					//hobby
					data[i].hobby.splice(0)
					for (j = 0; j < ff.hobby.length; j++) {
						if (ff.hobby[j].checked){
							data[i].hobby.push(ff.hobby[j].value);  							
						}
					}
					
					//subject
					data[i].subject.splice(0)
					for (j = 0; j < ff.subject.options.length; j++) {
						if (ff.subject[j].selected){
							data[i].subject.push(ff.subject.options[j].value);  							
						}
					}
					
				}		
			}
		}
	
	//삭제
	function funcDelete() {
	
	var no = ff.no.value;

	for (i = 0; i < data.length; i++) {
		if (data[i].no == no) {
			data.splice(i,1);
			break;
			}
		}

	}
</script>
</head>
<body>
	<h3 id='title'>Object 객체를 사용하거나 function을 객체로 사용하는 경우</h3>
<form name='frm' method='post'>
	<label class='lbl'>No</label>
	<input type='number' name='no' min='1' max='1000'/>
	
	<input type='button' value='검색' name='btnFind'/>	<!-- 검색버튼 -->
	
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
			<option value = 'html'>JAVA</option>
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
	<input type='button' value='수정' name='btnModify'/>
	<input type='button' value='삭제' name='btnDelete'/>
	<input type='button' value='닫기' name='btnClose'/>
</div>

</form>
</body>
</html>