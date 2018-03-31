<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<c:forEach var="cust" items="${custs}">
${cust.id}  &nbsp; ${cust.firstName}  &nbsp;  ${cust.lastName}  &nbsp; ${cust.gender} <br>
</c:forEach>
