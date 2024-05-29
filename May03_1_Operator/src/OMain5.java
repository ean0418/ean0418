import java.util.Scanner;

public class OMain5 {
	public static void main(String[] args) throws InterruptedException {
		// 키(cm), 몸무게(kg)를 입력받아서
		// => 비만도 검사 프로그램

		// 표준체중 =(키-100) * 0.9
		// 비만도 = (실제 체중 / 표준체중) * 100
		// 비만도가 120을 넘으면 "비만",
		// 아니면 "안비만" 문구를 출력
		// 아무 키나 입력했을 프로그램이 종료되게!

		Scanner k = new Scanner(System.in);

		System.out.print("키 :");
		int height = k.nextInt();
		System.out.print("몸무게 :");
		int weight = k.nextInt();
		double normalWeight = (height - 100) * 0.9;
		System.out.printf("당신의 정상체중은 : %.2f입니다\n", normalWeight);
		double obseity = (weight / normalWeight) * 100;
		System.out.printf("당신의 비만도는 : %.2f입니다\n", obseity);
		String pig = obseity > 120 ? "비만" : "안비만";
		System.out.printf("당신은 %s입니다\n", pig);
		System.out.println("");
		String endProgram = k.next();
		System.out.println("프로그램을 종료합니다.");
		Thread.sleep(100);

		// 화요일에는 함수 -> 조건문 -> 반복문 -> 배열 -> 종합 예제??

	}
}
