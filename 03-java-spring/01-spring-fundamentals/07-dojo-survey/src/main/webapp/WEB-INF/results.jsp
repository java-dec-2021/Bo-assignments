<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<link rel="stylesheet" href="css/styles.css">
<title>Dojo Survey</title>
</head>
<body>
	<h1>Dojo Survey</h1>
	<div class="container">
		<h3>Submitted Info</h3>
		<p><strong>Name:</strong> <c:out value="${ name }"/></p>
		<p><strong>Location:</strong> <c:out value="${ location }"/></p>
		<p><strong>Language:</strong> <c:out value="${ language }"/></p>
		<p><strong>Comment:</strong> <c:out value="${ comment }"/></p>	
	</div>
</body>
</html>

