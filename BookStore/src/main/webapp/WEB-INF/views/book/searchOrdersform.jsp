<%@ page contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
<title>주문 내역 검색</title>
</head>
<body>
주문 내역 검색
<form method="post">
시작일 : <input type="date" name="startdate" id="start" value="2014-07-01" min="2014-07-01" max="2014-07-10">
- 종료일 : <input type="date" name="enddate" id="end" value="2014-07-10" min="2014-07-01" max="2014-07-10"><br>
고객명 : <input name="name">
<input type="submit">
</form>
</body>
</html>