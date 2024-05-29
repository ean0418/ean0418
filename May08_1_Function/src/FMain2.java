import java.util.Scanner;
// 함수 : main 함수에서 Java를 모르는 사람이 봐도 뭘 한건지 알아볼 수 있게 + 간결해야
// 기능을 잘 분류해서 함수로 표현을 해줘야..!
// => 유지보수가 편해집니다~

// 만약에 // 표준체중을 구하는 공식이 0.9 =>0.8로 바뀌었다!
// 다양한 기능을 함수 하나에 구현하고, 변경사항을 수정하게 됐을 때
//    (유지보수)
//  한번에 잘 찾을 수 있을까//?

// 어떤 기능(함수)를 만들까 설계해본 후 코드를 짤 것!

public class FMain2 {
	// 비만도 검사 프로그램 (함수.ver)
	public static void startProgram() {
		System.out.println("비만도 검사 프로그램을 시작합니다!");
	}
	// 키, 몸무게는 입력받을 것
	public static int putUrHeight() {
		Scanner k = new Scanner(System.in);
		System.out.print("키는 :");
		int height = k.nextInt();
		return height;
	}
	
	public static int putUrWeight( ) {
		Scanner k = new Scanner(System.in);
		System.out.print("몸무게는 :");
		int weight = k.nextInt();
		return weight;
	}
	// 표준체중 = (키 - 100) * 0.9
	public static double standardWeight(double height) {
		double standard = ((height -100) * 0.9);
		return standard;
	}
		
	// 비만도 = (실제체중 / 표준체중) * 100
	public static double checkObseity(double weight, double stdWeight) {
		double obseity = (weight / stdWeight) * 100;
		return obseity;
	}
	// 비만도가 120이 넘으면 '비만' 아니면 '안비만'
	public static String determineOverweight(double obseity) {
		String pig = (obseity > 120) ? "비만" : "안비만";
		return pig;
	}
	// 결과를 출력해주는 함수
	public static void printResult(double h, double w, double std, double b, String r) {
		System.out.println("---------");
		System.out.printf("키 : %.1fcm\n", h);
		System.out.printf("몸무게: %.1fkg\n", w);
		System.out.printf("표준체중 : %.1fkg\n", std);
		System.out.printf("비만도 : %.1f\n", b);
		System.out.printf("당신은 [%s] 입니다.\n", r);
		System.out.println("---------");
	}
	// 함수들 다 모아둔 함수
	public static void start() {
		startProgram();
		double height = putUrHeight();
		double weight = putUrWeight();
		double stdweight = standardWeight(height);
		double obseity = checkObseity(weight, stdweight);
		String result = determineOverweight(obseity);
		printResult(height, weight, stdweight, obseity, result);
	}
	public static void main(String[] args) {
		/*startProgram();
		System.out.println("-----------");
		int x = putUrHeight();
		int y = putUrWeight();
		double s = standardWeight(x);
		System.out.printf("당신의 표준 몸무게는 %.2fkg입니다\n", s);
		double o = checkObseity(y, s);
		System.out.printf("당신의 비만도는 %.2f입니다\n", o);
		String p = determineOverweight(o);
		System.out.printf("당신의 운명은 %s입니다\n", p); */
		start();
	}
}
	
	