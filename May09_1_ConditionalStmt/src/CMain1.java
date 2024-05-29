import java.util.Scanner;

import javax.xml.stream.XMLInputFactory;

public class CMain1 {
	// 국어 시험 점수를 입력해서 받아오는 함수
	public static int getkoreanSc() {
		Scanner k = new Scanner(System.in);
		System.out.print("한국어 점수 : ");
		int koreanSc = k.nextInt();
		// 점수에는 - 점수가 없기 때문에
		return koreanSc; 
		//조건문(koreanSc >= 0 && koreanSc <= 100) ? koreanSc : getkoreanSc()
	}
	
	// 조건문 : 작성한 코드를 조건에 따라 코드의 실행 흐름을 다르게 동작하도록 제어하는 문법
	// if문 : 조건식의 결과가 true, false로 실행문을 결정
	
//	if (조건 A) {
//		조건 A가 만족했을 때 (참일때) 이 부분을 실행
//	} else if (조건 B) {
//		조건 A (X), 조건 B (0)일때 이 부분이 실행
//	} else if (조건 C) {
//		조건 A (X), 조건 B (X), 조건 C (0)일때 이 부분이 실행 	
//	} else (조건 D) {
//		맞는 조건이 하나도 없으면 이 부분이 실행
//	}
	
	
	public static void main(String[] args) {
		int koreanSc = getkoreanSc();
	/*	if (koreanSc  < 60) {
			System.out.println("당신의 국어점수는 '가' ");
		} else if (koreanSc >= 60 ) {
			System.out.println("당신의 국어점수는 '양' ");
		} else if (koreanSc >= 70 ) {
			System.out.println("당신의 국어점수는 '미' ");
		} else if (koreanSc >= 80 ) {
			System.out.println("당신의 국어점수는 '우' ");
		} else {
			System.out.println("당신의 국어점수는 '수' ");
		}
		*/
		
	// 국어점수가....
	 // 60점 미만이면 '가'
	 // 60점 이상이면 '양'
		//70점 '미'
		//80점 '우'
		//90점 '수'
	
	/* if (koreanSc >= 90) {
		System.out.println("당신의 국어점수는 '수' ");
	} else if (koreanSc >= 80 ) {
		System.out.println("당신의 국어점수는 '우' ");
	} else if (koreanSc >= 70 ) {
		System.out.println("당신의 국어점수는 '미' ");
	} else if (koreanSc >= 60 ) {
		System.out.println("당신의 국어점수는 '양' ");
	} else {
		System.out.println("당신의 국어점수는 '가' ");
	}*/
	System.out.println("-------------");
	
	//국어 점수가 50점이 안되면 욕, 아니면 칭찬
	// +점수가 50점 이상 60점 미만이면 아쉬운 소리
	// +점수가 30점 미만이며 퇴학처리
	
	// if문안에 if문을 또 사용하는 것이 가능 !
	
	// if - if 문과 if - else 문의 차이
	// if - if : 각각 다른 조건문으로 해석해서 수행하게 됨.
	// 				=> 효율적 x
	/*	if (koreanSc < 50) {
		System.out.println("xxxxxxxxxxxxxx!");
	}
	if (koreanSc >= 50) {
		System.out.println("!!!!!");
	}
*/	
	// if - else : 하나의 조건이 만족되면 
	//				나머지 부분은 수행하지 않음. => 효율적
	if (koreanSc < 50) {
		System.out.println("xxxxxxxxxxxxxx!");
		if (koreanSc < 30) {
			System.out.println("퇴학");
		}
	} else {
		System.out.println("!!!!!!!!!!!!!!!");
		if (koreanSc < 60) {
			System.out.println("아쉬운소리");
		}
	}
	
	
	} 
		
	
	
	
}

	

