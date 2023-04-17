<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<title>책 정보</title>
</head>
<body>
<h3>모든 책의 정보를 출력합니다.</h3>
<!-- bookAll : List<Book> bList -->
<table border="1">
<tr><th>bookid</th><th>bookname</th><th>publisher</th><th>price</th></tr>
<c:forEach items="${bookAll}" var="book">
	<tr><td>${book.bookid}</td><td>${book.bookname}</td><td>${book.publisher}</td><td>${book.price}</td></tr>
</c:forEach>
</table>
</body>
</html>