<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="resources/css/index.css">
<script type="text/javascript" src="resources/js/index.js"></script>
</head>
<body>
	View (v) - <br>
	JSP : .html or .jsp <br>
	Spring legacy : .jsp <br>
	Spring Boot : .html (thymeleaf) <br>
	
	Spring 내에서 쓰는 자원파일들 (css, js, 그림, ...)
		webapp - resources / ... (경로)
	 (*주의* src/main/resources 가 아니라 webapp안 resources)
	<hr>
	input 3개 => 이름, x, y
	button 하나를
	form에 담기
	<hr>
	<form action="calculate.do" method="post">
		<input name="n"> <p>
		<input name="x"> <p>
		<input name="y"> <p>
		<button>버튼</button>
	</form>
	<hr>
	<c:if test="${r != null }"> 계산결과 : ${r }</c:if> <br>
	${r2 }
</body>
</html>