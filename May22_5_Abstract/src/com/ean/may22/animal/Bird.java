package com.ean.may22.animal;

import com.ean.may22.bite.Bite;
import com.ean.may22.roar.Roar;

// Java에서 클래스끼리는 다중상속 x(1대1로만)
// 클래스 + 인터페이스 다중상속 0
public class Bird extends Animal implements Bite, Roar /* fly, eat, .... */ {
	private int leg;

	public Bird() {
		// TODO Auto-generated constructor stub
	}

	public Bird(String speices, int age, int leg) {
		super(speices, age);
		this.leg = leg;
	}

	@Override
	public void printInfo() {
		// TODO Auto-generated method stub
		super.printInfo();
		System.out.println(leg);
	}

	@Override
	public void roar() {
		// TODO Auto-generated method stub
		System.out.println("짹짹");
	}

	@Override
	public void bite() {
		System.out.println("부리부리");
	}

}
