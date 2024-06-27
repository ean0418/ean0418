<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>Apple Information</h2>
	<table> <!--  button  ,,,,, detailcontroller post방식 <---form -->
		<form action="AppleDetailController" method="post">
		<tr>
			<td>지역 : </td>
			<td class="td2">
				<input readonly="readonly" name ="a_region" 
				class="inputt" value="${apple.a_region }">
			</td>
		</tr>
		<tr>
			<td>색 : </td>
			<td class="td2">
				<input autofocus="autofocus" autocomplete="off" 
				name ="a_color" class="inputt" value="${apple.a_color }">
			</td>
		</tr>
		<tr>
			<td>맛 : </td>
			<td class="td2">
				<input  autocomplete="off" 
				name ="a_taste" class="inputt" value="${apple.a_taste }">
			</td>
		</tr>
		<tr>
			<td>가격 : </td>
			<td class="td2">
				<input  autocomplete="off" 
				name ="a_price" class="inputt" value="${apple.a_price }">
			</td>
		</tr>
		<tr>
			<td>설명 : </td>
			<td class="td2">
				<textarea id ="textArea"  autocomplete="off" 
				name ="a_intro" maxlength="100">${apple.a_intro }</textarea>
			</td>
		</tr>
		<tr>
			<td align="center" colspan="2">
				<button class="btn">수정</button>
			</form>
				<button class="btn" onclick="deleteApple('${apple.a_region}');">삭제</button>
				<button class="btn" onclick="history.back();">뒤로가기</button>
			</td>
		</tr>
	</table>
</body>
</html>