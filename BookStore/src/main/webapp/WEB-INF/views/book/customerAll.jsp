<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<title>고객 정보</title>
</head>
<body>
<h3>모든 고객의 정보를 출력합니다.</h3>
<!-- customerAll : List<Customer> -->
<c:forEach items="${customerAll}" var="customer">
	${customer.custid} / ${customer.name} / ${customer.address} / ${customer.phone}<br>
</c:forEach>
</body>
</html>