
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	function gogo() {
		location.href ="Second.jsp?a=100&b=200"
	}
</script>
</head>
<body>
	<!-- First.jsp에서 두 숫자를 입력했을 떄 
			Second.jsp에서 각 숫자들 출력하기
	-->
	
	<a href = "Second.jsp?a=10&b=20">&lt;a&gt;로 [GET방식 요청]</a>
	<hr>
	<div onclick="gogo();"> JavaScript로 [GET방식 요청]></div>
	<hr>
	<form action="Second.jsp">
		a : <input name = "a"> <br>
		b : <input name = "b"> <p>
			<button>form + button 조합으로 [GET / POST방식 요청]</button>
	</form>
	
</body>
</html>