<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="css/CT.css">
</head>
<body>
	<form action="HomeController" name = "screen" align ="center">
		<table align ="center">
			<tr  id ="nbTbl">
				<th id="idTitle">제목<hr></th>
			</tr>
			<hr>
			<tr align ="center">
				<td id= "idSite">
				<a href="HomeController">HOME</a>
				<a href="">A</a>
				<a href="">B</a>
				<a href="">C</a>
				</td>
			</tr>
		</table>
		<hr>
		<table border ="1" align ="center" width="600px" height="600px">
			<tr>
				<td id="siteContent">
				<jsp:include page="${contentPage }"></jsp:include>
				</td>
			</tr>
		</table>
	</form>
</body>
</html>