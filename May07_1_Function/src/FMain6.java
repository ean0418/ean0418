import java.util.Random;

public class FMain6 {
	// 랜덤한 정수를 '출력'하는 함수!
	// 랜덤한 정수를 '생성'하는 함수!
	// 정수를 하나 넣으면 홀수인지 짝수인지 출력하는 함수
	// 정수를 두 개 넣었을 때, 앞 숫자가 크면 '앞', 뒷 숫자가 크거나 같으면 '뒤' 생성하는 함수!
	
	
	// 랜덤한 정수를 '출력'하는 함수!
	public static void red() {
		Random r = new Random();
		int i = r.nextInt();
		System.out.println(i);
	}
	
	// 랜덤한 정수를 '생성'하는 함수!
	public static int blue() {
		Random r = new Random();
		int i = r.nextInt();
		return i; // i에 있는 값을 최종결과로 리턴
					// 이 함수는 종료
	}
	
	// 정수를 하나 넣으면 홀수인지 짝수인지 출력하는 함수
	public static int green(int a) {
		String result = (a % 2 ==0) ? "짝수" : "홀수";
		System.out.printf("%d는 %s!\n", a, result);
		return a;
	}
	
	// 정수를 두 개 넣었을 때, 앞 숫자가 크면 '앞', 뒷 숫자가 크거나 같으면 '뒤' 생성하는 함수!
	public static String purple(int a, int b) {
		String result = (a > b) ? "앞" : "뒤";
		return result;
	}
	
	 public static void main(String[] args) {
		red();
		int i = blue();
		System.out.println(i);
		System.out.println("-------------");
		green(i);
		green(5);
		green(8);
		System.out.println("------");
		String result = purple(3, 5);
		System.out.println(result);
		System.out.println("-----");
		/////////////////////
		// 저녁 메뉴 (2가지 중 하나)
		// 위의 함수를 이용해서
		// 	랜덤한 숫자 2개를 뽑아서
		// 먼저 뽑힌게 크면'초밥', 아니면 '파스타'를 출력
		int r1 = blue();
		int r2 = blue();
		System.out.println(r1);
		System.out.println(r2);
		System.out.println("------");
		String sss = purple(r1, r2);
		System.out.println(sss);
		String menu = (sss.equals("앞")) ? "초밥" : "파스타";
		System.out.println(menu);
	}
	
	
	
	
	
		
	
	
	
}
