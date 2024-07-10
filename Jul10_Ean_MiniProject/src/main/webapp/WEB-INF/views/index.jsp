<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>MOVIE</title>
<link rel="stylesheet" href="resources/css/index.css">
<link rel="stylesheet" href="resources/css/login.css">
<link rel="stylesheet" href="resources/css/signup.css">
<script src="//t1.daumcdn.net/mapjsapi/bundle/postcode/prod/postcode.v2.js"></script>
<script type="text/javascript" src="resources/js/jQuery.js"></script>
<script type="text/javascript" src="resources/js/movie_jQuery.js"></script>
<script type="text/javascript">
$(function() {
	goResign();
	logoutEvent();
	idCheckEvent();
	noticeEvent();
	searchAddressEvent();
	signupImageUpload();
	// test();
});
</script>
</head>
<body>
	<table id="siteTitleArea">
		<tr>
			<td align="center">
				<table id="siteTitleArea2">
					<tr>
						<td id="siteTitle" align="center">
							<a href="index.go">
								M<span id="M"></span>O<span id="O"></span>V<span id="V"></span>I<span id="I"></span>E<span id="E"></span>!
							</a>
						</td>
					</tr>
					<tr>
						<td id="greetMsg">
							<c:if test="${sessionScope.loginMember.ms_id != null }">
								${sessionScope.loginMember.ms_name}(${sessionScope.loginMember.ms_id})님 환영합니다.
							</c:if>
						</td>
					</tr>
					<tr>
						<td id="resultTd">${r }</td> 
					</tr>
					<tr>
						<td id="siteSubTitle" align="right">
							<marquee behavior="alternate">영화 러버인 당신을 위한 사이트!</marquee>
						</td>
					</tr>
				</table>
				<table id="siteMenuArea">
					<tr>
						<td align="center">
							<table id="siteMenuArea2">
								<tr>
									<td><a href=""><img src="resources/img/1.png"></a></td>
									<td><a href=""><img src="resources/img/2.png"></a></td>
									<td><a href=""><img src="resources/img/3.png"></a></td>
									<td><a href=""><img src="resources/img/4.png"></a></td>
									<td><a href="board.go"><img src="resources/img/5.png"></a></td>
								</tr>
							</table>
							<table id="siteLoginArea">
								<tr>
									<td>
										<c:choose>
											<c:when test="${sessionScope.loginMember.ms_id == null }">
												<a href="member.login.go">
													<img src="resources/img/6.png">
												</a>
											</c:when>
											<c:otherwise>
												<a id="logoutBtn" href="#">
													<img src="resources/img/7.png">
												</a>
											</c:otherwise>
										</c:choose>
									</td>
								</tr>
							</table>
							<table id="siteSignupArea">
								<tr>
									<td>
										<c:choose>
											<c:when test="${sessionScope.loginMember.ms_id == null }">
												<a href="member.signup.go">
													<img src="resources/img/8.png">
												</a>
											</c:when>
											<c:otherwise>
												<a href="member.info.go">
													<img src="resources/img/9.png">
												</a>
											</c:otherwise>
										</c:choose>
									</td>
								</tr>
							</table>
						</td>
					</tr>
				</table>
			</td>
		</tr>
	</table>
	
	<table id="siteContextArea">
		<tr>
			<td align="center">
				<jsp:include page="${cp }"/>
			</td>
		</tr>
	</table>
</body>
</html>