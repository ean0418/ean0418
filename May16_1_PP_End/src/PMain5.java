import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class PMain5 {
	// 로또
	// 컴퓨터가 1~45 사이의 정수 중 6개 숫자를 뽑음 (중복 x)
	public static int[] comNum() {
		int[] num = new int[6];
		Random r = new Random();
		int a = 0;
		for (int i = 0; i < num.length; i++) {
			a = r.nextInt(45) +1;
			num[i] =a;
			for (int j = 0; j < i; j++) {//중복처리에 대한 식
				System.out.println(num[j]+" "+num[i]);
				if (num[j] == num[i]) {
					i--;
				}
			}
		}
		for (int i = 0; i < num.length; i++) {
			System.out.printf("%d번째 숫자 : %d\n", i+1, num[i]);
				
		}
		return num;
	}
	// 유저가 숫자 6개를 입력
	public static int userNum() {
	Scanner k = new Scanner(System.in);
		int num2 = k.nextInt();
		if (num2 < 1 || num2 >46) {
			System.out.println("다시 입력:");
		}
		return (num2 >= 1 && num2 <= 45) ? num2 : userNum();
	}
	// 유저답 출력
	public static void printAnswer(int[] myAnswer) {
		for (int i : myAnswer) {
			System.out.println("[" + i + "]");
		}
		System.out.println();
		System.out.println("=======================");
	}
	//  => 출력
	public static int[] getLotto() {
		int[] lottoNum = new int[6];
		Random r = new Random();
		for (int i = 0; i < lottoNum.length; i++) {
			lottoNum[i] = r.nextInt(45) + 1;
			// 앞의 배열요소와 뒤의 배열요소의 값을 구분하기 위해서 반복문 추가
			for (int j = 0; j < i; j++) {
				System.out.println(lottoNum[j]+" "+lottoNum[i]);
				
				if (lottoNum[j] == lottoNum[i]) {
					i--;
			}
		}
	}
		return lottoNum;
	}
	public static void printLottoNum(int[] lottoNum) {
		System.out.println("로또 번호");
		for (int i : lottoNum) {
			System.out.println("["+i+"]");
		}
		System.out.println();
		System.out.println("=============");
	}
	// 6개 일치 : 1등 / 5개 일치 : 2등 / 4개 일치 : 3등 / 그 외 : 꽝
	// 입력한 번호와 랜덤으로 뽑힌 번호를 모든 경우의 수로 값이 같은지 비교
	// 같은 경우에는 카운트 올리기
	public static int checkNum(int[] myAnswer, int[] lottoNum) {
		int count = 0;
		for (int i = 0; i < lottoNum.length; i++) {
			for (int j = 0; j < myAnswer.length; j++) {
				if (lottoNum[i] == myAnswer[j]) {
					count++;
				}
			}
		}
		return count;
	}
	// 출력
	public static void printResult(int count) {
		System.out.printf("%d개 맞춰서.." , count);
		if (count == 6) {
			System.out.println("1등");
		} else if (count ==5) {
			System.out.println("2등");
		} else if (count ==4) {
			System.out.println("3등");
		} else {
			System.out.println("꽝");
		}
	}
	public static void activate() {
		int[] lottoNum = getLotto();
		int[] myAnswer = comNum();
		printAnswer(myAnswer);
		printLottoNum(lottoNum);
		int count = checkNum(myAnswer, lottoNum);
		printResult(count);
	}
	public static void main(String[] args) {
		activate();
		
	}
}
