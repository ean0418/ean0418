import java.util.Random;
import java.util.Scanner;

public class FMain3 {
	// 홀짝 게임 (함수.ver)
	public static void startGame() {
		System.out.println("홀짝 게임을 시작합니다!");
	}

	// 동전 10개를 쥐고 있다가! => 섞어서 동전갯수 고름
	public static int mixCoin() {
		Random r = new Random();
		int c = r.nextInt(10) + 1;
		System.out.println(c);
		return c;
		// => 단축 return new Random().nextInt(10) + 1;
	}
	
	// 내가 '홀' 이라고 하면....
	// 정답인지 아닌지 판정해서 그 결과를 출력해주는 프로그램
	public static String choose(int coin) {
		String answer = (coin % 2 == 1) ? "홀" : "짝";
		System.out.println(answer);
		return answer;
	}	// => return (coin % 2 == 1) ? "홀" : "짝";

	// 정답 맞추기
	public static String putUrAnswer() {
		Scanner k = new Scanner(System.in);
		System.out.print("홀 or 짝 :");
		String userAnswer = k.next();
		return userAnswer;
	}	// return new Scanner(System.in).next();

	// 정답 판별
	public static void checkResult(String answer, String userAnswer) {
		String result = (answer.equals(userAnswer)) ? "정답" : "오답";
		System.out.printf("결과는 두구두구 [%s]이므로 [%s]이라고 대답하신 당신! [%s]입니다\n", answer, userAnswer, result);
	}

	// 함수들을 모아둔 함수
	public static void start() {
		startGame();
		System.out.println("---------");
		String userAnswer = putUrAnswer();
		System.out.println("---------");
		int c = mixCoin();
		String answer = choose(c);
		System.out.println("---------");
		checkResult(answer, userAnswer);

	}

	public static void main(String[] args) {
		start();
	}

}
