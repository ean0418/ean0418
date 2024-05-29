import java.util.Random;

public class Computer {
	int coin = 20;
	Random cpu = new Random();
	
	
	public int askHowManyCoin(User u) {
		System.out.print("몇 개로 하실?(2개이상 20개 이하) :");
		coin = u.answerHowManyCoin();
		if (coin < 2 || coin > 21) {
			System.out.println("다시다시");
		}
		return (coin >= 2 && coin <= 20) ? coin : askHowManyCoin(u);
	}
	
	public int shakeCoin(int userCoin) {
		return cpu.nextInt(userCoin) + 1;
	}
	
	public String askResult(User u) {
		System.out.print("홀짝?");
		String userAns = u.answerResult();
		return (userAns.equals("홀") || userAns.equals("짝")) ? userAns : askResult(u);
	}
	
	public String judgeCoin(int shakeCoin) {
		return shakeCoin % 2 == 0 ? "짝" : "홀";
	}
	
	public String getResult(String userAns, String comAns) {
		return userAns.equals(comAns)? "정답" : "오답";
	}
	
	public void printResult(int shakeCoin, String result) {
		System.out.printf("동전은 %d개 뽑았고, %s이야!\n", shakeCoin, result);
	}
	public void start(User u) {
		int userCoin = askHowManyCoin(u);
		int shakeCoin = shakeCoin(userCoin);
		String userAns = askResult(u);
		String comAns = judgeCoin(shakeCoin);
		String result = getResult(userAns, comAns);
		printResult(shakeCoin, result);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//	int coin2;
//	
//	
//	public void askCoinNum() {
//		System.out.println("당신의 선택은?");
//	}
//	
//	public int getCoin(User u)  {
//		int coinNum = u.answerCoinNUM();
//		Random r = new Random();
//		int coin2 = r.nextInt(coinNum);
//		System.out.println(coin2);
//		return coin2;
//	}
//	public void askResult() {
//		System.out.println("홀짝?");
//	}
//	public void getResult(User u, int coin2) {
//		String answer2 = u.answerResult();
//		String result = (coin2 % 2 == 0) ? "짝" : "홀";
//		System.out.println(result);
//		String result2 = (answer2.equals(result)) ? "정답" : "땡";
//		System.out.println("결과는? :" + result2);
//		
//	}
//	public void printResult(User u) {
//		askCoinNum();
//		getCoin(u);
//		askResult();
//		getResult(u, coin2);
//		
//	}
//	
}
