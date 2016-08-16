<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Deletion Confirmation Page</title>
</head>
<body>
	<form:form action="delete.spring" method="POST">
	
		<table border="0" align="center">
		
			<tr>
				<td colspan="2" align="center"><h1>Deletion Confirmation</h1></td>
			</tr>
			<tr>
				<td>&nbsp;</td>
				<td>&nbsp;</td>
			</tr>
			<tr>
				<td><h1 align="center">Are you sure you want to delete the employee with Id : ${employeeId}</h1></td>
			</tr>
			<tr>
				<td colspan="2" align="center"><input type="submit" value="Delete Employee" /></td>
			</tr>
		
		</table>
		<input type="hidden" name="employeeId" value="${employeeId}" />
	
	</form:form>
	<br />
	<br />
	<h3 align="center">Click<a href="index.jsp">Here</a> to go to the Index Page.</h3>
</body>
</html>