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
		<form:form action="processForm" modelAttribute="customer">

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
				
				<b>Choose Customer Code:</b>
				
				</td>
				<td>
				
				<form:input path="customerCode" />
			<form:errors path="customerCode" cssClass="error" />
				
				</td>
			</tr>

			<tr>
				<td><b>Batch Code:</b></td>
				<td><form:input path="batchCode" /> 
				<form:errors path="batchCode" cssClass="error" /></td>
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
				
				<form:input type="date" path="expiry" placeholder="yyyy-MM-dd" />
			<form:errors path="expiry" cssClass="error" />
				
				
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