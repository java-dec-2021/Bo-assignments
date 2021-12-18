<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="/css/style.css" rel="stylesheet"/>
<title>Date & Time</title>
</head>

<body onload="alertPage('<c:out value="${dt}"/>')">

	<h1 class= <c:out value="${ dt }"/> > <c:out value="${ dtFormat }" /> </h1>
	<div>
		<a href="/home">Back</a>
	</div>
	
</body>

	<script defer type="text/javascript" src="js/alert.js"></script>
	
</html>