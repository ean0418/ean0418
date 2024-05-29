// OOP
// static - 고오오오오오오옹오오오급
// 생성자
// 객체간의 관계
//	A has a B : 사람 has a 핸드폰
//  A is a B : 개 is a 동물

public class HMain1 {
	public static void main(String[] args) {
		// 이름이 청포도, 맛이 청포도맛인 사탕
		// 정보 출력
		Candy c1 = new Candy("청포도", "청포도맛");
		c1.printInfo();
		System.out.println("---------------------------");
		// 이름이 롯데, 위치가 잠실, 직원수가 100명인 회사
		// 정보 출력
		Company cp = new Company("롯데", "잠실", 100);
		cp.printInfo();
		System.out.println("---------------------------");
		
		// 청포도 사탕을 롯데에서 만들었다 => 
		c1.brand = cp;
		
		// 청포도 사탕 제조사의 정보를 출력
		c1.brand.printInfo();
		System.out.println("---------------------------");
		// 삼성, 수원, 300명 회사
		Company cp2 = new Company("삼성", "수원", 300);
		cp2.printInfo();
		System.out.println("---------------------------");
		// cup가 i7-1234. ram 34gb , hdd 500 gb인 삼성 컴퓨터
		Computer co = new Computer("i7-1234", 32, 500, cp2);
		co.printInfo();
		// 컴퓨터 / 회사 정보를 출력
	
	}
}
