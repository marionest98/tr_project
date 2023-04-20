<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<title>로그인 화면</title>
</head>
<body>
<h3>로그인 화면 입니다.</h3>
<form:form action="login" method="get" modelAttribute="loginDto">
	<form:errors element="div"/><!-- 글로벌 에러메세지 출력 -->
	<label for="userid">id : </label><input name="userid" id="userid">
	<form:errors path="userid" delimiter=" "/><br><!-- path필드 에러 -->
	<label for="password">pw : </label><input name="password" id="password">
	<form:errors path="password" delimiter=" "/><br>
	<input type="submit" value="로그인">
</form:form>
</body>
</html>