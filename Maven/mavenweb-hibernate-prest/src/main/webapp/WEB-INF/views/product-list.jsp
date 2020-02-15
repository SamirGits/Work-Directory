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
<!-- ${pageContext.request.contextPath} : Context Path ~ Base Url -->
<a href="${pageContext.request.contextPath}/product/entry">Add New PRODUCT</a>

<hr/>
<table border="1" width="100%">
	<thead>
		<th>NAME</th>
		<th>CATEGORY</th>
		<th>COST</th>
		<th></th>
		<th></th>
	</thead>
	<tbody>
		<core:forEach var="product" items="${products}">
			<tr>
				<td>${product.name}</td>
				<td>${product.category}</td>
				<td>${product.cost}</td>
				<td><a href="${pageContext.request.contextPath}/product/update?id=${product.id}">UPDATE</a></td>
				<td><a href="${pageContext.request.contextPath}/product/delete/${product.id}">DELETE</a></td>
			</tr> 
		</core:forEach>
	</tbody>
</table>
</boy>
</html>