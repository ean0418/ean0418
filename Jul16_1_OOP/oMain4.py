# -*- coding:utf-8 -*-


# abstract - X

# Java : 생성자 상속이 안됨
# Python : 생성자가 상속이 됨
#    멤버변수를 생성자에게 결정 => 생성자를 상속안해주면
#        => 멤버변수가 상속이 안되는...

class Avengers:
    def __init__(self, name, age):
        print("Avengers Assemble ~")
        self.name = name
        self.age = age
        
    def attack(self):
        print("공~~~격")

    def printInfo(self):
        print(self.name)
        print(self.age)
#########################################################
class Ironman(Avengers):
    
    # overloading : 메모드명 같게, 파라미터는 다르게
    # overriding : 상속받은 메소드의 기능을 바꾸기
    def __init__(self, name, age, suitType):
        Avengers.__init__(self, name, age)
        self.suitType = suitType

    def attack(self):
        Avengers.attack(self)
        super().attack()
        #super(). = 상위에 있는
        print("~~~~~~!!!!")

    def printInfo(self):
        Avengers.printInfo(self)
        print(self.suitType)
        
        
#################################################################        
# 헐크(어벤져스 소속) /이름 나이 바지사이즈 / 공격 0 / 정보 출력
class Hurk(Avengers):
    
    def __init__(self, name, age, pantsSize):
        Avengers.__init__(self, name, age)
        self.pantsSize = pantsSize
        
    def attack(self):
        Avengers.attack(self)
        print("허르크으으~")
        
    def printInfo(self):
        Avengers.printInfo(self)
        print(self.pantsSize)
        
#################################################################
if __name__ == "__main__":
    i = Ironman("토니스타크", 1, "mk50")
    i.attack()
    i.printInfo()
    print()


if __name__ == "__main__":
    h = Hurk("헐크", 3, "XXXXXXL")
    h.attack()
    h.printInfo()
    print()


