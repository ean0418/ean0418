<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		// JSP Model 2
		// 	V (.jsp)
		//		값 받기 : EL			${XXX }
	
		// 페이지 이동
		//		redirect, forward, include
		
		// 조건문, 반복문
		// 출력 형식 (소수점, 날짜 형식, ...)
		
		// CustomTag
		//		생김새가 HTML DOM객체
		//		.JSP => Servlet으로 바뀔 떄 java로 변환
		//		 	=> .jsp에서만 사용 가능0
		//		<접두어 : 태그명>
		//			<xxx:table></xxx:table> => 열고 닫기 한 쌍으로 !
		//			<xxx:table /> 			=> 열고 닫기 사이에 내용이 없다면
		
		// 1. JSP표준액션태그
		//		JSP환경에서 기본적으로 사용 가능한 태그
		//		그 접두어가 'jsp'
		//		forward, include, ...
		
		//	2. 커스텀태그
		//		외부 .jar를 넣고 사용을 함
		//		접두어가 마음대로
		//		반복문, 조건문, 출력형식, ...
	%>
	<h1>First</h1>
	<!-- 
	 	Second.jsp의 소스가 아래에 표현
	 	***원하는 자리에 넣어서 표현할 수 있다는게 장점
	  -->					
	<jsp:include page="Second.jsp"></jsp:include>
	<h2>Third</h2>
	
</body>
</html>




