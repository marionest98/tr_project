<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<title>Insert title here</title>
</head>
<body>
${movieInfo.movieInfoResult.movieInfo.movieNm}<br>
<c:forEach items="${movieInfo.movieInfoResult.movieInfo.actors}" var="actor">
	${actor.cast}역 : ${actor.peopleNm}
</c:forEach>
</body>
</html>