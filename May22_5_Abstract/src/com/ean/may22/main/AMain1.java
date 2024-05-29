package com.ean.may22.main;

import com.ean.may22.animal.Bird;

public class AMain1 {
	public static void main(String[] args) {
		
		// 추상화 (Abstraction) : 공통의 속성이나 기능을 묶어서 이름을 붙이는 것
		Bird b = new Bird("새", 9, 2);
		b.printInfo();
		b.roar();
		b.bite();
	}
}
