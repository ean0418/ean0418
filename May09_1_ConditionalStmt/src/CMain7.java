import java.util.Scanner;

public class CMain7 {
	// f1 : 정수를하나 입력 바아서
	// 그게 양수면 양/ 0 이면 0 / 음수면 음 출력
	public static void test1() {
		Scanner k = new Scanner(System.in);
		System.out.print("숫자 입력:");
		int a = k.nextInt();
		
		if (a > 0) {
			System.out.println("양");
		}else if (a == 0) {
			System.out.println(0);
		}else {
			System.out.println("음");
		}
	}
	// f2: 정수 하나 입력
		// 3의 배수면 3의 배수
		// 4의 배수면 4의 배수
		// 둘 다 아니면 몰라!!
		// 를 판정해주는 함수
	public static void test2() {
		Scanner k = new Scanner(System.in);
		System.out.println("숫자 입력:");
		int a = k.nextInt();
		
		if (a % 3 == 0 && a % 4 == 0) {
			System.out.println("3과 4의 배수입니다");
		
	//	if (a % 4 == 0) {
	//		System.out.println("4의 배수입니다");
	//		if (a % 3 == 0) {
	//			System.out.println("3의 배수입니다");
	//		}
		}else if (a % 4 == 0) {
			System.out.println("4의 배수입니다");
		}else if (a % 3 == 0) {
			System.out.println("3의 배수입니다");
		}  else {
			System.out.println("모름");
		}
	}
	
	public static void main(String[] args) {
		test1();
		System.out.println("-------");
		test2();
	}
	
	
	
	
}
