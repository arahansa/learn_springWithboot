<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<title> Happy WOrld </title>
</head>
<body>
hello world ${arg}

result: ${result['1']}
<br>
<c:forEach items="${enumList}" var="item">
	${item} : ${result['1']} , ${item.value } <br>
</c:forEach>

</body>
</html>