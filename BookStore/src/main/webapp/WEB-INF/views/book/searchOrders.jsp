<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<title>검색 결과</title>
</head>
<body>
<c:if test="${name eq ''}">
<fmt:formatDate value="${startdate}" dateStyle="short"/> ~
<fmt:formatDate value="${enddate}" dateStyle="short"/>
검색 결과입니다.
</c:if>
<c:if test="${name ne ''}">
"${name}" 검색 결과입니다.
</c:if>
<hr><!-- list size -->
<c:if test="${size == 0}">
	검색 조건에 맞는 결과가 없습니다.
</c:if>
<c:if test="${size != 0}">
	검색 결과 : ${size}개 <br>	
	<table border="1">
	<tr><th>name</th><th>bookname</th><th>orderdate</th><th>saleprice</th></tr>
	<c:forEach items="${list}" var="oders">
		<tr><td>${oders.name}</td><td>${oders.bookname}</td><td>${oders.orderdate}</td><td>${oders.saleprice}</td></tr>
	</c:forEach>
	</table>
</c:if>
</body>
</html>