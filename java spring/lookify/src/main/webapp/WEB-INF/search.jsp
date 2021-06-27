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


	<div class="container">

		<header
			style="display: flex; flex-direction: row; align-items: center; justify-content: space-between;">
			<div>
				<a href="#"></a>
			</div>
			<div class="search">
				<form style="">
					<input type="text" placeholder="" id="dashSearchBox"
						name="dashSearchBox"> <input type="submit"
						value="Search Songs">
				</form>
			</div>
		</header>
		<h1>Songs List:</h1>
		<table>
			<thead>
				<th>Title</th>
				<th>Rating</th>
				<th>Action</th>
			</thead>
			<tbody>

				<c:forEach items="${songs}" var="song">
					<tr>
						<td><a href="/songs/${song.id}">${song.title}</a></td>
						<td>${ song.rating}</td>
						<td><a href="/delete/${song.id}">Delete</a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>



</body>
</html>