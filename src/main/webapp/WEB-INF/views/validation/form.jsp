<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<title> Happy WOrld </title>
</head>
<body>

<form:form method="post" modelAttribute="validationTest" action="/test/validation">
	<form:input path="age" /> <form:errors path="age" cssClass="error"></form:errors><br>
	<form:input path="msg" /><form:errors path="msg" cssClass="error"></form:errors> <br>
	<form:input path="test" /> <form:errors path="test" cssClass="error"></form:errors><br>
	<input type="submit" value="전송" />
</form:form>

</body>
</html>