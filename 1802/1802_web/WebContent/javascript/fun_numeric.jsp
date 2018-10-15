<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>fun_numeric</title>
</head>
<body>
	<h1>숫자형 함수</h1>

	<h3>1)str = '1010'의 값이 2진수, 8진수, 16진수, 10진수일때 그 값을 10진수로 표시</h3>
	<script>
		document.write(parseInt("1010", 2));
		document.write(parseInt("1010", 8));
		document.write(parseInt("1010", 10));
		document.write(parseInt("1010", 16));
	</script>

	<h3>2) su1='10', su2='20'이 저장되어 있다. su1, su2를 산술적으로 더한 값을 출력</h3>

	<script>
		var su1 = 30;
		var su2 = 20;
		s1 = parseInt(su1);
		s2 = parseInt(su2);

		document.write(su1 + su2);
	</script>

	<h3>3)str에 임의의 값을 대입한 후 숫자형의 값이 아니라면 '계산불가'를 출력</h3>

	<script>
		var str = '10';
		if (str.isNaN() == true) {
			document.write("계산불가");
		}
	</script>

	<h3>4)방정식이 y='x*2+1'와 같이 문자열로 지정되어 있다.x값이 1~10일때 해를 모두 구하시오.(eval
		사용)</h3>
	<script>
		
	</script>

	<h3>5)jumi='910223-1234567'일때 생년,생월,생일,성별을 분리하여 출력(단 성별은 남자 또는 여자로
		표시)</h3>

	<script>
		var jumi = '910223-1234567'
		var year = jumi.substr(0, 2);
		var month = jumi.substr(2, 2);
		var day = jumi.substr(4, 2);
		var gen = jumi.substr(7, 1)

		document.write(year + '</br>');
		document.write(month + '</br>');
		document.write(day + '</br>');
	</script>

	<h3>6)su = '10, 20, 30, 40, 50'가 대입 되어 있다. 정수로 바꾸어 합계와 평균을 출력</h3>
	<script>
		var su = '10,20,30,40,50';
		var b = su.split(',');
		var a = 0;
		var sum = 0;
		var avg;

		for (var i = 0; i < su.split(",").length; i++) {
			sum += parseInt(su.split(",")[i]);/* or sum+=Number(a); sum += parseInt(a); */
		}

		avg = sum / b.length;
		document.writeln(sum + '<br/>');;
		document.writeln(avg);

	 

	</script>

	<h3>data = hipwg</h3>
	<script>
	var data = 'hipwg@naver.com'; 
	document.write("id : " + data.split('@')[0] + " "); document.write("domain : " + data.split('@')[1]);
	</script>
</body>
</html>