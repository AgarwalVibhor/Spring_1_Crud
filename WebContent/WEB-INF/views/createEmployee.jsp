<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Create Employee Form</title>
<style type="text/css">
	.error{
		color: red;
		font-weight: bold;
	}
</style>
</head>
<body>
	<form:form name="employeeForm" action="create.spring" method="POST" commandName="employeeForm">
		
		<table border="0" align="center">
		
			<tr>
				<td colspan="3" align="center"><h2>Employee Registration :</h2></td>
			</tr>
			<tr>
				<td>&nbsp;</td>
				<td>&nbsp;</td>
				<td>&nbsp;</td>
			</tr>
			<tr>
				<td>FIRST NAME :</td>
				<td><form:input path="fname" /></td>
				<td><form:errors path="fname" cssClass="error" />
			</tr>
			<tr>
				<td>LAST NAME :</td>
				<td><form:input path="lname" /></td>
				<td><form:errors path="lname" cssClass="error" />
			</tr>
			<tr>
				<td>DATE OF BIRTH :</td>
				<td><form:input path="dob" /></td>
				<td><form:errors path="dob" cssClass="error" />
			</tr>
			<tr>
				<td>EMAIL :</td>
				<td><form:input path="email" /></td>
				<td><form:errors path="email" cssClass="error" />
			</tr>
			<tr>
				<td>MOBILE :</td>
				<td><form:input path="mobile" /></td>
				<td><form:errors path="mobile" cssClass="error" />
			</tr>
			<tr>
				<td>ADDESSS : </td>
				<td><form:textarea path="address" /></td>
				<td><form:errors path="address" cssClass="error" />
			</tr>
			<tr>
				<td>SALARY :</td>
				<td><form:input path="salary" /></td>
				<td><form:errors path="salary" cssClass="error" />
			</tr>
			<tr> 
				<td>PASSWORD :</td>
				<td><form:password path="password" />
				<td><form:errors path="password" cssClass="error" />
			</tr>
			<tr>
				<td>&nbsp;</td>
				<td>&nbsp;</td>
				<td>&nbsp;</td>
			</tr>
			<tr>
				<td colspan="3" align="center"><input type="submit" value="Register" /></td>
			</tr>
		
		</table>
	
	
	</form:form>
	<br />
	<br />
	<h3 align="center">Click<a href="index.jsp">Here</a> to go to the Index Page.</h3>
</body>
</html>