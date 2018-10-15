<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>login_result</title>
</head>
<body>

<%  
   String url = "";
	
   String mid = request.getParameter("mid").trim();
   String pwd = request.getParameter("pwd").trim();
   
   String na = "./html/html_index.jsp";
	String sec = "./html/anchor.jsp";
	String asd = "./aside_html.jsp";

	if(request.getParameter("na") != null){
		na = request.getParameter("na");
	}
	if (request.getParameter("sec") != null) {
		sec = request.getParameter("sec");
	}
	if (request.getParameter("asi") != null) {
		asd = request.getParameter("asi");
	}
   
	url = "../index.jsp"
			+ "?nav=" + na
			+ "&sec=" + sec
			+ "&aside="+ asd;
   
   if (!mid.equals("") && !pwd.equals("")) {
      session.setAttribute("session_id",mid);
      /* 
      response.sendRedirect("../index.jsp"); */
      
      out.print("<script>location.href='"+url+"'</script>");
   }else {
      /* RequestDispatcher dispatcher = request.getRequestDispatcher("login.jsp");
      
      // request 영역의 속성("msg")에 값("아이디 또는 암호가 잘못되었어요.")을 설정
      request.setAttribute("msg", "아이디 또는 암호가 잘못되었어요.");
      
      // 요청정보(requst)와 응답정보(response)를 그대로 가지고 페이지를 이동시켜라.
      dispatcher.forward(request, response); */
      
/*     out.print("<script>location.href='../index.jsp?sec=./jsp/login.jsp&msg=똑바로하세요!'</script>");*/   
		}
%>

</body>
</html>