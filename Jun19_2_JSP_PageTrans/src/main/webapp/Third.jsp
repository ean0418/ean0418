<%@page import="java.util.Random"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		// Parameter 읽기
		int a = Integer.parseInt(request.getParameter("a"));
	
		String bbb =request.getParameter("b");
		Integer bb = Integer.parseInt(bbb);
		int b = bb.intValue();
		// = int b = Integer.parseInt(request.getParameter("b"));
		
		// Attribute 읽기
		Object ccc = request.getAttribute("c"); // Object
		Integer cc = (Integer) ccc;   // Object => Integer
		int c = cc.intValue();	// Integer => int
		
		String d = (String) request.getAttribute("d");
		Random e = (Random)	request.getAttribute("e");
		// object는 형변환 꼭해서 불러와야함~!
		
	%>
	
	<h1>Third</h1>
	a : <%=a %> <br>
	b : <%=b %> <br>
	c : <%=c %> <br>
	d : <%=d %> <br>
	e : <%=e.nextInt(100) +1 %> <br>
	
	
	
	
</body>
</html>