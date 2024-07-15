# -*- coding:utf-8 -*-
import random
from random import randint
import time

# Java (null) = Python (None)

# 가위바위보 => 한 번 질 때까지 => 총 몇 번 이겼는 지 출력

handTable = [None, "가위", "바위", "보"]

def printRule():
    print("-------")
    for i, h in enumerate(handTable):
        if(i != 0):
            print('[%d]%s' %(i,h))
    print("-------")
    
def comFire():
    return randint(1, 3)

def userFire():
    print("-------")
    uh = int(input("뭐 낼 까 ? : " ))
    print("-------")
    if (1 <= uh <= 3):
        return uh
    else:
        print("잘 못 입 력 했 음 !")
        return userFire()

def printHand(uhuh, chch):
    print("유저 : %s" % handTable[uhuh])
    print("컴퓨터 : %s" % handTable[chch])

def judge(uhuh, chch):
    t = uhuh - chch
    if t == 0:
        print("무승부")
        return 0
    elif t == -1 or t == 2:
        print("패배")
        return 999
    else: 
        print("승리")
        return 1
    
def playGame():
    printRule()
    win = 0
    while True:
        uHand = userFire()
        cHand = comFire()
        printHand(uHand, cHand)
        result = judge(uHand, cHand)
        if result == 999:
            print("-=-=-=-=-=-=-=-=-=")
            print("종료 !")
            
            if win >= 10:
                time.sleep(1) # Java의 Thread.sleep()
                print(".", end="")
                time.sleep(1)
                print(".", end="")
                time.sleep(1)
                print(".", end="")
                time.sleep(1)
                print("씹고수")
            elif win >= 5:
                time.sleep(1) # Java의 Thread.sleep()
                print(".", end="")
                time.sleep(1)
                print(".", end="")
                time.sleep(1)
                print(".", end="")
                time.sleep(1)
                print("걍고수")
            else: 
                time.sleep(1) # Java의 Thread.sleep()
                print(".", end="")
                time.sleep(1)
                print(".", end="")
                time.sleep(1)
                print(".", end="")
                time.sleep(1)
                print("풉 ㅋㅋㅋ")
            
            break
        win += result
    print("%d승으로 종료" % win)
    
playGame()  
    
# def getComAns():
    # comAns = int(random.randint(1, 3))
    # return comAns
    #
# def getUserAns():
    # userAns = int(input("입력"))
    # if userAns != 1 or 2 or 3:
        # return userAns if 1<= userAns <=3 else getUserAns()
        #
# def getResult():
    # count = 0
    # count2 = 0
    # while True:
        # comAns = getComAns()
        # userAns = getUserAns()
        # if (comAns - userAns == -2 or  comAns - userAns == 1):
            # print("WIN")
            # count += 1
        # elif (comAns == userAns):
            # print("DRAW")
            # count2 += 1
        # elif (comAns - userAns == -1 or comAns - userAns == 2):
            # print("LOSE")
            # print("WIN : %d번" % count)
            # print("DRAW : %d번" % count2)
            # break;
            #
# getResult()
















