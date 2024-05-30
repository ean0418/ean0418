package com.ean.may241.main;

import java.util.Scanner;

public class EMain1 {
	
	// 프로그램 실행 => 콘솔창에 빨간글씨로 ~~~~나오는 걸
	//    => ?? 에러 / 경고문
	
	// error
	//		한국어 -번역 -> 영어
	//		사과			apple
	//		바나나		banana
	//		띱퀭			???
	//		Java의 문법에 안맞게 써서 컴파일이 불가능한 상태
	//		개발자 잘못 !
	//		완성본은 나오지 않음
	
	// warning
	//		지저분한 코드
	//		개발자 잘못 !
	//		컴파일은 가능하니 => 완성본은 나옴
	//						(실행하는데 문제 없음 0)
	//		이클립스가 잔소리를 함
	//	ex) Scanner 객체 만들고 나서 => 이 기능을 안닫음
	
	// exception
	//		프로그램이 100% 완성!
	//		실행할 때 뭔가 외부적인 요인에 의해서 작동이 제대로 안되는 상황...
	//		개발자의 잘못은 아님
	//		개발자 입장 => 개발자가 상황을 예측해서 대책은 세워놓자...!
	
	public static void main(String[] args) {
		// x : ? y : ? 입력받아서
		// 더한 값. 뺀 값, 곱한 값. 나눈 값을 출력(정수)
		Scanner k = new Scanner(System.in);
		System.out.println("x:");
		int x = k.nextInt();
		System.out.println("y: ");
		int y = k.nextInt();
		System.out.println(x + y);
		System.out.println(x - y);
		System.out.println(x * y);
//		System.out.println(x / y);
		
		// y 값에다가 0을 넣으면...? => Exception 발생 !
		
		// Exception 처리를 할 수 있는 방법!
		
//		try {
//			일단 이 부분을 실행 - (내용)
//		} catch (예외유형명 / 변수명) {
//			try쪽을 실행하다가 해당 유형의 예외가 발생하면 이 부분을 실행
//			만약 예외 없이 정상적으로 실행됐을 경우, catch 부부은 그냥지나치고
//			그 다음 소스를 실행
//		}catch (예외유형명 / 변수명) {
//		...
//		} finally {
//			정상적으로 프로그램이 실행됐던지, 예외가 발생했던지 상관없이 실행
//			return보다 먼저 실행		
//		}
		// x : 2, y : 0 => 66 - 67 (Arith) - 71 - 72
		// x : 10 , y : 1 => 66 - 67 - 68 - 69 - 70 (Index) - 73 - 74
		// x : 2, y : 1 => 66 - 67 -68 - 69 - 70
		
//		try {
//			int d = x / y;
//			System.out.println(d);
//			int[] ar = { 1, 2, 3 };
//			System.out.println(ar[x]);
//		} catch (ArithmeticException ae) {
//			System.out.println("0으로 못나눠");
//		} catch (ArrayIndexOutOfBoundsException aoe) {
//			System.out.println("배열 인덱스 범위 초과함");
//		}
//		
		// 두가지 문제가 동시에 터진 경우? => 먼저 나온 catch의 내용만 실행
		// Java의 입장에서 첫번째 예외가 발생했을 떄
		// 즉시 실행 중지 후 해당 예외처리부분으로 넘어가기 때문!
		
		// catch 한번에 예외 설정 가능 
		
		try {
			int d = x / y;
			System.out.println(d);
			int[] ar = { 1, 2, 3 };
			System.out.println(ar[x]);
		} catch (Exception e) { // 모든 exception 다 잡아줌
			System.out.println("ㅋㅋㅋㅋㅋㅋ");
			e.printStackTrace(); // 상황 출력 (개발자용)
		} finally {
			System.out.println("집가고싶어");
		}
	
	
	
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
