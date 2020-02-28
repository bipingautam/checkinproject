<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Customer Details</title>
</head>
<body>
	<table>
		<thead>
			<tr>
				<th>Customer</th>
				<th>Email</th>
				<th>Style</th>
				<th>Coloring</th>
			</tr>
		</thead>
		<tbody>
			<tr>
				<td>${customer.customer}</td>
				<td>${customer.email}</td>
				<td>${customer.style}</td>
				<td>${customer.coloring}</td>
			</tr>
		</tbody>
	</table>
</body>
</html>