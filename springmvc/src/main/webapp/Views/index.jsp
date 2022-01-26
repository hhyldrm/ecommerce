<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home Page</title>
</head>
<body>
	<h1>Spring MVC</h1>
	<p>
	Spring MVC HOMEWORK<br><br>
	Spring MVC is IMPORTANT
	</p>
	<!--  <h1>Get two integers from the user</h1>
	<form action = "add">
		Enter first integer:<input type ="text" name = "no1">
		<br><br>
		Enter second integer: <input type ="text" name = "no2">
		<br><br>
		<input type ="submit">
		
	</form>-->
	<!-- ******************************************************************************************************************** -->
	<!--  <h1>Add Student</h1>
	<form action = "addStudent">
		Enter student id:<input type ="text" name = "id">
		<br><br>
		Enter student name: <input type ="text" name = "name">
		<br><br>
		<input type ="submit">
		
	</form> -->
	
	<!--  <h1>Add Student</h1>
	<form action = "addStudent" method="post">
		Enter student id:<input type ="text" name = "id">
		<br><br>
		Enter student name: <input type ="text" name = "name">
		<br><br>
		<input type ="submit">
		
	</form>-->
	
	<!--  <h1>Get All Students</h1>
	<form action = "getStudent" method="get">
		Enter student id:<input type ="text" name = "id">
		<br><br>
		Enter student name: <input type ="text" name = "name">
		<br><br>
		<input type ="submit">
		
	</form>
	-->
	
	<h1> Get specific student by using the id</h1>
	<form action="getStudentWithId", method= "get">
	Enter student id to get the information:<input type="text" name = "id">
	<br><br>
	<input type ="submit">
	</form>
</body>
</html>




