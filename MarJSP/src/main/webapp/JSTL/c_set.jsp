<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="el.Member" %>
<%@ page import="java.util.*" %>
<% Member m = new Member("김자바", 10);
   Map<String, String> pref = new HashMap<>();
   //request.setAttribute("m", m);
%>
<!DOCTYPE html>
<html>
<head>
<title>Insert title here</title>
</head>
<body>
	<c:set var="mem" value="<%= m %>"/>
	<c:set target="${mem}" property="name" value="su"/>
	${mem.name}<br>
	<c:set var="pre" value="<%= pref %>"/>
	<c:set var="favoriateColor" value="#{pre.color}"/>
	
	좋아하는 색 : ${favoriateColor}<br>
	<c:set target="${pre}" property="color" value="red"/>
	좋아하는 색2 : ${favoriateColor}<br>
</body>
</html>