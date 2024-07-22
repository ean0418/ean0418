# -*- coding:utf-8 -*-
from urllib.error import HTTPError, URLError
import urllib.request as req

# 저장 경로 - list형식으로 !

urlList = ["https://image.dongascience.com/Photo/2022/06/6982fdc1054c503af88bdefeeb7c8fa8.jpg",
            "http://www.google.com"]

pathList = ["C:/Users/sdedu/Desktop/Test/WebCrawling/dog2.jpg",
            "C:/Users/sdedu/Desktop/Test/WebCrawling/index.html"]

for i, url in enumerate(urlList):
    # 예외처리
    try:
        # web의 수신정보를 확인
        res = req.urlopen(url)
        
        # 수신받는 내용
        content = res.read()
        print("----------------------")
        
        # 상태정보 확인
        print(f"헤더 정보 : {i, res.info()}")
        print(f"http status : {res.getcode()}")
        print("----------------------")
         
        # 파일 쓰기
        # with : 파일을 열고, 닫는거 같이 해주는 역할
        with open(pathList[i], "wb") as f :    # 'b' : binary mode
            f.write(content)
         
    except HTTPError as e:
        print("HTTPError Code : ", e.code)
    except URLError as e:
        print("URLError code : ", e.code)
    else: 
        print("---------------------")
        print("성 공 !")
        print("---------------------")

























