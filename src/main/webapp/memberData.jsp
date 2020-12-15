<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<%@ page isELIgnored = "false" %>
<title>Registered member data</title>
</head>
<body>
	<h1>Hello ${ email }, here is your data</h1>
	<table>
		<tr>
			<td>First Name: </td>
			<td> ${ firstName } </td>
		</tr>
		<tr>
			<td>Last Name: </td>
			<td> ${ lastName } </td>
			
		</tr>	
		<tr>
			<td>User Name: </td>
			<td> ${ userName } </td>
		</tr>
		
		<tr>
			<td>Email: </td>
			<td> ${ email } </td>
			
		</tr>
	</table>
</body>
</html>