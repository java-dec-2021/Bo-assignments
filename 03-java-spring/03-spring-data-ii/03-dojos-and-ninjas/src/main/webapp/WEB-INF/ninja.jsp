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
	<h1>New Ninja</h1>
	
	<div>
		<form:form action="/createNinja" method="POST" modelAttribute="ninja">
		
			<form:select path="dojoLocation">
			<c:forEach items="${ dojos }" var="dojo">
				<option value="${ dojo.id }">${ dojo.name }</option>
			</c:forEach>
			</form:select>	
			
		
			<div class="form-control">
				<form:label path="firstName">First Name: </form:label>
				<form:errors path="firstName"/>
				<form:input type="text" path="firstName"/>
			</div>
			
			<div class="form-control">
				<form:label path="lastName">Last Name: </form:label>
				<form:errors path="lastName"/>
				<form:input type="text" path="lastName"/>
			</div>
			
			<div class="form-control">
				<form:label path="age">Age: </form:label>
				<form:errors path="age"/>
				<form:input type="text" path="age"/>
			</div>

			
			
			<button>Create</button>
		</form:form>
	</div>

</body>
</html>