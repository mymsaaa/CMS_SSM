<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
<form action="login" method="post">
	<input type="text" name="userAccount" value="${user.userAccount }"/>
	<input type="password" name="userPassword" value="${user.userPassword }"/>
	<input type="submit" value="登陆"/>
	<span>${msg }</span>
</form>
</body>
</html>