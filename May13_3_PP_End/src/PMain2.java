import java.util.Scanner;

public class PMain2 {
	// ATM기능을 하는 프로그램
	// 1을 고르면 입금 / 2번을 고르면 출금 / 3번을 고르면 잔액 확인
	// 4을 고르면 프로그램을 종료
	// 입금, 출금 돈 값을 직접 입력 받을 것!
	// main
	public static void main(String[] args) {
		int choice = 0;
		int money = 0;
		Scanner k = new Scanner(System.in);
		
		while (true) {
			System.out.println("----------");
			System.out.println("1. 예금 | 2. 출금 | 3. 잔액 확인 | 4. 종료");
			System.out.println("----------");
			System.out.print("선택> ");
			choice = k.nextInt();
			
			if (choice == 1) {
				System.out.print("예금액> ");
				int pluseMoney = k.nextInt();
				System.out.printf("\t%,d원을 예금합니다.\n", pluseMoney);
				money += pluseMoney;
			}else if (choice == 2) {
				System.out.print("출금액> ");
				int minusMoney = k.nextInt();
				System.out.printf("\t%,d원을 출금합니다.\n", minusMoney);
				money -= minusMoney;
				if (money < 0) {
					System.out.println("\t...");
					System.out.println("\t잔고가 모자라");
					System.out.println("\t출금에 실패했습니다");
					money += minusMoney;
				}
			}else if (choice == 3) {
				System.out.printf("\t%,d원이 남아있습니다.\n", money);
			}else if (choice == 4) {
				System.out.println("\t프로그램 종료!");
				System.out.println("-----------------");
				break;
			}
		}
	}
	}
		
		
		
		
		
		
		
		
		
		
		//		Scanner k = new Scanner(System.in);
//		System.out.print("1번 입금/ 2번 출금/ 3번 잔액 확인/ 4번 종료 :");
//		int number = k.nextInt();
//		int money = 300000;
//		int num = 0;
//		int num2 = 0;
//		while (true) {
//
////		a:	switch (number) {
////	 	case 1:
////			System.out.print("입금하실 돈을 입력해주세요 :");
////			num = k.nextInt();
////			System.out.printf("%,d원을 입금하여 잔액은 %,d원입니다.\n", num, num + money);
////			break;
////		case 2:
////			System.out.print("출금하실 돈을 입력해주세요 :");
////			num2 = k.nextInt();
////			System.out.printf("%,d원을 출금하여 남은 잔액은 %,d원입니다.\n", num2, money - num2);
////			break;
////		case 3:
////			System.out.println("잔액 확인");
////			System.out.printf("잔액 %,d원입니다.", money);
////			break;
////		case 4:
////			System.out.println("종료");
////			break a;
////		}
////		}
//			b: while (true) {
//
//			a:if (number == 1) {
//					System.out.print("입금하실 돈을 입력해주세요 :");
//					num = k.nextInt();
//					System.out.printf("%,d원을 입금하여 잔액은 %,d원입니다.\n", num, num + money);
//					break;
//				} else if (number == 2) {
//					System.out.print("출금하실 돈을 입력해주세요 :");
//					num2 = k.nextInt();
//					System.out.printf("%,d원을 출금하여 남은 잔액은 %,d원입니다.\n", num2, money - num2);
//					break;
//				} else if (number == 3) {
//					System.out.println("잔액 확인");
//					System.out.printf("잔액 %,d원입니다.", money);
//					break;
//				} else if (number == 4) {
//					System.out.println("종료");
//					break a;
//				}
//			}
//		}
//	}
//}
