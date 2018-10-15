<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<!-- 
text : 아이디, 성명, 매출액
radio : 구분(회원, 비회원)
checkbox : 취미(축구, 농구, 배구, 야구, 등산, 독서, 여행)
radio : 등급(A,B,C,D)
화면에 입력받아 그결과를 textarea에 출력
단, 등급은 매출액이
10000 이상이면 A
5000 이상이면 B
1000 이상이면 C, 그 외 에는 D를 자동 표시.
 -->
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script>
	window.onload = function() {
		var ff = document.frm;
		checkGrade(ff);
		/* amount(매출액)가 변경 될 때 마다 등급을 자동설정 (keyup) */
		ff.amount.onkeyup = function() {
			checkGrade(ff);
		}
	}
	function checkGrade(ff) {
		//매출액에 따른 라디오 버튼 처리
		amt = Number(ff.amount.value);

		if (amt >= 10000) {
			ff.grade[0].checked = true;
		} else if (amt >= 5000) {
			ff.grade[1].checked = true;
		} else if (amt >= 1000) {
			ff.grade[2].checked = true;
		} else {
			ff.grade[3].checked = true;
		}
	}
</script>
</head>
<body>

</body>
</html>