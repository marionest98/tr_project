<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="chap03.day0331.Calc" %>
<%! 
	public int sum(int start, int end){
		int result = 0;
		for(int i = start ; i <= end ; i++){
			result += i;
		}
		return result;
	}
%>
<!DOCTYPE html>
<html>
<head>
<title>1~10까지의 합</title>
</head>
<body>
<%
	int sum = 0;
	for(int i = 1 ; i <= 10; i++){
		sum += i;
	}
	// System.out.println("sum : " + sum);
%>
<% Calc c = new Calc(); %>
<!-- html/xml 주석 -->
<%-- JSP 주석 : client에 전달되지 않는다. --%>
1~10까지의 합 : <%= sum %><br>
1~10까지의 합1 : <%= 1+2+3+4+5+6+7+8+9+10 %><br>
1~10까지의 합2 : <%= sum(1,10) %><br>
1~10까지의 합3 : <%= c.sum(1, 10) %><br>
</body>
</html>