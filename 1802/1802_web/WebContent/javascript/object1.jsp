<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>object1</title>
<link href="https://fonts.googleapis.com/css?family=Gaegu" rel="stylesheet">
<link href="https://fonts.googleapis.com/css?family=Great+Vibes|Oswald" rel="stylesheet">
<link rel='stylesheet' type='text/css' href='../css/mycss.css'/>
<script>
	function $(id){
		return document.getElementById(id);
	} 
	window.onload = function(){
		var ff = document.frm;
		var r = $('result');
		//리터럴 타입1
		ff.obj1.onclick = function(){
			var o = {};
		
		o.mid = ff.mid.value;
		o.pwd = ff.pwd.value;
		o.gu = (ff.gu[0].checked)?ff.gu[0].value:ff.gu[1].value;
		
		r.innerHTML = '<li>' + o.mid + '<li>' + o.pwd + '<li>' + o.gu;
		/* css에 반투명하게 나오므로 값도 반투명하게 나옴(알아두고 css 지우든 말든 알아서 처리하자.) */
		}
		//리터럴 타입2
		ff.obj2.onclick = function(){
			// 객체 정의---------------
			var o = {};
			o.setData = function(mid,pwd,gu){
				this.mid = mid;
				this.pwd = pwd;
				this.gu = gu;
			};
			//--------------------------
			var mid = ff.mid.value;
			var pwd = ff.pwd.value;
			var gu = (ff.gu[0].checked)?ff.gu[0].value:ff.gu[1].value;
			
			o.setData(mid,pwd,gu);
			
			r.innerHTML = '<h4>리터럴 type2</h4>'+'<li>'+o.mid+
							'<li>'+o.pwd+'<li>'+o.gu;
		}
		
		//리터럴 타입3
		ff.obj3.onclick =  function(){
			//리터럴 타입의 객체와 setter/getter 정의 -------
			var o = {};
			o.setMid = function(mid){this.mid = mid;};
			o.setPwd = function(pwd){this.pwd = pwd;};
			o.setGu = function(gu){this.gu = gu;};
			
			o.getMid = function(mid){return this.mid;};
			o.getPwd = function(pwd){return this.pwd;};
			o.getGu = function(gu){return this.gu;};
			//----------------------------------------
			
			var gu = (ff.gu[0].checked)?ff.gu[0].value:ff.gu[1].value;
			o.setMid(ff.mid.value);
			o.setPwd(ff.pwd.value);
			o.setGu(gu);
			
			r.innerHTML = '<h4>리터럴 type3</h4>'
						+ '<li>'+o.getMid()
						+ '<li>'+o.getPwd()
						+ '<li>'+o.getGu();
			}
		
	}
</script>
</head>
<body>
	<h3 id='title'>폼에 입력된 자료를 사용하여 자바스크립드의 객체를 생성 후 출력</h3>
	<form name='frm' method='post'>
		<label id='lid'>아이디</label>
		<input type='text' size='8' name='mid' value='p001' /><br/>
		<!-- name을 id로 아닌 mid로 안주는 이유는 트러블이 생길수 있어서 -->
		<label id='lpw'>암호</label>
		<input type='password' size='10' name='pwd' value='1111' /><br/>
		<label id='lgu'>회원 구분</label>
		<label><input type='radio' name='gu' checked value='회원' />회원</label>
		<label><input type='radio' name='gu' value='비회원' />비회원</label>
		
		<p/>
		<input type='button' value='OBJ1' name='obj1' />
		<input type='button' value='OBJ2' name='obj2' />
		<input type='button' value='OBJ3' name='obj3' />
	</form>
	<div id='result'>
	</div>
</body>
</html>