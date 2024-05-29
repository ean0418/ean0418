package com.Ean.may222.main;

import com.Ean.may222.product.Computer;
import com.Ean.may222.product.Scanner;

public class PMain1 {
	public static void main(String[] args) {
	
	// 매직스테이션 800000 i5-1234 8gb	500gb 컴퓨터
	// 출력
	Computer c = new Computer("매직스테이션", 800000, "i5-1234", 8, 500);
	c.printInfo();
	System.out.println("---------------------");
	// 멀티익스프레스 500000 스캐너
	Scanner s = new Scanner("멀티익스프레스", 50000);
	s.printInfo();
	System.out.println("---------------------");
	// 출력
	com.Ean.may222.product.Scanner s1 = new com.Ean.may222.product.Scanner("멀티익스프레스", 50000);
	s1.printInfo();
	System.out.println("---------------------");
	}
}