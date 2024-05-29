
public class IMain3 {
	public static void main(String[] args) {

		// 홍길동 17살 논현고등학교 1학년 => 출력
		// 김길동 21살 서울대학교 2학년 => 출력
		// 고길동 22살 육군 상병 =>출력
		Student s1 = new Student("홍길동", 17, "논현고", 1);
		s1.printInfo();
		System.out.println("----------------------------");
		Student s2 = new Student("김길동", 21, "성균관", 2);
		s2.printInfo();
		System.out.println("----------------------------");
		Army a1 = new Army("고길동", 22, "육군", "상병");
		a1.printInfo();
		System.out.println("----------------------------");
		
		
		Pen p = new Pen(); // Product !
		System.out.println("----------------------------");
		Pen p2 = new Pen("빨강"); // Product !
		System.out.println("----------------------------");
		Pen p3 = new Pen("모나미", 300, "검정"); // Product !
		System.out.println("----------------------------");
		Mask m1 = new Mask("마스크", 1000);
		m1.printInfo();

	}
}