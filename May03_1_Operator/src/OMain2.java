import java.util.Scanner;

public class OMain2 {
	public static void main(String[] args) {
		
		Scanner k = new Scanner(System.in);
		
		// 프로그래밍 언어들마다 기본자료형
		// 아무런 처리를 안하고 값만 있을때. 어떤 자료형으로 인식을 하는가
		// Java의 경우
		// 		정수 : int
		//		실수 : double (Java 한정, 다른 언어들은 대부분 float)
		//		문자열 : String
		//		논리 : boolean
		
		// 형 변환 (type casting)
		// 		자료형을 바꾸는 행위
		// 		Java가 자체적으로 자동 형변환
		//		자동형변환이 안되는 경우 => Eclipse가 처리
		//		(자료형) 값; 
		
		// 형 변환의 대표적인 예시로는 float
		float f = 1.234F; // 형 변환이 자동으로 안되는 경우
		float f1 = (float) 1.234;
		System.out.println(f);
		
		double d = 9; // 형 변환이 자동으로 되는 경우
		System.out.println(d);
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
