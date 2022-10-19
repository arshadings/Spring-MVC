<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	Welcome to index page
	
	<form action="addAlien" method="post">
	Enter alien id : <input type="number" name="aid"><br><br>
	Enter alien name : <input type="text" name="aname"><br>
	<input type="submit">
	</form>
	<br/><br>
	<form action="getAlien" method="get">
	Enter alien id : <input type="number" name="aid"><br>
	<input type="submit">
	</form><br><br>
	<form action="getAlienByName" method="get">
	Enter alien Name : <input type="text" name="aname"><br>
	<input type="submit">
	</form><br><br>
	
</body>
</html>