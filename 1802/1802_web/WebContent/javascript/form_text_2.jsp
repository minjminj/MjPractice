<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>form_text_2</title>
<script>
	
	window.onload = function(){											//로딩됬을때 실행되는 함수
	
		var practice = document.frm;

		practice.btn.onclick = function(){		
		
		practice.kor.style.backgroundColor = '#ffffff';				
		practice.eng.style.backgroundColor = '#ffffff';
		practice.mat.style.backgroundColor = '#ffffff';
		
		/* suFunc() 에서 ()를 넣은채 시작하면 이벤트를 발생하기 전에 실행해버린다. 
		--()를 치면 실행된 결과를 ()안에서 넣어달라는 뜻이므로 나중에 실행된다.
		 이벤트가 사전에 정해되어져있고 실행되는 타입(콜백 타입) 
		var를 쓰면 지역형 변수 안쓰면 전역형 변수 var는 데이터형이 아닌 범위
		*/

	/* document.frm.tot.value = parseInt(document.frm.kor.value)+		내가 쓴 예제
	parseInt(document.frm.eng.value)+
	parseInt(document.frm.mat.value);

	document.frm.avg.value = parseInt(document.frm.tot.value/3); */
		

			
		if(!isFinite(practice.kor.value) || practice.kor.value == ''){ /* null 과 공백의 의미는 다르다. */
				
			practice.kor.focus(); 	/* focus - 커서이동 */
				practice.kor.style.backgroundColor = '#efefef';	
		
			
				   return;	
			}
			if(!isFinite(practice.eng.value) || practice.eng.value == ''){
				practice.eng.focus(); 	/* focus - 커서이동 */
				practice.eng.style.backgroundColor = '#efefef';	
				return;
			}
			if(!isFinite(practice.mat.value) || practice.mat.value == ''){
				practice.mat.focus();
				practice.mat.style.backgroundColor = '#ffdddd';
				return;
			}
			
			var kor = parseInt(practice.kor.value);
			var eng = parseInt(practice.eng.value);
			var mat = parseInt(practice.mat.value);
			
			var tot = (kor + eng + mat);
			
			practice.tot.value = tot;
			practice.avg.value = (tot/3).toFixed(1);/* toFiexd 마이너스 값은 사용불가 (소수점 몇째자리 까지 나오는지 구할때)*/
			
													/* name 값이 똑같다면 배열변수로 취급한다. */
			
		}	
	
	}

</script>
</head>
<body>
	<h2>국, 영, 수 점수를 입력받아 총점, 평균을 계산하여 각각 text 상자에 표시하시오</h2>
	<form name='frm' method='post'>
		<label>국어</label> <input type='text' name='kor' value='90' /><br />
		<!-- input type='text'이므로 결국은 문자열이다. parseInt,parseFloat사용-->
		<label>영어</label> <input type='text' name='eng' value='90' /><br />
		<label>수학</label> <input type='text' name='mat' value='90' /><br />
		<hr />
		<label>합계</label> <input type='text' name='tot' /><br /> <label>평균</label>
		<input type='text' name='avg' /><br />
		<p />
		<input type='button' value='성적계산' name='btn' />
	</form>
</body>
</html>


