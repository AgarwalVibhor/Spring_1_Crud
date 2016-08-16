<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Single Employee Details Page</title>
</head>
<body>
	<table border="0" align="center">
	
		<tr>
			<td colspan="2" align="center">Employee Details :</td>
		</tr>
		<tr>
			<td>&nbsp;</td>
			<td>&nbsp;</td>
		</tr>
		<tr>
			<td>EMPLOYEE ID</td>
			<td>${employee.employeeId}</td>
		</tr>
		<tr>
			<td>FIRST NAME :</td>
			<td>${employee.fname}</td>
		</tr>
		<tr>
			<td>LAST NAME :</td>
			<td>${employee.lname}</td>
		</tr>
		<tr>
			<td>DATE OF BIRTH :</td>
			<td>${employee.dob}</td>
		</tr>
		<tr>
			<td>EMAIL :</td>
			<td>${employee.email}</td>
		</tr>
		<tr>
			<td>MOBILE :</td>
			<td>${employee.mobile}</td>
		</tr>
		<tr>
			<td>ADDRESS :</td>
			<td>${employee.address}</td>
		</tr>
		<tr>
			<td>SALARY :</td>
			<td>${employee.salary}</td>
		</tr>
		<tr>
			<td>PASSWORD :</td>
			<td>${employee.password}</td>
		</tr>
	
	</table>
	<br />
	<br />
	<h3 align="center">Click<a href="index.jsp">Here</a> to go to the Index Page.</h3>
</body>
</html>