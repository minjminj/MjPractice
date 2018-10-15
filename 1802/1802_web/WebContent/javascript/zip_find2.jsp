<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>zip_find</title>
<style>
    #zip{ width:270px;}
</style>
<script>
window.onload=function(){
    var ff = document.frm;
    ff.btnOK.onclick = copyData;
    ff.zip.ondblclick = copyData;
}
 
function copyData(){
    var ff = document.frm;
    var sel = ff.zip;
    var v = sel.options[sel.selectedIndex].value;
    var z1 = v.substr(0,3);
    var z2 = v.substr(4,3);
    var ad = v.substr(8);
    var frm = window.opener.document.frm;
    frm.z1.value = z1;
    frm.z2.value = z2;
    frm.address.value = ad;
    
    self.close();
}
</script>
 
</head>
<body>
<form name='frm' method='post'>
    <select name='zip' size='10' id='zip'>
        <option value='123-567/경기도'>123-567/경기도</option>
        <option value='111-222/강원도'>111-222/강원도</option>
        <option value='111-333/경상도'>111-333/경상도</option>
        <option value='111-444/전라도'>111-444/전라도</option>
        <option value='111-555/충청도'>111-555/충청도</option>
        <option value='111-111/제주도'>111-111/제주도</option>
    </select><br/>
    <input type='button' value='확인' name='btnOK'/>
</form>
</body>
</html>[출처] open 창에서 우편번호 전달하기  (JobTC(Job Training Center of Korea)) |작성자 IT여행자



