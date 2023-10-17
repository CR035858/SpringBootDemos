<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table border="2">
<thead>
<tr><td>StudentId</td><td>StudentName</td></tr>
</thead>
<tbody>
<c:forEach items="${students}" var="student">
<tr><td><c:out value="${student.studId}" /></td><td><c:out value="${student.studName}" /></td></tr>
</c:forEach>
</tbody>


</table>
</body>
</html>