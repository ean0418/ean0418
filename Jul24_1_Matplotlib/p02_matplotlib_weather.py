# -*- coding:utf-8 -*-
import matplotlib.pyplot as plt
import matplotlib.font_manager as fm
from http.client import HTTPConnection
from cx_Oracle import connect
from xml.etree.ElementTree import fromstring
import numpy as np

# 기상청 데이터
#    => 각 3시간별 기온(temp)와 습도(reh)를 선 그래프로 표현

# http://www.kma.go.kr/wid/queryDFSRSS.jsp?zone=1168052100
plt.rcParams['axes.unicode_minus'] = False # 음수부호 처리


temp = []
reh = []
hour= []
hc = HTTPConnection("www.kma.go.kr")
hc.request("GET", "/wid/queryDFSRSS.jsp?zone=1168052100")

res = hc.getresponse().read()

for w in fromstring(res).iter("data"):
    # print(w.find("temp").text)
    # print(w.find("reh").text)
    a= float(w.find("temp").text)
    b= float(w.find("reh").text)
    c = w.find("hour").text
    temp.append(a)
    reh.append(b)
    hour.append(c + "시")
indexes =range(len(hour))

##################################################
fontFile = "C:/Windows/Fonts/malgun.ttf"
fontName = fm.FontProperties(fname=fontFile, size=50).get_name()
plt.rc("font", family=fontName)

xData = indexes
yData = temp
yData2 = reh

x1 = plt.subplot()
p1 = x1.plot(xData, yData, "r-o")
x1.axis([None, None, None, 38])
x1.set_xlabel("시간")
x1.set_ylabel("온도")

x2 = x1.twinx()
p2 = x2.plot(xData, yData2, "g:^") 
x2.axis([None, None, 0, 100])
x2.set_ylabel("습도")
plt.title("날씨", loc="center")
x1.legend(p1+p2,["시간별 온도","시간별 습도"])

plt.xticks(indexes, hour)

plt.show() 











