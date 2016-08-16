<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Delete Start Page</title>
<style type="text/css">
	.error{
		color: red;
		font-weight: bold;
	}
</style>
</head>
<body>
	<form:form action="deleteStart.spring" method="POST">
	
		<table border="0" align="center">
		
			<tr>
				<td colspan="2" align="center"><h1>Deleting Employee Record</h1></td>
			</tr>
			<tr>
				<td>&nbsp;</td>
				<td>&nbsp;</td>
			</tr>
			<tr>
				<td colspan="2" align="center" class="error">${message}</td>
			</tr>
			<tr>
				<td>&nbsp;</td>
				<td>&nbsp;</td>
			</tr>
			<tr>
				<td>ENTER EMPLOYEE ID :</td>
				<td><input type="number" name="employeeId" /></td>
			</tr>
			<tr>
				<td>ENTER EMPLOYEE EMAIL ID :</td>
				<td><input type="text" name="email" /></td>
			</tr>
			<tr>
				<td>&nbsp;</td>
				<td>&nbsp;</td>
			</tr>
			<tr>
				<td colspan="2" align="center"><input type="submit" value="Delete" /></td>
			</tr>
			
		</table>
	
	</form:form>
	<br />
	<br />
	<h3 align="center">Click<a href="index.jsp">Here</a> to go to the Index Page.</h3>
</body>
</html>