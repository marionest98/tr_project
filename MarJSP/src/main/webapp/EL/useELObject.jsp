<%@ page contentType = "text/html; charset=utf-8" %>
<%@ page isELIgnored="true" %>
<%
	request.setAttribute("name", "최범균");
	session.setAttribute("name", "javakim");
%>
<html>
<head><title>EL Object</title></head>
<body>
${name}<br>
<%-- <%= request.getAttribute("name") %> --%>
${sessionScope.name}<br>
요청 URI: ${pageContext.request.requestURI}<br>
request의 name 속성: ${requestScope.name}<br>
code 파라미터: ${param.code}
<%-- <%= request.getParameter("code") %> --%>
</body>
</html>
