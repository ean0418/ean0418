# -*- coding:utf-8 -*-
from cx_Oracle import connect

# 메뉴만들기 (함수)
# 1. 학생 등록 / 2. 강의장 조회 / 3. 학생 조회 / 4. 학생정보를 파일로 내보내기
# 0. 종료

# 강의장 조회 : 1강의장 - 6증 복도 오른쪽
# 학생 조회 : 이름, 생년월일(연-월-일 (요일)), 나이, 몇 강의장,
#            중간 점수, 기말 점수, 평균 점수
# 파일로 내보내기 (학생의 전체 정보 다 csv 파일로)

def enrollStudent():
    con = connect("hjs980418/0418@localhost:1521/xe")
    cur = con.cursor()
    
    name = input("이름 : ")
    birth = input("생년월일(연-월-일): ")
    room = input("몇 강의장: ")
    test1 = int(input("중간점수 : "))
    test2 = int(input("기말점수 : "))
    
    sql = f"insert into jul19_student values(jul19_student_seq.nextval, '{name}',to_date('{birth}','(yyyy-mm-dd)'), '{room}', '{test1}', '{test2}')"
    
    cur.execute(sql)
    
    if cur.rowcount == 1:
        print("성공")
        con.commit()
        
    con.close()   

def findRm():
    con = connect("hjs980418/0418@localhost:1521/xe")
    cur = con.cursor()
    
    sql = f"select l_room, l_location from jul19_lRoom"
    cur.execute(sql)
    
    for r, l in cur:
        print(r, l)

    con.close()
    
def findSt():
    con = connect("hjs980418/0418@localhost:1521/xe")
    cur = con.cursor()
    
    sql = f"select s_name, TO_CHAR(s_birth, 'YYYY-MM-DD (DY)'), TRUNC(MONTHS_BETWEEN(SYSDATE, s_birth) / 12) s_room, s_test1, s_test2, (s_test1 + s_test2) /2 AS avg_score "
    sql += f"from jul19_student"
    cur.execute(sql)
    # 강사님 답안
    # 나이 계산  
    # now = datetime.today()
    # for _, name, birthday, room, mid, fin in cur:
    #    print("-----------------")
    #    print(f"이름 : {name})
    #    bd = datetime.strftime(birthday, "%Y-%m-%d")
    #    print(f"생일 : {bd} ({birthday.strftime('%a')}")
    #    print(f"나이 : {now.year-birthday.year}세")
    #    print(f"강의장 : {room})
    #    print(f"중간고사 : {min})
    #    print(f"기말고사 : {fin})
    #    print(f"평균점수 : {(mid+fin)/2}점")
    
    for row in cur:
        print(row)
    
    con.close()
    
def goFile():
    con = connect("hjs980418/0418@localhost:1521/xe")
    cur = con.cursor()
    
    file = open("C:/Users/sdedu/Desktop/Test/data/studentInfo.csv", "w", encoding="UTF-8")
    sql = "select * from jul19_student"
    cur = con.cursor()
    cur.execute(sql)

    for a,b,c,d,e,f in cur:
        file.write(f"No : {a}, 이름 : {b}, 생년월일(요일) : {c}, 강의실 : {d}, 중간고사 : {e}, 기말고사 : {f}\n")
    print("완료")
    file.close()
    con.close()

def end():
    print("종료")

def showMenu():
    print("메뉴")
    print("1. 학생 등록")
    print("2. 강의장 조회")
    print("3. 학생 조회")
    print("4. 학생정보를 파일로 내보내기")
    print("0. 종료")
    return input("번호 입력 : ")
    
def start():
    while True:
        menu = showMenu()
        if menu == "1": 
            enrollStudent()
        elif menu == "2":
            findRm()
        elif menu == "3":
            findSt()
        elif menu == "4":
            goFile()
        elif menu == "0":
            end()
            break 
#####################
start() 
    
    
    


















