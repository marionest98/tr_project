<%@ page contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
<title>좋아하는 동물은?</title>
</head>
<body>
	<form method="post"> <!-- 요청 uri가 같기 때문에 action="" 생략 -->
		<fieldset>
			이름 : <input type="text" name="name"><br>
			나이 : <input type="text" name="age"><br>
			생일 : <input name="birth" placeholder="yyyyMMdd"><br>
			좋아하는 동물 :
			강아지<input type="checkbox" name="pet" value="강아지">
			고양이<input type="checkbox" name="pet" value="고양이">
			토끼<input type="checkbox" name="pet" value="토끼"><br>
			<input type="submit">
		</fieldset>
	</form>
</body>
</html>