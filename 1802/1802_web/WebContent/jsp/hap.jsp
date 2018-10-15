<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<!-- 두정수 x,y(x<=y)를 입력받아 x~y까지의 합계와 평균을 계산하여 동일한 페이지에 출력하시오 -->
<body>
	<form name='frm' method='post'>
	
	<label>받을것</label><br/>
	  
	<input type='text' name='x'/><br/>
	<input type='text' name='y'/><br/>

	<input type='submit' name='답'/>
	
	</form>
	<%
	request.setCharacterEncoding("utf-8");
	if(request.getMethod().equals("GET"))return;
	
	int x = Integer.parseInt(request.getParameter("x"));
	int y = Integer.parseInt(request.getParameter("y"));
	
	int sum = 0;
	double avg = 0; 
	String str = "";
	
	if(y>=x){
		for(int i=x;i<=y;i++){
			sum += i;
		}
	}
	avg = sum/(y-x);
	str = String.format("합계: %d 평균:%f %d", sum, avg , sum);
	
	
	out.print(sum);
	out.print(avg);
	%>
	
	
</body>
</html>