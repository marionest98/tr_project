<%@ page contentType = "text/html; charset=utf-8" %>
<%@ page buffer="8kb" %>
<%@ page errorPage = "error/viewErrorMessage.jsp" %>
<html>
<head><title>버퍼 플러시 이후 에러 발생 결과</title></head>
<body>
<div>
<%  for (int i = 0 ; i < 300 ; i++) { out.println(i); }  %>
</div>
<%= 1 / 0 %>

</body>
</html>
