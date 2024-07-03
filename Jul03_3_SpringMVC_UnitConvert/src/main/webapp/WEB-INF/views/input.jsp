<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="unit.convert">
		숫자<input name = "n1"> <p>
		 <select name = "what">변환기
          <option value="l" >cm->inch</option>
          <option value="d" >m2 -> 평</option>
          <option value="t" >℃ ->℉ </option>
          <option value="v" >mi/h->km/h</option>
          </select>
          <button>버튼</button>
	</form>
</body>
</html>