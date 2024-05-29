import java.util.Scanner;

// 1을 입력하면 학생 수 값을 입력 받을 수 있게
// 2를 입력하면 각 학생들의 점수를 입력 받을 수 있게 (점수 범위 고려 x)
// 3을 입력하면 학생들의 점수리스트를 출력할 수 있게 (ex) 1번 학생 점수 : 50점
// 4를 입력하면 최고점수와 평균점수를 분석해서 출력할 수 있게
// 5를 입력하면 프로그램 종료

public class PMain6 {
	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
		int selectNo = 0;
		int studentNum = 0;
		// 배열의 기본값 = null
		int[] scores = null;
		
		while (true) {
			System.out.println("----------------------");
			System.out.println("1. 학생수 | 2. 점수입력 | 3. 점수리스트 | 4. 분석 | 5. 종료");
			System.out.println("----------------------");
			System.out.print("번호입력>");
			selectNo = k.nextInt();
			if (selectNo == 1) {
				System.out.print("학생 수 : ");
				studentNum = k.nextInt();
				scores = new int[studentNum];
				System.out.printf("학생수는 %d명입니다\n", studentNum);
			}else if (selectNo == 2) {
				for (int i = 0; i < scores.length; i++) {
					System.out.printf("%d번 학생 점수 입력 : ", i +1);
					scores[i] = k.nextInt();
				}
			} else if (selectNo == 3) {
				int index = 1;
				for (int i : scores) {
					System.out.printf("%d번 학생 점수 : %d점\n", index++, i);
				} 
			}else if (selectNo == 4) {
			int max = 0;
			int sum = 0;
			double avg = 0;
			for (int i : scores) {
				sum += i;
				max = (max < i) ? i : max;
			}
			avg = (double) sum / scores.length;
			System.out.printf("최고점수 : %d점\n", max);
			System.out.printf("평균점수 : %,2f점\n", avg);
			}else if (selectNo == 5) {
				System.out.println("종료");
				break;
			}else {
				System.out.println("잘못 입력했으니 재입력!");
			}
			
		}
	}
}
