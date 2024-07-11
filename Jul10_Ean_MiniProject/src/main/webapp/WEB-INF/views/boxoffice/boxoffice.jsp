<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="resources/css/box.css">
<script src="https://cdn.canvasjs.com/canvasjs.min.js"></script>
<script type="text/javascript" src="resources/js/jQuery.js"></script>
<style type="text/css">

table {
	background-color:#967E76;
	border: 1px solid #fff;
	margin-left:auto;
		margin-right:auto;
}
td {
margin-left:auto;
		margin-right:auto;
background-color: #594545;
}
</style>
<script type="text/javascript">
	$(function() {
		//  alert('asd');
		$.ajax({
			url : "k.box.get",
			success : function(aaa) {
				let ar = [];				
				let rankTh = $("<th></th>").text("7월 영화 순위");
				let nameTh = $("<th></th>").text("영화이름");
				let openTh = $("<th></th>").text("개봉");
				let audiTh = $("<th></th>").text("당일 관객수");

				let trr = $("<tr></tr>").append(rankTh, nameTh, openTh, audiTh);
				$("table").prepend(trr);

				$(aaa).find("weeklyBoxOffice").each(function(i, d) {
					let rank = $(d).find("rank").text();
					let name = $(d).find("movieNm").text();
					let open = $(d).find("openDt").text();
					let audi = $(d).find("audiCnt").text();

					let td1 = $("<td></td>").text(rank);
					let td2 = $("<td></td>").text(name);
					let td3 = $("<td></td>").text(open);
					let td4 = $("<td></td>").text(audi);

					let tr = $("<tr></tr>").append(td1, td2, td3, td4);
					$("table").append(tr);

 					ar[i]={label: name, y: audi * 1, lineColor:"orange",
							markerColor: "#1E09FF"};
				});

 				var chart = new CanvasJS.Chart("chartContainer", {
					animationEnabled : true,
					theme : "light2",
					title : {
						text : "JULY BOX OFFICE"
					},
					data : [{
						type : "line",
						indexLabelFontSize : 16,
						dataPoints : ar
					}]
				});
				chart.render(); 
			}
		});
	});
</script>
</head>
<body>
	<div id="chartContainer" style="height: 500px; width: 100%;"></div>
	<hr>
	<table border="1" align="center"></table>	

	<div>
   <a href="#" class="btn-gradient red" onclick="history.back()">BACK</a>
    </div>
   
</body>
</html>