<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
     
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<title>Products and Categories</title>
</head>


<body>
	<h1>New Category</h1>

	<div>
		<div>
		<form action="addCategory" METHOD="POST">
			<p>Name: </p>
			<input name="name" type="text">
			
			<button>Create</button>
		</form>
	</div>
	</div>
	
	<div>
		<a href="/dashboard"><button type="button" class="btn btn-secondary">Dashboard</button></a>
	</div>

	<div class="container">
		<table class="table table-striped table-dark">
			<thead>
				<tr>
					<th>Name</th>
				</tr>
				
				<c:forEach items="${ allCategories }" var="category">
				<tr>
					<td><a href="/showCategory/${ category.id }">${ category.name }</a></td>
				</tr>
				</c:forEach>
			</thead>		
		</table>
	</div>




</body>
</html>




























