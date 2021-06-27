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
<h1> New Product!!</h1>



<form:form action="/kalb" method="POST" modelAttribute="product">
		<div>

			<form:label path="name"> Name</form:label>
			<form:input  path="name" />
			<form:errors path="name" />
		</div>
		
		
		<div>

			<form:label path="description"> description</form:label>
			<form:input  path="description" />
			<form:errors path="description" />
		</div>
		
		
		
		<div>

			<form:label path="price"> price</form:label>
			<form:input  path="price" />
			<form:errors path="price" />
		</div>
		
		
		
		
		
		
		<button>Create!</button>

	</form:form>




</body>
</html>