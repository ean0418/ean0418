import java.util.Random;
import java.util.Scanner;

public class RMain1 {
	
	// Up & Down 게임 (main에)
	// 1~100사이의 숫자
	// 컴퓨터 vs 나 => 같은 숫자내면 종료
	// 		숫자가 나보다 낮으면 Down!
	//		숫자가 나보다 높으면 Up!
	//		몇 턴만에 정답을 찾았는지 출력
	
	public static void main(String[] args) {
		Random r = new Random();
		int computerNum = r.nextInt(100) + 1;
		System.out.println(computerNum);
		Scanner k = new Scanner(System.in);
		int myNum= 0;
		for (int turn = 1; true; turn++) { // 몇 번 반복할지 모르기 때문에
											// 조건을 지정할 수 없음
											// true로 자리를 메워줌
			System.out.print("입력 : ");
			myNum = k.nextInt();
			
			if (computerNum < myNum) {
				System.out.println("Down");
			} else if (computerNum > myNum) {
				System.out.println("Up");
			} else {
				System.out.println("정답!");
				System.out.printf("%d번만에 정답을 맞췄습니다.\n", turn);
				break; // 반복문을 깨버림;
			}
			System.out.println("-------------");
			
			
			
			
		}
		
//	for (int i = 1; i <= 100; i++) {
//		Random r = new Random();
//		int computerNum = r.nextInt(100) + 1;	
//		for (int j = 1; j <=100 ; j++) {
//			Scanner k = new Scanner(System.in);
//			System.out.print("숫자입력:");
//			int myNum = k.nextInt();
//			System.out.println(computerNum);
//		if (myNum > computerNum ) {
//			System.out.printf("숫자가 너무 커요 Down, 다시 시도하세요");
//			}else if (myNum < computerNum) {
//				System.out.printf("숫자가 너무 작아요 Up, 다시 시도하세요");
//			}else {
//				System.out.println("정답");
//			}
//		}
//	}
	
	}
	
	
	
	
	
	
	
}
