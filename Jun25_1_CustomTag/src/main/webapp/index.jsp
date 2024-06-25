<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="js/EanValidChecker.js"></script>
<script type="text/javascript" src="js/calcCheck.js"></script>
<link rel="stylesheet" href="css/CT.css">
<link rel="stylesheet" href="calcCss/calc.css">
</head>
<body>
	<table id="nbTbl">
		<tr>
			<th id="idTitle">
				<marquee>
					2024년 6월 24일
				</marquee>
			</th>		
		</tr>
		
		<tr>
			<td id="idsite" align="center">
				<a href="HomeController">Home</a>		
				<a href="CalcController">사칙연산</a>
				<a href="JSTLCController">JSTLC</a>
				<a href="JSTLFController">JSTLF</a>
			</td>
		</tr>
		
		<tr>
			<td id="siteContent"><jsp:include page="${contentPage }"></jsp:include></td>
		</tr>
		
	</table>
</body>
</html>