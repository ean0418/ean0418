
// 게임 캐릭터 하나 생성!
// 속성 : 닉네임 / 레벨 / 직업 / 무기
// 출력하는 기능까지!
// main에서 객체를 만들고 닉네임 값만 넣어서 출력

public class OMain2 {
	public static void main(String[] args) {
//		GameChar g = new GameChar();
//		g.name = "황정수";
//		// System.out.println(g.name);
//		g.printIntro();
		
		GameChar g = new GameChar("황정수");
		g.printIntro();
			
		
	}
}