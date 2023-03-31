<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page buffer="8kb" autoFlush="false"%>
<!DOCTYPE html>
<html>
<head>
<title>autoFlush</title>
</head>
<body>
<div>
<% for (int i = 0; i < 1000; i++) {
	out.println(i);
} %>
</div>
</body>
</html>