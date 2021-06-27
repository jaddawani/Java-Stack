<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<h1>All Languages</h1>
<table>
    <thead>
        <tr>
            <th>Name</th>
            <th>creator</th>
            <th>Version</th>
            <th>Action</th>
        </tr>
    </thead>
    <tbody>
        <c:forEach items="${langs}" var="lang">
        <tr>
            <td><a href=/languages/${lang.id}><c:out value="${lang.name}"/></a></td>
            <td><c:out value="${lang.creator}"/></td>
            <td><c:out value="${lang.version}"/></td>
            <td><a href = /languages/edit/${lang.id}>Update</a> || <a href = /languages/${lang.id}/delete>Delete</a></td>
            
        </tr>
        </c:forEach>
    </tbody>
</table>


<form:form action="/createlang" method="post" modelAttribute="lang">
    <p>
        <form:label path="name">Name</form:label>
        <form:errors path="name"/>
        <form:input path="name"/>
    </p>
    <p>
        <form:label path="creator">Creator</form:label>
        <form:errors path="creator"/>
        <form:textarea path="creator"/>
    </p>
    <p>
        <form:label path="version">Version</form:label>
        <form:errors path="version"/>
        <form:input path="version"/>
    </p>
  
    <input type="submit" value="Submit"/>
</form:form>    





</body>
</html>