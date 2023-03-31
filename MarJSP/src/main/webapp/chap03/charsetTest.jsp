<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page trimDirectiveWhitespaces="true" %>
<!-- charset=iso-8859-1 : 알파벳만 인코딩 가능 html/xml주석 -->
<%-- jsp주석 --%>
<!DOCTYPE html>
<html>
<head>
<title>Insert title here</title>
</head>
<body>



<p> 현재 시간 : <%= new java.util.Date() %>
</p>


trimDirectiveWhitespaces속성은 불필요한 빈 줄이나 빈칸을 지워줍니다.
</body>
</html>