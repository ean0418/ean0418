<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel ="stylesheet" href ="css/index.css">
<script type="text/javascript" src="js/EanValidChecker.js"></script>
<script type="text/javascript" src="js/RegValidCheck.js"></script>
<script type="text/javascript" src="js/go.js"></script>
</head>
<body>
	<table id ="siteTbl">
		<tr>
			<th id="siteTitleArea"><a href="HomeController">과일가게</a> </th>
		</tr>
		<tr>
			<th id="siteContentArea" align="center">
				<jsp:include page="${contentPage }"></jsp:include>
			</th>
		</tr>
	</table>
	<table id ="siteMenuTbl">
		<tr>
			<td align="center"><a href="AppleController">APPLE</a></td>
			<td align="center"><a href="">BANANA</a></td>
			<td align="center"><a href="">CHERRY</a></td>
			<td align="center"><a href="DBCController">DB연결</a></td>
		</tr>
	</table>
</body>
</html>