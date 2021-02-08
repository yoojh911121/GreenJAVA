<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	// POST전송시 한글이 깨지는것 방지!!!
	request.setCharacterEncoding("UTF-8");
%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>${param.name }님 반갑습니다.</h1>
	<h1>${param.age }살이네 행님이라 불러!!!</h1>
</body>
</html>