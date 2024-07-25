# -*- coding:utf-8 -*-
from http.client import HTTPConnection
import matplotlib.pyplot as plt
import matplotlib.font_manager as fm
import numpy as np

from urllib3 import request
from json import loads
from audioop import avg
import numpy

# 4f626857416f6c6c3632586a416843
# http://openapi.seoul.go.kr:8088/4f626857416f6c6c3632586a416843/json/RealtimeCityAir/1/25/

# 서북권, 도심권, 동북권, .. 의 미세먼지 / 초미세먼지
# 각각 평균값을 bar그래프로 표현(누적합_

dust1=[]
dust2=[]
msrrgn=[]

hc = HTTPConnection("openapi.seoul.go.kr:8088")
hc.request("GET","/4f626857416f6c6c3632586a416843/json/RealtimeCityAir/1/25/")

resBody = hc.getresponse().read()

# print(resBody.decode())

airData = loads(resBody)
air = airData["RealtimeCityAir"]["row"]

for a in air:
    b = a["PM10"]
    c = a["PM25"]
    d = a["MSRRGN_NM"]
    msrrgn.append(d)
    dust1.append(b) 
    dust2.append(c)
avgDust1 = sum(dust1) /len(dust1)
avgDust2 = sum(dust2) /len(dust2)

fontFile = "C:/Windows/Fonts/malgun.ttf"
fontName = fm.FontProperties(fname=fontFile, size=50).get_name()
plt.rc("font", family=fontName)      


plt.bar(msrrgn,avgDust1,color="#B5B2FF",)
plt.bar(msrrgn,avgDust2, color="#FFC19E", bottom=dust1)
plt.show()




