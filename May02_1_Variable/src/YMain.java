
public class YMain {
	public static void main(String[] args) throws InterruptedException {
		// 학원오는데 얼마나 걸렸는지 (시간) : 1시간
		// 어제 저녁 메뉴 ? : ???
		// 어제 뭐하셨나요 ? : ???
		// 취침 시간 : ?시 ?분
		// 첫 수업 소감 : ???
		// 수업 성취도 : ?.?%
		// 출력
		
		// => 5초 정도 딜레이 걸어서 => .bat로 실행까지!
		
		System.out.println("-------------------------");
		System.out.printf("걸리는 시간 : %d시간\n", 1);
		System.out.printf("저녁 메뉴 : %s\n", "보쌈");
		System.out.printf("어제 뭐했는가 : %s\n", "넷플보면서 휴식");
		System.out.printf("취침 시간 : %d시\n", 12);
		System.out.printf("첫 수업 소감 : %s\n", "처음 접해보는 분야임에도 불구하고 선생님께서 쉽고 친절하게 알려줘서 만족합니다");
		System.out.printf("수업 성취도 : %.2f%%\n", 99.99);
		System.out.println("-------------------------");
		
		Thread.sleep(5000);
		// export-> 메모장에 java -jar ____.jar-> 다른 이름저장 .bat
		
	}
}
