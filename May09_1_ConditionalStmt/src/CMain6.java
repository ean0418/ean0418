import java.util.Scanner;

public class CMain6 {
	// 1년 = 12달
	// 각 달마다 며칠인지 다릅니다
	// 몇 월인지 입력 받아서
	// 31일 / 30일 / 28일
	// 14월 => 없는 달
	
	
	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
		System.out.print("월 :");
		int month = k.nextInt();
	
		switch (month) {
		case 2 :
			System.out.println("28일입니다");
			break;
		case 1 :
		case 3 :
		case 5 :
		case 7 :
		case 8 :
		case 10 :
		case 12 :
			System.out.println("31일입니다");
			break;
		case 4 :
		case 6 :
		case 9 :
		case 11 :
			System.out.println("30일입니다");
			break;
		default: // err : 오류를 강조할때!
			System.err.println("없는달임");
			break;
		}
	}
}
