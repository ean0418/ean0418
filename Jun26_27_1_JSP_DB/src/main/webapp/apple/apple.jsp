<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="css/apple.css">

<style type="text/css">
	.asdf a {
		color: black;
	}
</style>
</head>
<body>
	<table id ="appleTbl" border="1" width ="500" height="500" >
		<tr>
			<td align ="right">${r }<a href="AppleRegController">등록</a></td>
		</tr>
		<tr align ="center" id="appleTitle">
			<td id="appleContext">지역</td>
			<td id="appleContext">가격</td>
		</tr>
		<c:forEach var = "apple" items="${apples }">
		<tr align ="center" class="dataTr" onclick ="goAppleDetail('${apple.a_region}');">
			<td id="appleContext">${apple.a_region }</td>
			<td id="appleContext"><fmt:formatNumber value="${apple.a_price }" type="number" /> </td>
		</tr>
		</c:forEach>
		<tr>
			<td align="center" class="asdf">
				<c:forEach var="p" begin="1" end ="${pageCount }">
					<a href = "ApplePageController?p=${p }">${p }</a>
				</c:forEach>
			</td>
		</tr>
	</table>
	
	<table align="left" valign="bottom">
		<tr >
			<td> <img src="img/apple.jfif"></td>
		</tr>
	</table>
	<table id="appleImg" align="right" valign="bottom">
		<tr align="right" valign="bottom" >
			<td> <img src="img/apple2.jpg"></td>
		</tr>
	</table>
</body>
</html>