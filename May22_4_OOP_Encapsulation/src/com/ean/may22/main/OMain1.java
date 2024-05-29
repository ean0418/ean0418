package com.ean.may22.main;

import com.ean.may22.coffee.Coffee;

public class OMain1 {
	public static void main(String[] args) {
//		// 타이틀이 ㅋㅋㅋ인 JFrame
//		JFrame f = new JFrame("ㅋㅋㅋ");
//		// 사이즈를 300, 500 수정
//		f.setSize(300, 500);
//		// 타이틀을 ㅎㅎㅎ로 수정
//		f.setTitle("ㅎㅎㅎ");
//		// 보이게 하고 싶음
//		f.setVisible(true);
		
		// 커피..
		// 이름이 아메리카노, 3000원
		Coffee c = new Coffee("아메리카노", 3000);
		c.printInfo();
		System.out.println("----------------------");
		Coffee c1 = new Coffee();
		c1.setName("아메리카노");
		c1.setPrice(3000);
		c1.printInfo();
		System.out.println("----------------------");
		// 사람
		// 이름, 나이, 몸무게 출력
		com.ean.may22.person.Person p1 = new com.ean.may22.person.Person();
		p1.setName("황정수");
		p1.setAge(26);
		p1.setWeight(70);
		p1.printInfo();
		System.out.println(p1.getName());
	}

}
