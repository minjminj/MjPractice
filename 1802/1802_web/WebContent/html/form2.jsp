<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>form2</title>
</head>
<body>
	<h3>HTML5에 추가된 input 속성들</h3>
	<form name = 'frm' method = 'post'>
		<label>색상</label>
		<input type='color' name='color' /><br/>
		<label>date</label>
		<input type = 'date' name = 'date'/><br/>
		<label>datetime</label>
		<input type='datetime' name ='datetime'/><br/>
		<label>datetime - local</label>
		<input type='datetime-color' name='datetimelocal'/><br/>
		<label>email</label>
		<input type = 'email' name ='email'/><br/>
		<label>month</label>
		<input type='month' name = 'month'/><br/>
		<label>number</label>
		<input type='number' name ='number'/><br/>
		<label>range</label>
		<input type='range' name='range'/><br/>
		<label>search</label>
		<input type='search' name='search'/><br/>
		<label>tel</label>
		<input type='tel' name='tel'/><br/>
		<label>time</label>
		<input type='time' name='time'/><br/>
		<label>url</label>
		<input type='url' name='url'/><br/>
		<label>week</label>
		<input type ='week' name ='week'/><br/>
		<label for ='submit'>전송</label>
		<input type = 'submit'name = '전송' />
	</form>
</body>
</html>