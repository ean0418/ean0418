from http.client import HTTPConnection
from json import loads
hc = HTTPConnection("openapi.seoul.go.kr:8088")
with open("C:/Users/sdedu/Desktop/Test/data/subwayInfo.csv","w", encoding="UTF-8") as f:
    for y in range(2019, 2024):
        for m in range(1, 13):
            when = "%d%02d" % (y, m)
            for start in range(1, 2000, 1000):
                hc.request("GET", f"/4f626857416f6c6c3632586a416843/json/CardSubwayPayFree/{start}/{start + 999}/{when}/")
                resBody = hc.getresponse().read()
                subwayData = loads(resBody)
                
                if "CardSubwayPayFree" in subwayData:
                    for s in subwayData["CardSubwayPayFree"]["row"]:
                        a = s['USE_MM']
                        b = s['SBWY_ROUT_LN_NM']
                        c = s['STTN']
                        d = float(s['RMIO_GTON_NOPE'])
                        e = float(s['FREECHRG_GTON_NOPE'])
                        f1 = float(s['RMIO_GTOFF_NOPE'])
                        g = float(s['FREECHRG_GTOFF_NOPE'])
                        f.write(f"{a},{b},{c},{d},{e},{f1},{g}\n")
                
                
                
                
                
                
                