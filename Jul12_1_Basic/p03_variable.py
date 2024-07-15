# -*- coding:utf-8 -*-
from pickle import TRUE, FALSE

# 변수 (Variable)
# Java : 값을 표현하기 위해서 최적의 자료형을 개발자가 직접 선정
#        => 메모리 사용량이 최적화 
#        자료형 변수명 = 값;
#        int a = 10;

# Python : Python이 알아서 자료형을 선정
#        '자료형' 이라는 것 자체를 공부할 필요가 딱히 없음 => 개발자가 편함
#        자동으로 선정하는 시간 : 메모리 사용량 최적화 컨트롤이 불가능
#        기본형이 없고, 다 참조형 >> 메모리의 사용량이 많음
#        변수명 = 값 

a = 10
print(a)
print(type(a))  #type(변수) : 자료형
print(id(a))    # id(변수) : 주소값

# Java 버전 값 바꾸기
# int b = 10;
# b = 20;

b = 10
print(id(b))

# 파이썬 값을 변경할 때 메모리에 저장된 값을 지우고 다시 저장하지 않음
# 대신 또 다른 메모리 공간에 값을 저장하고 그 곳을 a 변수로 지정하게 됨
# 값을 지우기 않기 때문에 10 값은 그대로 남아있고, 나중에 재사용 할 수 있음
# 변수는 메모리 공간을 가리키는 지시자(포인터) 역할을 함

# Python의 data type (자료형)
p_str ='Ean'    # str : 문자열
print(p_str, type(p_str))

p_int = 10      # int : 정수
print(p_int, type(p_int))

p_float = 1.234 # float : 실수
print(p_float, type(p_float))

p_bool = True   # bool : 논리 (True, False)
print(p_bool, type(p_bool))

p_list = [3, 7, 5] # list : 리스트
print(p_list, type(p_list))

p_list2 = [p_str, p_int]
print(p_list2, type(p_list2))

p_dict = {
    'name' : 'Ean',
    'age'  : 100
}   # dict : 사전(dictionary)
print(p_dict, type(p_dict))

p_set = {6, 7, 4} # set : 집합
print(p_set, type(p_set))

#p_tuple = (5, 7, 6) # tuple(튜플)
p_tuple = 5, 7, 6 # () 생략 가능
print(p_tuple, type(p_tuple))
print('############################')

# 형 변환 (Type Casting)
d = 1
print(type(d), id(d))
d = str(d)
print(type(d), id(d))

e = False
e = int(e)
print(e)        # False = 0 / True = 1

print('############################')
# 키보드 입력받기 (keyboard input)
ki = input('키: ')
print(ki, type(ki)) # input으로 가져오면 기본적으로 str이기 때문에
                    # 정수, 실수는 형 변환이 필요함

ki = float(ki)
print(ki, type(ki))

ki2 = float(input('몸무게 :'))
print(ki2, type(ki2))


