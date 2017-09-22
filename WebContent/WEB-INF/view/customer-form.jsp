<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Customer Form</title>
<style type="text/css">
.error{
color:red;
}
</style>
</head>
<body>

<form:form action="processForm" modelAttribute="customer">
First Name: <form:input path="firstName"/>
<form:errors path="firstName" cssClass="error" />

<br>

Last Name: <form:input path="lastName"/>
<form:errors path="lastName" cssClass="error" />
<br>

Age: <form:input path="age"/>
<form:errors path="age" cssClass="error" />
<br>

Choose Customer Code: <form:input path="customerCode"/>
<form:errors path="customerCode" cssClass="error" />
<br>

Batch Code: <form:input path="batchCode"/>
<form:errors path="batchCode" cssClass="error" />
<br>


<input type="submit" value="Submit" />
</form:form>


</body>
</html>