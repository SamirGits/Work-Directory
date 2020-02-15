<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="spring-form" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<spring-form:form action="${pageContext.request.contextPath}/product/save-update"   method="POST" modelAttribute="product">
	<spring-form:hidden path="id"/>
	<br/>
	<br/>
	<spring-form:label path="name">Name : </spring-form:label>
	<spring-form:input path="name"/>
	<br/>
	<br/>
	<spring-form:label path="category">Category : </spring-form:label>
	<spring-form:input path="category"/>
	<br/>
	<br/>
	<spring-form:label path="cost">Cost : </spring-form:label>
	<spring-form:input path="cost"/>
	<br/>
	<br/>
	<input  type="submit" value="Update">
	
</spring-form:form>
</body>
</html>