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
		<form action="submit" method="post">
			<div class="style">
				<label for="name">Your Name:</label>
				<input type="text" name="name"id="name"/>
			</div>
			
			<div class="style">
				<label for="location">Dojo Location:</label>
				<select name="location" id="location">
					<option selected>Location</option>
					<option>San Jose</option>
					<option>Seattle</option>
					<option>Burbank</option>
					<option>Online</option>
				</select>
			</div>
			
			<div class="style">
				<label for="language">Favorite Language:</label>
				<select name="language" id="language">
					<option selected>Language</option>
					<option>Java</option>
					<option>HTML</option>
					<option>Python</option>
					<option>JavaScript</option>
				</select>
			</div>
			
			<div class="style">
				<p>Comments (optional):</p>
				<textarea name="comments" id="comments"></textarea>				
			</div>
			
			<div>
				<button type="submit">Button</button>
			</div>
		</form>
	</div>
</body>
</html>