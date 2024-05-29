import java.util.Scanner;

public class YMain2 {
	// 정수 2개를 입력받아서 (각각의 함수에)
	// 그 정수 2개를 더했을 때 짝수면 결과 리턴, 아니면 값을 재입력
	
	public static int getNum() {
		Scanner k = new Scanner(System.in);
		System.out.print("숫자1을 입력해주세요 : ");
		int num = k.nextInt();
		return num;
	}
	public static int getNum2() {
		Scanner k = new Scanner(System.in);
		System.out.print("숫자2을 입력해주세요 : ");
		int num2 = k.nextInt();
		return num2;
	}
	public static int addNum(int num, int num2) {
		int result = ((num + num2) % 2 == 0) ? num + num2 : addNum(getNum(),getNum2());
		System.out.printf("두 수의 합은 %d 짝수이므로 프로그램을 종료합니다.", result);
		return result; 					// addNum(x,y)=>처음 홀수를 입력한 값이 계속해서 계산됨!
	}
	public static void main(String[] args) {
	int num = getNum();
	int num2 = getNum2();
	int result = addNum(num, num2);
	}
	
	
	
	
	
	
	
	
}

