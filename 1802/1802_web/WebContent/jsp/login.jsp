<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>login</title>
<style>
h4 {
	text-align: center;
}

#login_main {
	border: 1px outset #4444ff;
	width: 300px;
	padding: 10px;
	box-sizing: border-box;
	margin: 0 auto;
	box-shadow: 2px 2px 6px gray;
}

#login_main>form>label {
	display: inline-block;
	width: 60px;
}

#btnLogin {
	width: 60px;
	height: 30px;
	margin-left: 80px;
}

#btnLogout {
	width: 60px;
	height: 30px;
	margin-left: 20px;
}

.msg {
	color: red;
}
</style>

</head>
<body>
	<%
		String na = "./html/html_index.jsp";
		String sec = "./html/anchor.jsp";
		String asi = "aside_html.jsp";
		
		if(request.getParameter("nav") != null){
			na = request.getParameter("nav");
		}
		if(request.getParameter("sec") != null){
			sec = request.getParameter("sec");
		}
		if(request.getParameter("asi") != null){
			sec = request.getParameter("asi");
		}
	
		String msg = "";
		if (request.getAttribute("msg") != null) {
			msg = (String) request.getAttribute("msg");
		} else {
			msg = request.getParameter("msg");
		}

		if (msg == null) {
			msg = "";
		}
	%>


	<div id='login_main'>
		<h4>Login</h4>
		<form name='frm_login' method='post' action='./jsp/login_result.jsp'>
			<label>아이디</label> <input type='text' name='mid'><br /> <label>암&nbsp;&nbsp;&nbsp;호</label>
			<input type="password" name='pwd'><br />

			<output name='msg' class='msg'><%=msg%></output>
			<br />
			<p />
			<input type='submit' value='LOGIN' name='btnLogin' id='btnLogin' />
		
			<input type='hidden' name='na' value='./html/html_index.jsp' />
			<input type='hidden' name='sec' value='./html/anchor.jsp' />
			<input type='hidden' name='asi' value='aside_html.jsp' />
		</form>
	</div>
</body>
</html>