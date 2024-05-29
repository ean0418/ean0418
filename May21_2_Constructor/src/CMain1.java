
public class CMain1 {
	public static void main(String[] args) {
		// 신발
		// 나이키 홈페이지
		
		// 이름 
		// 사이즈
		// 가격
		// 브랜드
		// 정보출력
		Shoes s1 = new Shoes();
		Shoes s2 = new Shoes();
		s1.name = "나이키 P-6000 서밋 화이트 퍼";
		s1.price = 110000;
		s1.size = 250;
		s1.printInfo();
		System.out.println("=================================");
		s2.name = "나이키 줌 보메로 5 라이트 본 앤 블랙";
		s2.price = 320000;
		s2.size = 250;
		s2.printInfo();
		System.out.println("=================");
		
		// 생성자 오버로딩
		Shoes s3 = new Shoes("나이키 줌 보메로 6", 255, 483274078);
		s3.printInfo();
		System.out.println("================");
		s2.test(s2.name);
		System.out.println("================");
		s2.test("zzz");
			
		// 커피
		// 커피 이름/ 가격
		// 출력
	
		System.out.println("================");
		Coffee c1 = new Coffee("아이스아메리카노", 5500);
		c1.printInfo();
		System.out.println("================");
	}
}
