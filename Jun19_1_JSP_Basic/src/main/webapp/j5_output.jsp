<%@page import="javax.servlet.jsp.tagext.TryCatchFinally"%>
<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@page import="java.util.Spliterator"%>
<%@page import="java.util.StringTokenizer"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	function getRandomColor() {
		
		// Math.random()    => 0 ~ 0.99999
		// Math.random() * 255   => 0 ~ 254.99999
		// Math.random(Math.random() * 255)  => 0 ~ 255
		
		let r = Math.round(Math.random() + 255);
		let g = Math.round(Math.random() + 255);
		let b = Math.round(Math.random() + 255);
		
		return "rgb(" + r + "," + g + ","+ b + ")";
	}
	
	function init() {
		let cv = document.getElementById("cv");
		let pen = cv.getContext("2d");
		let x = 0;
		let y = 0;
		
		setInterval(() => {
			pen.save();
			pen.fillStyle = "rgba(0,0,0,0.2)"; // a : 투명도 (0~1)
			pen.fillRect(0,0,500,500);
			
			pen.shadowOffSetX = 0;
			pen.shadowOffSetY = 0;
			pen.shadowBlur = 5;
			pen.shadowColor = "white";
			
			x = Math.random() * 500;
			y = Math.random() * 500;
			pen.fillStyle = getRandomColor();
			pen.fillRect(x,y,20,20);
			
			pen.restore();
			
		
		}, 200);
		
		
	}
</script>
</head>
<body onload="init();">
	<canvas id ="cv" width = "500px" height = "500px"></canvas>	
	<hr>
	<% 
	// response.sendRedirect("test.jsp");
	String num = request.getParameter("number");
	
	// Split
	String[] numData = num.split(",");
	
	int sum1 = 0;
	for(String n : numData) {
		try {
			sum1 += Integer.parseInt(n);
		} catch (Exception e) {
			
		}
	}
	// StringTokenizer
	StringTokenizer st = new StringTokenizer(num, ",");
	int sum2 = 0;
	while(st.hasMoreTokens()) {
		try {
			sum2 += Integer.parseInt(st.nextToken()); 
		}catch(Exception e) {
				
			
		}
	}

	%>
	합(Split) : <%=sum1 %> <br>
	합(StringTokenizer) : <%=sum2 %> <br>
</body>
</html>