<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>All Employees Page</title>
</head>
<body>
	<form:form action="listAll.spring" method="POST">
	
		<table border="0" align="center">
		
			<tr>
				<td><h2>Click on "Get Employees" to get the details of all employees :</h2></td>
			</tr>
			<tr>
				<td>&nbsp;</td>
			</tr>
			<tr>
				<td align="center">${message}</td>
			</tr>
			<tr>
				<td>&nbsp;</td>
			</tr>
			<tr>
				<td align="center"><input type="submit" value="Get Employees" /></td>
			</tr>
			
		</table>
	
	</form:form>
	<br />
	<br />
	<h3 align="center">Click<a href="index.jsp">Here</a> to go to the Index Page.</h3>
</body>
</html>