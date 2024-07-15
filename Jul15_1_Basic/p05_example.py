# -*- coding:utf-8 -*-
import random
from _ast import Break, While

# UP/DOWN 게임 (함수)
# 유저의 이름을 입력받고 환영하는 인사를 출력
# (컴퓨터) 1 ~ 100 사이의 랜덤한 숫자를 하나 뽑아서
# 유저에게 정답을 입력하게 했을 때
# 저 범위의 숫자가 아니면 다시 입력하도록
# 입력한 숫자가 정답보다 작으면 'UP', 크면 'DOWN'출력
# 정답을 맞췄을 때는 몇 번만에 맞췄는 출력 + 종료
# 정답 기회는 총 10번

count = 10

def greetUser():
    name = input("이름 : ")
    print("환영합니다",name,"님")

def getComAns():    
    comNum = random.randint(1, 100)
    return comNum

def explainRule():
    print("################")
    print("기회는 총 10번!")
    print("1부터 100사이의 숫자!")
    print("################")

def sayUserAnswer():
    userNum = int(input("숫자 : "))
    if userNum > 100 or userNum <= 0:
         print("1~100 사이라구")
    return userNum if 1 <= userNum <= 100 else sayUserAnswer()

def playGame():
    greetUser()
    comNum = getComAns()
    explainRule()
    count = 0
    while count < 10:
        userNum = sayUserAnswer()
        count += 1
        
        if userNum < comNum:
            print("UP!")
        elif userNum > comNum:
            print("DOWN!")
        else:
            print("정답!!!!! %d번 만에 맞췄어" % count)
            print("정답은 %d였어" % comNum)
            break
    if count == 10:
        print("10번 기회를 다 썻음! 정답은 %d였어" % comNum)

playGame()



