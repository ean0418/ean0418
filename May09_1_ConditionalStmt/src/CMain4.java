import java.util.Scanner;

public class CMain4 {
	public static void main(String[] args) {
		// switch-case (ex: 권한 설정_)
		
		// Scanner로 입력 받을 것!
		
		// 이병 입력 => 눈치, 관등성명, 훈련, 잠
		// 일병 입력 => 관등설명, 훈련, 잠
		// 상병 입력 => 훈련, 잠
		// 병장 입력 => 잠
		
		try (Scanner k = new Scanner(System.in)) {
			System.out.print("계급 입력:");
			String army = k.next();
			
			switch (army) {
			case "이병":
				System.out.println("눈치");
			case "일병":
				System.out.println("관등성명");
			case "상병":
				System.out.println("훈련");
			case "병장":
				System.out.println("잠");
				break;			
			default:
				System.out.println("집가고싶다");
				break;			
			}
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
