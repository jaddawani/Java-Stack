<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <h1>Index Page</h1>
<h3>Create a User</h3>
    <form action='/users' method='post'>
    <p>Name: <input type='text' name='name'></p>
    <p>Email: <input type='text' name='email'></p>
    <p>Dojo location: <select  name='location'>
        <option value="ramallah">ramallah</option>
        <option value="nablus">nablus</option>
    </select>
    <p>Favorite language <select  name='language'>
        <option value="python">python</option>
        <option value="java">java</option>
    </select>

    </p>
    <p> Comment (optional)</p>
    <textarea name="comm"></textarea>
    <input type='submit' value='create user'>
</form>
</body>
</html>