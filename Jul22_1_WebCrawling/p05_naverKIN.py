# -*- coding:utf-8 -*-
from urllib.parse import quote
import requests
from bs4 import BeautifulSoup

# https://kin.naver.com/search/list.naver?query=

q = quote(input("검색어 : "))
# print(q)

url =f"https://kin.naver.com/search/list.naver?query={q}"

# cmd => pip install requests
# requests : 간편하게 HTTP 요청하기 위해서 사용하는 모듈

response = requests.get(url)    # get() : GET방식 요청
# print(response.status_code)

if response.status_code == 200:
    html = response.text
    # print(html)
    soup = BeautifulSoup(html, 'html.parser')
    # select_one을 사용할 경우 : 문서의 처음부터 찾게 되며,
    #                        가장 처음에 만나는 해당 SELECTOR를 호출함
    ul = soup.select_one('ul.basic1')
    
    # select을 사용할 경우 : 해당하는 selector들의 모든 내용이 list에 담긴다
    # > : 그 하위에 있는 selector들 전부 다
    titles = ul.select('li > dl > dt > a')
    
    for title in titles:
        print(title.text)
else:
    print(response.status_code)












