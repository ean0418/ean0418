# -*- coding:utf-8 -*-
from bs4 import BeautifulSoup

# BeautifulSoup
#    파이썬에서 사용할 수 있는 웹데이터 
# cmd => pip install bs4 => pip list 다운로드 확인

htmlEx = """
<html>
<head>
<meta charset="EUC-KR">
<title>우리는 BS4로 Web Crawling을 할거에요!</title>
</head>
<body>
<h1>다들 월요일이고 비 많이오고 힘들겟지만</h1>
<h2>조금만 파이팅</h2>
<p><b>BeautifulSoup</b></p>
<p>Python에서 Crawling할 때 유용하게 사용할 수 있는 Library</p>
<a href='#'>구글</a>
<a href='#'>네이버</a>
<a href='#'>유튜브</a>
</p>
<p> HOW TO USE BS4</p>
</body>
</html>
"""
# bs4 초기화
# html.parser : HTML 문법 규칙에 따른 문자열, 해당 문법을 바탕으로
#                단어의 의미나 구조를 분석하는 프로그램
soup = BeautifulSoup(htmlEx, 'html.parser')

# print(soup)

# 코드 예쁘게 정리하기 - prettify()
print(soup.prettify())

# title부분 찾기
title = soup.html.head.title
print(title) # title의 태그까지
print(title.string) # title의 내용만
print(title.text)
print(title.getText())
print("---------------------------")

# h1 태그 텍스트 출력
h1 = soup.html.body.h1
print(h1)
print(h1.text)
print("---------------------------")

# p태그
p1 = soup.html.body.p
print(p1)
print(p1.string)
print(p1.text)
print("------------------------------")

# next_sibling : 동일한 레벨 상의 다음요소를 불러올 수 있는 기능
#    <-> previous_sibling
# 태그와 태그사이에 개행이 있는 경우, 엔터처리로 취급함...
#    => 요소로 인식을 함
p2 = p1.next_sibling.next_sibling
print(p2)
print(p2.text)









