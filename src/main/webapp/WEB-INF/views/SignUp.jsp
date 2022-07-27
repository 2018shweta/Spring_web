<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="f"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>SignUp page</title>
</head>
<body>
	SignUp page

	<!-- <form action="saveuser" method="post">
firstName:<input name ="firstName" type="text"><br>
email:<input name ="email" type="text"><br>
password:<input name ="password" type="text"><br>
<button type="submit"value="submit">Submit</button>
</form> -->

	<f:form action="saveuser" method="post" modelAttribute="user">
firstName:<f:input path="firstName" />
		<f:errors path="firstName"></f:errors>
		<br>
		<br>
email:<f:input path="email" />
		<f:errors path="email"></f:errors>
		<br>
		<br>
password:<f:input path="password" />
		<f:errors path="password"></f:errors>
		<br>
		<br>
		<button type="submit" value="submit">Submit</button>



	</f:form>
</body>
</html>