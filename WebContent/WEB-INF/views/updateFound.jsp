<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Update Found Page</title>
<style type="text/css">
	.error{
		color: red;
		font-weight: bold;
	}
</style>
</head>
<body>
	
	<form:form name="employeeForm" action="update.spring" method="POST" commandName="employeeForm">
	
		<table border="0" align="center">
		
			<tr>
				<td colspan="3" align="center"><h1>Update Employee Details</h1></td>
			</tr>
			<tr>
				<td>&nbsp;</td>
				<td>&nbsp;</td>
				<td>&nbsp;</td>
			</tr>
			<tr>
				<td>EMPLOYEE ID : </td>
				<td><form:input path="employeeId" readonly="true" value="${employee.employeeId}" /></td>
				<td>&nbsp;</td>
			</tr>
			<tr>
				<td>FIRST NAME : </td>
				<td><form:input path="fname" value="${employee.fname}" /></td>
				<td><form:errors path="fname" cssClass="error" /></td>
			</tr>
			<tr>
				<td>LAST NAME : </td>
				<td><form:input path="lname" value="${employee.lname}" /></td>
				<td><form:errors path="lname" cssClass="error" /></td>
			</tr>
			<tr>
				<td>DATE OF BIRTH :</td>
				<td><form:input path="dob" value="${employee.dob}" /></td>
				<td><form:errors path="dob" cssClass="error" /></td>
			</tr>
			<tr>
				<td>EMAIL :</td>
				<td><form:input path="email" value="${employee.email}" /></td>
				<td><form:errors path="email" cssClass="error" /></td>
			</tr>
			<tr>
				<td>MOBILE :</td>
				<td><form:input path="mobile" value="${employee.mobile}" /></td>
				<td><form:errors path="mobile" cssClass="error" /></td>
			</tr>
			<tr>
				<td>ADDRESS :</td>
				<td><form:input path="address" value="${employee.address}" /></td>
				<td><form:errors path="address" cssClass="error" /></td>
			</tr>
			<tr>
				<td>SALARY :</td>
				<td><form:input path="salary" value="${employee.salary}" /></td>
				<td><form:errors path="salary" cssClass="error" /></td>
			</tr>
			<tr>
				<td>PASSWORD :</td>
				<td><form:input path="password" value="${employee.password}" /></td>
				<td><form:errors path="password" cssClass="error" /></td>
			</tr>
			<tr>
				<td>&nbsp;</td>
				<td>&nbsp;</td>
				<td>&nbsp;</td>
			</tr>
			<tr>
				<td colspan="3" align="center"><input type="submit" value="Update"></td>
			</tr>
			
		</table>
		
	</form:form>
	<br />
	<br />
	<h3 align="center">Click<a href="index.jsp">Here</a> to go to the Index Page.</h3>
	
</body>
</html>		