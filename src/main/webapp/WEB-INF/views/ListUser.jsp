<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false" %>
   <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>List user</title>
</head>
<body>
list user
<table border="2">
<tr>

    <th>userId</th>
 <th>firstname</th>
 <th>email</th>
 <th>usertype</th>
</tr>
<c:forEach items="${ users}" var="u">
<tr>
       <td>${u.userId}</td>
       
<td>${u.firstName }</td>
<td>${u.email}</td>
<td>${u.userType}</td>
</tr>
</c:forEach>







</table>





</body>
</html>