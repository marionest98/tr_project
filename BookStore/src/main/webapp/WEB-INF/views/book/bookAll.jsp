<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<title>책 정보</title>
</head>
<body>
<h3>모든 책의 정보를 출력합니다.</h3>
<!-- bookAll : List<Book> -->
<c:forEach items="${bookAll}" var="book">
	${book.bookid} / ${book.bookname} / ${book.publisher} / ${book.price}<br>
</c:forEach>
</body>
</html>