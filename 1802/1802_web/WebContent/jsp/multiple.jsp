<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- 두정수 x,y(x<=y)와 z(배수)를 입려 받아 
x~y까지의 수중 z의 배수를 동일한 페이지에 출력하시오 -->
	<form name='frm' method='post'>
	
	<label>x</label>
	<input type = 'text' name = 't1'><br/>
	<label>y</label>
	<input type = 'text' name = 't2'><br/>
	<label>z</label>
	<input type = 'text' name = 't3'><br/>
	
	<input type = 'submit' value = '전송'>

	</form>
	
	<%
		request.setCharacterEncoding("utf-8");
	
		String x = request.getParameter("t1");
		String y = request.getParameter("t2");
		String z = request.getParameter("t3");
	
		if(request.getMethod().equals("GET"))return;
		
		out.print(x);
		out.print(y);
		out.print(z);

		mul(out,Integer.valueOf(x),Integer.valueOf(y),Integer.valueOf(z));
		%>
		
		<%!
		public void mul(JspWriter out,int x,int y,int z){
			String str = "";
			try{
				if(x <= y){
					for(int i = x;i <= y;i++){
						if(z%i == 0 && i!=1){
						z = z*z;
						str = String.format("%d", i);
						out.print(str);
					}
				}
			}
		}catch(Exception ex){
		}
	}
		%>
</body>
</html>