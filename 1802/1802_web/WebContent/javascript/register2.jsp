<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>register</title>
<script>
window.onload = function(){
    var ff = document.frm;
    var win;
    ff.btn.onclick = function(ev){
        win = window.open('zip_find2.jsp', '', 'width=320px, height=320px');
        win.moveTo(ev.screenX+20, ev.screenY+20);
    }
}
 
</script>
</head>
<body>
<h3>window.open()을 사용한 창 열기와 값 전달</h3>
<form name='frm' method='post'>
    <input type='text' size='3' name='z1' readonly="readonly"/>-
    <input type='text' size='3' name='z2' readonly="readonly"/>
    <input type='button' value='우편번호' name='btn'/>
    <p/>
    <input type='text' name='address' size='40'/>
</form>
</body>
</html>[출처] open 창에서 우편번호 전달하기  (JobTC(Job Training Center of Korea)) |작성자 IT여행자



 