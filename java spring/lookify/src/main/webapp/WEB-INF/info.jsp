<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isErrorPage="true"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Info</title>s
</head>
<body>
<a href="/dashboard"> Dashboard</a>
	<p>Title: ${song.title}</p>
	<p>Artist: ${song.artist }</p>
	<p>Rating: ${song.rating }</p>

</body>
</html>