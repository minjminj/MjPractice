<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

<link href="https://fonts.googleapis.com/css?family=Montserrat|Pacifico" rel="stylesheet">

<!-- 초기화 -->
<style>
*{margin:0;padding:0;}
body{font-family:'Times New Roman',serif;}
li{list-style:none;}
a{text-decoration:none;}
img{border:0;}
</style>

<!--헤더 -->
<style>
#main_header{
	width:960px; margin:0 auto;	
	height:160px;
	position:relative;
#main_header>#title{
	position:relative;
	left:20px; top:30px;	
	}
#main_header>#main_gnb{
	position:absolute;
	right:0; top:50px;
	}
#main_header>#main_lnb{
	position:absolute;
	right:0; bottom:10px;
	}
}
</style>

<!-- 타이틀 -->
<style>
#title{
font-family: 'Montserrat',cursive;
float:left;
}

</style>

 <!-- 메뉴(1) -->
   <style>
      /* 자손이 float 사용 => 부모는 overflow:hidden */
      #main_gnb > ul   {overflow: hidden;}
      #main_gnb > ul > li { float:left;}
      #main_gnb > ul > li > a{
         display:block;
         padding: 2px 10px;
         border: 1px solid black;
      }
      
      #main_gnb > ul > li > a {
         background: pink;
      }
      
      #main_gnb > ul > li > a:hover {
         background: black;
         color: white;
      }
      
      #main_gnb > ul > li:first-child > a {
         border-radius: 10px 0 0 10px;}
      #main_gnb > ul > li:last-child > a {
         border-right: 1px solid black;   
         border-radius: 0 10px 10px 0;}
       
   </style>
<!-- 메뉴2 -->
<style>
#main_lnb>ul{overflow:hidden;}
#main_lnb>ul>li{float:left;}
#main_lnb>ul>li>a{
	display:block;
	padding:2px 10px;
	border: 1px solid black;
}
#main_lnb>ul>il>a:hover{
	background:black;
	color:white;
}
#main_lnb>ul>li:first-child>a{border-radius:10px 0 0 10px;}
#main_lnb>ul>li:last-child>a{border-radius:0 10px 10px 0;}	
</style>

<!-- 콘텐츠 -->
<style>
#content{
	width:960px; margin:0 auto;
	overflow: hidden;
}
#content>#main_section{
	width:750px;
	float:left;
}
#content>#main_aside{
	width:200px;
	float:right;
}
</style>
<!-- 본문 -->
<style>
	#main_section>article.main_article{
		margin-bottom:10px;
		padding:20px;
		border:1px solid black;
	}
</style>
<!-- 사이드 -->
<style>
	/* 첫번째 탭 */
	input:nth-of-type(1){display:none;}
	input:nth-of-type(1) ~ div:nth-of-type(1){display:none;}
	input:nth-of-type(1):checked ~ div:nth-of-type(1){display:block;}
	/* 두번째 탭 */
	input:nth-of-type(2){display:none;}
	input:nth-of-type(2) ~ div:nth-of-type(2){display:none;}
	input:nth-of-type(2):checked ~ div:nth-of-type(2){display:block;}
	/*탭모양 구성  */
	section.buttons{overflow:hidden;}
	section.buttons>label{
	
	/*수평정렬  */
	display:block; float:left;
	
	/*크기 및 글자 위치 지정  */
	width:100px; height:30px;
	line-height:30px;
	text-align:center;
	
	/* 테두리 지정 */
	box-sizing:border-box;
	border:2px solid green;
	
	/* 색상지정 */
	background:red;
	color:white;
	}
	input:nth-of-type(1):checked~section.buttons>label:nth-of-type(1){
			background:blue;
			color:red;
	}
	input:nth-of-type(2):checked~section.buttons>label:nth-of-type(2){
		background:blue;
		color:red;
	}
</style>
<!-- 목록 -->
<style>
	.item{
		overflow:hidden;
		padding:10px;
		border:1px solid black;
		border-top:none;
	}
	.thumbnail{
		float:left;
	}
	.description{
		float:left;
		margin-left:10px;
	}
