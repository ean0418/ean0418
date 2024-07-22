# -*- coding:utf-8 -*-
from fake_useragent.fake import UserAgent
import urllib.request as req
from json import loads

# 어떤 브라우저는 get, post 방식을 날리는 상대방이 컴퓨터인것을 알게 되면
#    해당 웹에 접속하는 것을 차단하는 경우 O
#        => '나 컴퓨터 아니야!' 라고 '사람인 척'을 하기 위해서 어떤 라이브러리를 사용
# fake-useragent
#    cmd => pip install fake-useragent -> pip list에서 다운 확인
# fake header 정보 (가상으로 User-agent 랜덤 생성)
# Python으로 정보를 크롤링하지만, 마치 웹브라우저에서 실행하는 것처럼 인식
ua = UserAgent()
# print(ua.ie)
# print(ua.msie)
# print(ua.chrome)
# print(ua.safari)
# print(ua.random)

# 헤더 선언 : dict 형태로 (key, value)
h = {
        "User-Agent" : ua.chrome,
        "referer" : "https://finance.daum.net/" # 이 경로를 통해서 왔다!
    }

# 다음 금융 (주식) 요청 URL
url = "https://finance.daum.net/api/search/ranks?limit=10"

# 요청
res = req.urlopen(req.Request(url, headers=h)).read().decode()

# 응답 데이터 확인
print('res : ', res)

# 응답 데이터 => python

# 순위, 주식명, 거래가를 콘솔에 출력

daumData = loads(res)
daum = daumData["data"]

for i in daum:
    rank = i["rank"]
    name = i["name"]
    tradePrice = i["tradePrice"]
    print(f"순위는 {rank}")
    print(f"주식명은 {name}")
    print(f"거래가는 {tradePrice}")
    print("----------------------")


























