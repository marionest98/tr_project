<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<title>Insert title here</title>
</head>
<body>
<b>${search}</b>로 검색한 결과입니다.
<hr><!-- list size -->
<c:if test="${size == 0}">
	검색 조건에 맞는 결과가 없습니다.
</c:if>
<c:if test="${size != 0}">
	검색 결과 : ${size}개 <br>
	<c:forEach items="${list}" var="dept">
		${dept.deptno} / ${dept.dname} / ${dept.loc}<br>
	</c:forEach>
</c:if>
</body>
</html>