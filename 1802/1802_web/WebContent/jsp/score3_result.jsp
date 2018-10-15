<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>score3_result</title>
</head>
<body>
<%
   // 한글 깨지는거 방지
   request.setCharacterEncoding("UTF-8");
   // 처음 페이지 로딩시(GET방식) 밑으로 흘러가지 않게 함
   if (request.getMethod().equals("GET")) {
	   return;
   }
   
   
   
   
   
   RequestDispatcher dispatcher = request.getRequestDispatcher("include_action_main.jsp?inc=score3.jsp");
   
   int kor, eng, mat, errCode = 0;
   try {
	   
      errCode=1;
      kor = Integer.parseInt(request.getParameter("kor"));
      
      errCode=2;
      eng = Integer.parseInt(request.getParameter("eng"));
   
      errCode=3;
      mat = Integer.parseInt(request.getParameter("mat"));
      
      int tot = kor + eng + mat;
      double avg= (double)tot/3;
      
      out.print("합계: " + tot);
      out.print("평균: " + avg);

   }catch (Exception e) {
      switch(errCode) {
      case 1:
         request.setAttribute("msgKor", "국어 성적이...");
         break;
      case 2:
         request.setAttribute("msgEng", "영어 성적이...");
         break;
      case 3:
         request.setAttribute("msgMat", "수학 성적이...");
         break;
      }
      dispatcher.forward(request, response);
      
   }
      
   
%>
</body>
</html>