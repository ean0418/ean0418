# -*- coding:utf-8 -*-
from cx_Oracle import connect

con = connect("hjs980418/0418@localhost:1521/xe")

file = open("C:/Users/sdedu/Desktop/Test/data/weatherInfo.csv","a", encoding="UTF-8")

sql = "select * from jul19_weather"
cur = con.cursor()
cur.execute(sql)

for a,b,c,d,e,f in cur: 
    file.write(f"{a},{b},{c},{d},{e},{f}\n")

file.close()
con.close()
print("성공!")










