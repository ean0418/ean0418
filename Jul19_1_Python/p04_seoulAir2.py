# -*- coding:utf-8 -*-
from cx_Oracle import connect

# db에 있는 미세먼지 데이터 => csv에 저장(데이터 콤마로 구분)

con = connect("hjs980418/0418@localhost:1521/xe")

file = open("C:/Users/sdedu/Desktop/Test/data/airInfo.csv", "a", encoding="UTF-8")

sql ="select * from jul19_dust"
cur = con.cursor()
cur.execute(sql)

for a,b,c,d in cur:
    file.write(f"NO : {a}, 구 : {b}, 미세먼지 : {c}, 초미세먼지 : {d}\n")
   
file.close()

con.close() 




















