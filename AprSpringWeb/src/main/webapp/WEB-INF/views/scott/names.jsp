<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<title>검색결과</title>
</head>
<body>
<b>${ename}</b>로 검색한 결과입니다.
<hr><!-- list size -->
<c:if test="${size == 0}">
	검색 조건에 맞는 결과가 없습니다.
</c:if>
<c:if test="${size != 0}">
	검색 결과 : ${size}개 <br>
	<c:forEach items="${names}" var="emp">
		부서이름 : ${emp.dname} 사원번호 : ${emp.empno} 사원명 : ${emp.ename} <br>
	</c:forEach>
</c:if>
</body>
</html>