# -*- coding:utf-8 -*-
# http://openAPI.seoul.go.kr:8088/4f626857416f6c6c3632586a416843/json/RealtimeCityAir/1/25/
from http.client import HTTPConnection
from json import loads
from cx_Oracle import connect
from xml.etree.ElementTree import fromstring




# 구 이름 MSRSTE_NM, 미세먼지PM10, 초미세먼지PM25 의 정보를 db에 담아주세요!
#    (여러 기간에 걸쳐 이 테이터를 모은다고 가정)
con = connect("hjs980418/0418@localhost:1521/xe")

hc = HTTPConnection("openAPI.seoul.go.kr:8088")
hc.request("GET", "/4f626857416f6c6c3632586a416843/json/RealtimeCityAir/1/25/")

resBody = hc.getresponse().read()
print(resBody.decode())

dustData = loads(resBody)
dust = dustData["RealtimeCityAir"]["row"]

for i in dust:
    a = i["MSRSTE_NM"]
    b = i["PM10"]
    c = i["PM25"]

    sql = f"insert into jul19_dust values(jul19_dust_seq.nextval,'{a}','{b}','{c}')"
    cur = con.cursor()
    cur.execute(sql)

if cur.rowcount == 1:    
    print("성공")
    con.commit()

con.close()    

