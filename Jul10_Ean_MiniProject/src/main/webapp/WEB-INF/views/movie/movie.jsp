<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
img {
	width: 50%;
}
th {
	font-size: 20pt;
}
td {
	font-size: 20pt;
}
#ii {
	color:red;
	font-size: 30pt;
}
</style>
</head>
<body>
	<h1>BEST LIST</h1>
	<table border="1">
		<tr>
			<th width="230px">번호</th>
			<th width="230px">제목</th>
			<th width="230px">이미지</th>
			<th width="230px">별점</th>
		</tr>
	</table>
	<table class="boardTbl" style="cursor:pointer;">
		<tr>
			<td width="230px" align="center">1</td>
			<td width="230px" align="center">파묘</td>
			<td width="230px" align="center">
			<a href="movie1.go"><img src="resources/img/movie1.jfif"></a> </td>
			<td width="230px" align="center" id="ii">★8.2</td>
		</tr>
		<tr>
			<td colspan="3"><div class="boardDiv"></div></td>
		</tr>
	</table>
	<table class="boardTbl" style="cursor:pointer;">
		<tr>
			<td width="230px" align="center">2</td>
			<td width="230px" align="center">범죄도시4</td>
			<td width="230px" align="center">
			<a href="movie2.go"><img src="resources/img/movie2.jfif"></a> </td>
			<td width="230px" align="center"  id="ii">★7.53</td>
		</tr>
		<tr>
			<td colspan="3"><div class="boardDiv"></div></td>
		</tr>
	</table>
	<table class="boardTbl" style="cursor:pointer;">
		<tr>
			<td width="230px" align="center">3</td>
			<td width="230px" align="center">인사이드 아웃2</td>
			<td width="230px" align="center"><a href="movie3.go">
			<img src="resources/img/movie3.jfif"></a> </td>
			<td width="230px" align="center"  id="ii">★8.98</td>
		</tr>
		<tr>
			<td colspan="3"><div class="boardDiv"></div></td>
		</tr>
	</table>
	<table class="boardTbl" style="cursor:pointer;">
		<tr>
			<td width="230px" align="center">4</td>
			<td width="230px" align="center">웡카</td>
			<td width="230px" align="center">
			<a href="movie4.go"> <img src="resources/img/movie4.jfif"> </a></td>
			<td width="230px" align="center"  id="ii">★7.97</td>
		</tr>
		<tr>
			<td colspan="3"><div class="boardDiv"></div></td>
		</tr>
	</table>
</body>
</html>