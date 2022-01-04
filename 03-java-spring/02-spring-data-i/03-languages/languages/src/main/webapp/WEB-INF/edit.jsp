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
	<h1>Edit Language</h1>
	<div>
		<form:form method="POST" action="/edit/${language.id}" modelAttribute="language">
			<form:label path="name">Name</form:label>
			<form:errors path="name"/>
			<form:input type="text" path="name"/>
			
			<form:label path="creator">Name</form:label>
			<form:errors path="creator"/>
			<form:input type="text" path="creator"/>
			
			<form:label path="currentVersion">Name</form:label>
			<form:errors path="currentVersion"/>
			<form:input type="text" path="currentVersion"/>
			
			<button>Submit</button>
		</form:form>
	</div>
	<div>
		<a href="/dashboard">Dashboard</a>
	</div>

</body>
</html>