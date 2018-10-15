<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>table</title>
</head>
<body>
<h3>기본 테이블</h3>
	<table border = '10'><!-- table border = '외곽선 두께' -->
	<!-- <tr>태그를 새로 또 써줌으로써 아래에 새로운 행 생성 -->
	
		<tr>
			<td>1</td>
			<td>2</td>
			<td>3</td>
			<td>4</td>
		</tr>
		<tr>
			<td>5</td>
			<td>6</td>
			<td>7</td>
			<td>8</td>
		</tr>
		<tr>
			<td>9</td>
			<td>10</td>
			<td>11</td>
			<td>12</td>
		</tr>
		<tr>
			<td>13</td>
			<td>14</td>
			<td>15</td>
			<td>16</td>
		</tr>
	</table>
	
		<table border = '1'><!-- table border = '외곽선 두께' -->
	<!-- <tr>태그를 새로 또 써줌으로써 아래에 새로운 행 생성 -->
	
		<tr>
			<td colspan = '2'>상반기(행병합)</td>	<!-- <td colspan = ''>태그는 행 병합이다. -->
			<td colspan = '2'>하반기</td>
		</tr>
		<tr>
			<td rowspan = '3'>열</td>
			<td>6</td>
			<td>9</td>
			<td>12</td>
		</tr>
		<tr>
		
			<td>b</td>
			<td>c</td>
			<td>d</td>
		</tr>
		<tr>
			<td>f</td>
			<td>g</td>
			<td>h</td>
		</tr>
	
	
	
	<table border = '1'><!-- table border = '외곽선 두께' -->
	<!-- <tr>태그를 새로 또 써줌으로써 아래에 새로운 행 생성 -->
		<caption><h2><i>흠</i></h2></caption>
			<thead style="background:yellow"> 
		<tr>
			<td colspan = '4' style="background:yellow">실 적</td>
			
		</tr>
	</thead>
	<tbody >
		<tr>
			<td rowspan = '2' style="background:red">상 반(열병합)</td><!-- <td rowspan = ''>태그 열병합이다. -->
			<td>3</td>
			<td>a</td>
			<td>b</td>
		</tr>
		
		<tr>	
			<td>6</td>
			<td>c</td>
			<td>d</td>
		</tr>
	</tbody>	
		<tfoot style="background:green">
		<tr>
			<td rowspan = '2' style="background:yellow">하 반</td>
			<td>9</td>
			<td>e</td>
			<td>f</td>
		</tr>
		
		<tr>
			<td>12</td>
			<td>g</td>
			<td>h</td>
		</tr>
		</tfoot>
</body>
</html>