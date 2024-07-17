# -*- coding:utf-8 -*-
from http.client import HTTPSConnection

from json import loads
from urllib.parse import quote
from pip._vendor.requests.utils import from_key_val_list
from xml.etree.ElementTree import fromstring

# dev.kakao.com

# 412e7727ffd0b8900060854044814879

# https://dapi.kakao.com/v2/search/web

# 책 이름 검색해서 책 제목 - 작가 / 할인가 / 도서 소개 출력

book = input("검색 : ")
book = quote(book)
h = {
    "Authorization" : "KakaoAK 412e7727ffd0b8900060854044814879"
    }
hc = HTTPSConnection("dapi.kakao.com")
hc.request("GET", "/v3/search/book?query=%s" %book, headers=h)

resBody = hc.getresponse().read()
print(resBody.decode())

bookData = loads(resBody)

books = bookData["documents"]
# print(books)

for b in books:
    try:
        print(b["title"],"-", b["authors"])
        print(b["title"],"-",", ".join(b["authors"]))
        #                        .join() : list를 문자열로
        #                        구분자.join() : list의 요소들을 지정한 구분자로 나눠
        #                        하나의 문자열로 합쳐줌
        #                        ex) ", ".join(['a', 'b', 'c']) => a, b, c
        print(b["sale_price"])
        print(b["contents"])
        print("-----------")
    except Exception as e:
        print("", end="")










