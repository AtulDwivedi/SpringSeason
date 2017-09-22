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
		<label><b>First Name:</b>&nbsp;</label>
		<form:input path="fullName" />
		<br><br>

		<label><b>Last Name:</b>&nbsp;</label>
		<form:input path="email" />
		<br><br>

		<label><b>Password:</b>&nbsp;</label>
		<input type="password" name="password" />
		<br><br>

		<label><b>Gender:</b></label>&nbsp;
		<label>Male:&nbsp;</label>
		<form:radiobutton path="gender" value="Male" />
		<label>Female:&nbsp;</label>
		<form:radiobutton path="gender" value="Female" />
		<br><br>

		<label><b>Country:</b>&nbsp;</label>
		<form:select path="country">
			<form:option value="IND" label="India" />
			<form:option value="USA" label="America" />
			<form:option value="UK" label="Australia" />
		</form:select>
		<br><br>

		<label><b>Courses:</b></label>
		<label>Java Module 1:&nbsp;</label>
		<form:checkbox path="courses" value="Core Java" />
		<label>Java Module 2:&nbsp;</label>
		<form:checkbox path="courses" value="Advance Java" />
		<label>Java Module 3:&nbsp;</label>
		<form:checkbox path="courses" value="Java Frameworks" />
		<br><br>

		<label><b>Are you a graduate?</b></label>
		<form:checkbox path="graduate" />
		<br><br>

		<label><b>Comment</b></label>
		<form:textarea path="comment" cols="20" rows="2" />
		<br><br>


		<input type="submit" value="Register" />
	</form:form>
</body>
</html>