import java.util.Scanner;

public class YMain2 {
	public static void main(String[] args) {

		Scanner k = new Scanner(System.in);

		// 국어, 수학, 영어 점수를 각각 입력받아서 출력
		// + 총점과 평균점수까지 출력

		System.out.print("국어 점수: ");
		int koreanScore = k.nextInt();

		System.out.print("수학 점수: ");
		int mathScore = k.nextInt();

		System.out.print("영어 점수: ");
		int englishScore = k.nextInt();

		System.out.println("----------");
		System.out.printf("국어 점수 : %d점/100점\n", koreanScore);
		System.out.printf("수학 점수 : %d점/100점\n", mathScore);
		System.out.printf("영어 점수 : %d점/100점\n", englishScore);
		System.out.printf("총점 : %d점\n", koreanScore + mathScore + englishScore);
		System.out.printf("평균 : %.1f점\n", (double)(koreanScore + mathScore + englishScore) / 3);
		//System.out.println("총점 : " + (koreanScore + mathScore + englishScore));
		//System.out.println("평균 : " + ((koreanScore + mathScore + englishScore) / 3));
		
		//int / int = int
		
		
	}
}
