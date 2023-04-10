<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<title>결과</title>
</head>
<body>
이름 : ${a.name}<br>
나이 : ${a.age}<br>
좋아하는 동물 : 
<c:forEach items="${a.pet}" var="p">
	${p}
</c:forEach> <br>
</body>
</html>