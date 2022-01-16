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

	<div class="container">
		<h1>${ showProduct.name }</h1>
	</div>
	
	<div>
		<h3>Categories</h3>
	</div>
	
	<div>
		<ul>
		<c:forEach items="${ showProduct.categories }" var="category">	<!-- showProduct.categories - categories is from the many to many relationship in the Product.java - private List<Category> categories; -->
			<li>${ category.name }</li>
		</c:forEach>
	</ul>
	</div>
	
	
	
	
	<div>
		<form action="/addCategoryToProduct/${ category.id }" method="POST">
			<select name="categoryName">
			<c:forEach items="${ listOfCategories }" var="cat">
				<option value="${ cat.id }">${ cat.name }</option>
			</c:forEach>		
			</select>	
			<button>Add</button>
		</form>
	</div>
	
	<div>
		<a href="/dashboard"><button type="button" class="btn btn-secondary">Dashboard</button></a>
	</div>

</body>
</html>





























