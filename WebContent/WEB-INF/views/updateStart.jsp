<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Update Start Page</title>
<style type="text/css">
	.error{
		color: red;
		font-weight: bold;
	}
</style>
</head>
<body>
	<form action="updateStart.spring" method="POST">
	
		<table border="0" align="center">
			<tr>
				<td colspan="2" align="center"><h1>Update Details</h1></td>
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
				<td><input type="number" name="employeeId" required="required"></td>
			</tr>
			<tr>
				<td>ENTER EMPLOYEE EMAIL : </td>
				<td><input type="text" name="email" required="required"></td>
			</tr>
			<tr>
				<td>&nbsp;</td>
				<td>&nbsp;</td>
			</tr>
			<tr>
				<td colspan="2" align="center"><input type="submit" value="Update" /></td>
			</tr>
		</table>
	
	</form>
	<br />
	<br />
	<h3 align="center">Click<a href="index.jsp">Here</a> to go to the Index Page.</h3>
</body>
</html>