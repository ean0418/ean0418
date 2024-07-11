<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>메뉴</title>
<link rel="stylesheet" href="resources/css/store.css">
<style type="text/css">

</style>
</head>
<body>
    <!-- 메뉴 제목 테이블 -->
    <table border="1">
        <tr width="230px">
            <th width="230px">메뉴</th>
            <th width="230px">이미지</th>
            <th width="230px">가격</th>
            <th width="230px">종류</th>
        </tr>
    </table>

    <!-- 메뉴 항목: 팝콘 -->
    <table style="cursor:pointer;">
        <tr>
            <td width="230px">팝콘</td>
            <td width="230px"><img src="resources/img/popcorn.jpg" alt="팝콘 이미지"></td>
            <td width="230px">100000</td>
            <td width="230px">
                <label>맛</label>
                <select>
                    <option>카라멜</option>
                    <option>어니언</option>
                    <option>치토스</option>
                    <option>치즈</option>
                    <option>고소한맛</option>
                </select>
            </td>
        </tr>
        <tr>
            <td colspan="3"><div class="boardDiv"></div></td>
        </tr>
    </table>

    <!-- 메뉴 항목: 탄산음료 -->
    <table style="cursor:pointer;">
        <tr>
            <td width="230px">탄산음료</td>
            <td width="230px"><img src="resources/img/drink.jpg" alt="탄산음료 이미지"></td>
            <td width="230px">70000</td>
            <td width="230px">
                <label>종류</label>
                <select>
                    <option>콜라</option>
                    <option>사이다</option>
                    <option>환타</option>
                    <option>제로콜라</option>
                    <option>제로사이다</option>
                </select>
            </td>
        </tr>
        <tr>
            <td colspan="3"><div class="boardDiv"></div></td>
        </tr>
    </table>

    <!-- 메뉴 항목: 버터오징어 -->
    <table style="cursor:pointer;">
        <tr>
            <td width="230px" >버터오징어</td>
            <td width="230px"><img src="resources/img/squid.jpg" alt="버터오징어 이미지"></td>
            <td width="230px">90000</td>
             <td width="230px">
                <label>맛</label>
                <select>
                    <option>버터</option>
                    <option>소금</option>
                    <option>양념</option>
                    <option>매콤양념</option>
                    <option>데리야끼</option>
                </select>
            </td>
        </tr>
        <tr>
            <td colspan="3"><div class="boardDiv"></div></td>
        </tr>
    </table>

    <!-- 메뉴 항목: 핫도그 -->
    <table style="cursor:pointer;">
        <tr>
            <td width="230px">핫도그</td>
            <td width="230px"><img src="resources/img/hotdog.jpg" alt="핫도그 이미지"></td>
            <td width="230px">90000</td>
             <td width="230px">
                <label>맛</label>
                <select>
                    <option>참치마요</option>
                    <option>어니언</option>
                    <option>칠리</option>
                    <option>스파이시</option>
                    <option>크런치</option>
                </select>
            </td>
        </tr>
        <tr>
            <td colspan="3"><div class="boardDiv"></div></td>
        </tr>
    </table>
     <table align="right">
    	<tr align="right">
    	<td><button><img src="resources/img/get.jpg"> </button> <td></tr>
    </table>

</body>
</html>
