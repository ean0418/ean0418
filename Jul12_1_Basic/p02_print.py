# -*- coding:utf-8 -*-

# Java vs Python
#    Java : 컴퓨터 활용 효율적 => 규칙의 언어 => Perfect한 객체지향언어
#            명확하고, 혼란스럽지 않은 코드
#            코드가 길어진다

#    Python : 사람이 쓰기 편하게 => 자유의 언어 => hybrid한 객체지향언어
#            코드가 짧다
#            코드가 길어지면... 헷갈릴 여지가 있음!
##########################################################

# 기본적인 출력 방식 
print("wa! 파이썬!") # '' / "" 구분안해도 됨
print("wa! 금요일!") # enter 기능 포함 O
print()

# seperator
print("내", '일', "토", '요', "일", sep='ㅋ')
# 여러분의 메일주소 출력
print("abhjs1337","naver.com", sep='@')
# 전화번호 출력
print("010",'1111','2222', sep="-")

# end 
print('파이썬이', end=' ') # 기본값\n
print('본격적으로', end=' ')
print('시작되었습니다.', end='\n')

# 출력 형식 (format)
print('{} and {}'.format('1번', '2번'))
print('{1} and {0} and {0}'.format('1번', '2번')) # 숫자 넣으면 순서지정도 가능
print('{p1} is {p2}'.format(p1='Life', p2='Egg'))# 지정도 가능
print()

# %d, %f, %s
# System.out.printf("%d", 123); 파이썬에서는 ;써도되고 안써도 됨
print('%d' % 123)
print('%.2f' % 123.456789)

# 10이라는 값을 0번째에, 11.11111이라는 값을 1번재에 소수점 둘째자리까지 출력
print('{0} and {1}'.format('%d' % 10, '%.1f' % 11.11111))
print('{0: d}, {1: .2f}'.format(10, 11.11111))
print()






