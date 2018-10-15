<%@page import="bean.MemberVo"%>
<%@page import="java.util.List"%>
<%@page import="bean.MemberDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

<style type="text/css">
@import url('https://fonts.googleapis.com/css?family=Nanum+Pen+Script');
    body{
        line-height:2em;        
       font-family: 'Nanum Pen Script', cursive;
       font-size:30px;
}


    ul, li{ 
        list-style:none;
        text-align:center;
        padding:0;
        margin:0;
}

    #mainWrapper{
        width: 800px;
        margin: 0 auto; /*가운데 정렬*/
    }

    #mainWrapper > ul > li:first-child {
        text-align: center;
        font-size:14pt;
        height:40px;
        vertical-align:middle;
        line-height:30px;
}

    
    

   .row {
        
        text-align:center;
         font-size:25px;
         margin:0 auto;
         
}

   .id {
 
   	font-size:25px;
    display:inline-block;
    width:60px;
   }
   
   .name {
    display:inline-block;
    width:60px;
    font-size:25px;
   }
   
   .email {
    display:inline-block;
    width:100px;
    font-size:25px;
   }
   
   .phone {
    display:inline-block;
    width:100px;
    font-size:25px;
   }
   
   .rdate {
    display:inline-block;
    width:100px;
    font-size:25px;
   }


    
    #title > li > ul > li:first-child               {width:20%;} 
    #title > li > ul > li:first-child +li           {width:20%;} 
    #title > li > ul > li:first-child +li+li       {width:20%;}
    #title > li > ul > li:first-child +li+li+li     {width:20%;} 
    #title > li > ul > li:first-child +li+li+li+li{width:20%;}

    #divPaging {
        clear:both; 
        margin:0 auto; 
        width:220px; 
        height:50px;
}

    #divPaging > div {
        float:left;
        width: 30px;
        margin:0 auto;
        text-align:center;
}

    

    .left {
        text-align : left;
}

.page {
  width: 100vw;
  height: 100vh;
  display: flex;
  justify-content: center;
}


/* add default color for animation start  */


/* toggle this class */

.color-bg-start {
  background-color: salmon;
}


/* toggle class bg-animate-color */

.bg-animate-color {
  animation: random-bg .5s linear infinite;
}


/* add animation to bg color  */

@keyframes random-bg {
  from {
    filter: hue-rotate(0);
  }
  to {
    filter: hue-rotate(360deg);
  }
}

.fun-btn {
  /* change bg color to get different hues    */
  background-color: salmon;
  color: white;
  padding: 2em 3em;
  border: none;
  transition: all .3s ease;
  border-radius: 5px;
  letter-spacing: 2px;
  text-transform: uppercase;
  outline: none;
  align-self: center;
  cursor: pointer;
  font-weight: bold;
}

.fun-btn:hover {
  animation: random-bg .5s linear infinite, grow 1300ms ease infinite;
}

.start-fun {
  background-color: #fff !important;
  /* change color of button text when fun is started   */
  color: salmon !important;
}

/* pulsating effect on button */
@keyframes grow {
  0% {
    transform: scale(1);
  }
  14% {
    transform: scale(1.3);
  }
  28% {
    transform: scale(1);
  }
  42% {
    transform: scale(1.3);
  }
  70% {
    transform: scale(1);
  }
}


</style>
<script>
$('.fun-btn').on('click', function(event) {
	  $(this).toggleClass('start-fun');
	  var $page = $('.page');
	  $page.toggleClass('color-bg-start')
	    .toggleClass('bg-animate-color');

	  //change text when when button is clicked

	  $(this).hasClass('start-fun') ?
	    $(this).text('stop the fun') :
	    $(this).text('start the fun');

	});
</script>
</head>
<body>
<%
String nav = request.getParameter("nav");
String sec = request.getParameter("sec");

%>


	
	
<div id='list' class='animated fadeInUpBig'>
	<label>회원조회</label>
		<form name='frmList' method='post'>
            <li id='Search'>
                <div>
                    <input type='text'  name='findStr' />
                    <input type='submit' value='검색' name='btnFind' class="<!-- fun-btn -->" />
                    <input type='hidden' value='<%=nav%>' name='nav' />
                    <input type='hidden' name='sec' />
                    <input type='hidden' name='id' />
     
                </div>
                <div class = 'row'>
                            <span class='id'>아이디</span>
                            <span class='name'>성명</span>
                            <span class='phone'>연락처</span>
                            <span class='email'>이메일</span>
                            <span class='rdate'>가입일</span>
       
                 </div>
            </li>
		</form>
	<%
		String findStr="";
		MemberDao dao = new MemberDao();
		if(request.getMethod().equals("POST")){
			findStr = request.getParameter("findStr");
		}
		List<MemberVo> list = dao.select(findStr);
	%>
	
	
		
	<div id='lists'>
		<div class='row'>
		<%
			for (MemberVo v : list) {
		%>
			<span class='id'>
			<a href='#' onclick="go('<%=v.getId()%>')">
					<%=v.getId()%>
			</a>
			</span> 
			<span class='name'>
			<%=v.getName()%>
			</span>
			<span class='phone'>
			<%=v.getPhone()%>
			</span> 
			<span class='email'>
			<%=v.getEmail()%>
			</span>
			<span class='rdate'>
			<%=v.getRdate()%>
			</span>
		<%
			}
		%>
		</div>
	</div>

	<ul>
            게시판 페이징 영역
            <li>
				<div id="divPaging">
					<input type='button' value='◀' />
					<input type='button' value='1' />
					<input type='button' value='2' /> 
					<input type='button' value='3' />
					<input type='button' value='4' /> 
					<input type='button' value='▶' />
				</div>
			</li>

        </ul>
</div>
<script>
	function go(id){
		var ff = document.frmList;
		ff.method = 'get';//test용 화면에 보이기 위해
		ff.id.value = id;
		ff.sec.value = './jsp/member/view.jsp';
		ff.action = 'index.jsp';
		ff.submit();
	}
</script>
</body>
</html>