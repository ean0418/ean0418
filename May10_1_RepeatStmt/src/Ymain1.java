import java.util.Scanner;

// 평일 스케줄 출력해주는 프로그램

// 시간을 입력받아서 (24시간단위) => 해당시간에 속하는 내용을 출력
//		=> (입력한 시간이) 시간 범위가 아니면 다시 입력

// 오전 9 -오후 6 : 학원에서 공부
// 오전 9시. 오후 2시. 오후 6시 : qr찍
// 오후 1시 - 오후 2시전까지: 점심시간
// 오후6시 넘어서 오후 8시 : 집에 가는 시간
// 오전6시- 오전 9시 전까지 : 기상 + 씻기 + 학원가기
// 오후 8시 - 오전 6시 전까지 : 여가시간 + 취침

public class Ymain1 {
	public static int putUrSchedule() {
		Scanner k = new Scanner(System.in);
		System.out.print("시간을 입력해주세요(00~23) :");
		int hour = k.nextInt();
		if (!(hour >= 0 && hour <= 23)) {
			System.out.printf("%02d시는 없습니다. 다시 입력하세요\n", hour);
		}
		return (hour >= 0 && hour <= 23) ? hour : putUrSchedule();
	}

	// 시간을 출력하는 함수
	public static void printHour(int hour) {
		System.out.println("------");
		System.out.printf("%02d시 ! \n", hour);
		System.out.println("------");
	}

	// 결과를 출력하는 함수
	public static void printResult(int hour) {
		if (hour >= 9 && hour <= 18) {
			System.out.println("공부 중~");
			if (hour == 9 || hour == 14 || hour == 18) {
				System.out.println("QR!");
			} else if (hour >= 13 && hour < 14) {
				System.out.println("점심");
			}
		} else if (hour > 18 && hour <= 20) {
			System.out.println("컴백홈");
		} else if (hour > 6 && hour < 9) {
			System.out.println("일어나기 씻기 학원가기 ~");
		} else {
			System.out.println("여가시간 자는 시간~");
		}
	}

	public static void main(String[] args) {
		int hour = putUrSchedule();
		printHour(hour);
		printResult(hour);
	}
//	public static void getSchedule(int hour) {
//		if (hour >= 20 && hour < 6) {
//			System.out.println("여가시간 + 취침");
//		} else if (hour >= 6 && hour < 9) {
//			System.out.println("기상 + 씻기 + 학원가기");
//		} else if (hour >= 9 && hour <= 18) {
//			System.out.println("학원에서 공부");
//			if (hour >= 13 && hour <= 14) {
//				System.out.println("점심시간");
//			}
//		} else if (hour > 18 && hour < 20) {
//			System.out.println("집에 가는 시간");
//		}
//		switch (hour) {
//		case 9:
//			System.out.println("QR찍기");
//			break;
//		case 14:
//			System.out.println("QR찍기");
//			break;
//		case 18:
//			System.out.println("QR찍기");
//			break;
//		default:
//			break;
//		}
//	}

//	public static void main(String[] args) {
//		int hour = putUrSchedule();
//		getSchedule(hour);
//
//	}

}
