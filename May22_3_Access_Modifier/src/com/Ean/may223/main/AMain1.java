package com.Ean.may223.main;

import com.Ean.may223.product.Dog;

public class AMain1 extends Dog {
	public static void main(String[] args) {

//		Dog dog = new Dog();
//
//		dog.a = 1;
//		dog.b = 2;
//		dog.c = 3;
//		dog.d = 4; 
		
		AMain1 amain = new AMain1();
		amain.a = 1; // 'a'는 public, 접근 가능!
		amain.b = 2; // 'b'는 protected, 접근 가능!
		// AMain1이 Dog의 하위 클래스이고, AMain1의 인스턴스를 통해
		// 		protected 멤버변수에 접근 0
//		amain.c = 3; // 'c'는 default, 다른 패키지에 있어서 접근 불가능 !
//		amain.d = 4; // 'd'는 private, 다른 클래스여서 접근 불가능 !
		
		// 접근 범위 순서대로 나열
		// private < default < protected < public
		
		
		
	}
}