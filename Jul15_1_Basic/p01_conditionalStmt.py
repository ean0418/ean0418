# -*- coding:utf-8 -*-

# 조건문 : 흐름 제어

if True: # 들여쓰기 꼭하기!
    print("와~ 조건문") 
if False:
    print("안나오겟쥐~?")
####################################################
# 우선순위 (산술, 관계, 논리)
# 산술 > 관계 > 논리
print(10 + 2 > 8 + 3) # 산술이 관계보다 앞서서 => 12 > 11
print(10 + 2 * 2 > 8 + 3 * 2) # 14 > 14
print(((10 + 2) > 3) and (6 + 4 == 10))
###################################################
# if 조건A:
    # 코드
# else: 
    # 코드

# 놀이동산 >> A : 성인, 150이상 (값은 입력받아서)
# 입력시에 => 탑승 가능 or 탑승 불가 출력
age = int(input("나이: "))
height = float(input("키: "))

# if (age >= 20):
    # if (height >= 150):
        # print("탑승가능")
    # else:
        # print("탑승불가")
# else:
    # print("탑승 불가")

if (age >= 20 and height >= 150):
    print("탑승가능")
else:
    print("탑승불가")

print("탑승 가능" if(age >= 20 and height >= 150) else "탑승 불가")
print((age >= 20 and height >= 150) and "탑승가능" or "탑승 불가")
#############################################
# 다중 조건문
# Java : if - else if - else
# Python : if - elif - else
# 점수 입력 => 80점 이상은 'A'
# 점수 입력 => 70점 이상은 'B'
# 점수 입력 => 60점 이상은 'C'
# 점수 입력 => 나머지는 'D'

grade = int(input("점수: "))
if grade > 100 or grade < 0:
    print("뭐함?")
elif (grade >= 80):
    print("A")
elif (grade >= 70):
    print("B")
elif (grade >= 60):
    print("C")
else:
    print("D")

# switch - case : 없음

# in, not in
abc = {"name" : "비버", "age" : 19, "phone" : "010-1111-2222"}

print("name" in abc)
print(20 in abc.values())
print("height" not in abc)

