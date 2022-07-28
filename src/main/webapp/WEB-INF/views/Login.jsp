<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>login page</title>
</head>
<body>


login

<form action="login" method="post">
		Email :  <input type="text" name="email"><br><br> 
		Password : <input type="password" name="password"><br><br>
		<input type="submit" value="Login"/>
	</form>
	${msg}



</form>
</body>
</html>