</style>
</head>
<body>
	<header id='main_header'>
		<div id='title'>
			<h1>ChoiGyuHa</h1>
			<h2>HTML5+CSS3Basic</h2>
		</div>
		<nav id='main_gnb'>
			<ul>
				<li><a href='#'>Web</a></li>
				<li><a href='#'>Mobile</a></li>
				<li><a href='#'>Game</a></li>
				<li><a href='#'>Simulation</a></li>
				<li><a href='#'>Data</a></li>
			</ul>
		</nav>
		<nav id='main_lnb'>
			<ul>
				<li><a href='#'>HTML5</a></li>
				<li><a href='#'>CSS3</a></li>
				<li><a href='#'>JAVASCRIPT</a></li>
				<li><a href='#'>JQUERY</a></li>
				<li><a href='#'>Node.js</a></li>
			</ul>
		</nav>
	</header>
	<div id='content'>
		<section id='main_section'>
			<h1>Main Section</h1>
			<p>
			가나다라마바사아자차카타파하ABCDEFGHIJKLMNOPQRSTUVWXYZ</br>
			가나다라마바사아자차카타파하ABCDEFGHIJKLMNOPQRSTUVWXYZ</br>
			가나다라마바사아자차카타파하ABCDEFGHIJKLMNOPQRSTUVWXYZ
			</p>
		</section>
		<aside id='main_aside'>
			<h1>Main Asaide</h1>
			<p>
			가나다라마바사아자차카타파하ABCDEFGHIJKLMNOPQRSTUVWXYZ</br>
			가나다라마바사아자차카타파하ABCDEFGHIJKLMNOPQRSTUVWXYZ</br>
			가나다라마바사아자차카타파하ABCDEFGHIJKLMNOPQRSTUVWXYZ
			</p>
		</aside>
	</div>
	<section id='main_section'>
		<article class='main_article'>
			<h1>Main Article</h1>
			<p>
			가나다라마바사아자차카타파하ABCDEFGHIJKLMNOPQRSTUVWXYZ</br>
			가나다라마바사아자차카타파하ABCDEFGHIJKLMNOPQRSTUVWXYZ</br>
			가나다라마바사아자차카타파하ABCDEFGHIJKLMNOPQRSTUVWXYZ
			</p>
		</article>
		<article class='main_article'>
			<h1>Main Article</h1>
			<p>
			가나다라마바사아자차카타파하ABCDEFGHIJKLMNOPQRSTUVWXYZ</br>
			가나다라마바사아자차카타파하ABCDEFGHIJKLMNOPQRSTUVWXYZ</br>
			가나다라마바사아자차카타파하ABCDEFGHIJKLMNOPQRSTUVWXYZ
			</p>
		</article>
		<article class='main_article'>
			<h1>Main Article</h1>
			<p>
			가나다라마바사아자차카타파하ABCDEFGHIJKLMNOPQRSTUVWXYZ</br>
			가나다라마바사아자차카타파하ABCDEFGHIJKLMNOPQRSTUVWXYZ</br>
			가나다라마바사아자차카타파하ABCDEFGHIJKLMNOPQRSTUVWXYZ
			</p>
		</article>
	</section>
	<aisde id='main_aside'>
		<input id='first' type='radio' name='tab' checked='checked'/>
		<input id='second' type='radio' name='tab' />
		<section class='buttons'>
			<label for='first'>First</label>
			<label for='second'>Second</label>
		</section>
		<div class='tab_item'>
			<ul>
				<li class='item'>
		<a htef='#'>
			<div class='thumbnail'>
				<img src='http://placehold.it/45x45'/>
			</div>
				<div class='description'>
					<strong>HTML5 Audio</strong>
					<p>2018-6-16</p>
				</div>
			</a>
	</li><li class='item'>
		<a htef='#'>
			<div class='thumbnail'>
				<img src='http://placehold.it/45x45'/>
			</div>
				<div class='description'>
					<strong>HTML5 Audio</strong>
					<p>2018-6-16</p>
				</div>
			</a>
	</li><li class='item'>
		<a htef='#'>
			<div class='thumbnail'>
				<img src='http://placehold.it/45x45'/>
			</div>
				<div class='description'>
					<strong>HTML5 Audio</strong>
					<p>2018-6-16</p>
				</div>
			</a>
	</li><li class='item'>
		<a htef='#'>
			<div class='thumbnail'>
				<img src='http://placehold.it/45x45'/>
			</div>
				<div class='description'>
					<strong>HTML5 Audio</strong>
					<p>2018-6-16</p>
				</div>
			</a>
	</li>
			</ul>
		</div>
		<div class='tab_item'>
			<ul>
				<li><a href='#'>CSS3 Transition</a></li>
				<li><a href='#'>CSS3 Animation</a></li>
				<li><a href='#'>CSS3 Border</a></li>
				<li><a href='#'>CSS3 Box</a></li>
			</ul>
		</div>
	</aisde>
	
</body>
</html>