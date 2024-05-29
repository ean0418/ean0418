
public class Judgement {
	String[] rulebook = new String[] {"", "가위", "바위", "보"};
	
	public void readRulebook() {
		System.out.println("========");
		for (int i = 0; i < rulebook.length; i++) {
			System.out.printf("%d. %s\n", i, rulebook[i]);
		}
		System.out.println("========");
	}
	
	// 뭐낼지 물어보기
	// Overloading....!
	public int askAns(Friend f) {
		System.out.printf("친구야 뭐낼래?");
		int friAns = f.fire();
		return friAns >=1 && friAns <= 3 ? friAns : askAns(f);
	}
	
	public int askAns(Me m) {
		System.out.println("Me:");
		int meAns = m.fire();
		return meAns;
	}
	
	// 누가 뭐 냈는지
	public void printHand(Friend f, Me m) {
		System.out.printf("친구는 %s\n", rulebook[f.hand]);
		System.out.printf("나는 %s\n", rulebook[m.hand]);
	}
	
	// 판정
	public boolean judgeWin(Friend f, Me m) {
		int result = f.hand - m.hand;
		if (result == 0) {
			System.out.println("비겼다");
			m.draw++;
		} else if (result == -1 || result == 2) {
			System.out.println("내가 이겼다!");
			m.win++;
		} else {
			System.out.println("친국가 이겼다!");
		}
		return result == -1|| result == 2;
	}
	
	public void sayMeWin(Me m) {
		System.out.printf("마루는 %d번 비겼고, %d번 이겼어!\n", m.draw, m.win);
	}
	
	public void start(Me m, Friend f) {
		readRulebook();
		Boolean result = false;
		while (true) {
			m.hand = askAns(m);
			f.hand = askAns(f);
			printHand(f, m);
			System.out.println("==============");
			if (judgeWin(f, m)) {
				sayMeWin(m);
				break;
			}
			System.out.println("==============");
		}
	}
//	public int printrule() {
//		int rule = 0;
//		switch (rule) {
//		case 1:
//			System.out.println("가위");
//			break;
//		case 2:
//			System.out.println("바위");
//			break;
//		case 3:
//			System.out.println("보");
//			break;
//		default:
//			break;
//		}
//		return rule;
//	}
//	public int askFriend(Friend f) {
//		int friNum = f.answerNum();
//		return friNum;
//	}
//	public int askMe(Me m) {
//		System.out.println("너는 뭐 낼거임?");
//		int myNum = m.answerNum();
//
//		return myNum;
//	}
//	public int judge(int friNum, int myNum) {
//		int result = myNum - friNum;
//		if (result == -1 || result == 2) {
//			System.out.println("졌음");
//		} else if (result == 0) {
//			System.out.println("비김");
//		} else {
//			System.out.println("이김 ㅊㅋㅊㅋ");
//		}return result;
//	} 
//	
//	public void start(Friend f, Me m) {
//		int rule = printrule();
//		int draw = 0;
//		int win = 0;
//		while (true) {
//			int friNum = askFriend(f);
//			int myNum = askMe(m);
//			int result = judge(friNum, myNum);
//				if (result == 0) {
//					draw++;
//				} else if (result == -2 || result == 1) {
//					win++;
//				}  else if (result == -1 || result == 2) {
//				System.out.printf("%d번 이겼고, %d번 비겼다..", win, draw);
//				System.out.println("졌다..");
//				break;
//			}	}
//		}
//		
//		
//	
}