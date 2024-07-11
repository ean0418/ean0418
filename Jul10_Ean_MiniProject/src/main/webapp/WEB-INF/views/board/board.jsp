<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="resources/css/board.css">
</head>
<body>
	<h1>자유게시판</h1>
	<table id="boardTbl2" border="1">
		<tr>
			<th width="190px">글 번호</th>
			<th width="190px">제목</th>
			<th width="190px">개봉</th>
			<th width="190px">누적</th>
			<th width="190px">작성자</th>
		</tr>
	</table>
	<a href="board1.go">
		<table id="boardTbl" class="boardTbl" style="cursor: pointer;">
			<tr>
				<td width="190px" align="center">1</td>
				<td width="190px" align="center">파묘</td>
				<td width="190px" align="center">2024.02.22</td>
				<td width="190px" align="center">11,913,223명</td>
				<td width="190px" align="center">정수</td>
			</tr>
			<tr>
				<td colspan="3"><div class="boardDiv"></div></td>
			</tr>
		</table>
	</a>
	<a href="board2.go">
		<table id="boardTbl" class="boardTbl" style="cursor: pointer;">
			<tr>
				<td width="190px" align="center">2</td>
				<td width="190px" align="center">범죄도시4</td>
				<td width="190px" align="center">2024.04.24</td>
				<td width="190px" align="center">11,500,438명</td>
				<td width="190px" align="center">정수2</td>
			</tr>
			<tr>
				<td colspan="3"><div class="boardDiv"></div></td>
			</tr>
		</table>
	</a>
	<a href="board3.go">
		<table id="boardTbl" class="boardTbl" style="cursor: pointer;">
			<tr>
				<td width="190px" align="center">3</td>
				<td width="190px" align="center">인사이드 아웃2</td>
				<td width="190px" align="center">2024.06.12</td>
				<td width="190px" align="center">7,101,757명</td>
				<td width="190px" align="center">정수3</td>
			</tr>
			<tr>
				<td colspan="3"><div class="boardDiv"></div></td>
			</tr>
		</table>
	</a>
	<a href="board4.go">
		<table id="boardTbl" class="boardTbl" style="cursor: pointer;">
			<tr>
				<td width="190px" align="center">4</td>
				<td width="190px" align="center">웡카</td>
				<td width="190px" align="center">2024.01.31</td>
				<td width="190px" align="center">3,531,560명</td>
				<td width="190px" align="center">정수4</td>
			</tr>
			<tr>
				<td colspan="3"><div class="boardDiv"></div></td>
			</tr>
		</table>
	</a>
	<table border="1">
		<tr>
			<td colspan="2"><input></td>
			<td><button>검색</button></td>
		</tr>
	</table>
	<table align="right">
			<tr align="right">
			<td><button>수정</button></td>
		</tr>
	</table>	
</body>
</html>