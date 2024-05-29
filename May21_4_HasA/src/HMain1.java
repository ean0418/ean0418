
// A has a B : 포함관계

public class HMain1 {
	// 이름이 Andrew Kim, 남자, 핸드폰 번호가 010-1234-5678인 사람
	// 출력
	
	// 강남포차, 논현동, 02-1111-2222, Andrew Kim의 식당
	// 출력 (식당 주인의 정보까지)
	
	// 계란말이, 22000원, 강남포차에서 파는 메뉴
	// 관련된 전체 정보를 출력
	
	// 석쇠불고기, 25000원, 강남포차에서 파는 메뉴
	// 관련된 전체 정보를 출력
	
	// 석쇠, 5000원, 석쇠불고기를 담은 접시
	// 관련된 전체 정보를 출력
	
	// 가락시장, 송파구, 석쇠를 구매한 시장
	// 관련된 전체 정보를 출력
	
	// 곽두팔, 가락시장을 좋아하는 상인
	// 관련된 전체 정보를 출력
	public static void main(String[] args) {
		Someone s = new Someone("Andrew Kim", "남성", "010-1234-5678");
		s.printInfo();
		System.out.println("----------");
		Restaurant r = new Restaurant("강남포차", "논현동", "02-1111-2222", s);
		r.printIntro();
		System.out.println("----------");
		Menu m = new Menu("계란말이", 22000, r);
		m.printInfo();
		System.out.println("----------");
		Menu m2 = new Menu("석쇠불고기", 25000, r);
		m2.printInfo();
		System.out.println("----------");
		Plate p = new Plate("석쇠", 5000, m2);
		p.printInfo();
		System.out.println("----------");
		Market mk = new Market("가락시장", "송파구", p);
		mk.printInfo();
		System.out.println("----------");
		Someone s2 = new Someone("곽두팔", mk);
		s2.printInfo2();
		System.out.println("----------");
		// 곽두팔의 이름만 출력
		System.out.println(s2.name);
		System.out.println("----------");
		// 좋아하는 시장 정보 전체 출력
		s2.garak.printInfo();
		System.out.println("----------");
		// 좋아하는 시장은 어디?
		System.out.println(s2.garak.location);
		// 좋아하는 시장에서 산 접시 전체정보
		s2.garak.buying.printInfo();
		System.out.println("----------");
		// 시장에서 산 접시에 담긴 메뉴 전체 정보
		s2.garak.buying.bulgogi.printInfo();
		System.out.println("----------");
		// 시장에서 산 접시에 담긴 메뉴의 가격
		System.out.println(s2.garak.buying.bulgogi.price);
		System.out.println("----------");
		// 시장에 산 접시에 담긴 메뉴를 판 식당 연락처
		System.out.println(s2.garak.buying.bulgogi.food.phoneNum);
		System.out.println("----------");
		// 시장에서 산 접시에 담긴 메뉴를 판 식당 주인 연락처
		System.out.println(s2.garak.buying.bulgogi.food.owner.phoneNum);
		System.out.println("----------");
		// 계란말이를 파는 사람 연락처
		System.out.println(m.food.owner.phoneNum);
		
	}
}
