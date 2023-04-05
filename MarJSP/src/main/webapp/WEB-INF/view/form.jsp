<%@ page contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
<title>회원가입</title>
</head>
<body>
<h1>회원가입</h1>
<form action="input.do" method="post" name="form1" onsubmit="validate()">
	<input name="id" id="id" placeholder="아이디" ><br>
	<input id="pw" name="pw" placeholder="비밀번호" ><br>
	<input id="pwc" name="pwc" placeholder="비밀번호확인" ><br>
	<input type="text" id="adn" readonly placeholder="우편번호" name="adn" onclick="getZonecode()"><br>
	<input type="text" id="ad" placeholder="도로명주소" name="ad"><br>
	<button onclick="passwordc()">제출</button><br>
</form>
<script src="//t1.daumcdn.net/mapjsapi/bundle/postcode/prod/postcode.v2.js"></script>
<script>
	function getZonecode() {
		new daum.Postcode({
	        oncomplete: function(data) {
	        	document.form1.adn.value=data.zonecode;
	        	document.form1.ad.value=data.roadAddress;
	        }
	    }).open();
	}
	function validate() {
		let form = document.form1;
		if(!form.id.value){
			alert("id를 입력해주세요")
			return false;
		}
		if(!form.pw.value){
			alert("id를 입력해주세요")
			return false;
		}
		if(form.pw.value != form.pwc.value){
			alert("비밀번호가 틀립니다.")
			return false;
		}
	}
</script>
</body>
</html>