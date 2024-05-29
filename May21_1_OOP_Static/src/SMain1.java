
// 1. 기계어 상태의 소스가 stack영역에 깔림
// 2. static 멤버 변수들이 static영역에 배치
// 3. JVM이 SMain1.main(...);을 호출
// 4. 실행
public class SMain1 {
	// 과자 객체를 만들어보자! + 출력 기능
	// 과자 이름, 중량, 가격

	// 지금 main에는 과자가 없는 상태
	// 과자 이름? => 모름
	// 과자의 무게? => 모름
	// 과자의 가격? => 모름
	// 과자 생산자 => 황정수
	public static void main(String[] args) {
		System.out.println(Snack.MANUFACTURER);
		System.out.println("===============================");
		
		Snack.printTaste();
		// 과자 객체 2개 만들기
		
		Snack s = new Snack();
		s.name = "허니버터칩";
		s.weight = 100.1;
		s.price = 1800;
		s.print();
		
		Snack s2 = new Snack();
		s2.name = "포카칩";
		s2.weight = 120.1;
		s2.price = 2000;
		s2.print();
		
		// 일단 생산자는 다 김비버가 맞음
		// 생산자의 값을 바꿔보자

		s2.print();
	}
}