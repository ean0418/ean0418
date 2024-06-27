<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<link rel ="stylesheet" href ="css/reg.css">
</head>
<body>
	<form action="AppleRegController" method="post" name="regForm" onsubmit="return check();">
	<table id ="regTbl" border="1"  align="center" >
		<tr>
			<td  align="center">
				<h1>사과</h1>
			</td>
		</tr>
		<tr>
			<td  align="center">
				지역 : <input name ="a_region" autofocus="autofocus"
						autocomplete="off" >
			</td>
		</tr>
		<tr>
			<td  align="center">
				색 : <input  name ="a_color" autofocus="autofocus"
						autocomplete="off">
			</td>
		</tr>
		<tr>
			<td  align="center">
				맛 : <input  name ="a_taste" autofocus="autofocus"
						autocomplete="off"> 
			</td>
		</tr>
		<tr>
			<td  align="center">
				가격 : <input name = "a_price" autofocus="autofocus"
						autocomplete="off">
			</td>
		</tr>
		<tr>
			<td  align="center">
				소개 : <input  name ="a_intro" autofocus="autofocus"
						autocomplete="off"> 
			</td>
		</tr>
		<tr>
			<td align="center">
				<button >등록</button>
			</td>
		</tr>
	</table>
	</form>
</body>
</html>