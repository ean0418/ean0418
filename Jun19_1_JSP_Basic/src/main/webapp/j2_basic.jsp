

<%@page import="java.util.Random"%>
<%@page import="java.io.PrintWriter"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%! 
		public String getOE(int x) {
			return (x % 2 == 0) ? "짝수" : "홀수";
	}
	%>
	<%
		Random r = new Random();
		int x = r.nextInt(100) + 1;
	%>
	<h1> 뽑은 숫자 : <%=x %></h1>
	<h1> 홀짝 여부 : <%=getOE(x) %></h1>
		
	
</body>
</html>