<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>form_radio2</title>
<style>
#te {
	border-radius: 20px 20px 20px 20px;
}

#p {
	border: 0 solid;
	border-bottom-width: 1px;
}
</style>
<script>
	window.onload = function() {
		frm.btn.onclick = zxc;
	}
	function zxc() {
		ff = document.frm;
		var sd = '';
		k = ff.aa.length;
		for (i = 0; i < k; i++) {
			if (ff.aa[i].checked) {
				sd = ff.aa[i].value;
			}
		}
		ff.te.value = "아이디 : " + ff.id.value + "\n이름 : " + ff.fn.value
				+ "\n주소 : " + ff.po.value + "\n성별 : " + sd;
	}
</script>
</head>
<body>
	<h3>아이디 성명 주소를 text상자로 성별은 radio로 입력받아 출력</h3>
	<form name='frm' method='post'>
		<textarea name='te' rows='5' cols='40' id='te'></textarea>
		<br /> <label>ID : </label><input type='text' name='id' id='p'><br />
		<label>성명 : </label><input type='text' name='fn' id='p'><br />
		<label>주소 : </label><input type='text' name='po' id='p'><br />
		<label><input type='hidden' name='aa' value='선택안됨' checked></label><br />
		<label><input type='radio' name='aa' value='남자'>남자</label><br />
		<label><input type='radio' name='aa' value='여자'>여자</label><br />
		<input type='button' name='btn' value='버튼'>
	</form>
</body>
</html>