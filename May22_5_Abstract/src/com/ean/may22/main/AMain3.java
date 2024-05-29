package com.ean.may22.main;

import com.ean.may22.Hero.Hero;
import com.ean.may22.Hero.Ironman;

public class AMain3 {

	// 다형성 (Polymoriphism)
	// poly (많은) + Morph (모양)
	// 상위타입 변수에 하위타입 객체를 담는 것이 가능
	// 같은 형태이지만 다른 기능을 할 수 있음! (override와 밀접한 관련)
		public static void main(String[] args) {
			Ironman i = new Ironman("d",123,12345) {
			};
			Hero a = new Ironman("d",456,456) {
			};
			a.printInfo();
			i.printInfo();
		}
	
		
		// a는 Hero 타입인데, 실제로는 Ironman 객체를 참조하고 있음
		// Ironman 클래스에서 오버라이딩 된 attack() 메소드를 호출했는데
		// 이 결과가 다형성과 오버라이팅이 밀접한 관련이 있음
		
	
}
