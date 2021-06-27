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


<h1> NEW PERSON!!</h1>

<form:form action="/person/new" method="POST" modelAttribute="person">
		
		<div>
			<form:errors path="firstName" />
			<form:input type="text" name="firstName" path="firstName" placeholder="Enter firstName" />
		</div>

		<div>
			<form:errors path="lastName" />
			<form:input type="text" name="lastName" path="lastName" placeholder="Enter lastName" />
		</div>

		

		<div>
			<input type="submit" value="Submit" />
		</div>


	</form:form>


</body>
</html>