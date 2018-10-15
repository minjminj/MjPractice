<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>score</title>
</head>
<body>
<%
// 폼의 데이터가 유지될 수 있도록 함
// 폼의 'name'으로 과목별 점수 얻어오기
// 파라미터는 form에 있는 정보
String kor = request.getParameter("kor");
String eng = request.getParameter("eng");
String mat = request.getParameter("mat");

// null 표시 방지
kor = (kor == null) ? "" : kor;
eng = (eng == null) ? "" : eng;
mat = (mat == null) ? "" : mat;


// 오류메시지 초기화
String msgKor = "", msgEng = "", msgMat = "";

// score3_result.jsp로부터 오류메시지 가져와서 대입하기
if (   request.getAttribute("msgKor") != null) {
      msgKor = (String)request.getAttribute("msgKor");   
}
if (request.getAttribute("msgEng") != null) {
      msgEng = (String)request.getAttribute("msgEng");
   
}
if (request.getAttribute("msgMat") != null) {
      msgMat = (String)request.getAttribute("msgMat");   
}
%>

<h3>3개의 성적을 입력받아 총점, 평균, 학점을 구하여 동일한 페이지에 출력하세요</h3>

<%-- 1) 성적처리 결과는 score3_result.jsp에서 출력
    2) score3.jsp의 성적 입력상자 오른쪽에
       <output><%=msgKor%></output>
       <output><%=msgEng%></output>
       <output><%=msgMat%></output>
       태그 추가 (오류메시지 표시)
    3) score3_result.jsp페이지에서 각 항목의 성적이 0~100 사이가 아니라면
       각 다시 score3.jsp를 forwarding하되 오류메시지를 표시하도록 조치
--%>

<form name='frm' method='post' action='include_action_main.jsp?inc=score3_result.jsp'>

   <label>국어: </label>
   <input type='text' name='kor' value="<%=kor %>" />
   <output class='msg'><%=msgKor %></output>
   <br/>
   
   <label>영어: </label>
   <input type='text' name='eng' value="<%=eng %>" />
   <output class='msg'><%=msgEng %></output>
   <br/>
   
   <label>수학: </label>
   <input type='text' name='mat' value="<%=mat %>" />
   <output class='msg'><%=msgMat %></output>
   <p/>
   
   <input type='submit' value='전송' />
   
</form>
<hr/>


</body>
</html>