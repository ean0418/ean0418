# -*- coding:utf-8 -*-

# str 
s = "Can't tuna kkk"
print(s)
print(s[0])
print(s[0:6]) # (0번째부터 (6-1)번째까지의 문자열)
print(s[2:10:2]) # (2번째부터 (10-1)번째까지의 문자열을 2칸씩 건너서 출력)
print("-----------------")

# List : 리스트 (순서 0, 중복 0, 수정 0, 삭제 0)
a = [123, 4, 56, 789, 1011]
print(a, type(a))
print(a[0])
print(a[0:3])
print(a[0:5:2])
print(a[-1]) # 뒤에서 첫번째

print(len(a))          # 요소의 갯수
a.append(1213)         # 끝에 요소 추가
a.insert(2, 1415)      # 원하는 위치에 요소 추가
print(a) 
a[4] = 7788            # 수정
del a[0]               # 삭제


# a.sort()             # 오름차순 정렬
a.sort(reverse = True) # 내림차순 정렬
print(a)
print("-----------------------------------")

# Tuple : 순서 0, 중복 0, 수정 x, 삭제 x
# tuple1 = ('1', '2', '3')
# del tuple1[0] 삭제 기능 지원 x
# tuple[0] ='c' 수정 기능 지원 x
# print(tuple1)

t = (1, 2, 3, 4, 5, 4, 4)
print(t)
print(t.index(5)) # index 해당 위치에 있는 값을 반환
print(t.count(3)) # index안의 요소가 튜플안에서 몇개가 있는지 그 갯수를 반환

# a1 = 20
# b1 = 10
(a1, b1) = (10, 20) # 값을 줄 때 튜플로 묶어서 0 / 소괄호 없어도 됨
print(a1)
print(b1)
(a1, b1) = (b1, a1)
print(a1)
print(b1)

x, y, z = 10, 20, 30
x, y, z = z, x, y
print(x, y, z)
print("------------------------")

# Set(집합) : 중복 제거, 순서는 랜덤
s = {"ㅋ", "ㅋ", "ㄹ", "ㅃ", "ㅃ"}
print(len(s))
s = list(s)
print(s)
print("-------------------------")

# Dict (=map)
d = {"name": "곽두팔", "age":12}
print(d, type(d))

print(d["name"])
print(d["age"])
print("-------------------------")

# Range
r = range(10) # 0 ~ (10 - 1) 까지의 범위
print(r, type(r))

r2 = range(2, 10) # 2 ~ (10 - 1) 까지의 범위
print(r2, type(r2))

r3 = range(2, 10, 3) # 2 ~ (10 - 1) 까지의 범위를 3씩 건너서
print(r3, type(r3))

# 0 ~ 9까지 있는 list 출력
r4 = range(10)
r4 = list(r2)
print(r4, type(r4))

# 1 ~ 20 중 홀수만 있는 list 출력
r5 = range(1, 20, 2)
r5 = list(r5)
print(r5, type(r5))






