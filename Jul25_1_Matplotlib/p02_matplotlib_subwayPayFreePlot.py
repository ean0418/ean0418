# -*- coding:utf-8 -*-
import matplotlib.pyplot as plt
import matplotlib.font_manager as fm
import numpy as np
# 방금 만든 csv파일 불러와서
#    연월에 맞춰서 => 유임승차, 무임승차, 유임하차, 무임하차 (전체 합)
#    => 선 그래프 그리기!
a ={}
b= {}
c={}
d={}
when={}
with open("C:/Users/sdedu/Desktop/Test/data/subwayInfo.csv","r", encoding="UTF-8") as f:
    for line in f.readlines():
        line = line.replace("\n","").split(",")
        a1 = int(line[3])
        b1=int(line[4])
        c1=int(line[5])
        d1=int(line[6])
        when1=line[0]
        
        if when1 in a:
            a[when1] += a1
            b[when1] += b1
            c[when1] += c1
            d[when1] += d1
            when[when1] += 1
        else:
            a[when1] = a1
            b[when1] = b1
            c[when1] = c1
            d[when1] = d1
            when[when1] = 1
    
print("최종");print(when);print(a);print(b);print(c);print(d)  

whens = []
a2 = []
b2 = []
c2 = []
d2 = []

for k, v in when.items():
    whens.append(k)
    a2.append(a[k])
    b2.append(b[k])
    c2.append(c[k])
    d2.append(d[k])
print("-----------------")
print(whens);print(a2);print(b2);print(c2);print(d2)

fontFile = "C:/Windows/Fonts/malgun.ttf"
fontName = fm.FontProperties(fname=fontFile, size=50).get_name()
plt.rc("font", family=fontName)   

# x1 = plt.subplot()
# p1 = x1.plot(whens, a2, "r-")
# x1.set_xlabel("연월")
# plt.xticks(whens,["01","02","03","04","05","06","07","08","09","10","11","12","01","02","03","04","05","06","07","08","09","10","11","12","01","02","03","04","05","06","07","08","09","10","11","12","01","02","03","04","05","06","07","08","09","10","11","12","01","02","03","04","05","06","07","08","09","10","11","12"])
#
# x2 = x1.twinx()
# p2 = x2.plot(whens, b2, "g:")
#
#
#
# p3 = x1.plot(whens, c2, "b--")
#
#
#
# p4 = x2.plot(whens, d2, "k-.")
#
# x1.legend(p1+p2+p3+p4, ["유임승차","무임승차","유임하차","무임하차"])
# plt.show()

plt.plot(whens, a2, color = "#EF9A9A")    
plt.plot(whens, b2, color = "#EF9A9A")    
plt.plot(whens, c2, color = "#EF9A9A")    
plt.plot(whens, d2, color = "#EF9A9A")    

plt.legend(["유임승차", "무임승차", "유임승차", "무임승차"])
plt.title("월별 지하철 유.무임 승차 정보")
plt.show()