<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Employees Details</title>
</head>
<body>
	<table border="1" align="center">
		<tr>
			<td colspan="9" align="center"><h2>Employee Details :</h2></td>
		</tr>
		<tr>
			<th>EMPLOYEE ID</th>
			<th>FIRST NAME</th>
			<th>LAST NAME</th>
			<th>DATE OF BIRTH</th>
			<th>EMAIL</th>
			<th>MOBILE</th>
			<th>ADDRESS</th>
			<th>SALARY</th>
			<th>PASSWORD</th>
		</tr>
		
		<c:forEach items="${employees}" var="employee">
		
		<tr>
			<td align="center"><c:out value="${employee.employeeId}"></c:out></td>
			<td align="center"><c:out value="${employee.fname}"></c:out></td>
			<td align="center"><c:out value="${employee.lname}"></c:out></td>
			<td align="center"><c:out value="${employee.dob}"></c:out></td>
			<td align="center"><c:out value="${employee.email}"></c:out></td>
			<td align="center"><c:out value="${employee.mobile}"></c:out></td>
			<td align="center"><c:out value="${employee.address}"></c:out></td>
			<td align="center"><c:out value="${employee.salary}"></c:out></td>
			<td align="center"><c:out value="${employee.password}"></c:out></td>
		</tr>
		
		</c:forEach>
	
	</table>
	
	<br />
	<br />
	<h3 align="center">Click<a href="index.jsp">Here</a> to go to the Index Page.</h3>
</body>
</html>