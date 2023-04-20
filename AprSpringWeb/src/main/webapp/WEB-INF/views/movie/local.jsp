<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<title>지역 검색 결과</title>
</head>
<body>
<h1>[${query}]지역의 명소입니다.(${localInfo.total}개)</h1>
<ul>
<c:forEach items="${localInfo.items}" var="item" varStatus="status">
	
<li>${status.index + 1}. <a href="${item.link}">${item.title}</a> <br>
주소 : ${item.roadAddress} <br>
카테고리 : ${item.category}
</li>

</c:forEach>
</ul>
</body>
</html>