<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Array</title>
</head>
<body>
<!-- javascript는 무조건 일차원 배열 
	그러나 일차원 배열을 다른 배열로 통해 만들면 이차원, 삼차원 배열로 만들수있다. 
	ex) java - [][] 가능(첫번째에 이차원배열 가능)
		javascript - new Array[](처음만들때 이차원배열을 만들순 없다.)
		but!! a[] = new Array() 와 같이 일차원 배열을 두번 함으로써 이차원 배열을 만들수있다. a[][] 완성!
			 a[][] = new Array()---- a[][][] 삼차원 배열 완성!! (java는 이와같은 방법이 불가능 하다.)
	-->
<!-- javascript의 배열은 가변적이다
	ex)안에 수가 5개가 있다고 꼭 5개만  할수있는것은 아니다.  
 -->
<!--javascript의 배열은 소괄호를 사용한다.-->
<script>
//JSON type
var mnt = ["백두산","한라산","금강산","설악산","치악산","사패산"];
var river = ["한강","금강","낙동강","두만강","섬진강","동강"];
var score = [90,87,98,56,27,87];
</script>
	
	<h3>1)배열 mnt를 연결문자열을 '-'으로 지정하여 출력하시오</h3>
<script>
document.write(mnt.join("-"));
</script>
	
	<h3>2)배열 mnt와 river를 붙여 새로운 배열을 만들고 내림차 정렬하여 출력하시오.</h3>
<script>
document.write(mnt.concat(river).sort().reverse());

var ss= mnt.concat(river);	/* 제대로 된 풀이 */
ss.sort();
document.write(ss.reverse()); 
</script>

	<h3>3)findStr="금강산"이 저장되어 있다.mnt배열에서 몇번째인지 찾아 출력하시오.</h3>
<script>
var findStr = "금강산";

document.write
</script>

	<h3>4)score에 있는 모든 성적을 사용하여 총점과 평균을 계산하시오.</h3>
<script>

</script>

<!-- 배열의 크기를 굳이 안에 집어넣을 필요가 없다(javascript의 배열은 가변적이므로) -->	
	<h3>5)score배열의 값들중 60점 이상인 갯수와 이하인 갯수를 각각 값들과 함께 출력</h3>
<script>

document.write(sort.)
</script>

<!-- javascript는  -->
	<h3>6)score를 내림차 정렬하여 출력하시오,</h3>
<script>
document.write();
</script>
	<h3>7)백두산-한강-90 과 같이 같이 위치(index)의 값이 서로 연관성이 있는 배열 이라고 가정한다면 score 가 60이상인 산이름과 강이름을 출력하시오</h3>
<script>

/*  */
</script>
</body>
</html>