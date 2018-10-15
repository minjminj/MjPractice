<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style>
@import url('https://fonts.googleapis.com/css?family=Nanum+Pen+Script');

#header_main {
	position: relative;

}

#header{
	position: relative;
	width:800px;
	height:300px;
	/*border-radius: 300px 300px 0px 0px; */
	background-color:#ff7473;
	margin: 0px auto;


}

#top_menu {
	position: absolute;
	top: 20px; 
	right: 300px;
}

#top_menu>#btnLogin{
 width:200px;
 height:200px;
 border-radius:100px;
 -moz-border-radius : 100px;
 -webkit-border-radius : 100px;
 -ms-border-radius :100px;
 -khtml-border-radius : 100px;
 -o-border-radius :100px;
 text-align:center;
 font-size:45px;
}

#top_menu>#btnLogout{
 width:200px;
 height:200px;
 border-radius:100px;
 -moz-border-radius : 100px;
 -webkit-border-radius : 100px;
 -ms-border-radius :100px;
 -khtml-border-radius : 100px;
 -o-border-radius :100px;
 text-align:center;
 font-size:45px;
}

#sub_menu{ 
	position:absolute;
	bottom:-300px;
	right:60px;
	
}
#sub_menu>li{
	display: inline-block;	/* 좌 우 배 치 */
	padding:10px;
	box-sizing:border-box;
	font-size:27px;
	font-family: 'Nanum Pen Script', cursive;
}

a{
	text-decoration:none;
}

#sub_menu a:hover{
	background-color:#fff000;
}
</style>
<script>


	var loginInit = function(nav,sec,aside){
	var btnLogin = document.getElementById('btnLogin');
	var btnLogout = document.getElementById('btnLogout');
	var btnScore = document.getElementById('btnScore');
	
	var url = './jsp/login.jsp'
			+ '&nav=' + nav
			+ '&aside=' +aside
			+ '&oldsec=' +sec;
	if (btnLogin != null) {
			btnLogin.onclick = function() {
				location.href = './index.jsp?sec='+url;
			}
		}

		 if (btnLogout != null) {
			btnLogout.onclick = function() {
				btnLogout.onclick = function() {
					location.href ='./jsp/logout.jsp?sec='+url;
				}
			}
		} 
	}
</script>
</head>
<body>
<%
	String session_id = (String)session.getAttribute("session_id");
	String na = "./html/html_index.jsp";
	String se = "./html/anchor.jsp";
	String asi = "./aside_html.jsp";
	
	if(request.getParameter("na") != null){
		na = request.getParameter("na");
	}
	if (request.getParameter("sec") != null) {
		se = request.getParameter("sec");
	}
	if (request.getParameter("asi") != null) {
		asi = request.getParameter("asi");
	}
%>
	<div id='header_main'>
		<div id='top_menu'>
		<%if(session_id == null) { %>
			<input type='button'  value='로 그 인' id='btnLogin' style="font-family: 'Nanum Pen Script', cursive;" /> 
		<%} else { %>	
			<input type='button'  value='로 그 아 웃' id='btnLogout' style="font-family: 'Nanum Pen Script', cursive;" />
		<%} %>
			
		</div>
		<ul id='sub_menu'>
			<li><a href='?nav=./html/html_index.jsp'>HTML</a></li>
			<li><a href='?nav=./css/css_index.jsp'>CSS</a></li>
			<li><a href='#'>JS</a></li>
			<li><a href='?nav=./jsp/member/member_control.jsp'>JSP</a></li>
			<li><a href='#'>AJAX</a></li>
			<li><a href='#'>JQUERY</a></li>
			<li><a href='#'>MYBATIS</a></li>
			<li><a href='?nav=./jsp/score/score_control.jsp'>성적관리</a></li>
			<li><a href='?nav=./jsp/score/list.jsp'>성적조회</a></li>
		
		</ul>
	</div>
	<script>
		loginInit('<%=na%>','<%=se%>','<%=asi%>');
	</script>
</body>
</html>