# -*- coding:utf-8 -*-
from _ast import In

# for (int i = 0; ...)    : x
# for (int ii : i)        : o (Java의 for-each문에 해당하는
#                                반복문 존재)

l = [123, 45, 6, 78, 910]
for ll in l:        # for (int ll : l)
        print(ll)
print()

# ㅋ을 10번 출력
for z in range(10):
    print("ㅋ") 
    
# 1~20까지의 정수 중에서 홀수만 출력
for zz in range(1, 21, 2): # for (int zz = 1; zz < 21; zz += 2)
    print(zz)
print()
###################################################
# while 문 : o
while True:
    y = int(input("y : "))
    if y % 2 == 0:
        print("짝수")
        break
# do{}while문 : x
################################################
# enumerate : 반복문을 사용할 때 몇 번 반복되었는지 확인이 필요할 때 사용
#            (인덱스, 값) 형태의 tuple로 리턴
ll = ["컴퓨터", "모니터","키보드", "마우스"]

for i, v in enumerate(ll): 
    print(i + 1, v)
print("--------")

score = [10, 54, 56, 70, 70, 87, 65, 99, 91, 88]
# 1등 학생은 몇번째에 ? / 점수는 몇점인지? 출력
maxI, maxS = 0, 0
for i, v in enumerate(score):
    if maxS < v:
        maxS = v
        maxI = i
        
print(maxI, maxS)      

print(score.index(maxS))   









