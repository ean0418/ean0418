import matplotlib.pyplot as plt
import matplotlib.font_manager as fm
import numpy as np

prnDict, frnDict, panDict, fanDict = {}, {}, {}, {}

fontFile = "C:/Windows/Fonts/malgun.ttf"
fontName = fm.FontProperties(fname=fontFile, size=50).get_name()
plt.rc("font", family=fontName)   

with open("C:/Users/sdedu/Desktop/Test/data/subwayInfo.csv","r", encoding="UTF-8") as f:
    for line in f.readlines():
        line = line.replace("\n","").split(",")
        when = line[0]
        prn = float(line[3]); frn = float(line[4])
        pan = float(line[5]); fan = float(line[6])
        
        if when in prnDict:
            prnDict[when] += prn
            frnDict[when] += frn
            panDict[when] += pan
            fanDict[when] += fan
        else:
            prnDict[when] = prn
            frnDict[when] = frn
            panDict[when] = pan
            fanDict[when] = fan   
    print(when)
    print(prnDict)
    print(frnDict)
    print(panDict) 
    print(fanDict)  
whens, prns, frns, pans, fans = [],[],[],[],[]
for k, v in prnDict.items():
    whens.append(k)
    prns.append(v)
    frns.append(frnDict[k]) # key에 해당하는 value
    pans.append(panDict[k])
    fans.append(fanDict[k])
print("----------------")
print(whens)    
print(prns)    
print(frns)    
print(pans)    
print(fans)    

plt.plot(whens, prns, color = "#EF9A9A")    
plt.plot(whens, frns, color = "#EF9A9A")    
plt.plot(whens, pans, color = "#EF9A9A")    
plt.plot(whens, fans, color = "#EF9A9A")    

plt.legend(["유임승차", "무임승차", "유임승차", "무임승차"])
plt.title("월별 지하철 유.무임 승차 정보")
plt.show()
        
        
        
        
        
        
        