<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isErrorPage="true"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>




<form:form action="/beseh" method="POST" modelAttribute="category">
		<div>

			<form:label path="name"> Name</form:label>
			<form:input  path="name" />
			<form:errors path="name" />
		</div>
		
		<button>Create!</button>

	</form:form>




</body>
</html>