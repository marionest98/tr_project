<%@ page contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
<title>게시글 입력 폼</title>
</head>
<body>
	게시글 쓰기 입력 폼
	<form method="post">
		<input type="hidden" name="id" value="10" />
		<input type="hidden" name="id" value="11" />
		<input type="hidden" name="id" value="12" />
		제목 : <input name="title"><br>
		내용 : <textarea name="content"></textarea><br>
		<input type="submit">
	</form>
</body>
</html>