import java.util.Random;
import java.util.Scanner;

public class PMian8 {
	public static void main(String[] args) {
	Scanner k = new Scanner(System.in);
	Random r = new Random();
	int money = 10000;
	int select = 0;
	int win = 0;
	int lose = 0;
	int draw = 0;
	int userDice1, userDice2, userDice3 = 0;
	int comDice1, comDice2, comDice3 = 0;
	String bettingChoice = null;
	String retryChoice = null;
	int bettingMoney = 0;
	int loan = 0;
	int accumulateLoan = 0;
	int payback = 0;
	int userSum = 0;
	int comSum = 0;
	
	a : while (true) {
		System.out.println("====주사위 게임====");
		System.out.println("1. Game Start");
		System.out.println("2. Game Score");
		System.out.println("3. Ean Loan");
		System.out.println("4. Pay Back");
		System.out.println("5. End Game");
		System.out.println("================");
		System.out.println("선택> ");
		select = k.nextInt();
		System.out.println("================");
		
		switch (select) {
		case 1:
			if (money <= 0) {// 게임을 하려고 했는데 돈이 없는 경우...
				System.out.println("\t돈 없는 너가 뭘 할 수 있는데?");
				break;
			} 
			while (true) {
				System.out.println("<< Game Start >>");
				userDice1 = r.nextInt(6)+1;
				userDice2 = r.nextInt(6)+1;
				userDice3 = r.nextInt(6)+1;
				comDice1 = r.nextInt(6)+1;
				comDice2 = r.nextInt(6)+1;
				comDice3 = r.nextInt(6)+1;
				
				System.out.println("1번째 주사위 값 : " + userDice1);
				System.out.println("2번째 주사위 값 : " + userDice2);
				System.out.println("3번째 주사위 값 : " + userDice3);
				
				userSum = userDice1 + userDice2 + userDice3;
				System.out.println("내 주사위 총 합 : " + userSum);
				
				System.out.print("배팅 하시겠습니까? [Y / N] :");
				bettingChoice = k.next();
				System.out.println("=====================");
				
				if (bettingChoice.equals("y") || bettingChoice.equals("Y")) {
					System.out.println("얼마를 배팅하겠습니까?");
					System.out.printf("현재 소지금 : %,d원\n", money);
					System.out.print("입력 :");
					
					while (true) {
						bettingMoney = k.nextInt();
						System.out.println("============");
						if (bettingMoney < 0) {// 배팅금액 -일 경우
							System.out.println("다시");
							System.out.println("다시 입력하세요");
							System.out.println("얼마를 배팅하겠습니까?");
							System.out.printf("현재 소지금 : %,d원\n", money);
							System.out.print("입력 :");
							continue;
						} else if (money < bettingMoney) { // 소지금액 < 배팅금액
							System.out.println("금액이 부족합니다");
							System.out.println("다시 입력하세요");
							System.out.println("얼마를 배팅하겠습니까?");
							System.out.printf("현재 소지금 : %,d원\n", money);
							System.out.print("입력 :");
							continue;
						}
						break; // 정상적으로 입력한 경우 해당 반복문 깨버림
					}
					
					System.out.println("컴퓨터 1번째 주사위 값 :"+ comDice1);
					System.out.println("컴퓨터 2번째 주사위 값 :"+ comDice2);
					System.out.println("컴퓨터 3번째 주사위 값 :"+ comDice3);
					
					comSum = comDice1 + comDice2 + comDice3;
					System.out.println("컴퓨터 주사위 총합 :" + comSum);
					System.out.println("=============================");
					
					System.out.println("<< 결과 >>");
					if (userSum > comSum) {
						System.out.println("\t승리!");
						System.out.printf("\t%,d원이 소지금에 추가되었습니다\n", bettingMoney);
						money += bettingMoney;
						win ++;
					} else if (userSum < comSum) {
						System.out.println("\n패배!");
						System.out.printf("\t%,d원이 소지금에서 차감되었습니다\n", bettingMoney);
						money -= bettingMoney;
						lose++;
						
						if (money <= 0) { // 지고나서 소지금 다 떨어진 경우
							System.out.println("=============================");
							System.out.println("\t 나가~~~~~~~~~~~~~~");
							break;
						}
					}else {
						System.out.println("비겼다~");
						draw++;
					}
					System.out.println("======================");
					System.out.print("한번 더 하시겠습니까? [Y/N] :");
					retryChoice = k.next();
					
					if (retryChoice.equals("y") || retryChoice.equals("Y")) {
						continue;
					} else { // y가 아닌 경우 재시도 x
						break;
					}
					
				}else if (bettingChoice.equals("n") || bettingChoice.equals("N")) {
					break;
				}else if (!bettingChoice.equals("y") || !bettingChoice.equals("Y") || 
						!bettingChoice.equals("n") || !bettingChoice.equals("N")) {
					break;
				}
			}
		case 2:
			System.out.println("<<당신의 전적>>");
			System.out.printf("Win : %d회\n", win);
			System.out.printf("Draw : %d회\n", draw);
			System.out.printf("Lose : %d회\n", lose);
			System.out.printf("내 소지금 : %,d원\n", money);
			break;
		case 3:
			System.out.println("월 금리 100% 대출 OPEN");
			System.out.print("얼마나 빌려드릴까요? :");
			loan = k.nextInt();
			System.out.printf("%,d원 빌려드리겠습니다 많이 따세요~!", loan);
			money += loan;
			accumulateLoan += loan;
			System.out.printf("여태까지 총 %,d원 빌리셨습니다 :)\n", accumulateLoan);
			break;
		case 4:
			System.out.printf("%,d원 채무있으신데 얼마나 갚으시겠습니까?", accumulateLoan);
			payback = k.nextInt();
			
			if (payback > accumulateLoan) {
				break;
			}
			
			money -= payback;
			accumulateLoan -= payback;
			
			if (accumulateLoan > 0) {
				System.out.printf("%,d원 남으셨습니다\n", accumulateLoan);
				
			}else if (accumulateLoan == 0) {
				System.out.println("고생하셨어~");
			} 
			break;
		case 5:
			System.out.println("게임을 종료합니다");
			System.out.println("=============================================");
			break a;
		default:
			System.out.println("잘못 입력하셨습니다요");
			break;
		}
		
		
		
		
	}
	}
}
