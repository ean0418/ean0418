package com.ean.may22.main;

import com.ean.may22.Hero.Ironman;

public class AMain2 {
	
		// 어벤져스 클래스
		// 이름, 나이 속성
		// 공격하기 기능
		
		// 익명 내부 클래스 (anonymous inner clasee_
					// Hero로부터 상속받은
					// 클래스명은 뭔지 모르는..
					// 내부에 만들어놓은 클래스
					// 단 한번만 사용될 수 있고, 오직 하나의 객체만을 사용할 수 있는
					// 일회용 클래스 (=다른 곳에서는 불러올 수 없음)   

		
		// 아이언맨은 어벤져스
		// 속성으로 재산
		// 공격은 빔
		// 흡연 0
		// 운전 0

		public static void main(String[] args) {
			
			Ironman i = new Ironman("d",1,1) {
			};
			i.printInfo();
			i.attack();
		}
}		
		
