<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<!-- export - general - ArchiveFile // 파일 압축해 내보내기 -->
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>declare1</title>

<!-- function 실행 -->
<!-- 보안성 O -->
<script src='declare1.js'></script>

</head>
<body>
	<!-- script 태그를 사용한 자바스크립트 선언 -->
	<!-- 보안성 X -->
	<h1>script 태그를 사용한 자바스크립트 선언</h1>
	<script>
		alert('안녕 자바스크립트!!!');
	</script>
	
	<!-- 태그에 자바스크립트를 선언 -->
	<!-- onclik = 클릭했을시 클릭한 내용을 실행해라. -->
	<!-- 보안성 X -->
	<h1>태그에 자바스크립트를 선언</h1>
	<label onclick='alert("label에서 클릭함...")'>이곳을 마우스로 클릭해 보세요!!@#!@#</label>
	<p/>
	
	<!-- 네이버로 이동해주는 버튼 생성(onclick을 이용하여서 생성) -->
	<!-- 보안성 X -->
	<input type='button' value='CLICK' onclick='location.href="http://www.naver.com"'></input>
	
	<!-- 외부파일에 자바스크립트를 선언한후 script 태그로 사용하기 -->
	<!-- 소괄호가 붙어있으면 무조건 메소드 그러나 자바스크립트에서는 함수라고 부른다. -->
	<!-- chrome 에서 F12 에서 개발자모드를 쓸수있다.(간단한 에러 확인 가능) -->
	<!-- New - Other - Javascript Source File  //	js생성 -->
	<!-- 자바스크립트에서는 모든객체나 함수는 function으로 선언(자바에서는 모든객체를 class로 선언) -->
	<h1>외부파일에 자바스크립트를 선언한후 script 태그로 사용하기</h1>
	<input type='button' value='RED' onclick='funcRed()'/>
	<input type='button' value='Green' onclick='funcGreen()'/>
	<input type='button' value='Blue' onclick='funcBlue()'/>
	
</body>
</html>