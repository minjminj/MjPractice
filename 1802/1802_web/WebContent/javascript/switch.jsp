<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>switch</title>
</head>
<body>
	<h3>1)kor, eng, mat에 성적을 대입한 후 학점을 A~F까지 구하여 성적, 총점, 평균, 학점을
		출력하시오.</h3>
	<script>
	var eng = 98;
	var kor = 78;
	var mat = 87;
	
	var tot = kor + eng + mat;
	var avg = tot/3;
	var grade = 'F';
	
	var sw =Math.floor(avg/10);

	//switch문을 사용한 학점.
	switch(sw){
	case 9:
	case 10:
		grade = 'A';
		break;
	case 8:
		grade = 'B';
		break;
	case 7:
		grade = 'C';
		break;
	case 6:
		grade = 'D';
	
	}
	
	document.write('<li>kor :'+kor);
	document.write('<li>eng :'+eng);
	document.write('<li>mat :'+mat);
	document.write('<li>tot :'+tot);
	document.write('<li>avg :'+avg);
	document.write('<li>grade :'+sw);
	</script>
</body>
</html>