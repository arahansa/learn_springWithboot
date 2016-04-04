<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<title> Happy WOrld </title>
</head>
<body>
<form:form modelAttribute="updateArticle" method="post" action="/test/sessionStatus/update">
id : <form:input path="id"/>
age : <form:input path="age"/>
msg : <form:input path="msg"/>
<input type="submit" value="확인"/>
</form:form>
</body>
</html>