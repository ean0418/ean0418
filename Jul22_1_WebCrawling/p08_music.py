# -*- coding:utf-8 -*-
from urllib.parse import quote
import requests
from bs4 import BeautifulSoup

# 가수, 노래 제목을 직접 입력해서 요청
# 노래 가사에 대한 내용을 출력

# https://search.naver.com/search.naver?where=nexearch&sm=top_hty&fbm=0&ie=utf8&query=

s = quote(input("가수 : "))
n = quote(input("노래 제목 : "))
l = '%EA%B0%80%EC%82%AC'
url = f"https://search.naver.com/search.naver?where=nexearch&sm=top_hty&fbm=0&ie=utf8&query={s}{n}{l}"

res = requests.get(url)

if res.status_code == 200:
    html = res.text
    soup = BeautifulSoup(html, 'html.parser')

    ul = soup.select_one('div.cm_pure_box')
    sing = ul.select("div > p")
    
    for s in sing:
        print(s.text)

else:
    print(res.status_code)





