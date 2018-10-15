<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>background_image</title>
<style>
	#div1{
		display: block;
		background-image:url('../img/HM.jpg');
		width:400px;
		height:250px;
		border:1px solid;
		border-radius:20px 20px 20px 20px;
		box-shadow:25px 25px 25px red;
	}
	#div2{
		background-image:url('../img/HM.jpg');
		width:400px;
		height:250px;
		background-size:100px 50px;
		border-style:dashed;
		border-radius:20px 20px 20px 20px;
	
	}
	#div3{
		border:1px border;
		background-image:url('../img/HM.jpg');
		width:400px;
		height:300px;
		border-radius:20px 0 20px 0px;
		background-size:100% 100%;
	}
	#div4{
		border:5px border;
		background-image:url('../img/HM.jpg');
		width:400px;
		height:300px;
		background-size:100% 100%;
		background-attachment:fixed;
		overflove:scroll;
	}
	.font-gs{
		font-size:30px;
		font-family:궁서체;
	}
</style>
</head>
<body>
<!--1)<div id='div1'/>을 작성하고
	-넓이:400px,높이 250px
	-외곽선, 그림자, 라운드 속성을 지정
	-바탕 이미지를 기본형으로 설정(바탕이미지의 크기는 100x50정도)
  	
  	2)<div id='div2'/>
  	-실선형 외곽선을 라운드 처리하여 작성
  	-바탕이미지는 x축으로만 반복
  	
  	3)<div id='div3'/>
  	-외곽성의 모양이 좌상, 우하만 라운드 처리
  	-바탕이미지의 크기는 영역크기 만큼으로 지정
  	
  	4)<div id='div4'/>
  	-바탕이미지가 스크롤되지 않도록 조치
  	-궁서체로 임의의 문자열 추가
  -->
  <div id='div1'>
  </div>
  <div id='div2'>
  </div>
  <div id='div3'>
  </div>
  <div id='div4'>
  	<h1 class='font-gs'>궁서체</h1>
  </div>
</body>
</html>