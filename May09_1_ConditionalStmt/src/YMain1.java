import java.util.Scanner;

public class YMain1 {

	// (3보다 작은) 정수를 하나 입력받는 함수
	public static int getNum() {
		Scanner k = new Scanner(System.in);
		System.out.print("숫자를 입력해주세요 : ");
		int a = k.nextInt();
		int result = (a >= 3) ? getNum() : a;
		return result;
	}

	// 홀수만 입력 받을 수 있는 함수
	// => 짝수를 입력하면 다시 입력 받을 수 있도록!
	public static int putUrNum() {
		Scanner k = new Scanner(System.in);
		System.out.print("아무 숫자나 입력해주세요 :");
		int num = k.nextInt();
		int result2 = (num % 2 == 0) ? putUrNum() : num;
		return result2;
	}

	// 정수를 입력받는 함수 => 0 ~ 100
	// => 범위안의 정수가 아니라면 다시 입력 받을 수 있도록!
	public static int getUrNum() {
		Scanner k = new Scanner(System.in);
		System.out.print("원하는 숫자를 입력해주세요 : ");
		int num2 = k.nextInt();
		int result3 = ((num2 >= 0) && (num2 <= 100)) ? num2 : getUrNum();
		return result3;
	}
	//
	
	public static void main(String[] args) {
		int result = getNum();
		System.out.println(result);
		System.out.println("---------");

		int result2 = putUrNum();
		System.out.println(result2);
		System.out.println("---------");

		int result3 = getUrNum();
		System.out.println(result3);
		System.out.println("---------");
	}

}
