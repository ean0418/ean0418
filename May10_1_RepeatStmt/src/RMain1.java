import java.util.Random;
import java.util.Scanner;

// 여태까지 했던 것 - 문과적인 요소...!
// 반복문 - 이과적 요소...! => 어려워요...

public class RMain1 {
	public static void main(String[] args) {
		// ㅎ 출력

		// 1. 어떤 작업을 여러 반복 (횟수)
		// 2. 어떤 작업을 퇴실시간까지 반복 (기한)

//		for (변수초기화; 조건식; 값의 증감) { 
//		(1. 변수초기화) (2. 조건식이 맞으면(참)) (4. 값의 증감)
//		(5. 다시 조건 비교) (7. 값의 증감) (8. 조건 비교후 안맞으면(거짓))
//			반복할 내용 (3. 내용 실행) (6. 내용 실행) (9. 반복문 종료)
//		}

		for (int i = 0; i < 3; i++) {
			System.out.printf("%d : ㅎ\n", i);
		}
		System.out.println("------");

		// 5부터 1까지 순서대로 내림차순으로 출력

		for (int i = 5; i > 0; i--) {
			System.out.println(i);
		}
		System.out.println("------");
		// 1, 3, 5, ..., 21까지 출력

		for (int i = 1; i < 22; i += 2) {
//			if (i % 2 ==1) {
//				System.out.println(i);
//			}
			System.out.println(i);
		}
		System.out.println("-------");

		// 반복문이 5번 도는 동안에 1- 10사이에 정수를 랜덤하게 뽑고 싶을 때

		// 반복문 안에서 변수를 새로 만드는 것은 자제하는게 좋음!
		// 반복문이 한 번 돌때마다 변수를 새로 생성함
		for (int i = 0; i < 5; i++) {
			Random r = new Random();
			int num = r.nextInt(10) + 1;
			System.out.println(num);
		}
		System.out.println("----------");

		// 반복문 밖에서 변수 하나 마들어서 갖다 쓰는게 조금 더 효율적!
		Random r = new Random();
		int x = 0;
		for (int i = 0; i < 5; i++) {
			x = r.nextInt(10) + 1; // 변수를 생성 (x)-> 변경(o)
			System.out.println(x);
		}
		System.out.println("--------");

		// 1 + 2 + 3 + ... + 10 더한 값 출력
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			sum += i; // sum = sum +i;
		}
		System.out.println(sum);

		System.out.println("--------");

		// 팩토리얼 !
		// 7! => ? 출력
		int mul = 1;
		for (int i = 1; i <= 7; i++) {
			mul *= i;
		}
		System.out.println(mul);

		System.out.println("--------");
		// 1 ~ 50 정수 중에
		// 3의 배수거나 5의 배수인 숫자를 다 더한 값을 출력

		int add = 0;
		for (int i = 1; i <= 50; i++) {
//			if (i % 3 == 0) {
//				add += i;
//			} else if (i % 5 == 0) {
//				add += i;
//			}
//		}
			if (i % 3 == 0 || i % 5 == 0) {
				add += i;
			}
		}
		System.out.println(add);

	}
}

//		int y = 0;
//		for (int i = 1; i < 11; i++) {
//			y = i==1 ? 1 : i + add(i-1);
//		}
//		System.out.println(y);
//	
//		System.out.println("------");
//		
//		int z = 0;
//		for (int i = 1; i < 8; i++) {
//			z = i ==1 ? 1 : i * factorial(i-1);
//		}
//		System.out.println(z);
//		
//		System.out.println("--------");
//		
//		for (int i = 1; i < 51; i++) {
//			if (i % 3 == 0) {
//				System.out.println(i);
//			} if (i % 5 == 0 ) {
//				System.out.println(i);
//			}
//			
//		}
