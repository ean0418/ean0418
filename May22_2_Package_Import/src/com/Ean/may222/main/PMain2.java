package com.Ean.may222.main;

import java.util.Random;
//PMain2.java에서 쓰는 Scanner는 무조건 이것만 사용하겠다!
import java.util.Scanner;

import com.Ean.may222.product.Computer;

// 패키지 : 클래스명이 중복될 때 구별할 수 있는 수단!!
// 			모든 클래스는 패키지에 넣을 수 있도록!!!

// 패키지명이 중복? 똑같으면? => 방법이 없음
//			-> 전 세계적으로 패키지명이 중복 안되게
// com.회사명.프로그램명.카테고리 (소문자)
// kr.co.회사명.프로그램명.카테고리

// 객체
//		패키지명.클래스명 변수명 = new 패키지명.생성자();

public class PMain2 {
	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);

//		com.Ean.may222.product.Scanner s = new com.Ean.may222.product.Scanner(1, 0); <-x

		// 객체 만들 때 패키지명을 생략 가능한 경우
		// - 자바 기본 패키지 (java.lang) 소속
		/* java.lang. */ String s = "ㅋ";
		/* java.lang. */System.out.println("a");

		// 같은 패키지 소속
		com.Ean.may222.main.Ean e = new com.Ean.may222.main.Ean();
		Ean e2 = new Ean();

		// 다른 패키지 소속
		com.Ean.may222.product.Computer c = new Computer();
		Computer c2 = new Computer();

		// Ctrl + shift + o => import 정리!ㅖ
		Random r = new Random();
	}
}
