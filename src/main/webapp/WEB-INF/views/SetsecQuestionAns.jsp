<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form method="post" action="savequestionans">
		Question :  <select name="question">
							<option value="Your mother's BirthPlace">Your mother's BirthPlace</option>
				    		<option value="First Bank Who Provide CreditCard">First Bank Who Provide CreditCard</option>
				    		<option value="First Job Company Name">First Job Company Name</option>
				    </select>
		<br><br>
		Ans : <input type="text" name="ans"><br><br>
		<input type="submit" value="SetQuestion"/> 
	</form>
</body>
</html>