<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<title>Dojos and Ninjas</title>
</head>
<body>
	<h1>Dojos and Ninjas</h1>
	
	<div>
		<a href="/dojo">Create Dojo</a>
	</div>
	
	<div>
		<a href="/ninja">Create Ninja</a>
	</div>
	
	<div>
		<a href="/showDojosWithNinjas">Show Dojos With Ninjas</a>
	</div>
	
	
	<div>
		<table class="table table-striped table-dark">
			<thead>
				<tr>
					<th>Dojo</th>
				</tr>
				
				<c:forEach items="${ dojos }" var="dojo">
				<tr>
					<td><a href="/showDojoWithNinjas/${ dojo.id }">${ dojo.name }</a></td>
				
				</tr>
				</c:forEach>
				
			</thead>
		</table>
	
	</div>
</body>
</html>