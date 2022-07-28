<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="f"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Search user</title>
</head>
<body>
<jsp:include page="Header.jsp"></jsp:include>


<form action="searchuser" method="post">

email:<input name="name" type="text"><br><br>

<button type="submit">submit</button>


</form>

</body>
</html>