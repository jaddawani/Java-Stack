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


<h1> NEW LICENSE!!</h1>



 

 

    <form:form action="/license/news" method="post"
        modelAttribute="license">
        <p>
            <form:label path="person">Person:</form:label>
            <form:errors path="person" />
    <select name="person">
        <c:forEach items="${persons}" var="person">
               
<option value="${person.getId()}">${person.firstName}</option>
        </c:forEach>
    </select>
        </p>
        <p>
            <form:label path="state">State:</form:label>
            <form:errors path="state" />
            <form:input path="state" />
        </p>
        <p>
            <form:label path="expirationDate">Expiration Date:</form:label>
            <form:errors path="expirationDate" />
            <form:input type="date" path="expirationDate" />
        </p>

        <input type="submit" value="Create" />
    </form:form>

</body>
</html>