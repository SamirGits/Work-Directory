<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table border="1" width="100%">
	<thead>
		<th>id</th>
		<th>NAME</th>
		<th>EMAIL</th>
	</thead>
	<tbody>
		<core:forEach var="student" items="${students}">
			<tr>
				<td>${student.id}</td>
				<td>${student.name}</td>
				<td>${student.email}</td>
			</tr> 
		</core:forEach>
	</tbody>
</table>
</body>
</html>