<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Student Registration</title>
</head>
<body>

	<form:form action="processForm" modelAttribute="student">
		<label>First Name:&nbsp;</label>
		<form:input path="fullName" />
		<br>

		<label>Last Name:&nbsp;</label>
		<form:input path="email" />
		<br>

		<label>Password:&nbsp;</label>
		<input type="password" name="password" />
		<br>

		<label>Gender:</label>
		<br>
		<label>Male:&nbsp;</label>
		<form:radiobutton path="gender" value="Male" />
		<label>Female:&nbsp;</label>
		<form:radiobutton path="gender" value="Female" />
		<br>

		<label>Country:&nbsp;</label>
		<form:select path="country">
			<form:option value="IND" label="India" />
			<form:option value="USA" label="United States of America" />
			<form:option value="UK" label="United Kingdom" />
		</form:select>
		<br>



		<label>Courses:</label>
		<br>
		<label>Java Module 1:&nbsp;</label>
		<form:checkbox path="courses" value="Core Java" />
		<label>Java Module 2:&nbsp;</label>
		<form:checkbox path="courses" value="Advance Java" />
		<label>Java Module 3:&nbsp;</label>
		<form:checkbox path="courses" value="Java Frameworks" />
		<br>

		<label>Are you a graduate?</label>
		<form:checkbox path="graduate" />
		<br>

		<label>Comment</label>
		<form:textarea path="comment" cols="30" rows="5" />
		<br>


		<input type="submit" value="Register" />
	</form:form>
</body>
</html>