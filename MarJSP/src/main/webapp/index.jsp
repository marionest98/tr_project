<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="java.util.Date" %>
<!DOCTYPE html>
<html>
<head>
<title>index</title>
</head>
<body>
	<h3>index.jsp파일은 경로 없이 요청할 수 있는 welcomefile입니다.</h3>
	<% Date now = new Date(); %>
	<p>현재 시간 : <%= now %></p>
	<a href="simple">simple</a><br>
	<a href="simple?type=greeting">simple_greeting</a><br>
	<a href="simple?type=date">simple_date</a><br>
	<a href="simple?type=test">simple_test</a><br>
	<a href="controllerUsingFile?cmd=hello">model_hello</a><br>
	<a href="hello.do">hello.do</a><br>
	<a href="a.do">a.do</a><br>
	<form action="b.do">
		<select name="menu">
			<option value="치킨">치킨</option>
			<option value="피자">피자</option>
			<option value="햄버거">햄버거</option>
		</select>
		<input type="submit">
	</form>
	<a href="inputForm.do">회원가입</a>
</body>
</html>