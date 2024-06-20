<%@page import="com.ean.jun202.main.Guest"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="Bcss.css">
</head>
<body>
	<%
		request.setCharacterEncoding("UTF-8");
		Guest g = (Guest) request.getAttribute("g");
	%>
	
	<table >
		<tr >
			<th colspan="2">BMI Result</th>
		</tr>
		<tr>
			<td>이름</td>
			<td><%=g.getName() %></td>
		</tr>
		<tr>
			<td>키</td>
			<td><%=g.getHeight()*100 %>cm</td> 
		</tr>
		<tr>
			<td>몸무게</td>
			<td><%=g.getWeight() %>kg</td>
		</tr>
		<tr>
			<td>BMI</td>
			<td><%=g.getBmi() %></td>
		</tr>
		<tr>
			<td colspan="2">
				<marquee>당신은<%=g.getStatus() %></marquee>
			</td>
		</tr>
		<tr>
			<td colspan="2">
				<img src="img/<%=g.getPhoto() %>" style="max-width:40%;">
			</td>
		</tr>
	</table>
</body>
</html>