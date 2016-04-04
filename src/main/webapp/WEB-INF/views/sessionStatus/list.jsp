<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<title> Happy WOrld </title>
</head>
<body>

<c:forEach items="${list}" var="item">
	 id : ${item.id } , age :${item.age}  , msg : ${item.msg } , hiddenMsg : ${item.hiddenMsg } <br>
	<a href="/test/sessionStatus/update/${item.id }">잘된수정폼 이동 </a>  , 
	<a href="/test/sessionStatus/updateFail/${item.id }">잘 못된 수정폼 이동 </a>  
	<br>
</c:forEach>

</body>
</html>