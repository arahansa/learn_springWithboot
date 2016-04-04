<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<title> Happy WOrld </title>
</head>
<body>
<!-- int id, age; 
String msg, hiddenMsg; -->
<c:forEach items="${list}" var="item">
	Id : ${item.id } , age : ${item.age } , msg : ${item.msg } , hiddenMsg : ${hiddenMsg } <br>
	<a href="/test/sessionStatus/update/${item.id }">잘된수정폼 이동 </a>  , 
	<a href="/test/sessionStatus/updateFail/${item.id }">잘된수정폼 이동 </a>  
	<br>
</c:forEach>

</body>
</html>