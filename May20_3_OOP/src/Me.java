import java.util.Scanner;

public class Me {
	Scanner brain = new Scanner(System.in);
	int hand;
	int win;
	int draw;
	
	public int fire() {
		return brain.nextInt(3) + 1;
	}
	
	
//	public int answerNum() {
//		System.out.println("대답:");
//		int myNum = mouth.nextInt();
//		return myNum;
//	}
}
