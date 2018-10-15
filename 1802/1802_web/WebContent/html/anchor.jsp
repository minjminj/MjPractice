<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>anchor</title>
</head>
<body>
	<!-- 1)외부 사이트 연결 -->
<p>
	<a href = 'http://www.naver.com'>네이버</a><br/>
	<a href = 'http://www.jobtc.kr'>우리카페</a><br/>
	<a href = 'http://www.daum.net'>다음</a><br/>
	<a href = 'http://www.nate.com'>네이트</a>
</p>
	<!-- 2)서버 내부의 파일링크 -->
<p>
	<a href = 'paragraph.jsp'>문단 태그</a></br>
	<a href = '../test.html'>html 테스트</a></br>
	<a href = '../test.jsp'> jsp 테스트</a>
</p>
	<!-- 3)특정파일에서 특정위치(장소)로 이동 -->
<p>
	<!-- # 은 name나 id 태그로 작성한다. -->
	<a href = 'paragraph.jsp#메모'>메모로 이동</a>
</p>
</body>
</html>