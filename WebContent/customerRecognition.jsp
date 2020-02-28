<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Customer Check-In</title>
</head>
<body>
	<form action="CustomerController" method="post">
		<div>
			<label>Customername</label>
			<input type="text" name="customer">
		</div>
		<div>
			<label>Email</label>
			<input type="email" name="email">
		</div>
		<div>
			<label>Style</label>
			<input type="text" name="style">
		</div>
		<div>
			<label>Coloring</label>
			<input type="text" name="Coloring">
		</div>
		<div>
			<input type="submit" value="Submit">
		</div>
</form>
</body>
</html>