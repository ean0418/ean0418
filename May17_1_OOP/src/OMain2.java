// Java : Perfect 객체지향언어 (구조가)
// C++, Python : Hybrid 객체지향언어 (구조가)

// 실생활을 묘사하자 => 보기가 쉬워질 것 => 유지보수에 용이해짐 !

// main()있는 클래스 : xxxMain
public class OMain2 {
	public static void main(String[] args) {
		// 버스를 Java로 표현해보자
		// => 표현하고 싶을 때는 항상! 클래스를! 새로! 만들자!
		// 버스번호 / 차종 / 버스회사 / 기사님이름 / 시작점 => 출력
		// int, double, String, ... : ?!, Java를 모르는 사람한테 설명하기 어렵다
		// 주석을 달 필요가 없다는게 장점!
		// 		=> 뭘 표현하고자 하는지 알 수 있기 때문에!
		// b : 객체, instance 라고 부름
		Bus b = new Bus(); // 버스 한대가 완성!
		b.number = 5002;
		b.car = "bus";
		b.company = "용인";
		b.name = "황정수";
		b.startingPoint = "에버랜드";
		
//		System.out.println(b.number);
//		System.out.println(b.car);
//		System.out.println(b.company);
//		System.out.println(b.name);
//		System.out.println(b.startingPoint);.
		
		b.printInfo();
		b.go();
		System.out.println("==================");
		
		// 핸드폰
		//		모델
		//		제조사
		//		가격
		// 		정보를 출력
		//		전화가 왔을 때 - 벨소리
		
		Cellphone c = new Cellphone();
		c.name = "아이폰15PLUS";
		c.company ="애플";
		c.price = 120;
		System.out.println(c); // 기본형이 아닌 것들은 다 참조형!!
		c.printCellphone();
		c.bell();
		System.out.println("==================");
		// c와 똑같으 ㄴ속성값을 가진 c2 생성 = 불가능 !!!(49번줄의 방법으로는 불가능)
		// => 무조건 new ~~로 생성해야 !!!!(*결론!!!!!!!!!!!!!)
		Cellphone c2 = c;// c의 별명이 하나 더 추가된 상황 !
		System.out.println(c2); //번지값이 같다. // 핸드폰 하나를 2개값이 공유하고 있음
		c2.price = 100;
		c2.printCellphone(); // 가격이 100으로 바뀜
		System.out.println("------");
		c.printCellphone(); // 위에서 c2가격을 100으로 변경 => c2 = c라서 공유!
		System.out.println("------");
		
	
	
	
	}
}
