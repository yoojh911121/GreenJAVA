<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>이름을 보내고 인사하는 프로그램</title>
</head>
<body>
	<fieldset>
		<legend>인사하기</legend>
		<form action="world.jsp" method="post">
			이름 : <input type="text" name="name" ><br />
			나이 : <input type="text" name="age"><br />
			<input type="submit" value="보내기">
		</form>
	</fieldset>
</body>
</html>