# -*- coding:utf-8 -*-
from http.client import HTTPConnection
from json import loads

y = 2023
f = open(f"C:/Users/sdedu/Desktop/Test/data/busInfo{y}.csv","w", encoding="UTF-8")
hc = HTTPConnection("openapi.seoul.go.kr:8088")
for m in range(1, 13):
    for d in range(1,32):
        for start in range(1, 41000, 1000):
            url = "/4f626857416f6c6c3632586a416843/json/CardBusStatisticsServiceNew/"
            url += f"{start}/{start + 999}/{y}{m:02d}{d:02d}/"
            hc.request("GET",url)
            resBody = hc.getresponse().read()
            bus = loads(resBody)
            if "CardBusStatisticsServiceNew" in bus:
                for b in bus["CardBusStatisticsServiceNew"]["row"]:
                            a1 = int(b['GTON_TNOPE'])
                            b1 = int(b['GTOFF_TNOPE'])
                            c1 = b['SBWY_STNS_NM'].replace(",",".")
                            f.write(f"{y},{m:02d},{d:02d},{b['RTE_NM']},{c1},{a1},{b1}\n")
                    
        print(y, m, d)
        
f.close()    
                    















