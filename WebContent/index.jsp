<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Index Page</title>
</head>
<body>
	<h1 align="center">Index Page</h1>
	<br />
	<br />
	<h2 align="center">Click on any one of the following links :</h2>
	<br />
	<br />
	<h3>1. Click <a href='<c:url value="/create.spring" />'>Create</a> to create a new employee.</h3>
	<br />
	<h3>2. Click <a href='<c:url value="/updateStart.spring" />'>Update</a> to update an existing employee.</h3>
	<br />
	<h3>3. Click <a href='<c:url value="/deleteStart.spring" />'>Delete</a> to delete an existing employee.</h3>
	<br />
	<h3>4. Click <a href='<c:url value="/listSingleStart.spring" />'>Search By Employee Id</a> to search an employee by id.</h3>
	<br />
	<h3>5. Click <a href='<c:url value="/fname.spring" />'>Search By First Name</a> to search an employee by his first name.</h3>
	<br />
	<h3>6. Click <a href='<c:url value="/dob.spring" />'>Search By Date Of Birth</a> to search an employee by his date of birth.</h3>
	<br />
	<h3>7. Click <a href='<c:url value="/salary.spring" />'>Search By Salary</a> to search an employee by salary.</h3>
	<br />
	<h3>8. Click <a href='<c:url value="/listAll.spring" />'>List All Employees</a> to get the details of all employees.</h3>
	
	
	
</body>
</html>