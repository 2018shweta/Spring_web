<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
       <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ListAll images</title>
</head>
<body>
<table border="2">

<tr>
<th>Images</th>
<th>userId</th>
<th>Action</th>
</tr>

<c:forEach items="${ profiles}" var="i">

<tr>
<td><img  src="${i.imgUrl}" height="500px" width="500px"/></td>
<td>${i.userId}</td>
<td>delete</td>
</tr>


</c:forEach>




</table>
</body>
</html>