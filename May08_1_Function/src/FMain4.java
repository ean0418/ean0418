import java.util.Random;
import java.util.Scanner;

public class FMain4 {
	// 동전 맞추기 게임
	public static void startGame() {
	System.out.println("동전 맞추기 게임 시작");
	}
	public static int setCoin() {
		return new Random().nextInt(10) +1;
	}
	
	public static int getCoinNum() {
		System.out.print("동전은 몇 개 일까요?");
		return new Scanner(System.in).nextInt();
	}
	public static String getResult(int coin, int coinNum) {
		return (coin == coinNum) ? "정답" : "땡";
	}
	public static void printResult(int a, int b, int coin, int coinNum, String answer) throws InterruptedException {
		Thread.sleep(a);
		System.out.printf("당신이 선택한 동전의 갯수는 %d개입니다\n", coinNum);
		Thread.sleep(a);
		System.out.printf("손에 있는 동전의 갯수는 %d개입니다\n", coin);
		Thread.sleep(b);
		System.out.printf("두구두구!! 당신의 동전 맞추기 결과는?... [%s]입니다", answer);
	}
	public static void start() throws InterruptedException {
		int coin = setCoin();
		int coinNum = getCoinNum();
		String answer = getResult(coin, coinNum);
		printResult(500, 2000, coin, coinNum, answer);
	}
	public static void main(String[] args) throws InterruptedException {
		start();
	}

}
	