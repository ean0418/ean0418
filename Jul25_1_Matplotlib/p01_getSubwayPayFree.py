# -*- coding:utf-8 -*-
from http.client import HTTPConnection
from datetime import datetime
from json import loads
import math

# 4f626857416f6c6c3632586a416843

# http://openapi.seoul.go.kr:8088/4f626857416f6c6c3632586a416843/json/CardSubwayPayFree/1/5/201501/

# 2019 ~ 2023년 월별로 > 하나의 파일(csv)에 저장
# 연월(ex:201901), 호선명, 지하철역, 유임승차인원, 무임승차인원, 유임하차인원, 무임하차인원

hc = HTTPConnection("openapi.seoul.go.kr:8088")
with open("C:/Users/sdedu/Desktop/Test/data/subwayInfo.csv","w", encoding="UTF-8") as f:
    for y in range(2019, 2024):
        for m in range(1, 13):
            print(f"{y}-{m:02d}")
            
            data_str =f"{y}{m:02d}"
            datetime.strptime(data_str, "%Y%m")
                
            
            url = f"/4f626857416f6c6c3632586a416843/json/CardSubwayPayFree/1/5/{data_str}/"
            hc.request("GET",url=url)
            resBody = hc.getresponse().read()
            subway = loads(resBody)
            
            if "CardSubwayPayFree" not in subway:
                break
            
            total = int(subway["CardSubwayPayFree"]["list_total_count"])        
            page = math.ceil(total / 100 + 1)       
            
            for x in range(1, page):
                hc.request("GET", f"/4f626857416f6c6c3632586a416843/json/CardSubwayPayFree/{1 +(x-1)*100}/{x*100}/{data_str}/")
                resBody = hc.getresponse().read()
                subway = loads(resBody)
                       
                for s in subway["CardSubwayPayFree"]["row"]:
                    a = s['USE_MM']
                    b = s['SBWY_ROUT_LN_NM']
                    c = s['STTN']
                    d = int(s['RMIO_GTON_NOPE'])
                    e = int(s['FREECHRG_GTON_NOPE'])
                    f1 = int(s['RMIO_GTOFF_NOPE'])
                    g = int(s['FREECHRG_GTOFF_NOPE'])
                    f.write(f"{a},{b},{c},{d},{e},{f1},{g}\n")
