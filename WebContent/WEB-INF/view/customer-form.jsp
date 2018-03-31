<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Customer Form</title>
<style type="text/css">
.error {
	color: red;
}
</style>
</head>
<body>
	<table align="center">
		<form:form action="save" modelAttribute="customer">
<tr>
				<td><b>Email*:</b></td>
				<td><form:input path="email" /> 
					<form:errors path="email" cssClass="error" />
				</td>
			</tr>


			<tr>
				<td><b>First Name*:</b></td>
				<td><form:input path="firstName" /> 
					<form:errors path="firstName" cssClass="error" />
				</td>
			</tr>

			<tr>
				<td>
				
				<b>Last Name*:</b>
				
				</td>
				<td>
				
				<form:input path="lastName" />
			<form:errors path="lastName" cssClass="error" />
				
				</td>
			</tr>
			
			<tr>
				<td>
				
				<b>Age*:</b>
				
				</td>
				<td>
				
				<form:input path="age" />
			<form:errors path="age" cssClass="error" />
				
				</td>
			</tr>
			
			<tr>
				<td>
				
				<b>Gender:</b>
				
				</td>
				<td>
				
				<form:input path="gender" />
			<form:errors path="gender" cssClass="error" />
				
				</td>
			</tr>

			<tr>
				<td><b>PAN Card Number:</b></td>
				<td><form:input path="panCardNumber" /> 
				<form:errors path="panCardNumber" cssClass="error" /></td>
			</tr>

			<tr>
				<td>
				
				<b>Date Of Birth Date:</b>
				
				</td>
				<td>
				
				<form:input type="date" path="dob" placeholder="yyyy-MM-dd" />
			<form:errors path="dob" cssClass="error" />
				
				
				</td>
			</tr>
			
			<tr>
				<td>
				
				<b>Membership Expiery Date:</b>
				
				</td>
				<td>
				
				<form:input type="date" path="membershipExpiryDate" placeholder="yyyy-MM-dd" />
			<form:errors path="membershipExpiryDate" cssClass="error" />
				
				
				</td>
			</tr>
			
			<tr>
				<td>
				
				&nbsp;
				
				</td>
				<td>
				
				<input type="submit" value="Submit" />
				
				</td>
			</tr>
			
			

		
			

			<br>
			<br>


			
		</form:form>
	</table>

</body>
</html>