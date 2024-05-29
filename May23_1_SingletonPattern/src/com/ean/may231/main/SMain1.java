package com.ean.may231.main;

import com.ean.may231.friend.Friend;

public class SMain1 {
	// 원하는 객체 하나 생성
	// 이름 나이 별명
	// 출력
	
	// 유일한 친구였으면 좋겠음 !
	// 디자인 패턴 프로그래밍 중에
	//		** 싱글톤 패턴 (Singleton Pattern)
	// 클래스가 최초 한번만 메모리를 할당하고 (Static)
	//		그 메모리에 객체를 만들어서 사용하는 디자인 패턴
	// 고정된 메모리 영역을 얻으면서 하나의 객체를 사용하기 떄문에
	//		메모리 낭비를 방지할 수 있음
	
	public static void main(String[] args) {
//		Friend f = new Friend("박정우", 23, "미어캣");
//		f.printInfo();
//		System.out.println(f);
//		System.out.println("--------------");
//		
//		Friend f2 = new Friend("박정우", 23, "미어캣");
//		f2.printInfo();
//		System.out.println(f2);
//		System.out.println("--------------");
		
		Friend f1 = Friend.getFriend();
		f1.printInfo();
		System.out.println(f1);
		System.out.println("-----------------");
		Friend f2 = Friend.getFriend();
		f2.printInfo();
		System.out.println(f2);
		System.out.println("-----------------");
	}
}
