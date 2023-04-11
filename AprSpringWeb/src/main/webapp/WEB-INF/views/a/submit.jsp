<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<title>결과</title>
</head>
<body>
이름 : ${a.name}<br>
나이 : ${a.age}<br>
생일 : <fmt:formatDate value="${a.birth}" pattern="yyyy년 MM월 dd일"></fmt:formatDate><br>
좋아하는 동물 : 
<c:forEach items="${a.pet}" var="p">
	${p}
</c:forEach> <br>
</body>
</html>