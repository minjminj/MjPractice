<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>event_file</title>
<script>
//이 로직은 알아두자 
	window.onload = function() {
		var img = document.getElementById('img');
		var file = document.getElementById('pic');
		/* file태그의 값이 변경 될 때의 처리 이벤트 */
		pic.onchange = function(){			// pic 이 변경되었을때(onchange) function을 호출해라 
			/* alert('good');  / Test */
			var file = event.srcElement;	// 이벤트가 태그 
			
			var url = file.files[0]; 		// 선택된 이미지의 경로정보	
			var reader = new FileReader();
			
			reader.onload = function(e) {
				img.src = e.target.result;
			}	
			reader.readAsDataURL(url);
		}
	}
</script>
</head>
<body>
	<h3>이미지 미리보기</h3>
	<img src="http://placehold.it/320X180" width = 320px height = 180px id='img' /><br/>
	<input type = 'file' name = 'pic' id = 'pic'/>
</body>
</html>