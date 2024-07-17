# -*- coding:utf-8 -*-

from http.client import HTTPSConnection
from json import loads
from xml.etree.ElementTree import fromstring

# 42008a8c8e7402a3fc9d3b1a7df8fee9

# https://api.openweathermap.org/data/2.5/weather?q={city name}&appid={API key}

# 도시 이름 : 입력 (영어)
# 요청파라미터 추가 0
# 응답 내용 출력까지

where = input("도시 이름(영어) :")


hc = HTTPSConnection("api.openweathermap.org")
u = "/data/2.5/weather?q=%s&appid=42008a8c8e7402a3fc9d3b1a7df8fee9&units=metric&lang=kr" % where
hc.request("GET", u)

resBody = hc.getresponse().read()
print(resBody.decode())

weatherData = loads(resBody) # JS => Python
# print(weatherData)

# dict : {"key" : "value"}
# list : [1, 2, 3] => 인덱스 값으로
l = [1, 2, 3] # Python : list / JS : array
d = {"name" : "홍길동", "age" : 30} # Python : dict / JS : object
##########################################################
# 날씨 / 기온temp / 체감기온feels_like / 습도humidity / 바람속도wind speed
# 데이터를 콘솔창에 출력
# dict / list 잘 확인하면서 

weather = weatherData["weather"][0]["main"]
temp = weatherData["main"]["temp"]
feels_like = weatherData["main"]["feels_like"]
humidity = weatherData["main"]["humidity"]
wind = weatherData["wind"]["speed"]

print(f"날씨는 {weather} 입니다")
print(f"온도는 {temp}도 입니다")
print(f"체감온도는 {feels_like}도 입니다")
print(f"습도는 {humidity}% 입니다")
print(f"바람속도는 {wind}m/s 입니다")




