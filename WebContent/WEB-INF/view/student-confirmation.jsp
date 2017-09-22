<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Process Student Registration</title>
</head>
<body>

	<span>Full Name: ${student.fullName}</span>
	<br>
	<span>Email: ${student.email}</span>
	<br>
	<span>Gender: ${student.gender}</span>
	<br>
	<span>Country: ${student.country}</span>
	<br>

	<span>Courses: </span>
	<c:forEach var="course" items="${student.courses }">
 		${course } &nbsp;
	</c:forEach>
	
	<br>
	<span>Graduate: ${student.graduate}</span>
	<br>
	
	<br>
	<span>Comment: ${student.comment}</span>
	<br>

</body>
</html>