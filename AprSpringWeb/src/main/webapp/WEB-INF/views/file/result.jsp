<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<title>Insert title here</title>
</head>
<body>
<c:if test="${dto != null}">
<h3>파일 업로드가 되었습니다.</h3>
파일번호 : ${dto.fileid}<br>
파일명 : ${dto.name}<br>
파일 사이즈 : ${dto.filesize}<br>
업로드 된 파일이름 : ${dto.path}<br>
<img src="/mainImg/${dto.path}" alt="${dto.description}">
</c:if>
<c:if test="${dto == null}">
파일을 선택하지 않았습니다.<br>
<span onclick="history.go(-1)" style="text-decoration: underline;">다시 선택</span>하세요
</c:if>
</body>
</html>