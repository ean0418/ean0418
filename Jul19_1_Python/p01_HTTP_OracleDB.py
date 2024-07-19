# -*- coding:utf-8 -*-
from http.client import HTTPConnection
from cx_Oracle import connect
from xml.etree.ElementTree import fromstring

# 기상청 (주소값 구해서)
# 기상청 xml => DB에 적재
# 시간대 / 기온 / 최고기온 / 날씨(한글) / 바람의방향(한글)

# http://www.kma.go.kr/wid/queryDFSRSS.jsp?zone=1171058000

con = connect("hjs980418/0418@localhost:1521/xe")


hc = HTTPConnection("www.kma.go.kr")
hc.request("GET", "/wid/queryDFSRSS.jsp?zone=1171058000")

res = hc.getresponse()
resBody = res.read()
# print(resBody.decode())

for w in fromstring(resBody).iter("data"):
    # print(w.find("hour").text)
    # print(w.find("temp").text)
    # print(w.find("tmx").text)
    # print(w.find("wfKor").text)
    # print(w.find("wdKor").text)
    a = w.find("hour").text
    b = w.find("temp").text
    c = w.find("tmx").text
    d = w.find("wfKor").text
    e = w.find("wdKor").text
    
    sql = f"insert into jul19_weather values(jul19_weather_seq.nextval,'{a}','{b}','{c}','{d}','{e}')"
    
    cur = con.cursor()
    cur.execute(sql)
    
if cur.rowcount == 1:
    print("성공")
    con.commit()

con.close()
    






















