import java.util.Random;

import javax.naming.spi.DirStateFactory.Result;

public class FMain1 {
	
	// B : 함수명 / 기능이 대충이라도 보이게, 동사같은 작명,
	// 				낙타체 or 뱀체
	// C : 파라미터 / 함수를 호출하는쪽(main 함수-> 다른 함수로도 가능 우리는 주로 main 함수로)에서 해당 함수로
	//				데이터를 보낼 때
	//				( 자료형 변수명, 자료형 변수명, ... )
	// A : 리턴타입 / 해당 함수에서 작업한 결과를 호출한 쪽(main)으로 보낼 때
	//				return 예약어와 한 쌍
	
	// 함수의 형태
	// public static A B (C) {
	// 	내용
	// 	return
	// }
	
	// 랜덤한 정수 하나를 구하는 함수
	public static int test() {
		Random r = new Random();
		int i = r.nextInt();
		return i;
	}
	// 두 정수를 더한 값을 출력하는 함수
	public static void test2(int a, int b) {
		System.out.println(a + b);
	}
	// 정수 두개를 넣으면, 그 중에서 큰 숫자를 출력해주는 함수
	public static String test3(int a, int b) {
		Random r = new Random();
		String result = (a > b) ? "a" : "b";
		return result;
	}
	// 실수 두개를 넣으면, 그 중에서 큰 숫자를 구해주는 함수
	
	public static double test4(double a, double b) {
		double result2 = (a > b) ? a : b;
		return result2;
	}
	public static void main(String[] args) {
		// 랜덤한 정수 2개를 구해서..
		int x = test();
		int y = test();
		// 그 2개의 수를 더한 값을 출력
		test2(x,y);
		String sss = test3(x,y);
		System.out.println(sss);
		
		double result2 = test4(1.1,2.2);
		System.out.println(result2);
		
	}
	// void => return 할 것이 없음을 의미
	
	
	
	
}
