
public class Judgement {
	// 나 부르기
	public Me callMe() {
		System.out.println("심판 : 나와");
		System.out.println("Me : 등장");
		return new Me();
	}
	
	// 친구에게 답 요구
	public int askFriAns(Friend f) {
		int friAns = f.writeFriAns();
		return friAns;
	}
	
	// 나에게 답 요구
	public int askMeAns(Me m) {
		int myAns = m.answerMyAns();
		if (myAns < 1 || myAns > 100) {
			System.out.println("ㄴㄴㄴ");
		}
		return myAns >= 1 && myAns <= 100 ? myAns : askMeAns(m);
	}
	// 판정
	public boolean judge(int answer, int myAnswer) {
		if (answer == myAnswer) {
			System.out.println("정답");
		} else if (answer > myAnswer) {
			System.out.println("UP");
		} else if (answer < myAnswer) {
			System.out.println("down");
		}
		return answer == myAnswer;
	}
	// 시도 횟수
	public void countTry(int turn) {
		System.out.println("=============");
		System.out.printf("%d번째 시도만에 정답!\n", turn);
		System.out.println("=============");
	}
	
	public void start(Friend f) {
		Me m = callMe();
		int answer = askFriAns(f);
		int myAnswer = 0;
		boolean endGame = false;
		int turn = 0;
		while (true) {
			myAnswer = askMeAns(m);
			turn++;
			endGame = judge(answer, myAnswer);
			if (endGame) {
				countTry(turn);
				break;
			}
		}
		
	}
	
//	public void startGame(Me m) {
//		System.out.println("황정수씨 나와주세요");
//		String join = m.joinGame();
//	}
//
//	public int askNum(Friend f) {
//		System.out.print("친구씨 종이에 답을 적어서 제출해주세요!");
//		int friendNum = f.answerNum();
//		if (friendNum < 1 || friendNum > 100) {
//			System.out.println("다시");
//		}
//		return (friendNum >= 1 && friendNum <= 100) ? friendNum : f.answerNum();
//	}
//
//	public int askNum2(Me m) {
//		System.out.print("황정수씨 숫자 대답해주세요");
//		int meNum = m.answerNum();
//		if (meNum < 1 || meNum > 100) {
//			System.out.println("다시");
//		}
//		return (meNum >= 1 && meNum <= 100) ? meNum : m.answerNum();
//	}
//
//	public void judgeAns(int friendNum, int meNum, Me m) {
//		for (int turn = 1; true; turn++) {
//			System.out.print("입력 : ");
//			int meNum2 = m.answerNum();
//			if (friendNum < meNum) {
//				System.out.println("Down");
//			} else if (friendNum > meNum) {
//				System.out.println("Up");
//			} else {
//				System.out.println("정답!");
//				System.out.printf("%d번만에 정답을 맞췄습니다.\n", turn);
//				break; // 반복문을 깨버림;
//			}
//			System.out.println("-------------");
//
//		}
//	}
//
//	public void start(Friend f, Me m) {
//		startGame(m);
//		int friendNum = askNum(f);
//		int meNum = askNum2(m);
//		judgeAns(friendNum, meNum, m);
//	}
}
