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

   <h1>${product.name}</h1>

    <form:form action="/product/addCategory" method="POST"
        modelAttribute="relation">
        <form:input type="hidden" path="product" value="${product.id}" />

        <div>
            <form:select path="category">
                <c:forEach items="${category}" var="p">
                    <form:option value="${ p.id }">${ p.name }</form:option>

                </c:forEach>
            </form:select>
        </div>
        <button>add!</button>
    </form:form>



    <h1>Categories</h1>
    <c:forEach items="${product.categories}" var="p">
        <ul>

            <li>${ p.name }</li>
        </ul>
    </c:forEach>

   

</body>
</html>
