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

	<header
		style="display: flex; flex-direction: row; align-items: center; justify-content: space-around;">
		<div>
			<a href="#"></a>
		</div>
		<div class="dummy">
			<a href="/dashboard">Dashbord</a>
		</div>
	</header>

	<form:form action="/songs/new" method="POST" modelAttribute="song">
		<h1>New Song</h1>
		<div>
			<form:errors path="title" />
			<form:input type="text" name="title" path="title" placeholder="Enter Title" />
		</div>

		<div>
			<form:errors path="artist" />
			<form:input type="text" name="artist" path="artist" placeholder="Enter Artirst Name" />
		</div>

		<div>
			<form:errors path="rating" />
			<form:input type="number" name="rating" path="rating" placeholder="Enter Rating(1-10)" />
		</div>

		<div>
			<input type="submit" value="Submit" />
		</div>


	</form:form>












</body>
</html>