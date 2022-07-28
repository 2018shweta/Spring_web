<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Edit page</title>
</head>
<body>
<form action="updateuser" method="Post">

FirstName:<input type="text" name="FirstName" value="${user.firstName }">
<input type="hidden" name="userId" value="${user.userId}"/>
		<input type="submit" value="Update"/>



</form>
</body>
</html>