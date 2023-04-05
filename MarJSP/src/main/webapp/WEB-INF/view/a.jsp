<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<title>메뉴 선택</title>
</head>
<body>
<%-- menu : list --%>
	<form action="b.do">
		점심 메뉴 선택 :
		<c:forEach items="${menu}" var="m">
			<input type="radio" name="menu" value="${m}"> ${m}
		</c:forEach>		
		<input type="submit" value="전송">
	</form>
	
</body>
</html>