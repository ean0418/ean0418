import java.util.Scanner;

// 재귀적 호출 (recursive call)
// 	함수 속에서 자기 자신(이 함수)을 또 호출 => 반복

// 함수를 호출한다 : 비교적 느린 작업

// 반복문 : ex) 'for' 

// 기업에서 테스트할 때 이걸 활용한 알고리즘을 문제로 내는 경우가 있음

public class FMain5 {
	
	// 등차수열
	// 정수를 하나 넣으면
	// 1 + 2 + 3 + 4 +...+ 그 숫자까지
	// 다 더한 값을 구해주는 함수
	
	// add(1) = 1
	// add(2) = 3
	// add(3) = 6
	
	public static int add(int x) {
		int answer = (x == 1) ? 1 : (x + add(x-1));
		return answer;
		
		
		// return x * (x + 1) / 2;
	}
	
	public static int factorial(int x) {
		int answer2 = (x == 1) ? 1 : (x * factorial(x-1));
		return answer2;	
	}
	// 피보나치 수열
	// 1, 1 , 2, 3, 5, 8, 13, 21, 34, 55, ...
	// 정수를 하나 넣으면 해당 위치에 나올 숫자값 구하기
	
	public static int test(int x) {
		int answer3 = (x == 1 || x == 2) ? 1 : (test(x-2) +test(x-1));
		return answer3;    //->( x < 3 )
	}
	
	//  숫자 하나를 넣어서 각 자릿수의 숫자를 더한 값 구하기
	// ex) digitsum(12345) = 15
	//digitsum(1) =1
	//		digitsum(12) = 1+2 = dig(1)+2
	//		digitsum(123) = 1 + 2 +3 = dig(12)+3
	// 	digitsum(1234) = dig(123) +4
	// digitsum(12345) = dig(1234) + 5
	public static int digitsum(int x) {
		int answer4 = (x < 10) ? x : (x % 10 + digitsum(x / 10));
		return answer4;
	}
	
	public static void main(String[] args) {
		int answer = add(10);
		System.out.println(answer);
		System.out.println("-------------");
		int answer2 = factorial(7);
		System.out.println(answer2);
		System.out.println("-------------");
		int answer3 = test(11);
		System.out.println(answer3);
		System.out.println("-------------");
		int answer4 = digitsum(123456);
		System.out.println(answer4);
	}
	
	
	
}
