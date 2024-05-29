import java.util.Scanner;

public class PMain7 {
	// 거스름돈 환전 프로그램
	// 함수 사용

	// <입력>
	// 구매한 물건 가격 : 35000
	// 낸 돈 : 41530
	// ---------
	// 거스름돈 6530 을
	// 50000 : 0
	// 10000 : 0
	// 5000 : 1
	// 1000 : 1
	// 500 : 1
	// 100 : 0
	// 50 : 0
	// 10 : 3
	// 0개짜리는 출력 x!

	// 물건 가격
	public static int putMoney() {
		int price = 0;
		Scanner k = new Scanner(System.in);
		System.out.print("구매한 물건 가격: ");
		price = k.nextInt();
		return price;
	}

	// 낸 돈
	public static int payMoney(int price) {
		int pay = 0;
		Scanner k = new Scanner(System.in);
		System.out.print("낸 돈: ");
		pay = k.nextInt();
		if (pay < price) {
			System.out.println("돈이 부족합니다. 다시 입력하세요.");
		}
		return pay >= price ? pay : payMoney(price);
	}

	// 거스름돈 계산
	public static int chargeMoney(int price, int pay) {
		int charge = (pay -= price);
		return charge;
	}

	// 위에 3개 출력
	public static void printResult(int price, int pay, int charge) {
		System.out.printf("구매할 물건 가격은 %d원입니다\n", price);
		System.out.printf("낸 돈은 %d원입니다\n", pay);
		System.out.printf("거스름돈은 %d원입니다\n", charge);
	}

	// 거스름돈을 화폐에 따라 어떻게 줄 것인가
	public static void printCharge(int charge) {
		// 1번째
//		int[] currency = {50000, 10000, 5000, 1000, 500, 100, 50, 10};
//		for (int i = 0; i < currency.length; i++) {
//			if (charge >= currency[i])
//				System.out.printf("%d원권 : %d개\n", currency[i], 
//						(charge / currency[i]));  
//			charge %= currency[i];
//		}

		// 2번째
		int currency2 = 100000;
		while (true) {
			currency2 /= 2;
			if (charge >= currency2) {
				System.out.printf("%d원권 : %d개\n", currency2, (charge / currency2));
				charge %= currency2;

			}
			currency2 /= 5;
			if (charge >= currency2) {
				System.out.printf("%d원권 : %d개\n", currency2, (charge / currency2));
				charge %= currency2;

			}
			if (currency2 == 10) {
				break;
			}
		}

	}

	public static void main(String[] args) {
		int price = putMoney();
		int pay = payMoney(price);
		int charge = chargeMoney(price, pay);
		printResult(price, pay, charge);
		printCharge(charge);
	}

}
