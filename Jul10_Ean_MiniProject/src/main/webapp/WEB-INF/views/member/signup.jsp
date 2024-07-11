<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

</head>
<body>
	<form action="member.signup" method="post" enctype="multipart/form-data">
		<table id="signupTbl">
			<tr>
				<td align="center" colspan="2">
				<input id="signup_ms_id" name="ms_id" placeholder="ID" autofocus="autofocus" 
				autocomplete="off" maxlength="10" class="i1" >
				<div id="msg"></div>
				</td>
			</tr>
			<tr>
				<td align="center" colspan="2">
				<input name="ms_pw" placeholder="PASSWORD" autocomplete="off" 
				maxlength="10" class="i1" type="password">
				</td>
			</tr>
			<tr>
				<td align="center" colspan="2">
				<input name="ms_pwChk" placeholder="PASSWORD CHECK" autocomplete="off"
				maxlength="10" class="i1" type="password">
				</td>
			</tr>
			<tr>
				<td align="center" colspan="2">
				<input name="ms_name" placeholder="NAME" autofocus="autofocus" 
				autocomplete="off" maxlength="10" class="i1" >
				</td>
			</tr>
			<tr>
				<td align="center" colspan="2">
				<input name="ms_fav_movie" placeholder="Movie" autofocus="autofocus" 
				autocomplete="off" maxlength="20" class="i1" >
				</td>
			</tr>
			<tr>
				<td align="center" colspan="2">
				<input id="ms_addr1" name="ms_addr1" placeholder="Zip Code" readonly="readonly" 
				class="i1" >
				<input id="ms_addr2" name="ms_addr2" placeholder="Address" readonly="readonly" 
				class="i1" >
				<input name="ms_addr3" placeholder="Detail Address" autocomplete="off"
				class="i1" >
				</td>
			</tr>
			<tr>
				<td align="right">
					&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Profile
				</td>
				<td align="center">
					<div class="fileBox">
						<input class="uploadName" value="Profile Pic" placeholder="Profile Pic">
						<label for="ms_photo">파일찾기</label>					
						<input id="ms_photo" name="ms_photo" type="file">
					</div>
				</td>
			</tr>
			<tr>
				<td align="center" colspan="2">
					<button>Sign Up</button>
				</td>
			</tr>
		</table>
	</form>
</body>
</html>