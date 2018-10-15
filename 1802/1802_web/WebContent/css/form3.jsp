<%@page import="java.util.Arrays"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>form3</title>
<style>
	label.label{
		width:70px;
		display:inline-block;
		text-align:right;
		margin-right:8px;
	}

	input[type=text]:focus, input[type=password]:focus, textarea:focus{
		background: #ff0000;
	}
	
	input[type=submit]:hover{
		color: #ff0000;
		font-weight:bold;
	}
	
	
</style>
</head>
<body>
<!--
1. 아이디, 암호, 연락처, 주소를 입력 받을 수 있도록 ipput태그를 구성하세요
2. 라디오 버트늘 사용하여 성별(남,여)를 구현하세요
3. 체크 박스를 사용하여 좋아하는 과일을 선택ㅎ사도록 ㅜ섣하세요
  (사과, 배, 복숭아, 수박, 참외, 딸기)

4. 사진 이미지를 첨부할 수 있도록 조치하세요
5. textarea를 사용하여 자기 소개를 할 수 있도록 조치
6. 전송버튼을 추가하여 입력된 내용을 전송하고, method='post'인 경우에만 입력된 내용을 출력하도록 작서앟세요
 -->   
   
   <h3>form3.jsp</h3>
   
   <form name='frm' method='post'>
      <label class='label'>아이디: </label>
      <input type='text' name='id' /><br/></span>
      
      <label class='label'>암호: </label>
     <input type='password' name='pwd' /></span><br/>
      
      <label class='label'>연락처: </label>
      <input type='tel' name='tel' /> <br/>
      
      <label class='label'>주소: </label>
      <input type='text' name='addr' /> <br/>
      
      <label>성별 : </label>
      <label><input type='radio' name='gender' value='남자' />남자</label>
      <label><input type='radio' name='gender' value='여자' />여자</label>
      <p/>
      
      <label>좋아하는 과일 : </label>
      <label><input type='checkbox' name='fruits' value='사과'>사과</label>
      <label><input type='checkbox' name='fruits' value='배'>배</label>
      <label><input type='checkbox' name='fruits' value='복숭아'>복숭아</label><br/>
      <label><input type='checkbox' name='fruits' value='수박'>수박</label>
      <label><input type='checkbox' name='fruits' value='참외'>참외</label>
      <label><input type='checkbox' name='fruits' value='딸기'>딸기</label><br/>
      
      <label>과일사진: </label>
      <label><input type='file' name='fruits_image'></label>
      <p/>
      
      <label>자기소개</label>
      <textarea rows='10' cols='60' name='introduce'></textarea><br/>
            
      <input type='submit' value='전송'>   
   </form>
   
   <%
      if (request.getMethod().equals("GET")) return;         //   post인 경우에만 밑으로 내려가게
      request.setCharacterEncoding("UTF-8");
   %>
   
   <ul>
      <li>아이디: <%=request.getParameter("id") %></li>
      <li>암호   : <%=request.getParameter("pwd") %></li>
      <li>연락처: <%=request.getParameter("tel") %></li>
      <li>주소: <%=request.getParameter("addr") %></li>
      <li>성별: <%=request.getParameter("gender") %></li>
      <li>&nbsp;</li>
      
      <li>좋아하는 과일: <%=Arrays.toString(request.getParameterValues("fruits")) %></li>
      <li>좋아하는 과일 사진파일명: <%=request.getParameter("fruits_image") %>
      <li>좋아하는 과일 사진: <img src='../img/<%=request.getParameter("fruits_image") %>'></li>
      
      
      <li>&nbsp;</li>
      <li>자기소개: <%=request.getParameter("introduce") %></li>
      
      
      
   </ul>
   
</body>
</html>