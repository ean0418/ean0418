# -*- coding:utf-8 -*-

# function(함수)
# def 함수명(파라미터명):
    # code
    
def test():
    print("해장이 필요한 황정수")
    
def test2():    # :을 썻으면 그 다음줄에는 반드시 들여쓰기를 해야함!!   
    pass # : 뒤에 코드 적을것이 없을 때, 자리채우기 위해서
                    # pass 작성
                    
# 정수 2개를 넣으면 그 합을 '출력'하는 함수
# a = int(input("a: "))
# b = int(input("b: "))
#
# def add(a,b):
    # print("합은", a + b, "입니다")
# add(a,b)

def printHab(a=5, b=8): # 호출할 때 값을 안넣어주면 함수파라미터의 값을
    print(a + b)        # 기본값으로 사용
    
# 정수 3개를 넣으면 그 합을 '출력'하는 함수
def printHab2(a, b, c): # overloading이 안됨 => 모든 함수명이 다 달라야...
    print(a + b + c)

# 정수 2개를 넣으면 그 합을 '구하는' 함수
def getHab(a, b):
    return a + b

# 정수 2개를 넣으면 사칙연산 결과를 '구하는' 함수
def calc(a, b):
    
    '''
        설명서...
        이 설명서는 1734년 영국에서부터 시작되어..
        $^@%@#$%#$!$%$^%$#&%$^%@#^#@
    '''
    q = a + b
    w = a - b
    e = a * b
    r = a / b
    return q, w, e, r # tuple 하나 리턴
####################################################
help(calc)
help(print())

test()
print()

test2()
print()

printHab(3, 6)
printHab() # => 5 + 8 로 13
printHab2(1, 2, 3)

c = getHab(3, 6)
print(c)
print()

d = calc(20, 10)
print(d, type(d))

# u, i, o, p = calc(20, 10)

u, i, _, p = calc(20, 10) # _ 처리하면 곱하기 결과 안가져올수 있음
print(u, i, p)






