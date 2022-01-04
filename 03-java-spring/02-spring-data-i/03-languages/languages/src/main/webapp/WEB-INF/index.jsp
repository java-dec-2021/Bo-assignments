<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>  

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<title>Languages</title>
</head>


<body>
	<div class="container">
	<h1>Languages</h1>
	<table class="table table-striped table-dark">
		<thead>
			<tr>
				<th>Id</th>
				<th>Name</th>
				<th>Creator</th>
				<th>Version</th>
				<th>Created At</th>
				<th>Updated At</th>
				<th>Action</th>
			</tr>
			<c:forEach items="${ allLanguages }" var="language">
			<tr>
				<td>${ language.id }</td>
				<td><a href="/details/${language.id}">${ language.name }</a></td>
				<td>${ language.creator }</td>
				<td>${ language.currentVersion }</td>
				<td>${ language.createdAt }</td>
				<td>${ language.updatedAt }</td>
				<td><a href="/edit/${language.id}">Edit</a> | <a href="/delete/${ language.id}">Delete</a></td>
			</tr>			
			</c:forEach>		
		</thead>		
	</table>	
	</div>
	
	
	<div class="container">
		<form action="/htmladd" method="POST">
			<p>Name: </p>
			<input name="name" type="text">
			<p>Creator: </p>
			<input name="creator" type="text">
			<p>Current Version: </p>
			<input name="currentVersion" type="text">
			<button>Submit</button>
		</form>
	
	</div>


</body>
</html>

































