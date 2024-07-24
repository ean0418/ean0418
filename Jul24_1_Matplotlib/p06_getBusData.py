# -*- coding:utf-8 -*-
from http.client import HTTPConnection
from cx_Oracle import connect
from json import loads
from urllib.parse import quote

# http://openapi.seoul.go.kr:8088/4f626857416f6c6c3632586a416843/json/CardBusStatisticsServiceNew/1/5/20151101/

# 2021 ~ 2023년 3년치 데이터를...
# 연, 월, 일 , 노선번호, 정류장명(역명), 승차총승객수, 하차총승객수
# 연도별로 csv파일에 저장

# 정류장명(역명) => 혹시 , 가 들어있을수도 있으니
#        => ,를 .로 바꿔서 저장

# 인원수 관련 => 정수형태로 저장

con = connect("hjs980418/0418@localhost:1521/xe")
cur = con.cursor()
with open("C:/Users/sdedu/Desktop/Test/data/busInfo.csv","w", encoding="UTF-8") as f:
    for y in range(2021, 2024):
        for m in range(1, 13):
            for d in range(1,32):
                hc = HTTPConnection("openapi.seoul.go.kr:8088")
                hc.request("GET", "/4f626857416f6c6c3632586a416843/json/CardBusStatisticsServiceNew/1/1000/{y}{m:02d}{d}")
                
                resBody = hc.getresponse().read()
                bus = loads(resBody)
                
                for b in bus["CardBusStatisticsServiceNew"]["rows"]:
                    a1 = int(b['GTON_TNOPE'])
                    b1 = int(b['GTOFF_TNOPE'])
                    f.write(f"'{b['USE_YMD']}','{b['RTE_NM']}','{b['SBWY_STNS_NM']}','{a1}','{b1}'")
                    
                
con.commit()
con.close()





