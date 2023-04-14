<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<title>Insert title here</title>
</head>
<body>
<form method="post" action="/update">
	<h3>${deptno}번 부서의 정보를 수정합니다.</h3>
	<input type="hidden" name="_method" value="put">
	<input type="hidden" name="deptno" value="${deptno}">
	부서명 : <input name="dname"><br>
	근무지 : <input name="loc"><br>
	<input type="submit">
</form>
</body>
</html>