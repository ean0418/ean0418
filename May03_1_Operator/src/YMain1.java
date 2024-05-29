import java.util.Scanner;

public class YMain1 {
	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
	
		// 오늘 기분은 어떤가요?
		// 오늘 컨디션 점수는 ?
		// 대중교통 몇 번 갈아타고 오셨는지?
		// 빔에 푹 주무셨는지 (잘 잤으면 true / 아니면 false)
		// 몇 시간 주무셨나요 ? (ex : 6.0시간)
		
		
		System.out.print("기분\t: ");
		String feelings = keyboard.next();
		
		System.out.print("컨디션\t: ");
		int condition = keyboard.nextInt();
		
		System.out.print("대중교통 환승횟수\t: ");
		int transport = keyboard.nextInt();
		
		System.out.print("밤에 잘잤는지\t: ");
		Boolean gdNight = keyboard.nextBoolean();
		
		System.out.print("몇 시간 잤는지\t: ");
		double howLongSleep = keyboard.nextDouble();
		
		System.out.println("--------------------------");
		System.out.printf("기분\t\t : %s\n", feelings);
		System.out.printf("컨디션\t\t : %d점\n", condition);
		System.out.printf("대중교통 환승횟수\t : %d번\n", transport);
		System.out.printf("밤에 잘잤는지\t : %b\n", gdNight);
		System.out.printf("몇 시간 잤는지\t : %s시간\n", howLongSleep);
		System.out.println("--------------------------");
		
		
		
		
		
		
		
	}
}
