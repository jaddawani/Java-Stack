<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isErrorPage="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<div>

<h1>First Query</h1>
	<c:forEach items="${Speaks}" var="speak">


		<p>Percentage:
			<c:out value="${speak[1]}"></c:out>
		</p>
		<p>Country Name:
			<c:out value="${speak[2]}"></c:out>
		</p>
		<p>Langauge:
			<c:out value="${speak[0]}"></c:out>
		</p>
		<p>---------------------------------------------------</p>



	</c:forEach>
	
	</div>
	
	<div>
	
	<h1> Second Query</h1>
	
	  <!-- <c:forEach items="${query2}" var="query2">


		<p># of CIty:
			<c:out value="${query2[1]}"></c:out>
		</p>
		<p>Country Name:
			<c:out value="${query2[0]}"></c:out>
		</p>
				<p>---------------------------------------------------</p>



	</c:forEach>
	             !-->
	</div>



<div>
	
	<h1> Forth Query</h1>
	
	   <c:forEach items="${query4}" var="query4">


<p>Percentage:
			<c:out value="${query4[2]}"></c:out>
		</p>
		<p>Country Name:
			<c:out value="${query4[0]}"></c:out>
		</p>
		<p>Langauge:
			<c:out value="${query4[1]}"></c:out>
		</p>
		<p>---------------------------------------------------</p>


		

	</c:forEach>
	            
	</div>	
	
	
	




</body>
</html>