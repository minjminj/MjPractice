<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
   <link rel='stylesheet' type='text/css' href='myStyle.css'/>
   <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
   <title>declare</title>
   <style>
      div {
         border: 1px solid #0000ff;
         width: 300px; height:100px;
         font-size: 30px;
      }
      
      div.c1 {
         background-color: #ffff00;
      }
      
      div#n1 {
         background-color: blue;
      }
            
   </style>

</head>
<body>
   <h1>CSS를 선언하는 3가지 방법</h1>
   
   <!--  1) tag에 직접 css 선언 -->
   <font style='font-size:100px; color:#0000ff'>이봉기</font><br/>
   <input type='text' value='이봉기' style='color:#ff0000' />
   
   
   <!-- 2) <style/> 안에서 css 선언 -->
   <div class='c1'>이봉기</div>
   <div id='n1'>홍길동</div>
   <div class='c1'>일지매</div>
   
   <span>수박</span>
   <span>사과</span>
   <span>배</span>
   <span>복숭아</span>

</body>
</html>