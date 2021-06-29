<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
    
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Welcome</title>
</head>
<body>
	<h1>Welcome, <c:out value="${user.firstName}" /></h1>
	<a href="/logout">Logout</a>
	
	
	
	<table>
<thead>
				<tr>
				<th> Name</th>
				<th>Date</th>
				<th>Location</th>
				<th>Host</th>
				<th>Action</th>
				
				</tr>
</thead>
<tbody>
<c:forEach items="${thisState}" var="event">

				<tr>
				<td>${event.Date}</td>
				<td>${event.name}</td>
				<td>${event.state}</td>
				<td>${event.planner}</td>
				<td><a href = "join/event"> Join</a></td>
				
				</tr>
				</c:forEach>

</tbody>
</table>

<table>
<thead>
				<tr>
				<th> Name</th>
				<th>Date</th>
				<th>Location</th>
				<th>Host</th>
				<th>Action</th>
				
				</tr>
</thead>
<tbody>
<c:forEach items="${allStates}" var="event">

				<tr>
				<td>${event.Date}</td>
				<td>${event.name}</td>
				<td>${event.state}</td>
				<td>${event.planner}</td>
				<td><a href = "join/event"> Join</a></td>
				
				</tr>
				</c:forEach>

</tbody>
</table>


` 
<form:form action="/addevent" method="POST" modelAttribute="events">
 <form:input type="hidden" path="planner" value="${user.id}" />
		<div>

			<form:label path="eventDate"> Date</form:label>
			<form:input  path="eventDate" />
			<form:errors path="eventDate" />
		</div>
		
		<div>

			<form:label path="state"> state</form:label>
			<form:input  path="state" />
			<form:errors path="state" />
		</div>
		
		
		
		
		
		
		
		<button>Submit!</button>

	</form:form>
	


	
</body>
</html>