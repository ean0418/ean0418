# -*- coding:utf-8 -*-
from http.client import HTTPSConnection
from xml.etree.ElementTree import fromstring

from urllib.parse import quote


# dev.naver.com

#"82bQtlxNZZmW_dBEz27u"
# "E2mRcl3T4o"

# Documents - 검색 - 쇼핑 (내려서 xml 주소)
# https://openapi.naver.com/v1/search/shop.xml

# 상품명 : 입력
# xml 파싱해서
# 문서의 상품 이름 / 최저가 / 브랜드 / 대분류 카테고리 정보를 출력
# URLEncoding 해서 주소로 넘겨줄 것
# qutoe - urllib.parse

q = input("상품명 : ")
q = quote(q)

def cut(t):
    t = t.replace("<b>", "").replace("</b>","")
    return t

hc = HTTPSConnection("openapi.naver.com") # 서버 주소
# request 함수의 body
#    : 요청할 때 데이터를 보내야 하는 경우에 body에 담아서 보냄
h = {
    "X-Naver-Client-Id" : "82bQtlxNZZmW_dBEz27u",
    "X-Naver-Client-Secret" : "E2mRcl3T4o"
    }

hc.request("GET","/v1/search/shop.xml?query="+q, headers=h) # 요청 


resBody = hc.getresponse().read()
# print(resBody.decode())

for s in fromstring(resBody).iter("item"):
    print(cut(s.find("title").text))
    print(s.find("lprice").text)
    print(s.find("brand").text)
    print(s.find("category1").text)
    print("------------------")
















