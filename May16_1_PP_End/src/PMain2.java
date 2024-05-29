import java.util.Random;
import java.util.Scanner;

// up&down 게임 (함수 사용0)
// 컴퓨터 1~100 사이의 숫자를 뽑음 
// 유저가 입력
// 1트  50 => DOWN
// 2트 20 => UP
// 몇 트안에 맞췄는지 출력

public class PMain2 {
	// 1~100 뽑는 함수
	public static int getNumber() {
		return new Random().nextInt(100) + 1;
	}

	// 유저 답
	public static int getUserAns() {
		Scanner k = new Scanner(System.in);
		System.out.print("정답은?");
		int answer = k.nextInt();
		if (answer < 1) {
			System.out.println("정답은 1이상");
		} else if (answer > 100) {
			System.out.println("정답은 100이하");
		}
		return (answer >= 1 && answer <= 100) ? answer : getUserAns();
	}

	// 정답 한 번 입력햇을 때 정답인지 아닌지 확인 + 정답일 때 반복문을 깰지 말지 전달됨
	public static boolean checkAnswer(int number, int answer) {
		if (number == answer) {
			System.out.print("정답은");
			// return true; // 정답일 때 true 값을 리턴하면서 종료되게
		} else if (number > answer) {
			System.out.println("Up");
			// return false; // 정답 아닐 때 false 값을 리턴하면서 게임이 계속 진행되도록
		} else if (number < answer) {
			System.out.println("Down");
			// return false; // 정답 아닐때
		}
		return (number == answer); // 이 조건에 맞을 때 true 값을 리턴
									// 맞지 않으면 false 값을 리턴
	}

	// 정답을 맞출 때까지 반복되는 함수
	public static void printResult() {
		int number = getNumber();
		int answer = 0;
		int turn = 0;

		while (true) {
			turn++;
			answer = getUserAns();
			if (checkAnswer(number, answer)) { // if문참일때만 돌아감
				System.out.printf("[%d] \n", number);
				System.out.printf("%d번 만에 정답\n", turn);
				break;
			}
		}

	}
	
	public static void main(String[] args) {
		printResult();
	}

}
