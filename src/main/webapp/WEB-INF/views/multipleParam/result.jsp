<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<title> Happy WOrld </title>
</head>
<body>

age : ${result.age } <br>

<c:forEach items="${result.testList}" var="item">
	item : ${item } <br>
</c:forEach>
</body>
</html>