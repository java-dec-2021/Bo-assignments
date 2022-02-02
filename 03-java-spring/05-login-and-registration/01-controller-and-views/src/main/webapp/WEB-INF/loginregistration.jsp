<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<title>Login & Registration</title>
</head>
<body>
<div class="container">
	<h1>Login & Registration</h1>
	<div class="row">
		<div class="column">
			<h3>Register</h3>
			
			<form:form action="/registerUser" meethod="POST" modelAttribute="user">
				<div class="form-group">
					<form:label path="firstName">First Name</form:label>
					<form:errors path="firstName"/>
					<form:input class="form-control" path="firstName"/>
				</div>
				
				<div class="form-group">
					<form:label path="lastName">Last Name</form:label>
					<form:errors path="lastName"/>
					<form:input class="form-control" path="lastName"/>
				</div>
				
				<div class="form-group">
					<form:label path="email">Email</form:label>
					<form:errors path="email"/>
					<form:input type="email" class="form-control" path="email"/>
				</div>
				
				<div class="form-group">
					<form:label path="password">Password</form:label>
					<form:errors path="password"/>
					<form:input type="password" class="form-control" path="password"/>					
				</div>
				
				<div class="form-group">
					<form:label path="confirmPassword">Confirm Password</form:label>
					<form:errors path="confirmPassword"/>
					<form:input type="password" class="form-control" path="confirmPassword"/>					
				</div>
				
				<input class="btn btn-primary" type="submit" value="Submit"/>			
			</form:form>			
		</div>
		
		
		<div class="column">
			<h3>Login</h3>
			<p>${ loginError }</p>
			<form action="/login" method="POST">			
				<label>Email Address</label>
				<input type="email" name="lemail">
				
				<label>Password</label>
				<input type="password" name="lpassword">
				
				<button>Login</button>			
			</form>			
		</div>			
				
	</div>
</div>
</body>
</html>