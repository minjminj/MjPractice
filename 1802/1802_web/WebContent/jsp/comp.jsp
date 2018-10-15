<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>comp</title>
</head>
<body>
<!-- 두 수를 매개변수로 받아 합계와 평균을 문자열로 반환받아 표현식으로 출력 -->

<%= compute(13,13) %>

<%!
public String compute(int a,int b){
	String r = "";
	
	int sum = a + b;
	double avg = (double)sum/ 2.0;
	
	r = sum + avg;
	
	return r;
}
%>


</body>
</html>