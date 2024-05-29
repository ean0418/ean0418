import java.util.Random;


public class Friend {
	Random paper = new Random();
	
	public int writeFriAns() {
		int think = paper.nextInt(100)+1;
		System.out.println("친구가 답을 정했다");
		return think;
	}
}
