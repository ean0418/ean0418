import matplotlib.pyplot as plt
import matplotlib.font_manager as fm

from http.client import HTTPConnection
from json import loads
hc = HTTPConnection("openapi.seoul.go.kr:8088")
hc.request("GET","/4f626857416f6c6c3632586a416843/json/RealtimeCityAir/1/25/")

resBody = hc.getresponse().read()

airData = loads(resBody)

whereDict = {} # {'동남권': 3, '서북권' : 2, ...}
pm10Dict = {}
pm25Dict = {}

for a in airData["RealtimeCityAir"]["row"]:
    # print(a["MSRRGN_NM"])
    # print(a["PM10"])
    # print(a["PM25"])
    where = a["MSRRGN_NM"]
    pm10 = float(a["PM10"])
    pm25 = float(a["PM25"])
    
    if where in pm10Dict:
        pm10Dict[where] += pm10
        pm25Dict[where] += pm25
        whereDict[where] += 1
    else:
        pm10Dict[where] = pm10
        pm25Dict[where] = pm25
        whereDict[where] = 1
    print(whereDict)
    print(pm10Dict)
    print(pm25Dict)

print("최종");print(whereDict);print(pm10Dict); print(pm25Dict)
###################################################
names = []
pm10s = []  
pm25s = []  

for k, v in whereDict.items():
    names.append(k)
    pm10s.append(pm10Dict[k] / v)
    pm25s.append(pm25Dict[k] / v)
    
print("-------------")
print(names); print(pm10s); print(pm25s)
    
fontFile = "C:/Windows/Fonts/malgun.ttf"
fontName = fm.FontProperties(fname=fontFile, size=50).get_name()
plt.rc("font", family=fontName)   


plt.bar(names, pm10s, color="#FFA7A7")     
plt.bar(names, pm25s, color="#B2CCFF", bottom=pm10s) 
plt.legend(["미세먼지","초미세먼지"])    
plt.show()