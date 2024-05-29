import java.util.Random;
import java.util.Scanner;

public class Ymain {
	// 홀짝게임 만들기!
	// 			동전 10개를 쥐고 있다가! => 섞어서 동전갯수 고름
	//			내가 '홀' 이라고 하면....
	//			정답인지 아닌지 판정해서 그 결과를 출력해주는 프로그램
	
	public static void main(String[] args) {
		Random r = new Random();
		int i = r.nextInt();		// int범위안에 있는 랜덤한 정수
		int i2 = r.nextInt(5);		// 0 ~ 4 중 랜덤한 정수
		int i3 = r.nextInt(5) + 1; // 1 ~ 5 중 랜덤한 정수		
		System.out.println(i);
		System.out.println(i2);
		System.out.println(i3);
		
		System.out.println("--------");
		/*
		Scanner k = new Scanner(System.in);
		
		System.out.print("홀짝 중 당신의 선택은 : ");
		String choose = k.next();
		
		int game = r.nextInt(10) + 1;
		
		System.out.printf("과연 결과는??? : %d\n", game);
		boolean result = game % 2 == 1;
		String result2 = (result) ? "홀수입니다" : "짝수입니다";
		System.out.printf("두구두구 결과는??? %s\n", result2);
		
		System.out.println("---------");
		*/
		Scanner k = new Scanner(System.in);
	
		int coin = r.nextInt(10) + 1;
		System.out.println(coin);
		
		String answer = (coin % 2 == 1) ? "홀" : "짝";
		System.out.println(answer);
		
		System.out.print("홀 or 짝 : ");
		String userAns = k.next();
		System.out.println(userAns);
		
		String result = (answer.equals(userAns)) ? "정답" : "오답";
		System.out.printf("뽑은 동전은 %d개이므로, %s!", coin, result);
		
		
		
		
		
	}
}
