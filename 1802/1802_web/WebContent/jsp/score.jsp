<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>score</title>
</head>
<body>
	<form name='frm' method='post'>
	
	
	  
	<label>x</label><input type='text' name='x'/><br/>
	<label>y</label><input type='text' name='y'/><br/>
	<label>z</label><input type='text' name='z'/><br/>

	<input type='submit' name='답'/>
	
	</form>

	<%
	request.setCharacterEncoding("utf-8");
	if(request.getMethod().equals("GET"))return;
	
	
	
	compute(14, 14);
	hakjum(14);
	%>
	
	<%!
	public String compute(int b,int c){
		String r = "";
		int sum = b + c;
		double avg = sum/2.0;
		return r;
	}
	
	public char hakjum(int a) 
	{
		return (a >= 90) ? 'A' : ((a >= 80) ? 'B' : ((a >= 70) ? 'C' : ((a >= 60) ? 'D' : 'F')));
	}
	
	%>

	
	
	
	
</body>
</html>