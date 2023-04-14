<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<style>
	div{
		float: left;
		margin: 10px;
	}
</style>
<title>사원 정보 확인</title>
</head>
<body>
<h4>부서와 사원을 선택하세요</h4>
<!-- List<Map<String,Object>> dList -->
<div>
	<select name="dept" id="dept">
		<option value="">부서 선택</option>
		<c:forEach items="${dList}" var="dept">
			<option value="${dept.deptno}">${dept.dname}</option>
		</c:forEach>
	</select>
</div>
<div id="second"></div>
<div id="third"></div>
<script src="http://code.jquery.com/jquery-3.6.0.min.js"></script>
<script>
	$(function(){
		$("#dept").change(function(){
			$("#second,#third").empty();
			if($(this).val() == ""){
				alert("부서를 선택하세요");
				return false;
			}
			let deptno = $(this).val();
			$.ajax({
				  url:'/emps/' +deptno,
				  type: 'get',
				  dataType: 'json'
				  })
				  .done( function(response) {
					  let ops = "<select id='emps'><option value=''>사원 선택</option>";
					  for(let i in response){
						  ops += "<option value='"+response[i].empno+"'>"+response[i].ename+"</option>";
					  }		
					  ops += "</select>"
						  
					  $("#second").append(ops)
				  })
			
		})//change	
		
		$("#second").on("change","#emps",function(){
			$("#third").empty();
			let empno = $(this).val();
			$.ajax({
				  url: '/emp/'+empno,
				  type: 'get',				  
				  dataType: 'json'
				  })
				  .done( function(response) {
					  let emp = "사원번호 : "+response.empno+"<br>";
					  emp += "사원이름 : "+response.ename+"<br>";
					  emp += "직급 : "+response.job+"<br>";
					  emp += "입사일 : "+response.hiredate+"<br>";
					  
					  $("#third").append(emp);
				  });
		})//emps change
		
	});//ready
</script>
</body>
</html>