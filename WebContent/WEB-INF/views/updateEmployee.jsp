<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Update Employee Page</title>
<style type="text/css">
	.error{
		color: red;
		font-weight: bold;
	}
</style>
</head>
<body>
	<form:form name="updateEmployee" action="update.spring" method="POST">
	
		<table border="0" align="center">
			<tr>
			</tr>
				<td colspan="3" align="center"><h2>Employee Update :</h2></td>
			<tr>
				<td>&nbsp;</td>
				<td>&nbsp;</td>
				<td>&nbsp;</td>
			</tr>
			<tr>
				<td>EMPLOYEE ID :</td>
				<td><form:input path="employeeId" /></td>
				<td><form:errors path="employeeId" cssClass="error" /></td>
			</tr>
			<tr>
				<td>&nbsp;</td>
				<td>&nbsp;</td>
				<td>&nbsp;</td>
			</tr>
			<tr>
				<td colspan="3" align="center"><input type="submit" value="Update" /></td>
			</tr>
		</table>
	
	</form:form>
</body>
</html>