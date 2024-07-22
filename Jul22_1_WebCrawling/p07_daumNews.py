# -*- coding:utf-8 -*-
from urllib.parse import quote
import requests
from bs4 import BeautifulSoup

# https://search.daum.net/search?w=news&q=%EA%B8%B0%EC%83%81%EC%B2%AD&enc=utf8&cluster=y&cluster_page=1&DA=DNS

# 검색어 콘솔에 입력
# 요청했을때 나오는 결과 1 ~ 5페이까지의 뉴스 제목을 출력

def getTitle(address, q):
    for i in range(1, 6):
        print(f"==========={i}페이지 ===============")
       
        addr = address + q
        addr += f"&enc=utf8&cluster=y&cluster_page=1&DA=PGD&p={i}"
        
        res = requests.get(addr)

        soup = BeautifulSoup(res.text, 'html.parser')
        
        # ul = soup.select_one("ul.c-list-basic")
        ul = soup.select_one("ul.c-list-basic")
        
        news = ul.select('li > div > div > div > strong>a')
        
        for n in news:
            print(n.text)
###############################################################

q = quote(input("검색어 : "))

address = f"https://search.daum.net/search?w=news&q="


getTitle(address, q)



















