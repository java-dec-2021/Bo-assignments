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
		<h1>${ showCategory.name }</h1>
	</div>
	
	<div>
		<h3>Products</h3>
	</div>
	
	<div>
		<ul>
		<c:forEach items="${ showCategory.products }" var="product">	<!-- showProduct.categories - categories is from the many to many relationship in the Product.java - private List<Category> categories; -->
			<li>${ product.name }</li>
		</c:forEach>
	</ul>
	</div>
	
	
	
	
	<div>
		<form action="/addProduct" method="POST">
			<select name="name" id="name">
			<c:forEach items="${ listOfProducts }" var="prod">
				<option>${ prod.name }</option>
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