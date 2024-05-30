package com.ean.may223.main;

import com.ean.may223.ironman.Ironman;
import com.ean.may223.person.Person;
import com.ean.may223.planet.Planet;

public class OMain1 {
	public static void main(String[] args) {
		// 게임 개발 중...
		// 행성 (이름, 크기, 보이는지 안보이는지)
		// 사람 (이름)

		// 이름이 '지구'인 행성 생성
		Planet p = new Planet("지구");
		// 이름이 ???인 사람 생성
		Person pp = new Person("황정수") {
		};
		// 이 행성이 사람을 입주
		p.add(pp);
		
		
		// 사수 : interface
		// interface는 부사수 제어용
		// attack();을 반드시 구현하게!!
		
		// 아이언맨 객체 - attack 기능 구현
		Ironman i = new Ironman() {
		};
		// 이 사람이 아이언맨을 자기 전담영웅으로 픽!
		pp.pick(i);
		// 이 사람이 도와달라고 소리침! (아이언맨이 공격)
		pp.help();
		// 이 행성사이즈를 1000으로 수정
		p.setSize(1000);
		// 이 행성을 보이게 수정
		p.setVisible(true);
		System.out.println("-------------");
		p.printInfo();
	}
}
