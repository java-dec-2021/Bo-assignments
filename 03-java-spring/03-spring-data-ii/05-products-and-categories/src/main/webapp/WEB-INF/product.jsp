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
	<h1>New Product</h1>
	
	<div>
		<form action="addProduct" METHOD="POST">
			<p>Name: </p>
			<input name="name" type="text">
			
			<p>Description: </p>
			<input name="description" type="text">
			
			<p>Price: </p>
			<input name="price" type="text">
			<button>Create</button>
		</form>
	</div>

	<div>
		<a href="/dashboard"><button type="button" class="btn btn-secondary">Dashboard</button></a>
	</div>
	
	
	<div class="container">
		<table class="table table-striped table-dark">
			<thead>
				<tr>
					<th>Name</th>
					<th>Price</th>
					<th>Description</th>
				</tr>
				
				<c:forEach items="${ allProducts }" var="product">
				<tr>
					<td><a href="/show/${ product.id }">${ product.name }</a></td>
					<td>${ product.price }</td>
					<td>${ product.description }</td>
				</tr>
				</c:forEach>
			</thead>		
		</table>
	</div>
	
	
	
	

</body>
</html>



<!-- 
<form method="POST" action="/login">
<select name="usersToLogin">
<c:forEach items="${allUsers}" var="user">
<option value="${user.id}">${user.firstName}/>
</c:forEach>
</select>
<button>Login</button>
</form>
-->



<!-- 
Like an Album
public void likeAlbum(User user, Album album) {
 List<User> userWhoLiked = album.getLikers();
 usersWhoLiked.add(user);
 this.aRepo.save(album);
 }-->






















