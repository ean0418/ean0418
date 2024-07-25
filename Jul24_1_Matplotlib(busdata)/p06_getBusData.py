# -*- coding:utf-8 -*-
from http.client import HTTPConnection
from cx_Oracle import connect
from json import loads
from urllib.parse import quote
from datetime import datetime
import math

def is_valid_date(year, month, day):
    try:
        datetime(year, month, day)
        return True
    except ValueError:
        return False

# http://openapi.seoul.go.kr:8088/4f626857416f6c6c3632586a416843/json/CardBusStatisticsServiceNew/1/5/20151101/

# 2021 ~ 2023년 3년치 데이터를...
# 연, 월, 일 , 노선번호, 정류장명(역명), 승차총승객수, 하차총승객수
# 연도별로 csv파일에 저장

# 정류장명(역명) => 혹시 , 가 들어있을수도 있으니
#        => ,를 .로 바꿔서 저장

# 인원수 관련 => 정수형태로 저장


y = 2023
hc = HTTPConnection("openapi.seoul.go.kr:8088")
f = open(f"C:/Users/sdedu/Desktop/Test/data/busInfo{y}.csv","w", encoding="UTF-8")
for m in range(1, 13):
    for d in range(1,32):
        if not is_valid_date(y, m, d):
            continue
        
        print(f"{y}-{m:02d}-{d:02d}")
        
        data_str=f"{m:02d}{d:02d}"
        datetime.strptime(data_str, "%m%d")
        url = f"/4f626857416f6c6c3632586a416843/json/CardBusStatisticsServiceNew/1/1000/{y}{data_str}"
        hc.request("GET", url=url)
        resBody = hc.getresponse().read()
        bus = loads(resBody)
        if "CardBusStatisticsServiceNew" not in bus:
            break
        
           
        total = int(bus["CardBusStatisticsServiceNew"]["list_total_count"])        
        page = math.ceil(total / 1000 )+ 1
        for x in range(1, page):
            hc.request("GET", f"/4f626857416f6c6c3632586a416843/json/CardBusStatisticsServiceNew/{1 +(x-1)*1000}/{x*1000}/{y}{data_str}")
        
            resBody = hc.getresponse().read()
            bus = loads(resBody)
        
            for b in bus["CardBusStatisticsServiceNew"]["row"]:
                a1 = int(b['GTON_TNOPE'])
                b1 = int(b['GTOFF_TNOPE'])
                c1 = b['SBWY_STNS_NM'].replace(",",".")
                f.write(f"{y},{m:02d},{d:02d},{b['RTE_NM']},{c1},{a1},{b1}\n")
            
f.close()                
   





