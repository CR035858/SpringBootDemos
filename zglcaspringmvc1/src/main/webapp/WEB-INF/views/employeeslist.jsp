<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="pink">

<table border="2">
<tr><td>Employee Id</td><td>Employee Name</td></tr>
<c:forEach items="${employees}" var="employee">
<tr>
<td>${employee.employeeId}</td>
<td>${employee.employeeName}</td>
</tr>
</c:forEach>
</table>
<a href="/greet/hello">Go Back to Home Page</a>
</body>
</html>