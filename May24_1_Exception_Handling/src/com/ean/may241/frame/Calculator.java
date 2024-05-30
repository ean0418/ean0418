package com.ean.may241.frame;

	// 1. 여기서 아예 끝장을 보자 ! : try - catch - finally
	// 정상 : 9 - 10 - 15 - 16 - 17- 11
	// 무게값으로 0 : 9 - 10 - 12 - 13 - 15 - 16 - 17 - 14
public class Calculator {
	
	public static int divide(int price, int weight) {
		try {
			int d = price / weight;
			return d;
		} catch (Exception e) {
			System.out.println("ㄴㄴㄴㄴㄴㄴㄴㄴㄴㄴㄴ");
			return -9999;
		} finally {
			System.out.println("zzzzz");
		}
	}
	
	// 2. 미루기 : throws => try보다 더 주력
	// divide2를 실행하다가 Exception이 터지면
	// divide2를 호출한 쪽에서 해결해라!!!
	public static int divide2 (int price, int weight) throws Exception {
		int d = price/ weight;
		return d;
	}
	
	
	
	

}
