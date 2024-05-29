import java.util.Arrays;
import java.util.Scanner;

// Bubble Sort : 인접한 두 항목의 값을 비교해서
//				기준에 만족하면 서로의 값을 교환하는 정렬 방법

public class PMain3 {

	// 숫자를 입력받아서 배열에 담을것 (숫자는 5개, 중복 x)
	// 정렬 전의 값을 출력
	// 정렬
	// 정렬 후의 값을 출력
	public static int[] getNum() {
		Scanner k = new Scanner(System.in);
		int[] num = new int[5];
		for (int i = 0; i < num.length; i++) {
			System.out.printf("%d번째 숫자 입력 :", i + 1);
			num[i] = k.nextInt();
		}
		System.out.println();
		System.out.println("-------");
		return num;
	}

	public static void printNum(int[] num) {
		System.out.println("<< 입력한 값 >>");
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i] + " ");
		}
		System.out.println();
		System.out.println("-------");
	}

	// 정렬
	public static int[] getResult(int[] num) {
		int t = 0;
		for (int turn = 1; turn < num.length; turn++) {
			for (int i = 0; i < num.length - 1; i++) {
				// num.length - 1 :
				// if문 안에서 계산을 할 때, 다음 배열값을 비교하기 위해서
				// + 1을 사용하는데
				// length 길이를 그대로 사용하면 에러가 발생
				if (num[i] > num[i + 1]) {
					t = num[i];
					num[i] = num[i + 1];
					num[i + 1] = t;
				}
				System.out.print(num[i] + " ");
			}
			System.out.println(num[4]);
			System.out.println("정렬된 값 : " + t);
			System.out.println("---------");
		}
		return num;
	}
	public static void printResult(int[] result) {
		System.out.println("<< 정렬 후 값 >>");
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i] + " ");
		}
		System.out.println();
		System.out.println("-------");
	}

	public static void main(String[] args) {
		int[] num = getNum();
		printNum(num);
		int[] result = getResult(num);
		printResult(result);
	
	Arrays.sort(num);
	for (int i = 0; i < result.length; i++) {
		System.out.print(num[i] + " ");
	}
	}

}
