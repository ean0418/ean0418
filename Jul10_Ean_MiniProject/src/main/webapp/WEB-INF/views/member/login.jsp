<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="member.login" method="post">
		<table id="loginTbl">
			<tr>
				<td align="center">
					LOGIN
				</td>
			</tr>
			<tr>
				<td align="center">
					<input name="ms_id" placeholder="ID" autocomplete="off" maxlength="10"
					 autofocus="autofocus" class="i1">
				</td>
			</tr>
			<tr>
				<td align="center">
					<input name="ms_pw" placeholder="PASSWORD" autocomplete="off" maxlength="10" type="password" class="i1">
				</td>
			</tr>
			<tr>
				<td align="center">
					<button>로그인</button>
				</td>
			</tr>
		</table>
	</form>
</body>
</html>