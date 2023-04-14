<%@ page contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
<title>부서명 검색</title>
</head>
<body>
부서명을 검색하는 페이지 입니다.
<form method="post" onsubmit="return validate()">
	검색 : <input name="search" type="search">
	<input type="submit">
</form>
<script type="text/javascript">
	function validate(){
		if(!document.forms[0].search.value){
			alert("검색어를 입력하세요.")
			return false;
		}
	}
</script>
</body>
</html>